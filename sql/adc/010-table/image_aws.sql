create table IMAGE_AWS (
    IMAGE_NO bigint(20) not null,
    IMAGE_ID varchar(100) not null,
    KERNEL_ID varchar(100),
    RAMDISK_ID varchar(100),
    INSTANCE_TYPES varchar(500) not null,
    EBS_IMAGE tinyint(1) not null,
    constraint IMAGE_AWS primary key (IMAGE_NO)
);