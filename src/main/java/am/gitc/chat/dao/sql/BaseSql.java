package am.gitc.chat.dao.sql;

import am.gitc.chat.util.DatabaseConnectionFactory;

abstract class BaseSql {

  protected DatabaseConnectionFactory dbConnectionFactory;

  BaseSql() {
    this.dbConnectionFactory = DatabaseConnectionFactory.getInstance();
  }
}
