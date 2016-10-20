/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/10/14 15:18:35                          */
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

drop table if exists user_info;

drop table if exists user_shop_relation;

/*==============================================================*/
/* Table: article                                               */
/*==============================================================*/
create table article
(
   id                   bigint(20) not null comment '主键',
   title                varchar(64) default NULL comment '文章标题',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   content              text comment '文章内容',
   thumbnail            varchar(128) default NULL comment '文章缩略图地址',
   remark               varchar(32) default NULL comment '备注',
   created_by           bigint(20) default NULL comment '创建人',
   modify_by            bigint(20) default NULL comment '修改人',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: article_message                                       */
/*==============================================================*/
create table article_message
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(32) default NULL comment '备注',
   created_by           bigint(20) default NULL comment '用户ID',
   acticle_id           bigint(20) default NULL comment '文章ID',
   message              varchar(256) default NULL comment '留言内容',
   parent_id            bigint(20) default 0 comment '父编号',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
   remark               varchar(32) default NULL comment '备注',
   name                 varchar(32) default NULL comment '品牌名称',
   image                varchar(128) default NULL comment '品牌图片',
   introduce            varchar(256) default NULL comment '品牌介绍',
   created_by           bigint(20) default NULL comment '创建人',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
   dic_id               bigint(20) default NULL comment '字典ID',
   obj_id               bigint(20) default NULL comment '对象ID',
   remark               varchar(32) default NULL comment '备注',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(32) default NULL comment '备注',
   order_num            varchar(32) default NULL comment '订单号',
   sum_price            bigint(20) default NULL comment '订单总价',
   created_by           bigint(20) default NULL comment '创建人',
   modify_by            bigint(20) default NULL comment '修改人',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(32) default NULL comment '备注',
   name                 varchar(64) default NULL comment '产品名称',
   thumbnail            varchar(128) default NULL comment '产品缩略图',
   price                bigint(20) default NULL comment '产品价格（以分为单位）',
   introduce            varchar(256) default NULL comment '产品简介',
   content              text comment '产品详情',
   province             bigint(20) default NULL comment '省',
   city                 bigint(20) default NULL comment '市',
   district             bigint(20) default NULL comment '区',
   is_sales             char(1) default 'n' comment '是否促销',
   sales_price          bigint(20) default NULL comment '促销价',
   created_by           bigint(20) default NULL comment '创建人',
   specifications       varchar(256) comment '规格',
   repertory            int default 0 comment '库存',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: product_brand_relation                                */
/*==============================================================*/
create table product_brand_relation
(
   id                   bigint(20) not null comment 'id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(32) default NULL comment '备注',
   product_id           bigint(20) default NULL comment '产品ID',
   brand_id             bigint(20) default NULL comment '品牌ID',
   shop_id              bigint(20) default NULL comment '店铺ID',
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
   remark               varchar(32) default NULL comment '备注',
   product_id           bigint(20) default NULL comment '产品ID',
   order_id             bigint(20) default NULL comment '订单ID',
   price                bigint(20) default NULL comment '当时产品价格',
   product_num          int(11) default NULL comment '产品购买数量',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: shop                                                  */
/*==============================================================*/
create table shop
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除',
   sort                 int(11) default 0 comment '排序',
   remark               varchar(32) default NULL comment '备注',
   name                 varchar(32) default NULL comment '店名',
   thumbnail            varchar(128) default NULL comment '店铺缩略图',
   banner               varchar(128) default NULL comment '店铺banner图',
   province             bigint(20) default NULL comment '省',
   city                 bigint(20) default NULL comment '市',
   district             bigint(20) default NULL comment '区',
   street               varchar(64) default NULL comment '街道地址',
   longitude            float default NULL comment '经度',
   latitude             float default NULL comment '纬度',
   introduce            varchar(256) default NULL comment '店铺介绍',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
   name                 varchar(32) default NULL comment '名称',
   parent_id            bigint(20) default 0 comment '父编号',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_dic                                               */
/*==============================================================*/
create table sys_dic
(
   id                   bigint(20) not null comment '主键',
   name                 varchar(32) default NULL comment '名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '修改时间',
   is_delete            char(1) default 'n' comment '是否删除(y/n)',
   sort                 int(11) default 0 comment '排序',
   parent_id            bigint(20) default 0 comment '父编号',
   remark               varchar(32) default NULL comment '备注',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_log                                               */
/*==============================================================*/
create table sys_log
(
   id                   bigint(20) not null comment '主键',
   opt_time             timestamp default CURRENT_TIMESTAMP comment '操作时间',
   opt_category         bigint(20) default NULL comment '日志分类',
   opt_summary          varchar(255) default NULL comment '记录被操作业务数据的变更内容',
   ip_address           varchar(16) default NULL comment '计算机ip地址',
   computer_name        varchar(32) default NULL comment '计算机名称',
   operator             bigint(20) default NULL comment '操作人员的用户Id',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_permission                                        */
/*==============================================================*/
create table sys_permission
(
   id                   bigint(20) not null,
   available            bit(1) default NULL,
   name                 varchar(255) default NULL,
   parent_id            bigint(20) default NULL,
   parent_ids           varchar(255) default NULL,
   permission           varchar(255) default NULL,
   resource_type        varchar(255) default NULL,
   url                  varchar(255) default NULL,
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   id                   bigint(20) not null,
   available            bit(1) default NULL,
   description          varchar(255) default NULL,
   role                 varchar(255) default NULL,
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_role_permission                                   */
/*==============================================================*/
create table sys_role_permission
(
   role_id              bigint(20) default NULL,
   permission_id        bigint(20) default NULL,
   id                   bigint(20) not null,
   primary key (id)
)
ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_sequences                                         */
/*==============================================================*/
create table sys_sequences
(
   id                   bigint(20) not null auto_increment comment 'id',
   name                 varchar(32) default NULL comment '名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_user_role                                         */
/*==============================================================*/
create table sys_user_role
(
   user_id              bigint(20) default NULL,
   role_id              bigint(20) default NULL,
   id                   bigint(20) not null,
   primary key (id)
)
ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   bigint(20) not null,
   name                 varchar(255) default NULL,
   password             varchar(255) default NULL,
   salt                 varchar(255) default NULL,
   state                tinyint(4) not null,
   username             varchar(255) default NULL,
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
   remark               varchar(32) default NULL comment '备注',
   created_by           bigint(20) default NULL comment '用户ID',
   shop_id              bigint(20) default NULL comment '店铺ID',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*数据库修改*/
/*角色表增加创建人字段*/
alter TABLE sys_role add created_by BIGINT;
/*权限表添加创建人字段*/
alter TABLE sys_permission add created_by BIGINT;
/*用户表增加邮箱和电话号码*/
alter TABLE user_info add email VARCHAR(32);
alter TABLE user_info add phone VARCHAR(32);
/*产品增加修改人字段*/
alter TABLE product add modify_by BIGINT;