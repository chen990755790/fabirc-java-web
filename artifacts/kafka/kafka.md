����kafka�������裺
ǰ��:��װgo������docker,docker-compose����,���ؾ������ɽڵ�֤�飬ͨ�������ļ�
������2 139.199.48.44  ��֯2  :2 peer , 1 couchdb,1 ca, 1 cli�� mysql 
      3 115.159.235.114 ��֯1 :2 peer , 1 couchdb,1 ca, 1 cli
      5 139.199.48.189  order+zookeeper+kafka ,postgres+block-explorer
      
notes:
1 configtx.yaml
   1.1 OrdererType: kafka
   1.2 Kafka:
      # Brokers: A list of Kafka brokers to which the orderer connects
      # NOTE: Use IP:port notation
      Brokers:
        - 10.2.0.2:9092
2 peer-base.yaml
    - CORE_VM_DOCKER_HOSTCONFIG_NETWORKMODE=`kafka`��Ŀ¼���ƣ�_byfn
  �������ݲ��������ļ�
�ӿڵ��ò��裺
1 �û�ע��peerOrg1
2 ����ͨ�������������ɵ�ͨ�������ļ�һ�£����˲����Ѽ���ͨ��
3 ��װ����
4 ʵ�������루������{������ǵ�һ�Σ����ǰ�װ����}
5 ��������
6 ��ѯ
7 �û�ע��peerOrg2
8 �ڵ����ͨ��
9 ��װ����
10 peerOrg2��ѯ���˹���ʵ�������룬�ٶȽ�����
