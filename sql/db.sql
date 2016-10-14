/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/10/14 11:05:41                          */
/*==============================================================*/


drop table if exists article;

drop table if exists article_message;

drop table if exists brand;

drop table if exists category_relation;

drop table if exists orders;

drop table if exists pro_brand_relation;

drop table if exists product;

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
   id                   bigint(20) not null comment '����',
   title                varchar(64) default NULL comment '���±���',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   content              text comment '��������',
   thumbnail            varchar(128) default NULL comment '��������ͼ��ַ',
   remark               varchar(32) default NULL comment '��ע',
   create_user_id       bigint(20) default NULL comment '������',
   modify_user_id       bigint(20) default NULL comment '�޸���',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: article_message                                       */
/*==============================================================*/
create table article_message
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   user_id              bigint(20) default NULL comment '�û�ID',
   acticle_id           bigint(20) default NULL comment '����ID',
   message              varchar(256) default NULL comment '��������',
   parent_id            bigint(20) default 0 comment '�����',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: brand                                                 */
/*==============================================================*/
create table brand
(
   id                   bigint(20) not null comment 'id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   name                 varchar(32) default NULL comment 'Ʒ������',
   image                varchar(128) default NULL comment 'Ʒ��ͼƬ',
   introduce            varchar(256) default NULL comment 'Ʒ�ƽ���',
   user_id              bigint(20) default NULL comment '������',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: category_relation                                     */
/*==============================================================*/
create table category_relation
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            varchar(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   dic_id               bigint(20) default NULL comment '�ֵ�ID',
   obj_id               bigint(20) default NULL comment '����ID',
   remark               varchar(32) default NULL comment '��ע',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   order_num            varchar(32) default NULL comment '������',
   sum_price            bigint(20) default NULL comment '�����ܼ�',
   user_id              bigint(20) default NULL comment '�û�ID',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: pro_brand_relation                                    */
/*==============================================================*/
create table pro_brand_relation
(
   id                   bigint(20) not null comment 'id',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   product_id           bigint(20) default NULL comment '��ƷID',
   brand_id             bigint(20) default NULL comment 'Ʒ��ID',
   shop_id              bigint(20) default NULL comment '����ID',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   name                 varchar(64) default NULL comment '��Ʒ����',
   thumbnail            varchar(128) default NULL comment '��Ʒ����ͼ',
   price                bigint(20) default NULL comment '��Ʒ�۸��Է�Ϊ��λ��',
   introduce            varchar(256) default NULL comment '��Ʒ���',
   content              text comment '��Ʒ����',
   province             bigint(20) default NULL comment 'ʡ',
   city                 bigint(20) default NULL comment '��',
   district             bigint(20) default NULL comment '��',
   is_sales             char(1) default 'n' comment '�Ƿ����',
   sales_price          bigint(20) default NULL comment '������',
   user_id              bigint(20) default NULL comment '������',
   specifications       varchar(256) comment '���',
   repertory            int default 0 comment '���',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: product_order_relation                                */
/*==============================================================*/
create table product_order_relation
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   product_id           bigint(20) default NULL comment '��ƷID',
   order_id             bigint(20) default NULL comment '����ID',
   price                bigint(20) default NULL comment '��ʱ��Ʒ�۸�',
   product_num          int(11) default NULL comment '��Ʒ��������',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: shop                                                  */
/*==============================================================*/
create table shop
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   name                 varchar(32) default NULL comment '����',
   thumbnail            varchar(128) default NULL comment '��������ͼ',
   banner               varchar(128) default NULL comment '����bannerͼ',
   province             bigint(20) default NULL comment 'ʡ',
   city                 bigint(20) default NULL comment '��',
   district             bigint(20) default NULL comment '��',
   street               varchar(64) default NULL comment '�ֵ���ַ',
   longitude            float default NULL comment '����',
   latitude             float default NULL comment 'γ��',
   introduce            varchar(256) default NULL comment '���̽���',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_area                                              */
/*==============================================================*/
create table sys_area
(
   id                   bigint(20) not null,
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   name                 varchar(32) default NULL comment '����',
   parent_id            bigint(20) default 0 comment '�����',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_dic                                               */
/*==============================================================*/
create table sys_dic
(
   id                   bigint(20) not null comment '����',
   name                 varchar(32) default NULL comment '����',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��(y/n)',
   sort                 int(11) default 0 comment '����',
   parent_id            bigint(20) default 0 comment '�����',
   remark               varchar(32) default NULL comment '��ע',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: sys_log                                               */
/*==============================================================*/
create table sys_log
(
   id                   bigint(20) not null comment '����',
   opt_time             timestamp default CURRENT_TIMESTAMP comment '����ʱ��',
   opt_category         bigint(20) default NULL comment '��־����',
   opt_summary          varchar(255) default NULL comment '��¼������ҵ�����ݵı������',
   ip_address           varchar(16) default NULL comment '�����ip��ַ',
   computer_name        varchar(32) default NULL comment '���������',
   operator             bigint(20) default NULL comment '������Ա���û�Id',
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
   name                 varchar(32) default NULL comment '����',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
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
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '����ʱ��',
   modify_time          timestamp not null default CURRENT_TIMESTAMP comment '�޸�ʱ��',
   is_delete            char(1) default 'n' comment '�Ƿ�ɾ��',
   sort                 int(11) default 0 comment '����',
   remark               varchar(32) default NULL comment '��ע',
   user_id              bigint(20) default NULL comment '�û�ID',
   shop_id              bigint(20) default NULL comment '����ID',
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

