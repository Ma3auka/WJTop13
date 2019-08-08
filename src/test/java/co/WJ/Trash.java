/*                  Assert.assertTrue(driver.findElement(By.cssSelector(".builder-radio-group")).getText().contains("Round"));
                    System.out.println("- Title3");

                    Assert.assertTrue(driver.findElement(By.className(".metal-type")).getText().contains("Gold"));
                    System.out.println("- Title4");

                    new Select(driver.findElement(By.id("diamond-size"))).selectByVisibleText("1/2 CT."); drop-down list

                    new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
                    Select dropdown = new Select(driver.findElement(new By.ByName("size")));
                    dropdown.selectByVisibleText("1/3 CT.");

                    Thread.sleep(5000);

                    dropdown = new Select(driver.findElement(new By.ByName("size")));
                    dropdown.selectByVisibleText("1/2 CT.");

                    driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t"); // &#x43e;&#x442;&#x43a;&#x440;&#x44b;&#x442;&#x44c; &#x432;&#x43a;&#x43b;&#x430;&#x434;&#x43a;&#x443; &#x432; &#x43d;&#x43e;&#x432;&#x43e;&#x43c; &#x43e;&#x43a;&#x43d;&#x435;

                    driver.findElement(By.xpath("//a[text()='Start over']")).click();






//////////////////////////////// Necklaces
https://docs.google.com/spreadsheets/d/1cm0k5icRyPCDkUF-AfBhy-bXVElqvcZr/edit#gid=1645641088
////////////// Circle Links
/// 7227

  [
                  'jewelry_type'  => 7,                   // id1
/id1                 2 => 'Bracelet',
                      3 => 'Charm',
                      4 => 'Earrings',
                      7 => 'Necklace',
                      8 => 'Ring',
                    'product_part'  => 9,                  //
/id2                      For Rings
                         case 8:
                             $parts = [
                                 1 => Yii::t('app_admin', 'Shank'),
                                 2 => Yii::t('app_admin', 'Head')
                             ];
                             break;
                          For Necklace
                         case 7:
                             $parts = [
                                 3 => Yii::t('app_admin', 'Chain'),
                                 4 => Yii::t('app_admin', 'Pendant'),
                                 9 => Yii::t('app_admin', 'Necklace'),
                             ];
                             break;
                          For Bracelet
                         case 2:
                             $parts = [
                                 5 => Yii::t('app_admin', 'Bracelet'),
                                 6 => Yii::t('app_admin', 'Pearl'),
                             ];
                             break;
                          For Earring
                         case 4:
                             $parts = [
                                 7 => Yii::t('app_admin', 'Earring'),
                             ];
                             break;
                          For Charm
                         case 3:
                             $parts = [
                                 8 => Yii::t('app_admin', 'Charm'),
                             ];
                            'part_style'    => 254,                // &#x420;&#x430;&#x43d;&#x434;&#x43e;&#x43c; (Necklace)
                            'item_number'   => '7227-1',           // SD Model (&#x426;&#x438;&#x444;&#x440;&#x44b;)
                            'stones'        => [                   // &#x412;&#x43f;&#x438;&#x441;&#x44b;&#x432;&#x430;&#x435;&#x43c; &#x43a;&#x430;&#x43c;&#x43d;&#x438;
                            [
                            'stone'                => 'sphr',      // .https://sdc-designs.wonderjewel.co/factory/material/index / VENDOR DECRITPION (BG)
                            'product_part'         => 9,           // id2
                            'stone_shape'          => 'rd',        // SHAPE (BN)
                            'stone_clarity'        => 'SI2',       // &#x41c;&#x435;&#x43d;&#x44f;&#x435;&#x43c; &#x43a;&#x43e;&#x433;&#x434;&#x430; &#x442;&#x43e;&#x43b;&#x44c;&#x43a;&#x43e; &#x435;&#x441;&#x442;&#x44c; Diamond
                            'position'             => 2,           // 1 - &#x41a;&#x43e;&#x433;&#x434;&#x430; &#x435;&#x441;&#x442;&#x44c; &#x446;&#x435;&#x43d;&#x442;&#x440;&#x430;&#x43b;&#x44c;&#x43d;&#x44b;&#x439; &#x43a;&#x430;&#x43c;&#x435;&#x43d;&#x44c; / 2 - &#x41a;&#x43e;&#x433;&#x434;&#x430; &#x435;&#x433;&#x43e; &#x43d;&#x435;&#x442;
                            'stone_color'          => 's_bl',      // .https://sdc-designs.wonderjewel.co/factory/attribute/index / COLOR (BK)
                            'stone_settings'       => 'bezel',     // .https://sdc-designs.wonderjewel.co/factory/attribute/index / SETTING (BP)
                            'stone_nature'         => 'NTR',       // .https://sdc-designs.wonderjewel.co/factory/attribute/index / CLASS (BD)
                            'stone_weight'         => 0.03,        // AVG CT WT WT/MM SIZE (BR)
                            'stone_price'          => 3.45,        // PRICE PER CT (BT)
                            'stone_settings_price' => 0.88,        // TTL STONE SETTING COST (BW)
                            'stone_quantity'       => 1,           // &#x41a;&#x43e;&#x43b;&#x438;&#x447;&#x435;&#x441;&#x442;&#x432;&#x43e; &#x43a;&#x430;&#x43c;&#x43d;&#x435;&#x439;
                            'supply_by'            => 0,           // &#x412;&#x441;&#x435;&#x433;&#x434;&#x430; 0
                            'set_by'               => 0            // &#x412;&#x441;&#x435;&#x433;&#x434;&#x430; 0
                            ]
                            ],
                            'metal'         => [                   // &#x412;&#x43f;&#x438;&#x441;&#x44b;&#x432;&#x430;&#x435;&#x43c; &#x43c;&#x435;&#x442;&#x430;&#x43b;&#x44b;
                            [
                            'metal'       => 's',                  // METAL TYPE (AQ)
                            'metal_color' => 'W',                  // COLOR (AT)
                            'weight'      => 1.48                  // FINISH WEIGHT (AY)
                            ],
                            ],
                            'labor'         => [                   //
                            'manufacturing_cost' => 5.5,           // MANUFACTURING COST ()
                            'finishing_cost' => 5.5,               // FINISHING COST (EJ)
                            'special_finishing_cost' => 1.18,      // SPECIAL FINISHES  (EL)
                            'engraving_cost' => 2.33,              // ENGRAVING COST (EO)
                            'bag_tag_cost' => 0.5,                 // BAG & TAG (EP)
                            'no_of_casting'  => 3,                 // NO: OF CASTING (EN)
                            ],
                            'title'         => 'High Polish Double Circle Link Necklace in White Silver', // Discription (E)
                            'design_code'   => 'XC7227',           // Diaspark Style # (D)
                            'status'        => 1,
                            'part_group'    => '7227',             // Diaspark Style # (D)
                            'part_group_id' => 0,
                            ],                            // 7227
                            [
                            'jewelry_type'  => 7,
                            'product_part'  => 9,
                            'part_style'    => 365,
                            'item_number'   => '7227-2',
                            'stones'        => [
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ]
                            ],
                            'metal'         => [
                            [
                            'metal'       => 's',
                            'metal_color' => 'Y',
                            'weight'      => 1.48
                            ],
                            [
                            'metal'       => 's',
                            'metal_color' => 'R',
                            'weight'      => 1.48
                            ],
                            ],
                            'labor'         => [
                            'manufacturing_cost' => 5.5,
                            'finishing_cost' => 5.5,
                            'special_finishing_cost' => 1.18,
                            'engraving_cost' => 2.33,
                            'bag_tag_cost' => 0.5,
                            'no_of_casting'  => 3,
                            ],
                            'title'         => 'High Polish Double Circle Link Necklace in Yellow Rose',
                            'design_code'   => 'XC7227',
                            'status'        => 1,
                            'part_group'    => '7227',
                            'part_group_id' => 0,
                            ],                                  //   7228 W
                            [
                            'jewelry_type'  => 2,
                            'product_part'  => 5,
                            'part_style'    => 476,
                            'item_number'   => '7228-1',
                            'stones'        => [
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 5,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ]
                            ],
                            'metal'         => [
                            [
                            'metal'       => 's',
                            'metal_color' => 'W',
                            'weight'      => 1.48
                            ],
                            ],
                            'labor'         => [
                            'manufacturing_cost' => 5.5,
                            'finishing_cost' => 5.5,
                            'special_finishing_cost' => 1.18,
                            'engraving_cost' => 2.33,
                            'bag_tag_cost' => 0.5,
                            'no_of_casting'  => 3,
                            ],
                            'title'         => 'High Polish Double Circle Link Necklace in White Silver',
                            'design_code'   => 'XC7228',
                            'status'        => 1,
                            'part_group'    => '7228',
                            'part_group_id' => 0,
                            ],                                  //   7228  Y
                            [
                            'jewelry_type'  => 7,
                            'product_part'  => 5,
                            'part_style'    => 587,
                            'item_number'   => '7228-2',
                            'stones'        => [
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 5,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ]
                            ],
                            'metal'         => [
                            [
                            'metal'       => 's',
                            'metal_color' => 'Y',
                            'weight'      => 1.48
                            ],
                            [
                            'metal'       => 's',
                            'metal_color' => 'R',
                            'weight'      => 1.48
                            ],
                            ],
                            'labor'         => [
                            'manufacturing_cost' => 5.5,
                            'finishing_cost' => 5.5,
                            'special_finishing_cost' => 1.18,
                            'engraving_cost' => 2.33,
                            'bag_tag_cost' => 0.5,
                            'no_of_casting'  => 3,
                            ],
                            'title'         => 'High Polish Double Circle Link Necklace in Yellow Rose',
                            'design_code'   => 'XC7228',
                            'status'        => 1,
                            'part_group'    => '7228',
                            'part_group_id' => 0,
                            ],                                  //   7275  P W B
                            [
                            'jewelry_type'  => 7,
                            'product_part'  => 9,
                            'part_style'    => 698,
                            'item_number'   => '7275-1',
                            'stones'        => [
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_pnk',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'perl',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_wht', //WHITE
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'perl',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_blck', //Black (DK GREY)
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            'stone'                => 'perl',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_pnk',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            ],
                            'metal'         => [
                            [
                            'metal'       => 's',
                            'metal_color' => 'W',
                            'weight'      => 0.52
                            ],
                            ],
                            'labor'         => [
                            'manufacturing_cost' => 5.5,
                            'finishing_cost' => 5.5,
                            'special_finishing_cost' => 1.18,
                            'engraving_cost' => 2.33,
                            'bag_tag_cost' => 0.5,
                            'no_of_casting'  => 3,
                            ],
                            'title'         => 'Baroque Pearl Necklace in White',
                            'design_code'   => 'XC7275',
                            'status'        => 1,
                            'part_group'    => '7275',
                            'part_group_id' => 0,
                            ],
                            [                                           //   7229  P W B
                            'jewelry_type'  => 7,
                            'product_part'  => 9,
                            'part_style'    => 709,
                            'item_number'   => '7229-1',
                            'stones'        => [
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.03,
                            'stone_price'          => 3.45,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 1,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [                                   // 7603
                            'stone'                => 'dmnd',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_wht',
                            'stone_settings'       => 'pave',
                            'stone_nature'         => 'GNN',
                            'stone_weight'         => 0.16,
                            'stone_price'          => 1.87,
                            'stone_settings_price' => 0.88,
                            'stone_quantity'       => 32,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            'metal'         => [
                            [
                            'metal'       => 'f',
                            'metal_color' => 'W',
                            'weight'      => 1.85
                            ],
                            [
                            'metal'       => 'f',
                            'metal_color' => 'Y',
                            'weight'      => 1.85
                            ],
                            [
                            'metal'       => 'f',
                            'metal_color' => 'R',
                            'weight'      => 1.85
                            ],
                            ],
                            'labor'         => [
                            'manufacturing_cost' => 8.0,
                            'finishing_cost' => 8.0,
                            'special_finishing_cost' => 1.18,
                            'engraving_cost' => 2.33,
                            'bag_tag_cost' => 0.5,
                            'no_of_casting'  => 3,
                            ],
                            'title'         => 'Pave Double Circle Link Necklace in Pink White Yellow',
                            'design_code'   => 'XC7229',
                            'status'        => 1,
                            'part_group'    => '7229',
                            'part_group_id' => 0,
                            ],
                            [                                           //   7603  187
                            'jewelry_type'  => 4,
                            'product_part'  => 7,
                            'part_style'    => 810,
                            'item_number'   => '7603-1',
                            'stones'        => [
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 7,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'burnis',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.011,
                            'stone_price'          => 1.15,
                            'stone_settings_price' => 1.76,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'amth',
                            'product_part'         => 7,
                            'stone_shape'          => 'ov',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_prpl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0,    // CR
                            'stone_price'          => 6,    // CT (/ &#x43d;&#x430; stone_quantity)
                            'stone_settings_price' => 2,    // CQ
                            'stone_quantity'       => 2,    // CC
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 7,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'burnis',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.011,  // CR
                            'stone_price'          => 1.15,   // CT (/ &#x43d;&#x430; stone_quantity)
                            'stone_settings_price' => 1.76,   // CQ
                            'stone_quantity'       => 2,      // CC
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            'metal'         => [
                            [
                            'metal'       => 's',
                            'metal_color' => 'W',
                            'weight'      => 1.85
                            ],
                            ],
                            'labor'         => [
                            'manufacturing_cost' => 6.25,
                            'finishing_cost' => 6.25,
                            'special_finishing_cost' => 2.36,
                            'engraving_cost' => 4.66,
                            'bag_tag_cost' => 0.5,
                            'no_of_casting'  => 4,
                            ],
                            'title'         => 'Amethyst Oval Color Bezel Earrings in White',
                            'design_code'   => 'XC7603',
                            'status'        => 1,
                            'part_group'    => '7603',
                            'part_group_id' => 0,
                            ],
                            //7603
                            'jewelry_type'  => 4,
                            'product_part'  => 7,
                            'part_style'    => 810,
                            'item_number'   => '7603-1',
                            'stones'        => [
                            [
                            [
                            'stone'                => 'sphr',
                            'product_part'         => 9,
                            'stone_shape'          => 'rd',
                            'stone_clarity'        => 'SI2',
                            'position'             => 2,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0.011,
                            'stone_price'          => 0.575,
                            'stone_settings_price' => 1.76,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'amth',
                            'product_part'         => 9,
                            'stone_shape'          => 'ov',
                            'stone_clarity'        => 'SI2',
                            'position'             => 1,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0,
                            'stone_price'          => 6,
                            'stone_settings_price' => 2,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'topz',
                            'product_part'         => 9,
                            'stone_shape'          => 'ov',
                            'stone_clarity'        => 'SI2',
                            'position'             => 1,
                            'stone_color'          => 's_bl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 0,
                            'stone_price'          => 12.3,
                            'stone_settings_price' => 2.00,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'qrtz',
                            'product_part'         => 9,
                            'stone_shape'          => 'ov',
                            'stone_clarity'        => 'SI2',
                            'position'             => 1,
                            'stone_color'          => 's_brwn',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 1.36,
                            'stone_price'          => 1.9,
                            'stone_settings_price' => 2.00,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'mrgn',
                            'product_part'         => 9,
                            'stone_shape'          => 'ov',
                            'stone_clarity'        => 'SI2',
                            'position'             => 1,
                            'stone_color'          => 's_brwn',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 1.36,
                            'stone_price'          => 1.9,
                            'stone_settings_price' => 2.00,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'prdl',
                            'product_part'         => 9,
                            'stone_shape'          => 'ov',
                            'stone_clarity'        => 'SI2',
                            'position'             => 1,
                            'stone_color'          => 's_prpl',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 1.36,
                            'stone_price'          => 26,
                            'stone_settings_price' => 2.00,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            [
                            'stone'                => 'prsl',
                            'product_part'         => 9,
                            'stone_shape'          => 'ov',
                            'stone_clarity'        => 'SI2',
                            'position'             => 1,
                            'stone_color'          => 's_grn',
                            'stone_settings'       => 'bezel',
                            'stone_nature'         => 'NTR',
                            'stone_weight'         => 1.36,
                            'stone_price'          => 2.9,
                            'stone_settings_price' => 2.00,
                            'stone_quantity'       => 2,
                            'supply_by'            => 0,
                            'set_by'               => 0
                            ],
                            ],
                            'metal'         => [
                            [
                            'metal'       => 's',
                            'metal_color' => 'W',
                            'weight'      => 1.68  //
                            ],
                            ],
                            'labor'         => [
                            'manufacturing_cost' => 6.25,
                            'finishing_cost' => 6.25,
                            'special_finishing_cost' => 6.25,
                            'engraving_cost' => 4.66,
                            'bag_tag_cost' => 0.5,
                            'no_of_casting'  => 4,
                            ],
                            'title'         => 'Amethyst Oval Color Bezel Earrings in White Silver',
                            'design_code'   => 'XC7603',
                            'status'        => 1,
                            'part_group'    => '7603',
                            'part_group_id' => 0,
                            ],


 */