/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016-10-21 16:47:50                          */
/*==============================================================*/


drop table if exists article;

drop table if exists article_message;

drop table if exists brand;

drop table if exists category_relation;

drop table if exists orders;

drop table if exists product;

drop table if exists product_brand_relation;

drop table if exists product_order_relation;

drop table if exists shop;

drop table if exists sys_area;

drop table if exists sys_dic;

drop table if exists sys_log;

drop table if exists sys_permission;

drop table if exists sys_role;

drop table if exists sys_role_permission;

drop table if exists sys_sequences;

drop table if exists sys_user_role;

drop table if exists user_detail;

drop table if exists user_login;

drop table if exists user_shop_relation;

/*==============================================================*/
/* Table: article                                               */
/*==============================================================*/
create table article
(
   id                   bigint(20) not null comment '文章id',
   title                varchar(64) default NULL comment '文章标题',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   content              text comment '文章内容',
   thumbnail            varchar(128) default NULL comment '文章缩略图ַ',
   remark               varchar(64) default NULL comment '备注',
   created_by           bigint(20) default NULL comment '创建用户id',
   modify_by            bigint(20) default NULL comment '修改用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table article comment '文章';

/*==============================================================*/
/* Table: article_message                                       */
/*==============================================================*/
create table article_message
(
   id                   bigint(20) not null comment '文章消息id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   created_by           bigint(20) default NULL comment '创建用户id',
   acticle_id           bigint(20) default NULL comment '文章id',
   message              varchar(255) default NULL comment '留言内容',
   parent_id            bigint(20) default 0 comment '文章消息父id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table article_message comment '文章消息表';

/*==============================================================*/
/* Table: brand                                                 */
/*==============================================================*/
create table brand
(
   id                   bigint(20) not null comment 'id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   name                 varchar(32) default NULL comment '名称',
   image                varchar(128) default NULL comment '图片地址',
   introduce            text default NULL comment '商标内容',
   created_by           bigint(20) default NULL comment '创建用户id',
   modify_by            bigint(20) comment '修改用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table brand comment '商标表';

/*==============================================================*/
/* Table: category_relation                                     */
/*==============================================================*/
create table category_relation
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            varchar(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   dic_id               bigint(20) default NULL comment '字典id',
   obj_id               bigint(20) default NULL comment '对象id',
   remark               varchar(64) default NULL comment '备注',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   id                   bigint(20) not null comment '订单id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   order_num            varchar(32) default NULL comment '数量',
   sum_price            bigint(20) default NULL comment '总价格',
   created_by           bigint(20) default NULL comment '创建用户id',
   modify_by            bigint(20) default NULL comment '修改用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table orders comment '订单表';

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   id                   bigint(20) not null comment '商品id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   name                 varchar(32) default NULL comment '商品名',
   thumbnail            varchar(128) default NULL comment '商品缩略图',
   price                bigint(20) default NULL comment '价格',
   introduce            text default NULL comment '商品简介',
   content              text comment '商品描述',
   province             bigint(20) default NULL comment '省id',
   city                 bigint(20) default NULL comment '市id',
   district             bigint(20) default NULL comment '区id',
   is_sales             char(1) default 'n' comment '是否促销',
   sales_price          bigint(20) default NULL comment '促销价格',
   created_by           bigint(20) default NULL comment '创建用户id',
   specifications       varchar(64) default NULL comment '规格',
   repertory            int(11) default 0 comment '库存数量',
   modify_by            bigint(20) default NULL comment '创建用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table product comment '商品表';

/*==============================================================*/
/* Table: product_brand_relation                                */
/*==============================================================*/
create table product_brand_relation
(
   id                   bigint(20) not null comment '商品品牌关系id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   product_id           bigint(20) default NULL comment '商品id',
   brand_id             bigint(20) default NULL comment '品牌id',
   shop_id              bigint(20) default NULL comment '商铺id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: product_order_relation                                */
/*==============================================================*/
create table product_order_relation
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   product_id           bigint(20) default NULL comment '商品id',
   order_id             bigint(20) default NULL comment '订单id',
   price                bigint(20) default NULL comment '价格',
   product_num          int(11) default NULL comment '商品购买数量',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: shop                                                  */
/*==============================================================*/
create table shop
(
   id                   bigint(20) not null comment '商铺id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   name                 varchar(32) default NULL comment '商铺名',
   thumbnail            varchar(128) default NULL comment '商铺缩略图',
   banner               varchar(128) default NULL comment '商铺广告图',
   province             bigint(20) default NULL comment '省id',
   city                 bigint(20) default NULL comment '市id',
   district             bigint(20) default NULL comment '区id',
   street               varchar(64) default NULL comment '街道地址',
   longitude            float default NULL comment '经度',
   latitude             float default NULL comment '维度',
   introduce            text default NULL comment '商铺介绍',
   created_by           bigint(20) comment '创建用户id',
   modify_by            bigint(20) comment '修改用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table shop comment '商铺表';

/*==============================================================*/
/* Table: sys_area                                              */
/*==============================================================*/
create table sys_area
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(32) default NULL comment '备注',
   name                 varchar(32) default NULL comment '省市区名',
   parent_id            bigint(20) default 0 comment '父id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_dic                                               */
/*==============================================================*/
create table sys_dic
(
   id                   bigint(20) not null comment '字典id',
   name                 varchar(32) default NULL comment '字典名',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   parent_id            bigint(20) default 0 comment '父id',
   remark               varchar(64) default NULL comment '备注',
   created_by           bigint(20) comment '创建用户id',
   modify_by            bigint(20) comment '修改用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_log                                               */
/*==============================================================*/
create table sys_log
(
   id                   bigint(20) not null comment 'id',
   opt_time             timestamp not null default CURRENT_TIMESTAMP comment '记录时间',
   opt_category         bigint(20) default NULL comment '操作类型',
   opt_summary          varchar(255) default NULL comment '操作记录',
   ip_address           varchar(16) default NULL comment 'ip地址ַ',
   computer_name        varchar(32) default NULL comment '电脑名称',
   operator             bigint(20) default NULL comment '操作用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table sys_log comment '系统日志';

/*==============================================================*/
/* Table: sys_permission                                        */
/*==============================================================*/
create table sys_permission
(
   id                   bigint(20) not null comment 'id',
   available            bit(1) default NULL comment '是否启用',
   name                 varchar(255) default NULL comment '权限名称',
   parent_id            bigint(20) default NULL comment '父权限id',
   parent_ids           varchar(255) default NULL comment '父权限集合',
   permission           varchar(255) default NULL comment '权限',
   resource_type        varchar(255) default NULL comment '原类型',
   url                  varchar(255) default NULL comment '可访问的url',
   created_by           bigint(20) default NULL comment '创建用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   id                   bigint(20) not null comment 'id',
   available            bit(1) default 1 comment '是否启用',
   description          varchar(255) default NULL comment '描述',
   role                 varchar(32) default NULL comment '角色名',
   created_by           bigint(20) default NULL comment '创建用户id',
   create_time          timestamp comment '创建时间',
   modify_time          timestamp comment '修改时间',
   modify_by            bigint(20) comment '修改用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table sys_role comment '角色表';

/*==============================================================*/
/* Table: sys_role_permission                                   */
/*==============================================================*/
create table sys_role_permission
(
   role_id              bigint(20) default NULL comment '角色id',
   permission_id        bigint(20) default NULL comment '权限id',
   id                   bigint(20) not null,
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_sequences                                         */
/*==============================================================*/
create table sys_sequences
(
   id                   bigint(20) not null auto_increment comment 'id',
   name                 varchar(32) default NULL comment '名字',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_user_role                                         */
/*==============================================================*/
create table sys_user_role
(
   user_id              bigint(20) default NULL comment '用户id',
   role_id              bigint(20) default NULL comment '角色id',
   id                   bigint(20) not null,
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: user_detail                                           */
/*==============================================================*/
create table user_detail
(
   id                   bigint(20) not null comment 'id',
   nick_name            varchar(32) comment '别名',
   birthday             date default NULL comment '生日',
   sex                  int(1) default 1 comment '性别',
   qq                   varchar(16) comment 'QQ',
   avatar_file          varchar(128) comment '头像',
   home_addre           varchar(255) comment '地址ַ',
   primary key (id)
);

alter table user_detail comment '用户详细信息';

/*==============================================================*/
/* Table: user_login                                            */
/*==============================================================*/
create table user_login
(
   id                   bigint(20) not null comment 'id',
   password             varchar(255) default NULL comment '密码',
   salt                 varchar(255) default NULL comment '密码盐',
   state                tinyint(4) not null comment '状态',
   user_name            varchar(32) default NULL comment '用户名',
   email                varchar(64) default NULL comment '电子邮箱',
   phone                varchar(32) default NULL comment '联系电话',
   last_login_time      timestamp comment '最后登入时间',
   user_id              bigint(20) comment '用户id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: user_shop_relation                                    */
/*==============================================================*/
create table user_shop_relation
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(64) default NULL comment '备注',
   created_by           bigint(20) default NULL comment '创建用户id',
   shop_id              bigint(20) default NULL comment '店铺id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

