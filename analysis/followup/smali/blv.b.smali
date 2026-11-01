.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    const-string v0, "getReminderText(...)"

    .line 4
    .line 5
    iget v1, v5, Lblv;->$cid:I

    .line 6
    .line 7
    const-string v2, "getLocation(...)"

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const-string v6, "getBeginTime(...)"

    .line 11
    .line 12
    const-string v7, "<this>"

    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x1

    .line 18
    packed-switch v1, :pswitch_data_7f2

    .line 19
    .line 20
    .line 21
    sget-object v0, Laolu;->a:Laolu;

    .line 22
    .line 23
    iget v1, v5, Lblv;->a:I

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    if-eqz v1, :cond_7a0

    .line 29
    .line 30
    if-eq v1, v10, :cond_79d

    .line 31
    .line 32
    if-eq v1, v8, :cond_79a

    .line 33
    .line 34
    if-eq v1, v4, :cond_797

    .line 35
    .line 36
    goto/16 :goto_620

    .line 37
    .line 38
    :pswitch_25
    sget-object v0, Laolu;->a:Laolu;

    .line 39
    .line 40
    iget v1, v5, Lblv;->a:I

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    if-nez v1, :cond_44

    .line 46
    .line 47
    iget-object v1, v5, Lblv;->d:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v2, v5, Lblv;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v3, v5, Lblv;->e:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v4, v5, Lblv;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iput v10, v5, Lblv;->a:I

    .line 56
    .line 57
    check-cast v4, Lpzd;

    .line 58
    .line 59
    check-cast v3, Lpyw;

    .line 60
    .line 61
    check-cast v1, Luss;

    .line 62
    .line 63
    invoke-virtual {v1, v2, v3, v4, v5}, Luss;->m(Lhxf;Lpyw;Lpzd;Laoln;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eq v1, v0, :cond_7f0

    .line 68
    .line 69
    :cond_44
    sget-object v0, Laojh;->a:Laojh;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_47
    sget-object v0, Laolu;->a:Laolu;

    .line 73
    .line 74
    iget v1, v5, Lblv;->a:I

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    if-eqz v1, :cond_53

    .line 80
    .line 81
    if-eq v1, v10, :cond_6d

    .line 82
    .line 83
    goto :goto_9a

    .line 84
    :cond_53
    iget-object v1, v5, Lblv;->e:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v2, v5, Lblv;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Laoot;

    .line 89
    .line 90
    iget-object v2, v2, Laoot;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Lnwv;

    .line 93
    .line 94
    check-cast v1, Lnyl;

    .line 95
    .line 96
    iget-object v1, v1, Lnyl;->b:Lnwu;

    .line 97
    .line 98
    invoke-interface {v1, v2}, Lnwu;->h(Lnwv;)Lajcq;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput v10, v5, Lblv;->a:I

    .line 103
    .line 104
    invoke-static {v1, v5}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-eq v1, v0, :cond_7f0

    .line 109
    .line 110
    :cond_6d
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 111
    .line 112
    if-eqz v1, :cond_9a

    .line 113
    .line 114
    iget-object v2, v5, Lblv;->e:Ljava/lang/Object;

    .line 115
    .line 116
    iget-object v3, v5, Lblv;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Lnwy;

    .line 119
    .line 120
    iget v1, v1, Lnwy;->d:I

    .line 121
    .line 122
    invoke-static {v1}, Lnwx;->b(I)Lnwx;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-nez v1, :cond_81

    .line 127
    .line 128
    sget-object v1, Lnwx;->d:Lnwx;

    .line 129
    .line 130
    :cond_81
    check-cast v2, Lnyl;

    .line 131
    .line 132
    iget-object v2, v2, Lnyl;->a:Lnxg;

    .line 133
    .line 134
    iput v8, v5, Lblv;->a:I

    .line 135
    .line 136
    iget-object v4, v2, Lnxg;->b:Laolr;

    .line 137
    .line 138
    new-instance v6, Lnxf;

    .line 139
    .line 140
    check-cast v3, Ljava/lang/String;

    .line 141
    .line 142
    invoke-direct {v6, v2, v3, v1, v9}, Lnxf;-><init>(Lnxg;Ljava/lang/String;Lnwx;Laoln;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v4, v6, v5}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-eq v1, v0, :cond_98

    .line 150
    .line 151
    sget-object v1, Laojh;->a:Laojh;

    .line 152
    .line 153
    :cond_98
    if-eq v1, v0, :cond_7f0

    .line 154
    .line 155
    :cond_9a
    :goto_9a
    sget-object v0, Laojh;->a:Laojh;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_9d
    sget-object v0, Laolu;->a:Laolu;

    .line 159
    .line 160
    iget v1, v5, Lblv;->a:I

    .line 161
    .line 162
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    if-nez v1, :cond_620

    .line 166
    .line 167
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 168
    .line 169
    iget-object v2, v5, Lblv;->e:Ljava/lang/Object;

    .line 170
    .line 171
    iget-object v14, v5, Lblv;->d:Ljava/lang/Object;

    .line 172
    .line 173
    iget-object v15, v5, Lblv;->c:Ljava/lang/Object;

    .line 174
    .line 175
    new-instance v11, Lksf;

    .line 176
    .line 177
    move-object v13, v2

    .line 178
    check-cast v13, Lor;

    .line 179
    .line 180
    move-object v12, v1

    .line 181
    check-cast v12, Laz;

    .line 182
    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    invoke-direct/range {v11 .. v16}, Lksf;-><init>(Laz;Lor;Ljava/lang/Object;Laomy;Laoln;)V

    .line 186
    .line 187
    .line 188
    new-instance v1, Laoxa;

    .line 189
    .line 190
    invoke-direct {v1, v11}, Laoxa;-><init>(Laonn;)V

    .line 191
    .line 192
    .line 193
    iput v10, v5, Lblv;->a:I

    .line 194
    .line 195
    invoke-static {v1, v5}, Laoov;->au(Laoxh;Laoln;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    if-ne v1, v0, :cond_4ae

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_c9
    sget-object v9, Laolu;->a:Laolu;

    .line 203
    .line 204
    iget v1, v5, Lblv;->a:I

    .line 205
    .line 206
    if-eqz v1, :cond_d6

    .line 207
    .line 208
    :try_start_cf
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_d2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_cf .. :try_end_d2} :catch_165

    .line 209
    .line 210
    .line 211
    move-object/from16 v0, p1

    .line 212
    .line 213
    goto/16 :goto_154

    .line 214
    .line 215
    :cond_d6
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :try_start_d9
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 219
    .line 220
    iget-object v3, v5, Lblv;->b:Ljava/lang/Object;

    .line 221
    .line 222
    iget-object v4, v5, Lblv;->d:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v4, Lksd;

    .line 225
    .line 226
    iget-object v4, v4, Lksd;->a:Lkrb;

    .line 227
    .line 228
    invoke-static {v4, v7}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    sget-object v7, Labdr;->a:Labdr;

    .line 232
    .line 233
    invoke-virtual {v7}, Lalad;->m()Lakzx;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-static {v7}, Lafsq;->cS(Lakzx;)Lvaa;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    iget-object v11, v4, Lkrb;->c:Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v11, v0}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v11}, Lvaa;->af(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object v11, v4, Lkrb;->c:Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v11, v0}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7, v11}, Lvaa;->ac(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iget-object v0, v4, Lkrb;->e:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v0, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7, v0}, Lvaa;->ad(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v4, Lkrb;->d:Lalcf;

    .line 266
    .line 267
    if-nez v0, :cond_10e

    .line 268
    .line 269
    sget-object v0, Lalcf;->a:Lalcf;

    .line 270
    .line 271
    :cond_10e
    invoke-static {v0, v6}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v0}, Lhgz;->w(Lalcf;)J

    .line 275
    .line 276
    .line 277
    move-result-wide v11

    .line 278
    invoke-virtual {v7, v11, v12}, Lvaa;->ae(J)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7}, Lvaa;->ag()V

    .line 282
    .line 283
    .line 284
    iget-object v0, v7, Lvaa;->a:Ljava/lang/Object;

    .line 285
    .line 286
    move-object v2, v0

    .line 287
    check-cast v2, Lakzx;

    .line 288
    .line 289
    invoke-virtual {v2}, Lakzx;->u()V

    .line 290
    .line 291
    .line 292
    check-cast v0, Lakzx;

    .line 293
    .line 294
    iget-object v0, v0, Lakzx;->b:Lalad;

    .line 295
    .line 296
    check-cast v0, Labdr;

    .line 297
    .line 298
    iput v8, v0, Labdr;->c:I

    .line 299
    .line 300
    iget v2, v0, Labdr;->b:I

    .line 301
    .line 302
    or-int/2addr v2, v10

    .line 303
    iput v2, v0, Labdr;->b:I

    .line 304
    .line 305
    invoke-virtual {v7}, Lvaa;->ab()Labdr;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v0}, Lafsq;->bF(Labdr;)Landroid/content/Intent;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    move-object v0, v3

    .line 314
    sget-object v3, Lksb;->a:Lksb;

    .line 315
    .line 316
    iget-object v4, v5, Lblv;->e:Ljava/lang/Object;

    .line 317
    .line 318
    new-instance v6, Lkgq;

    .line 319
    .line 320
    const/16 v7, 0x8

    .line 321
    .line 322
    invoke-direct {v6, v4, v7}, Lkgq;-><init>(Ljava/lang/Object;I)V

    .line 323
    .line 324
    .line 325
    iput v10, v5, Lblv;->a:I

    .line 326
    .line 327
    check-cast v0, Laz;

    .line 328
    .line 329
    check-cast v1, Lksg;

    .line 330
    .line 331
    move-object v4, v1

    .line 332
    move-object v1, v0

    .line 333
    move-object v0, v4

    .line 334
    move-object v4, v6

    .line 335
    invoke-virtual/range {v0 .. v5}, Lksg;->b(Laz;Ljava/lang/Object;Lor;Laomy;Laoln;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eq v0, v9, :cond_7e2

    .line 340
    .line 341
    :goto_154
    check-cast v0, Lksc;

    .line 342
    .line 343
    iget-boolean v0, v0, Lksc;->a:Z

    .line 344
    .line 345
    if-eqz v0, :cond_17d

    .line 346
    .line 347
    iget-object v0, v5, Lblv;->e:Ljava/lang/Object;

    .line 348
    .line 349
    new-instance v1, Lkri;

    .line 350
    .line 351
    invoke-direct {v1, v10}, Lkri;-><init>(I)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v0, v1}, Lkrk;->a(Lkrj;)V
    :try_end_164
    .catch Landroid/content/ActivityNotFoundException; {:try_start_d9 .. :try_end_164} :catch_165

    .line 355
    .line 356
    .line 357
    goto :goto_17d

    .line 358
    :catch_165
    iget-object v0, v5, Lblv;->e:Ljava/lang/Object;

    .line 359
    .line 360
    new-instance v1, Lkrh;

    .line 361
    .line 362
    invoke-direct {v1, v8}, Lkrh;-><init>(I)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v0, v1}, Lkrk;->a(Lkrj;)V

    .line 366
    .line 367
    .line 368
    iget-object v0, v5, Lblv;->b:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, Landroid/content/Context;

    .line 371
    .line 372
    const v1, 0x7f140a92

    .line 373
    .line 374
    .line 375
    invoke-static {v0, v1, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 380
    .line 381
    .line 382
    :cond_17d
    :goto_17d
    sget-object v0, Laojh;->a:Laojh;

    .line 383
    .line 384
    return-object v0

    .line 385
    :pswitch_180
    sget-object v9, Laolu;->a:Laolu;

    .line 386
    .line 387
    iget v0, v5, Lblv;->a:I

    .line 388
    .line 389
    const-string v11, "getEndTime(...)"

    .line 390
    .line 391
    if-eqz v0, :cond_18f

    .line 392
    .line 393
    :try_start_188
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_18b
    .catch Landroid/content/ActivityNotFoundException; {:try_start_188 .. :try_end_18b} :catch_22c

    .line 394
    .line 395
    .line 396
    move-object/from16 v0, p1

    .line 397
    .line 398
    goto/16 :goto_21a

    .line 399
    .line 400
    :cond_18f
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :try_start_192
    iget-object v0, v5, Lblv;->c:Ljava/lang/Object;

    .line 404
    .line 405
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 406
    .line 407
    iget-object v3, v5, Lblv;->d:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v3, Lkrz;

    .line 410
    .line 411
    iget-object v3, v3, Lkrz;->a:Lkqw;

    .line 412
    .line 413
    invoke-static {v3, v7}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    sget-object v4, Labdr;->a:Labdr;

    .line 417
    .line 418
    invoke-virtual {v4}, Lalad;->m()Lakzx;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-static {v4}, Lafsq;->cS(Lakzx;)Lvaa;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    iget-object v12, v3, Lkqw;->c:Ljava/lang/String;

    .line 427
    .line 428
    const-string v13, "getCalendarInviteTitle(...)"

    .line 429
    .line 430
    invoke-static {v12, v13}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4, v12}, Lvaa;->af(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    iget-object v12, v3, Lkqw;->g:Ljava/lang/String;

    .line 437
    .line 438
    const-string v13, "getDescription(...)"

    .line 439
    .line 440
    invoke-static {v12, v13}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v4, v12}, Lvaa;->ac(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    iget-object v12, v3, Lkqw;->f:Ljava/lang/String;

    .line 447
    .line 448
    invoke-static {v12, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v12}, Lvaa;->ad(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    iget-object v2, v3, Lkqw;->d:Lalcf;

    .line 455
    .line 456
    if-nez v2, :cond_1cb

    .line 457
    .line 458
    sget-object v2, Lalcf;->a:Lalcf;

    .line 459
    .line 460
    :cond_1cb
    invoke-static {v2, v6}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-static {v2}, Lhgz;->w(Lalcf;)J

    .line 464
    .line 465
    .line 466
    move-result-wide v12

    .line 467
    invoke-virtual {v4, v12, v13}, Lvaa;->ae(J)V

    .line 468
    .line 469
    .line 470
    iget-object v2, v3, Lkqw;->e:Lalcf;

    .line 471
    .line 472
    if-nez v2, :cond_1db

    .line 473
    .line 474
    sget-object v2, Lalcf;->a:Lalcf;

    .line 475
    .line 476
    :cond_1db
    invoke-static {v2, v11}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v2}, Lhgz;->w(Lalcf;)J

    .line 480
    .line 481
    .line 482
    move-result-wide v2

    .line 483
    iget-object v12, v4, Lvaa;->a:Ljava/lang/Object;

    .line 484
    .line 485
    move-object v13, v12

    .line 486
    check-cast v13, Lakzx;

    .line 487
    .line 488
    invoke-virtual {v13}, Lakzx;->u()V

    .line 489
    .line 490
    .line 491
    check-cast v12, Lakzx;

    .line 492
    .line 493
    iget-object v12, v12, Lakzx;->b:Lalad;

    .line 494
    .line 495
    check-cast v12, Labdr;

    .line 496
    .line 497
    iget v13, v12, Labdr;->b:I

    .line 498
    .line 499
    or-int/lit8 v13, v13, 0x20

    .line 500
    .line 501
    iput v13, v12, Labdr;->b:I

    .line 502
    .line 503
    iput-wide v2, v12, Labdr;->g:J

    .line 504
    .line 505
    invoke-virtual {v4}, Lvaa;->ag()V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v4}, Lvaa;->ab()Labdr;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-static {v2}, Lafsq;->bF(Labdr;)Landroid/content/Intent;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    sget-object v3, Lksb;->a:Lksb;

    .line 517
    .line 518
    iget-object v4, v5, Lblv;->e:Ljava/lang/Object;

    .line 519
    .line 520
    new-instance v12, Lkgq;

    .line 521
    .line 522
    const/4 v13, 0x7

    .line 523
    invoke-direct {v12, v4, v13}, Lkgq;-><init>(Ljava/lang/Object;I)V

    .line 524
    .line 525
    .line 526
    iput v10, v5, Lblv;->a:I

    .line 527
    .line 528
    check-cast v1, Laz;

    .line 529
    .line 530
    check-cast v0, Lksg;

    .line 531
    .line 532
    move-object v4, v12

    .line 533
    invoke-virtual/range {v0 .. v5}, Lksg;->b(Laz;Ljava/lang/Object;Lor;Laomy;Laoln;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    if-eq v0, v9, :cond_7e2

    .line 538
    .line 539
    :goto_21a
    check-cast v0, Lksc;

    .line 540
    .line 541
    iget-boolean v0, v0, Lksc;->a:Z

    .line 542
    .line 543
    if-eqz v0, :cond_2b9

    .line 544
    .line 545
    iget-object v0, v5, Lblv;->e:Ljava/lang/Object;

    .line 546
    .line 547
    new-instance v1, Lkri;

    .line 548
    .line 549
    invoke-direct {v1, v10}, Lkri;-><init>(I)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v0, v1}, Lkrk;->a(Lkrj;)V
    :try_end_22a
    .catch Landroid/content/ActivityNotFoundException; {:try_start_192 .. :try_end_22a} :catch_22c

    .line 553
    .line 554
    .line 555
    goto/16 :goto_2b9

    .line 556
    .line 557
    :catch_22c
    :try_start_22c
    iget-object v0, v5, Lblv;->b:Ljava/lang/Object;

    .line 558
    .line 559
    iget-object v1, v5, Lblv;->d:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v1, Lkrz;

    .line 562
    .line 563
    iget-object v1, v1, Lkrz;->a:Lkqw;

    .line 564
    .line 565
    invoke-static {v1, v7}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    new-instance v2, Landroid/content/Intent;

    .line 569
    .line 570
    const-string v3, "android.intent.action.INSERT"

    .line 571
    .line 572
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    const/high16 v3, 0x10000000

    .line 576
    .line 577
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    invoke-virtual {v2, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    sget-object v3, Landroid/provider/CalendarContract$Events;->CONTENT_URI:Landroid/net/Uri;

    .line 586
    .line 587
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const-string v3, "title"

    .line 592
    .line 593
    iget-object v4, v1, Lkqw;->c:Ljava/lang/String;

    .line 594
    .line 595
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const-string v3, "description"

    .line 600
    .line 601
    iget-object v4, v1, Lkqw;->g:Ljava/lang/String;

    .line 602
    .line 603
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    const-string v3, "eventLocation"

    .line 608
    .line 609
    iget-object v4, v1, Lkqw;->f:Ljava/lang/String;

    .line 610
    .line 611
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    const-string v3, "beginTime"

    .line 616
    .line 617
    iget-object v4, v1, Lkqw;->d:Lalcf;

    .line 618
    .line 619
    if-nez v4, :cond_26e

    .line 620
    .line 621
    sget-object v4, Lalcf;->a:Lalcf;

    .line 622
    .line 623
    :cond_26e
    invoke-static {v4, v6}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    invoke-static {v4}, Lhgz;->w(Lalcf;)J

    .line 627
    .line 628
    .line 629
    move-result-wide v6

    .line 630
    invoke-virtual {v2, v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    const-string v3, "endTime"

    .line 635
    .line 636
    iget-object v1, v1, Lkqw;->e:Lalcf;

    .line 637
    .line 638
    if-nez v1, :cond_281

    .line 639
    .line 640
    sget-object v1, Lalcf;->a:Lalcf;

    .line 641
    .line 642
    :cond_281
    invoke-static {v1, v11}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    invoke-static {v1}, Lhgz;->w(Lalcf;)J

    .line 646
    .line 647
    .line 648
    move-result-wide v6

    .line 649
    invoke-virtual {v2, v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    const-string v2, "putExtra(...)"

    .line 654
    .line 655
    invoke-static {v1, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    check-cast v0, Landroid/content/Context;

    .line 659
    .line 660
    invoke-static {v0, v1}, Lahqx;->l(Landroid/content/Context;Landroid/content/Intent;)V

    .line 661
    .line 662
    .line 663
    iget-object v0, v5, Lblv;->e:Ljava/lang/Object;

    .line 664
    .line 665
    new-instance v1, Lkrg;

    .line 666
    .line 667
    invoke-direct {v1, v8}, Lkrg;-><init>(I)V

    .line 668
    .line 669
    .line 670
    invoke-interface {v0, v1}, Lkrk;->a(Lkrj;)V
    :try_end_2a0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_22c .. :try_end_2a0} :catch_2a1

    .line 671
    .line 672
    .line 673
    goto :goto_2b9

    .line 674
    :catch_2a1
    iget-object v0, v5, Lblv;->e:Ljava/lang/Object;

    .line 675
    .line 676
    new-instance v1, Lkrh;

    .line 677
    .line 678
    invoke-direct {v1, v10}, Lkrh;-><init>(I)V

    .line 679
    .line 680
    .line 681
    invoke-interface {v0, v1}, Lkrk;->a(Lkrj;)V

    .line 682
    .line 683
    .line 684
    iget-object v0, v5, Lblv;->b:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Landroid/content/Context;

    .line 687
    .line 688
    const v1, 0x7f1401cb

    .line 689
    .line 690
    .line 691
    invoke-static {v0, v1, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 696
    .line 697
    .line 698
    :cond_2b9
    :goto_2b9
    sget-object v0, Laojh;->a:Laojh;

    .line 699
    .line 700
    return-object v0

    .line 701
    :pswitch_2bc
    sget-object v0, Laolu;->a:Laolu;

    .line 702
    .line 703
    iget v1, v5, Lblv;->a:I

    .line 704
    .line 705
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    if-eqz v1, :cond_2c8

    .line 709
    .line 710
    move-object/from16 v1, p1

    .line 711
    .line 712
    goto :goto_2dc

    .line 713
    :cond_2c8
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v1, Lili;

    .line 716
    .line 717
    invoke-virtual {v1}, Lili;->f()Likq;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-interface {v1}, Likq;->bl()Lajcq;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    iput v10, v5, Lblv;->a:I

    .line 726
    .line 727
    invoke-static {v1, v5}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    if-eq v1, v0, :cond_7f0

    .line 732
    .line 733
    :goto_2dc
    check-cast v1, Lj$/util/Optional;

    .line 734
    .line 735
    new-instance v0, Lguv;

    .line 736
    .line 737
    const/16 v2, 0xd

    .line 738
    .line 739
    invoke-direct {v0, v2}, Lguv;-><init>(I)V

    .line 740
    .line 741
    .line 742
    new-instance v4, Lhvd;

    .line 743
    .line 744
    invoke-direct {v4, v0, v3}, Lhvd;-><init>(Ljava/lang/Object;I)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v1}, Lj$/util/Optional;->isPresent()Z

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    if-ne v10, v0, :cond_2fe

    .line 752
    .line 753
    invoke-virtual {v1}, Lj$/util/Optional;->get()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    iget-object v1, v4, Lhvd;->a:Ljava/lang/Object;

    .line 758
    .line 759
    invoke-interface {v1, v0}, Laonj;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-static {v0}, Lj$/util/Optional;->ofNullable(Ljava/lang/Object;)Lj$/util/Optional;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    :cond_2fe
    invoke-virtual {v1}, Lj$/util/Optional;->isPresent()Z

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    if-eq v10, v0, :cond_307

    .line 772
    .line 773
    sget-object v0, Lalqh;->a:Lalqh;

    .line 774
    .line 775
    goto :goto_30b

    .line 776
    :cond_307
    invoke-virtual {v1}, Lj$/util/Optional;->get()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    :goto_30b
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 781
    .line 782
    iget-object v3, v5, Lblv;->d:Ljava/lang/Object;

    .line 783
    .line 784
    iget-object v4, v5, Lblv;->c:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v0, Lalqh;

    .line 787
    .line 788
    move-object v6, v1

    .line 789
    check-cast v6, Lili;

    .line 790
    .line 791
    iget-object v7, v6, Lili;->j:Laljf;

    .line 792
    .line 793
    check-cast v4, Ljava/lang/String;

    .line 794
    .line 795
    check-cast v3, Lamba;

    .line 796
    .line 797
    invoke-virtual {v7, v0, v3, v1, v4}, Laljf;->a(Lalqh;Lamba;Lalip;Ljava/lang/String;)Lalje;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    iget-object v0, v5, Lblv;->e:Ljava/lang/Object;

    .line 802
    .line 803
    sget-object v3, Lili;->a:Lalqg;

    .line 804
    .line 805
    new-instance v4, Lild;

    .line 806
    .line 807
    invoke-direct {v4, v10}, Lild;-><init>(I)V

    .line 808
    .line 809
    .line 810
    iget-object v5, v6, Lili;->d:Lajcu;

    .line 811
    .line 812
    check-cast v0, Lalqk;

    .line 813
    .line 814
    invoke-virtual {v1, v3, v0, v4, v5}, Lalje;->a(Lalqg;Lalqk;Lalit;Lajcu;)V

    .line 815
    .line 816
    .line 817
    iput-boolean v10, v6, Lili;->g:Z

    .line 818
    .line 819
    new-instance v0, Lrig;

    .line 820
    .line 821
    invoke-direct {v0}, Lrig;-><init>()V

    .line 822
    .line 823
    .line 824
    iget-object v3, v6, Lili;->h:Ljava/util/Map;

    .line 825
    .line 826
    sget-object v4, Ligd;->b:Ligd;

    .line 827
    .line 828
    new-instance v5, Lrih;

    .line 829
    .line 830
    invoke-direct {v5, v0}, Lrih;-><init>(Lrig;)V

    .line 831
    .line 832
    .line 833
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    new-instance v3, Lrig;

    .line 837
    .line 838
    invoke-direct {v3}, Lrig;-><init>()V

    .line 839
    .line 840
    .line 841
    iget-object v4, v6, Lili;->h:Ljava/util/Map;

    .line 842
    .line 843
    sget-object v5, Ligd;->c:Ligd;

    .line 844
    .line 845
    new-instance v6, Lrih;

    .line 846
    .line 847
    invoke-direct {v6, v3}, Lrih;-><init>(Lrig;)V

    .line 848
    .line 849
    .line 850
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    new-instance v4, Laltz;

    .line 854
    .line 855
    invoke-direct {v4, v0}, Laltz;-><init>(Ljava/io/InputStream;)V

    .line 856
    .line 857
    .line 858
    new-instance v0, Lalua;

    .line 859
    .line 860
    invoke-direct {v0, v3}, Lalua;-><init>(Ljava/io/InputStream;)V

    .line 861
    .line 862
    .line 863
    const/16 v3, 0x10

    .line 864
    .line 865
    :try_start_360
    invoke-virtual {v1}, Lalje;->h()V
    :try_end_363
    .catch Lalio; {:try_start_360 .. :try_end_363} :catch_38d

    .line 866
    .line 867
    .line 868
    iget-object v5, v1, Lalje;->h:Lamgv;

    .line 869
    .line 870
    iget-object v6, v1, Lalje;->g:Lalqk;

    .line 871
    .line 872
    iget-object v7, v1, Lalje;->b:Laljg;

    .line 873
    .line 874
    invoke-interface {v7}, Laljg;->a()I

    .line 875
    .line 876
    .line 877
    move-result v7

    .line 878
    invoke-virtual {v5, v6, v7}, Lamgv;->a(Lalqk;I)V

    .line 879
    .line 880
    .line 881
    invoke-static {}, Lj$/util/Optional;->empty()Lj$/util/Optional;

    .line 882
    .line 883
    .line 884
    move-result-object v5

    .line 885
    invoke-virtual {v1, v5}, Lalje;->f(Lj$/util/Optional;)V

    .line 886
    .line 887
    .line 888
    iget-object v5, v1, Lalje;->i:Lajcu;

    .line 889
    .line 890
    new-instance v6, Lakbr;

    .line 891
    .line 892
    invoke-direct {v6, v1, v4, v3, v9}, Lakbr;-><init>(Ljava/lang/Object;Ljava/lang/Object;I[B)V

    .line 893
    .line 894
    .line 895
    invoke-interface {v5, v6}, Lajcu;->execute(Ljava/lang/Runnable;)V

    .line 896
    .line 897
    .line 898
    iget-object v3, v1, Lalje;->i:Lajcu;

    .line 899
    .line 900
    new-instance v4, Lakbr;

    .line 901
    .line 902
    invoke-direct {v4, v1, v0, v2, v9}, Lakbr;-><init>(Ljava/lang/Object;Ljava/lang/Object;I[B)V

    .line 903
    .line 904
    .line 905
    invoke-interface {v3, v4}, Lajcu;->execute(Ljava/lang/Runnable;)V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_4ae

    .line 909
    .line 910
    :catch_38d
    move-exception v0

    .line 911
    iget-object v2, v1, Lalje;->c:Lamgt;

    .line 912
    .line 913
    new-instance v4, Lachb;

    .line 914
    .line 915
    invoke-direct {v4, v0, v3}, Lachb;-><init>(Ljava/lang/Object;I)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v2, v4}, Lamgt;->b(Ljava/util/function/Consumer;)V

    .line 919
    .line 920
    .line 921
    sget-object v2, Lalje;->a:Laimz;

    .line 922
    .line 923
    invoke-virtual {v2}, Laimp;->d()Lainm;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    check-cast v2, Laimw;

    .line 928
    .line 929
    const/16 v3, 0x88

    .line 930
    .line 931
    const-string v4, "BGConversationImpl.java"

    .line 932
    .line 933
    const-string v5, "com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/BGConversationImpl"

    .line 934
    .line 935
    const-string v6, "start"

    .line 936
    .line 937
    invoke-interface {v2, v5, v6, v3, v4}, Laimw;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    check-cast v2, Laimw;

    .line 942
    .line 943
    const-string v3, "error on start: %s"

    .line 944
    .line 945
    invoke-virtual {v0}, Lalio;->getMessage()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    invoke-interface {v2, v3, v0}, Laimw;->y(Ljava/lang/String;Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v1}, Lalje;->c()V

    .line 953
    .line 954
    .line 955
    goto/16 :goto_4ae

    .line 956
    .line 957
    :pswitch_3bc
    sget-object v0, Laolu;->a:Laolu;

    .line 958
    .line 959
    iget v1, v5, Lblv;->a:I

    .line 960
    .line 961
    const-string v2, "Start"

    .line 962
    .line 963
    if-eqz v1, :cond_3d4

    .line 964
    .line 965
    if-eq v1, v10, :cond_3cd

    .line 966
    .line 967
    :try_start_3c6
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    move-object/from16 v1, p1

    .line 971
    .line 972
    goto/16 :goto_467

    .line 973
    .line 974
    :cond_3cd
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_3d0
    .catchall {:try_start_3c6 .. :try_end_3d0} :catchall_4b8

    .line 975
    .line 976
    .line 977
    move-object/from16 v1, p1

    .line 978
    .line 979
    goto/16 :goto_48f

    .line 980
    .line 981
    :cond_3d4
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 982
    .line 983
    .line 984
    :try_start_3d7
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 985
    .line 986
    move-object v3, v1

    .line 987
    check-cast v3, Liin;

    .line 988
    .line 989
    iget-object v3, v3, Liin;->b:Lmfz;

    .line 990
    .line 991
    invoke-static {v2}, Lgus;->aw(Ljava/lang/String;)Lmhc;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v3}, Lmfz;->c()V

    .line 995
    .line 996
    .line 997
    iget-object v6, v5, Lblv;->e:Ljava/lang/Object;

    .line 998
    .line 999
    move-object v7, v6

    .line 1000
    check-cast v7, Lifz;

    .line 1001
    .line 1002
    iget-object v7, v7, Lifz;->c:Lify;

    .line 1003
    .line 1004
    if-nez v7, :cond_3ef

    .line 1005
    .line 1006
    sget-object v7, Lify;->a:Lify;

    .line 1007
    .line 1008
    :cond_3ef
    iget v7, v7, Lify;->b:I

    .line 1009
    .line 1010
    invoke-static {v7}, Lifx;->b(I)Lifx;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v7

    .line 1014
    if-nez v7, :cond_3f9

    .line 1015
    .line 1016
    sget-object v7, Lifx;->d:Lifx;

    .line 1017
    .line 1018
    :cond_3f9
    sget-object v9, Lifx;->a:Lifx;
    :try_end_3fb
    .catchall {:try_start_3d7 .. :try_end_3fb} :catchall_4b8

    .line 1019
    .line 1020
    const-string v11, "start$<anonymous>"

    .line 1021
    .line 1022
    const-string v12, "com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl"

    .line 1023
    .line 1024
    const-string v13, "AudioPrismCallAudioReaderImpl.kt"

    .line 1025
    .line 1026
    if-ne v7, v9, :cond_427

    .line 1027
    .line 1028
    :try_start_403
    sget-object v0, Liin;->a:Laimz;

    .line 1029
    .line 1030
    invoke-virtual {v0}, Laimp;->c()Lainm;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    check-cast v0, Laimw;

    .line 1035
    .line 1036
    sget-object v1, Laioa;->b:Laioa;

    .line 1037
    .line 1038
    invoke-interface {v0, v1}, Laimw;->m(Laioa;)Lainm;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    const/16 v1, 0x72

    .line 1043
    .line 1044
    invoke-interface {v0, v12, v11, v1, v13}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    check-cast v0, Laimw;

    .line 1049
    .line 1050
    const-string v1, "Streaming type must be specified"

    .line 1051
    .line 1052
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    sget-object v0, Liga;->c:Liga;
    :try_end_420
    .catchall {:try_start_403 .. :try_end_420} :catchall_4b8

    .line 1056
    .line 1057
    invoke-static {v2}, Lgus;->aw(Ljava/lang/String;)Lmhc;

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v3}, Lmfz;->c()V

    .line 1061
    .line 1062
    .line 1063
    return-object v0

    .line 1064
    :cond_427
    :try_start_427
    new-instance v14, Lnfv;

    .line 1065
    .line 1066
    iget-object v3, v5, Lblv;->b:Ljava/lang/Object;

    .line 1067
    .line 1068
    iget-object v9, v5, Lblv;->d:Ljava/lang/Object;

    .line 1069
    .line 1070
    move-object/from16 v18, v9

    .line 1071
    .line 1072
    check-cast v18, Ligg;

    .line 1073
    .line 1074
    move-object/from16 v16, v3

    .line 1075
    .line 1076
    check-cast v16, Lifv;

    .line 1077
    .line 1078
    move-object/from16 v17, v6

    .line 1079
    .line 1080
    check-cast v17, Lifz;

    .line 1081
    .line 1082
    move-object v15, v1

    .line 1083
    check-cast v15, Liin;

    .line 1084
    .line 1085
    const/16 v19, 0x0

    .line 1086
    .line 1087
    const/16 v20, 0x1

    .line 1088
    .line 1089
    invoke-direct/range {v14 .. v20}, Lnfv;-><init>(Liin;Lifv;Lifz;Ligg;Laoln;I)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v7}, Lifx;->ordinal()I

    .line 1093
    .line 1094
    .line 1095
    move-result v6

    .line 1096
    if-eqz v6, :cond_4b0

    .line 1097
    .line 1098
    if-eq v6, v10, :cond_481

    .line 1099
    .line 1100
    if-eq v6, v8, :cond_455

    .line 1101
    .line 1102
    if-eq v6, v4, :cond_4b0

    .line 1103
    .line 1104
    new-instance v0, Laois;

    .line 1105
    .line 1106
    invoke-direct {v0}, Laois;-><init>()V

    .line 1107
    .line 1108
    .line 1109
    throw v0

    .line 1110
    :cond_455
    sget-object v4, Ligg;->c:Ligg;

    .line 1111
    .line 1112
    if-ne v9, v4, :cond_46a

    .line 1113
    .line 1114
    sget-object v4, Lifx;->c:Lifx;

    .line 1115
    .line 1116
    iput v8, v5, Lblv;->a:I

    .line 1117
    .line 1118
    check-cast v3, Lifv;

    .line 1119
    .line 1120
    check-cast v1, Liin;

    .line 1121
    .line 1122
    invoke-virtual {v1, v4, v3, v14, v5}, Liin;->c(Lifx;Lifv;Laonj;Laoln;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v1

    .line 1126
    if-eq v1, v0, :cond_7f0

    .line 1127
    .line 1128
    :goto_467
    check-cast v1, Liga;

    .line 1129
    .line 1130
    goto :goto_491

    .line 1131
    :cond_46a
    sget-object v0, Liin;->a:Laimz;

    .line 1132
    .line 1133
    invoke-virtual {v0}, Laimp;->b()Lainm;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    const/16 v1, 0x89

    .line 1138
    .line 1139
    invoke-interface {v0, v12, v11, v1, v13}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    check-cast v0, Laimw;

    .line 1144
    .line 1145
    const-string v1, "requested uplink when Duolinks is unavailable"

    .line 1146
    .line 1147
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    sget-object v0, Liga;->f:Liga;

    .line 1151
    .line 1152
    move-object v1, v0

    .line 1153
    goto :goto_491

    .line 1154
    :cond_481
    sget-object v4, Lifx;->b:Lifx;

    .line 1155
    .line 1156
    iput v10, v5, Lblv;->a:I

    .line 1157
    .line 1158
    check-cast v3, Lifv;

    .line 1159
    .line 1160
    check-cast v1, Liin;

    .line 1161
    .line 1162
    invoke-virtual {v1, v4, v3, v14, v5}, Liin;->c(Lifx;Lifv;Laonj;Laoln;)Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    if-eq v1, v0, :cond_7f0

    .line 1167
    .line 1168
    :goto_48f
    check-cast v1, Liga;

    .line 1169
    .line 1170
    :goto_491
    sget-object v0, Liga;->b:Liga;

    .line 1171
    .line 1172
    if-ne v1, v0, :cond_4a2

    .line 1173
    .line 1174
    iget-object v0, v5, Lblv;->c:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v0, Liin;

    .line 1177
    .line 1178
    iget-object v0, v0, Liin;->i:Lj$/util/concurrent/ConcurrentHashMap;

    .line 1179
    .line 1180
    iget-object v3, v5, Lblv;->b:Ljava/lang/Object;

    .line 1181
    .line 1182
    iget-object v4, v5, Lblv;->e:Ljava/lang/Object;

    .line 1183
    .line 1184
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4a2
    .catchall {:try_start_427 .. :try_end_4a2} :catchall_4b8

    .line 1185
    .line 1186
    .line 1187
    :cond_4a2
    iget-object v0, v5, Lblv;->c:Ljava/lang/Object;

    .line 1188
    .line 1189
    invoke-static {v2}, Lgus;->aw(Ljava/lang/String;)Lmhc;

    .line 1190
    .line 1191
    .line 1192
    check-cast v0, Liin;

    .line 1193
    .line 1194
    iget-object v0, v0, Liin;->b:Lmfz;

    .line 1195
    .line 1196
    invoke-virtual {v0}, Lmfz;->c()V

    .line 1197
    .line 1198
    .line 1199
    :cond_4ae
    :goto_4ae
    move-object v0, v1

    .line 1200
    return-object v0

    .line 1201
    :cond_4b0
    :try_start_4b0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1202
    .line 1203
    const-string v1, "Streaming type unrecognized, should never happen"

    .line 1204
    .line 1205
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    throw v0
    :try_end_4b8
    .catchall {:try_start_4b0 .. :try_end_4b8} :catchall_4b8

    .line 1209
    :catchall_4b8
    move-exception v0

    .line 1210
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 1211
    .line 1212
    invoke-static {v2}, Lgus;->aw(Ljava/lang/String;)Lmhc;

    .line 1213
    .line 1214
    .line 1215
    check-cast v1, Liin;

    .line 1216
    .line 1217
    iget-object v1, v1, Liin;->b:Lmfz;

    .line 1218
    .line 1219
    invoke-virtual {v1}, Lmfz;->c()V

    .line 1220
    .line 1221
    .line 1222
    throw v0

    .line 1223
    :pswitch_4c6
    sget-object v0, Laolu;->a:Laolu;

    .line 1224
    .line 1225
    iget v1, v5, Lblv;->a:I

    .line 1226
    .line 1227
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1228
    .line 1229
    .line 1230
    if-nez v1, :cond_584

    .line 1231
    .line 1232
    iget-object v1, v5, Lblv;->d:Ljava/lang/Object;

    .line 1233
    .line 1234
    iget-object v2, v5, Lblv;->b:Ljava/lang/Object;

    .line 1235
    .line 1236
    iget-object v3, v5, Lblv;->e:Ljava/lang/Object;

    .line 1237
    .line 1238
    invoke-static {v3}, Lhgu;->f(Ljava/lang/Object;)I

    .line 1239
    .line 1240
    .line 1241
    move-result v4

    .line 1242
    if-eqz v4, :cond_4e3

    .line 1243
    .line 1244
    if-eq v4, v10, :cond_4e0

    .line 1245
    .line 1246
    const-string v4, ""

    .line 1247
    .line 1248
    goto :goto_502

    .line 1249
    :cond_4e0
    check-cast v3, Lhya;

    .line 1250
    .line 1251
    throw v9

    .line 1252
    :cond_4e3
    move-object v4, v1

    .line 1253
    check-cast v4, Lhys;

    .line 1254
    .line 1255
    iget-object v6, v4, Lhys;->c:Landroid/content/Context;

    .line 1256
    .line 1257
    invoke-virtual {v4}, Lhys;->c()Ljava/util/Locale;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    invoke-static {v4}, Lj$/util/Optional;->of(Ljava/lang/Object;)Lj$/util/Optional;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v4

    .line 1265
    invoke-static {v6, v4}, Lgus;->ad(Landroid/content/Context;Lj$/util/Optional;)Landroid/content/res/Resources;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v4

    .line 1269
    move-object v6, v3

    .line 1270
    check-cast v6, Lhxz;

    .line 1271
    .line 1272
    iget v6, v6, Lhxz;->a:I

    .line 1273
    .line 1274
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v4

    .line 1278
    const-string v6, "getString(...)"

    .line 1279
    .line 1280
    invoke-static {v4, v6}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    :goto_502
    iget-object v6, v5, Lblv;->c:Ljava/lang/Object;

    .line 1284
    .line 1285
    instance-of v7, v3, Lhya;

    .line 1286
    .line 1287
    if-nez v7, :cond_599

    .line 1288
    .line 1289
    if-nez v7, :cond_596

    .line 1290
    .line 1291
    iput v10, v5, Lblv;->a:I

    .line 1292
    .line 1293
    new-instance v3, Laosc;

    .line 1294
    .line 1295
    invoke-static {v5}, Lajsz;->ap(Laoln;)Laoln;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v5

    .line 1299
    invoke-direct {v3, v5, v10}, Laosc;-><init>(Laoln;I)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v3}, Laosc;->z()V

    .line 1303
    .line 1304
    .line 1305
    check-cast v6, Ljava/io/File;

    .line 1306
    .line 1307
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v5

    .line 1311
    const-string v7, "getAbsolutePath(...)"

    .line 1312
    .line 1313
    invoke-static {v5, v7}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    new-instance v7, Lhyr;

    .line 1317
    .line 1318
    move-object v8, v2

    .line 1319
    check-cast v8, Landroid/speech/tts/TextToSpeech;

    .line 1320
    .line 1321
    check-cast v1, Lhys;

    .line 1322
    .line 1323
    invoke-direct {v7, v8, v3, v5, v1}, Lhyr;-><init>(Landroid/speech/tts/TextToSpeech;Laosb;Ljava/lang/String;Lhys;)V

    .line 1324
    .line 1325
    .line 1326
    iget-object v9, v1, Lhys;->d:Laoin;

    .line 1327
    .line 1328
    invoke-interface {v9}, Laoin;->a()Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v9

    .line 1332
    check-cast v9, Ljava/lang/Boolean;

    .line 1333
    .line 1334
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1335
    .line 1336
    .line 1337
    move-result v9

    .line 1338
    if-eqz v9, :cond_545

    .line 1339
    .line 1340
    new-instance v9, Laib;

    .line 1341
    .line 1342
    const/16 v10, 0x13

    .line 1343
    .line 1344
    invoke-direct {v9, v2, v10}, Laib;-><init>(Ljava/lang/Object;I)V

    .line 1345
    .line 1346
    .line 1347
    invoke-interface {v3, v9}, Laosb;->d(Laonj;)V

    .line 1348
    .line 1349
    .line 1350
    :cond_545
    invoke-virtual {v8, v7}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceProgressListener(Landroid/speech/tts/UtteranceProgressListener;)I

    .line 1351
    .line 1352
    .line 1353
    new-instance v2, Landroid/os/Bundle;

    .line 1354
    .line 1355
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v7

    .line 1362
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v7

    .line 1366
    const-string v9, "ttsFileProvider-"

    .line 1367
    .line 1368
    invoke-virtual {v9, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v7

    .line 1372
    invoke-virtual {v8, v4, v2, v6, v7}, Landroid/speech/tts/TextToSpeech;->synthesizeToFile(Ljava/lang/CharSequence;Landroid/os/Bundle;Ljava/io/File;Ljava/lang/String;)I

    .line 1373
    .line 1374
    .line 1375
    move-result v2

    .line 1376
    if-nez v2, :cond_587

    .line 1377
    .line 1378
    sget-object v1, Lhys;->a:Laimz;

    .line 1379
    .line 1380
    invoke-virtual {v1}, Laimp;->b()Lainm;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v1

    .line 1384
    const/16 v2, 0xb4

    .line 1385
    .line 1386
    const-string v4, "TtsFileProvider.kt"

    .line 1387
    .line 1388
    const-string v6, "com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider"

    .line 1389
    .line 1390
    const-string v7, "synthesizeTextIntoFile$<anonymous>"

    .line 1391
    .line 1392
    invoke-interface {v1, v6, v7, v2, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    check-cast v1, Laimw;

    .line 1397
    .line 1398
    const-string v2, "attempting to generate: %s"

    .line 1399
    .line 1400
    invoke-interface {v1, v2, v5}, Laimw;->y(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v3}, Laosc;->k()Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v1

    .line 1407
    if-eq v1, v0, :cond_582

    .line 1408
    .line 1409
    sget-object v1, Laojh;->a:Laojh;

    .line 1410
    .line 1411
    :cond_582
    if-eq v1, v0, :cond_7f0

    .line 1412
    .line 1413
    :cond_584
    sget-object v0, Laojh;->a:Laojh;

    .line 1414
    .line 1415
    return-object v0

    .line 1416
    :cond_587
    iget-object v0, v1, Lhys;->e:Lrlv;

    .line 1417
    .line 1418
    sget-object v1, Lrmx;->nl:Lrmx;

    .line 1419
    .line 1420
    invoke-interface {v0, v1}, Lrlv;->o(Lrmx;)V

    .line 1421
    .line 1422
    .line 1423
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1424
    .line 1425
    const-string v1, "tts invocation failed."

    .line 1426
    .line 1427
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1428
    .line 1429
    .line 1430
    throw v0

    .line 1431
    :cond_596
    check-cast v3, Lhya;

    .line 1432
    .line 1433
    throw v9

    .line 1434
    :cond_599
    check-cast v3, Lhya;

    .line 1435
    .line 1436
    throw v9

    .line 1437
    :pswitch_59c
    sget-object v0, Laolu;->a:Laolu;

    .line 1438
    .line 1439
    iget v1, v5, Lblv;->a:I

    .line 1440
    .line 1441
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1442
    .line 1443
    .line 1444
    if-nez v1, :cond_5bf

    .line 1445
    .line 1446
    iget-object v1, v5, Lblv;->e:Ljava/lang/Object;

    .line 1447
    .line 1448
    iget-object v2, v5, Lblv;->c:Ljava/lang/Object;

    .line 1449
    .line 1450
    check-cast v2, Laoot;

    .line 1451
    .line 1452
    iget-object v2, v2, Laoot;->a:Ljava/lang/Object;

    .line 1453
    .line 1454
    check-cast v2, Ljava/lang/String;

    .line 1455
    .line 1456
    iget-object v3, v5, Lblv;->d:Ljava/lang/Object;

    .line 1457
    .line 1458
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1459
    .line 1460
    .line 1461
    move-result v3

    .line 1462
    iput v10, v5, Lblv;->a:I

    .line 1463
    .line 1464
    check-cast v1, Lhtr;

    .line 1465
    .line 1466
    invoke-virtual {v1, v2, v3, v5}, Lhtr;->u(Ljava/lang/String;ILaoln;)Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v1

    .line 1470
    if-eq v1, v0, :cond_7f0

    .line 1471
    .line 1472
    :cond_5bf
    sget-object v0, Laojh;->a:Laojh;

    .line 1473
    .line 1474
    return-object v0

    .line 1475
    :pswitch_5c2
    sget-object v0, Laolu;->a:Laolu;

    .line 1476
    .line 1477
    iget v1, v5, Lblv;->a:I

    .line 1478
    .line 1479
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1480
    .line 1481
    .line 1482
    if-nez v1, :cond_620

    .line 1483
    .line 1484
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 1485
    .line 1486
    iget-object v2, v5, Lblv;->b:Ljava/lang/Object;

    .line 1487
    .line 1488
    iget-object v3, v5, Lblv;->e:Ljava/lang/Object;

    .line 1489
    .line 1490
    iget-object v4, v5, Lblv;->d:Ljava/lang/Object;

    .line 1491
    .line 1492
    iput v10, v5, Lblv;->a:I

    .line 1493
    .line 1494
    check-cast v4, Lgxl;

    .line 1495
    .line 1496
    check-cast v3, Lipc;

    .line 1497
    .line 1498
    check-cast v2, Lgsg;

    .line 1499
    .line 1500
    check-cast v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 1501
    .line 1502
    invoke-virtual {v1, v2, v3, v4, v5}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l(Lgsg;Lipc;Lgxl;Laoln;)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    if-ne v1, v0, :cond_4ae

    .line 1507
    .line 1508
    return-object v0

    .line 1509
    :pswitch_5e4
    sget-object v0, Laolu;->a:Laolu;

    .line 1510
    .line 1511
    iget v1, v5, Lblv;->a:I

    .line 1512
    .line 1513
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1514
    .line 1515
    .line 1516
    if-eqz v1, :cond_5f0

    .line 1517
    .line 1518
    move-object/from16 v1, p1

    .line 1519
    .line 1520
    goto :goto_600

    .line 1521
    :cond_5f0
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 1522
    .line 1523
    iget-object v2, v5, Lblv;->e:Ljava/lang/Object;

    .line 1524
    .line 1525
    iput v10, v5, Lblv;->a:I

    .line 1526
    .line 1527
    check-cast v2, Lgxl;

    .line 1528
    .line 1529
    check-cast v1, Lipc;

    .line 1530
    .line 1531
    invoke-static {v1, v2, v5}, Lgzb;->a(Lipc;Lgxl;Laoln;)Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v1

    .line 1535
    if-eq v1, v0, :cond_7f0

    .line 1536
    .line 1537
    :goto_600
    check-cast v1, Ljava/lang/Number;

    .line 1538
    .line 1539
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1540
    .line 1541
    .line 1542
    move-result v0

    .line 1543
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 1544
    .line 1545
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1546
    .line 1547
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1548
    .line 1549
    .line 1550
    iget-object v0, v5, Lblv;->d:Ljava/lang/Object;

    .line 1551
    .line 1552
    invoke-interface {v0, v10}, Lajcq;->cancel(Z)Z

    .line 1553
    .line 1554
    .line 1555
    sget-object v0, Laojh;->a:Laojh;

    .line 1556
    .line 1557
    return-object v0

    .line 1558
    :pswitch_615
    sget-object v0, Laolu;->a:Laolu;

    .line 1559
    .line 1560
    iget v1, v5, Lblv;->a:I

    .line 1561
    .line 1562
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1563
    .line 1564
    .line 1565
    if-eqz v1, :cond_626

    .line 1566
    .line 1567
    if-eq v1, v10, :cond_623

    .line 1568
    .line 1569
    :cond_620
    :goto_620
    move-object/from16 v0, p1

    .line 1570
    .line 1571
    return-object v0

    .line 1572
    :cond_623
    move-object/from16 v1, p1

    .line 1573
    .line 1574
    goto :goto_636

    .line 1575
    :cond_626
    iget-object v1, v5, Lblv;->d:Ljava/lang/Object;

    .line 1576
    .line 1577
    check-cast v1, Lgsg;

    .line 1578
    .line 1579
    invoke-virtual {v1}, Lgsg;->a()Lajcq;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v2

    .line 1583
    iput v10, v5, Lblv;->a:I

    .line 1584
    .line 1585
    invoke-static {v2, v1, v5}, Lgvf;->a(Lajcq;Lgsg;Laoln;)Ljava/lang/Object;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v1

    .line 1589
    if-eq v1, v0, :cond_7f0

    .line 1590
    .line 1591
    :goto_636
    move-object v12, v1

    .line 1592
    check-cast v12, Lgrv;

    .line 1593
    .line 1594
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 1595
    .line 1596
    if-eqz v12, :cond_67f

    .line 1597
    .line 1598
    sget-object v2, Lgyq;->a:Ljava/lang/String;

    .line 1599
    .line 1600
    invoke-static {}, Lgsh;->a()Lgsh;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v3

    .line 1604
    check-cast v1, Lgxl;

    .line 1605
    .line 1606
    iget-object v1, v1, Lgxl;->d:Ljava/lang/String;

    .line 1607
    .line 1608
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v1

    .line 1612
    const-string v4, "Updating notification for "

    .line 1613
    .line 1614
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v1

    .line 1618
    invoke-virtual {v3, v2, v1}, Lgsh;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1619
    .line 1620
    .line 1621
    iget-object v10, v5, Lblv;->e:Ljava/lang/Object;

    .line 1622
    .line 1623
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 1624
    .line 1625
    iget-object v2, v5, Lblv;->d:Ljava/lang/Object;

    .line 1626
    .line 1627
    check-cast v2, Lgsg;

    .line 1628
    .line 1629
    invoke-virtual {v2}, Lgsg;->g()Ljava/util/UUID;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v11

    .line 1633
    move-object v2, v10

    .line 1634
    check-cast v2, Lgyr;

    .line 1635
    .line 1636
    iget-object v2, v2, Lgyr;->c:Lgou;

    .line 1637
    .line 1638
    iget-object v2, v2, Lgou;->e:Ljava/lang/Object;

    .line 1639
    .line 1640
    new-instance v9, Lajx;

    .line 1641
    .line 1642
    move-object v13, v1

    .line 1643
    check-cast v13, Landroid/content/Context;

    .line 1644
    .line 1645
    const/4 v14, 0x4

    .line 1646
    invoke-direct/range {v9 .. v14}, Lajx;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/content/Context;I)V

    .line 1647
    .line 1648
    .line 1649
    const-string v1, "setForegroundAsync"

    .line 1650
    .line 1651
    invoke-static {v2, v1, v9}, Lgus;->x(Ljava/util/concurrent/Executor;Ljava/lang/String;Laomy;)Lajcq;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v1

    .line 1655
    iput v8, v5, Lblv;->a:I

    .line 1656
    .line 1657
    invoke-static {v1, v5}, Lyt;->g(Lajcq;Laoln;)Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v1

    .line 1661
    if-ne v1, v0, :cond_4ae

    .line 1662
    .line 1663
    return-object v0

    .line 1664
    :cond_67f
    check-cast v1, Lgxl;

    .line 1665
    .line 1666
    iget-object v0, v1, Lgxl;->d:Ljava/lang/String;

    .line 1667
    .line 1668
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1669
    .line 1670
    const-string v2, "Worker was marked important ("

    .line 1671
    .line 1672
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1673
    .line 1674
    .line 1675
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1676
    .line 1677
    .line 1678
    const-string v0, ") but did not provide ForegroundInfo"

    .line 1679
    .line 1680
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v0

    .line 1687
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1688
    .line 1689
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1690
    .line 1691
    .line 1692
    throw v1

    .line 1693
    :pswitch_69c
    sget-object v7, Laolu;->a:Laolu;

    .line 1694
    .line 1695
    iget v0, v5, Lblv;->a:I

    .line 1696
    .line 1697
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1698
    .line 1699
    .line 1700
    if-nez v0, :cond_6ca

    .line 1701
    .line 1702
    iget-object v0, v5, Lblv;->d:Ljava/lang/Object;

    .line 1703
    .line 1704
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 1705
    .line 1706
    iget-object v2, v5, Lblv;->b:Ljava/lang/Object;

    .line 1707
    .line 1708
    iget-object v3, v5, Lblv;->e:Ljava/lang/Object;

    .line 1709
    .line 1710
    check-cast v3, Lafl;

    .line 1711
    .line 1712
    invoke-virtual {v3}, Lafl;->a()Lcpn;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v3

    .line 1716
    invoke-static {v3}, Laooh;->c(Ljava/lang/Object;)V

    .line 1717
    .line 1718
    .line 1719
    invoke-interface {v2, v3}, Lafk;->a(Lcpn;)Lajl;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v2

    .line 1723
    iput v10, v5, Lblv;->a:I

    .line 1724
    .line 1725
    check-cast v0, Laii;

    .line 1726
    .line 1727
    const/4 v4, 0x0

    .line 1728
    const/16 v6, 0xc

    .line 1729
    .line 1730
    const/4 v3, 0x0

    .line 1731
    invoke-static/range {v0 .. v6}, Laii;->l(Laii;Ljava/lang/Object;Laiq;Ljava/lang/Object;Laonj;Laoln;I)Ljava/lang/Object;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v0

    .line 1735
    if-ne v0, v7, :cond_6ca

    .line 1736
    .line 1737
    move-object v0, v7

    .line 1738
    return-object v0

    .line 1739
    :cond_6ca
    sget-object v0, Laojh;->a:Laojh;

    .line 1740
    .line 1741
    return-object v0

    .line 1742
    :pswitch_6cd
    sget-object v0, Laolu;->a:Laolu;

    .line 1743
    .line 1744
    iget v1, v5, Lblv;->a:I

    .line 1745
    .line 1746
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1747
    .line 1748
    .line 1749
    if-eqz v1, :cond_6d9

    .line 1750
    .line 1751
    move-object/from16 v1, p1

    .line 1752
    .line 1753
    goto :goto_711

    .line 1754
    :cond_6d9
    iget-object v1, v5, Lblv;->b:Ljava/lang/Object;

    .line 1755
    .line 1756
    check-cast v1, Lblw;

    .line 1757
    .line 1758
    iget-object v15, v1, Lblw;->m:Lbkj;

    .line 1759
    .line 1760
    if-eqz v15, :cond_714

    .line 1761
    .line 1762
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v1, Laoot;

    .line 1765
    .line 1766
    iget-object v1, v1, Laoot;->a:Ljava/lang/Object;

    .line 1767
    .line 1768
    move-object v12, v1

    .line 1769
    check-cast v12, Ljava/lang/CharSequence;

    .line 1770
    .line 1771
    iget-object v1, v5, Lblv;->d:Ljava/lang/Object;

    .line 1772
    .line 1773
    check-cast v1, Laoot;

    .line 1774
    .line 1775
    iget-object v1, v1, Laoot;->a:Ljava/lang/Object;

    .line 1776
    .line 1777
    check-cast v1, Ldky;

    .line 1778
    .line 1779
    iget-wide v13, v1, Ldky;->b:J

    .line 1780
    .line 1781
    iput v10, v5, Lblv;->a:I

    .line 1782
    .line 1783
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 1784
    .line 1785
    .line 1786
    move-result v1

    .line 1787
    if-eqz v1, :cond_702

    .line 1788
    .line 1789
    invoke-static {v13, v14}, Ldky;->f(J)Z

    .line 1790
    .line 1791
    .line 1792
    move-result v1

    .line 1793
    if-eqz v1, :cond_704

    .line 1794
    .line 1795
    :cond_702
    move-object v1, v9

    .line 1796
    goto :goto_70f

    .line 1797
    :cond_704
    new-instance v11, Lbki;

    .line 1798
    .line 1799
    const/16 v16, 0x0

    .line 1800
    .line 1801
    invoke-direct/range {v11 .. v16}, Lbki;-><init>(Ljava/lang/CharSequence;JLbkj;Laoln;)V

    .line 1802
    .line 1803
    .line 1804
    invoke-virtual {v15, v11, v5}, Lbkj;->f(Laonn;Laoln;)Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v1

    .line 1808
    :goto_70f
    if-eq v1, v0, :cond_7f0

    .line 1809
    .line 1810
    :goto_711
    check-cast v1, Ldky;

    .line 1811
    .line 1812
    goto :goto_715

    .line 1813
    :cond_714
    move-object v1, v9

    .line 1814
    :goto_715
    if-eqz v1, :cond_794

    .line 1815
    .line 1816
    iget-object v0, v5, Lblv;->d:Ljava/lang/Object;

    .line 1817
    .line 1818
    check-cast v0, Laoot;

    .line 1819
    .line 1820
    iget-object v0, v0, Laoot;->a:Ljava/lang/Object;

    .line 1821
    .line 1822
    invoke-static {v1, v0}, Laooh;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1823
    .line 1824
    .line 1825
    move-result v0

    .line 1826
    if-nez v0, :cond_794

    .line 1827
    .line 1828
    iget-object v0, v5, Lblv;->b:Ljava/lang/Object;

    .line 1829
    .line 1830
    iget-object v2, v5, Lblv;->e:Ljava/lang/Object;

    .line 1831
    .line 1832
    check-cast v0, Lblw;

    .line 1833
    .line 1834
    iget-object v3, v0, Lblw;->a:Lblz;

    .line 1835
    .line 1836
    check-cast v2, Laoos;

    .line 1837
    .line 1838
    iget-object v4, v3, Lblz;->k:Lacx;

    .line 1839
    .line 1840
    iget-wide v6, v2, Laoos;->a:J

    .line 1841
    .line 1842
    invoke-virtual {v4, v6, v7}, Lacx;->a(J)Ljava/lang/Object;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v4

    .line 1846
    check-cast v4, Lbke;

    .line 1847
    .line 1848
    if-eqz v4, :cond_794

    .line 1849
    .line 1850
    iget-object v5, v5, Lblv;->c:Ljava/lang/Object;

    .line 1851
    .line 1852
    invoke-virtual {v4}, Lbke;->h()Ldji;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v6

    .line 1856
    check-cast v5, Laoot;

    .line 1857
    .line 1858
    iget-object v5, v5, Laoot;->a:Ljava/lang/Object;

    .line 1859
    .line 1860
    if-ne v6, v5, :cond_794

    .line 1861
    .line 1862
    iget-object v4, v4, Lbke;->b:Laomy;

    .line 1863
    .line 1864
    invoke-interface {v4}, Laomy;->a()Ljava/lang/Object;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v4

    .line 1868
    if-eqz v4, :cond_794

    .line 1869
    .line 1870
    iget-wide v5, v1, Ldky;->b:J

    .line 1871
    .line 1872
    new-instance v1, Lbko;

    .line 1873
    .line 1874
    new-instance v7, Lbkn;

    .line 1875
    .line 1876
    check-cast v4, Ldkw;

    .line 1877
    .line 1878
    invoke-static {v5, v6}, Ldky;->d(J)I

    .line 1879
    .line 1880
    .line 1881
    move-result v8

    .line 1882
    invoke-static {v4, v8}, Lli;->k(Ldkw;I)I

    .line 1883
    .line 1884
    .line 1885
    move-result v8

    .line 1886
    iget-wide v10, v2, Laoos;->a:J

    .line 1887
    .line 1888
    invoke-static {v5, v6}, Ldky;->d(J)I

    .line 1889
    .line 1890
    .line 1891
    move-result v12

    .line 1892
    invoke-direct {v7, v8, v12, v10, v11}, Lbkn;-><init>(IIJ)V

    .line 1893
    .line 1894
    .line 1895
    new-instance v8, Lbkn;

    .line 1896
    .line 1897
    invoke-static {v5, v6}, Ldky;->a(J)I

    .line 1898
    .line 1899
    .line 1900
    move-result v10

    .line 1901
    invoke-static {v4, v10}, Lli;->k(Ldkw;I)I

    .line 1902
    .line 1903
    .line 1904
    move-result v4

    .line 1905
    iget-wide v10, v2, Laoos;->a:J

    .line 1906
    .line 1907
    invoke-static {v5, v6}, Ldky;->a(J)I

    .line 1908
    .line 1909
    .line 1910
    move-result v5

    .line 1911
    invoke-direct {v8, v4, v5, v10, v11}, Lbkn;-><init>(IIJ)V

    .line 1912
    .line 1913
    .line 1914
    const/4 v4, 0x0

    .line 1915
    invoke-direct {v1, v7, v8, v4}, Lbko;-><init>(Lbkn;Lbkn;Z)V

    .line 1916
    .line 1917
    .line 1918
    iget-wide v4, v2, Laoos;->a:J

    .line 1919
    .line 1920
    sget v2, Lacy;->a:I

    .line 1921
    .line 1922
    new-instance v2, Lacx;

    .line 1923
    .line 1924
    const/4 v6, 0x6

    .line 1925
    invoke-direct {v2, v6}, Lacx;-><init>(I)V

    .line 1926
    .line 1927
    .line 1928
    invoke-virtual {v2, v4, v5, v1}, Lacx;->h(JLjava/lang/Object;)V

    .line 1929
    .line 1930
    .line 1931
    invoke-virtual {v3, v2}, Lblz;->f(Lacx;)V

    .line 1932
    .line 1933
    .line 1934
    iget-object v2, v0, Lblw;->b:Laonj;

    .line 1935
    .line 1936
    invoke-interface {v2, v1}, Laonj;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1937
    .line 1938
    .line 1939
    iput-object v9, v0, Lblw;->h:Lblg;

    .line 1940
    .line 1941
    :cond_794
    sget-object v0, Laojh;->a:Laojh;

    .line 1942
    .line 1943
    goto :goto_7f0

    .line 1944
    :cond_797
    move-object/from16 v1, p1

    .line 1945
    .line 1946
    goto :goto_7de

    .line 1947
    :cond_79a
    move-object/from16 v1, p1

    .line 1948
    .line 1949
    goto :goto_7cb

    .line 1950
    :cond_79d
    move-object/from16 v1, p1

    .line 1951
    .line 1952
    goto :goto_7b0

    .line 1953
    :cond_7a0
    iget-object v1, v5, Lblv;->e:Ljava/lang/Object;

    .line 1954
    .line 1955
    iget-object v2, v5, Lblv;->b:Ljava/lang/Object;

    .line 1956
    .line 1957
    iput v10, v5, Lblv;->a:I

    .line 1958
    .line 1959
    check-cast v2, Landroid/telecom/PhoneAccountHandle;

    .line 1960
    .line 1961
    check-cast v1, Lokj;

    .line 1962
    .line 1963
    invoke-virtual {v1, v2, v5}, Lokj;->k(Landroid/telecom/PhoneAccountHandle;Laoln;)Ljava/lang/Object;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v1

    .line 1967
    if-eq v1, v0, :cond_7f0

    .line 1968
    .line 1969
    :goto_7b0
    check-cast v1, Ljava/lang/Number;

    .line 1970
    .line 1971
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1972
    .line 1973
    .line 1974
    move-result v1

    .line 1975
    const/4 v2, -0x1

    .line 1976
    if-eq v1, v2, :cond_7e2

    .line 1977
    .line 1978
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1979
    .line 1980
    const/16 v6, 0x21

    .line 1981
    .line 1982
    if-lt v2, v6, :cond_7ce

    .line 1983
    .line 1984
    iget-object v2, v5, Lblv;->e:Ljava/lang/Object;

    .line 1985
    .line 1986
    iput v8, v5, Lblv;->a:I

    .line 1987
    .line 1988
    check-cast v2, Lokj;

    .line 1989
    .line 1990
    invoke-virtual {v2, v1, v5}, Lokj;->j(ILaoln;)Ljava/lang/Object;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v1

    .line 1994
    if-eq v1, v0, :cond_7f0

    .line 1995
    .line 1996
    :goto_7cb
    check-cast v1, Ljava/lang/String;

    .line 1997
    .line 1998
    goto :goto_7e0

    .line 1999
    :cond_7ce
    iget-object v1, v5, Lblv;->c:Ljava/lang/Object;

    .line 2000
    .line 2001
    iget-object v2, v5, Lblv;->b:Ljava/lang/Object;

    .line 2002
    .line 2003
    iput v4, v5, Lblv;->a:I

    .line 2004
    .line 2005
    check-cast v2, Landroid/telecom/PhoneAccountHandle;

    .line 2006
    .line 2007
    check-cast v1, Lzjs;

    .line 2008
    .line 2009
    invoke-virtual {v1, v2, v5}, Lzjs;->o(Landroid/telecom/PhoneAccountHandle;Laoln;)Ljava/lang/Object;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v1

    .line 2013
    if-eq v1, v0, :cond_7f0

    .line 2014
    .line 2015
    :goto_7de
    check-cast v1, Ljava/lang/String;

    .line 2016
    .line 2017
    :goto_7e0
    if-nez v1, :cond_7e4

    .line 2018
    .line 2019
    :cond_7e2
    move-object v0, v9

    .line 2020
    goto :goto_7f0

    .line 2021
    :cond_7e4
    iget-object v2, v5, Lblv;->d:Ljava/lang/Object;

    .line 2022
    .line 2023
    iput v3, v5, Lblv;->a:I

    .line 2024
    .line 2025
    check-cast v2, Luyg;

    .line 2026
    .line 2027
    invoke-virtual {v2, v1, v5}, Luyg;->z(Ljava/lang/String;Laoln;)Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v1

    .line 2031
    if-ne v1, v0, :cond_4ae

    .line 2032
    .line 2033
    :cond_7f0
    :goto_7f0
    return-object v0

    .line 2034
    nop

    .line 2035
    :pswitch_data_7f2
    .packed-switch 0x0
        :pswitch_6cd
        :pswitch_69c
        :pswitch_615
        :pswitch_5e4
        :pswitch_5c2
        :pswitch_59c
        :pswitch_4c6
        :pswitch_3bc
        :pswitch_2bc
        :pswitch_180
        :pswitch_c9
        :pswitch_9d
        :pswitch_47
        :pswitch_25
    .end packed-switch
.end method
