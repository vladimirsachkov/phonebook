PGDMP         ,        	        {         	   phonebook    10.23    15.2     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �
           1262    24576 	   phonebook    DATABASE     }   CREATE DATABASE phonebook WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';
    DROP DATABASE phonebook;
                postgres    false                        2615    2200    public    SCHEMA     2   -- *not* creating schema, since initdb creates it
 2   -- *not* dropping schema, since initdb creates it
                postgres    false            �
           0    0    SCHEMA public    ACL     Q   REVOKE USAGE ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;
                   postgres    false    6            �            1259    24577    phonebook_table_seq    SEQUENCE     |   CREATE SEQUENCE public.phonebook_table_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.phonebook_table_seq;
       public          postgres    false    6            �            1259    24579    phonebook_table    TABLE     B  CREATE TABLE public.phonebook_table (
    id bigint DEFAULT nextval('public.phonebook_table_seq'::regclass) NOT NULL,
    second_name character varying,
    first_name character varying,
    third_name character varying,
    department character varying,
    postion character varying,
    tel_number character varying
);
 #   DROP TABLE public.phonebook_table;
       public            postgres    false    196    6            �
          0    24579    phonebook_table 
   TABLE DATA           s   COPY public.phonebook_table (id, second_name, first_name, third_name, department, postion, tel_number) FROM stdin;
    public          postgres    false    197   b       �
           0    0    phonebook_table_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.phonebook_table_seq', 21, true);
          public          postgres    false    196            q
           2606    24587 $   phonebook_table phonebook_table_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.phonebook_table
    ADD CONSTRAINT phonebook_table_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.phonebook_table DROP CONSTRAINT phonebook_table_pkey;
       public            postgres    false    197            �
   �   x�����0E��L�p[$���,P@$.�F(Ъ!����F�*�)_�v�/B�k�KԄ�(5G�+�`��g8]�.PZ��l��9<&o?m���Ӆ$IY2�̦�z_��6n��Q��N@H�8'��8:|H]��Q�n�8�,��Y�J7�y2R�&C���	*���     