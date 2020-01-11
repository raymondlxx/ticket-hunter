package com.leo1ee.ticket.hunter.model;

import lombok.Data;

/**
 * @author leolee
 * @date 2020-01-11.
 */
@Data
public class Ticket {
  private String from;
  private String to;
  private String time;
  private Double price;
  private Double totalPrice;

}
