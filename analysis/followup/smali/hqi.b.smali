.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lhqi;->$cid:I

    .line 4
    .line 5
    const-string v2, "com/android/dialer/calllog/dataservice/CallLogFragmentDataService"

    .line 6
    .line 7
    const-string v3, "CallLogFragmentDataService.kt"

    .line 8
    .line 9
    const-string v4, "getAbsolutePath(...)"

    .line 10
    .line 11
    const-string v5, "TikTok trace may not live through suspension without TikTok provided CoroutineContext"

    .line 12
    .line 13
    const/4 v6, 0x6

    .line 14
    const/4 v7, 0x4

    .line 15
    const-string v9, "get(...)"

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x3

    .line 19
    const/4 v12, 0x2

    .line 20
    const/4 v13, 0x0

    .line 21
    const/4 v14, 0x1

    .line 22
    packed-switch v0, :pswitch_data_b42

    .line 23
    .line 24
    .line 25
    sget-object v13, Laolu;->a:Laolu;

    .line 26
    .line 27
    iget v0, v1, Lhqi;->b:I

    .line 28
    .line 29
    if-eqz v0, :cond_b22

    .line 30
    .line 31
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v2, v0

    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    goto/16 :goto_b35

    .line 40
    .line 41
    :pswitch_28
    sget-object v0, Laolu;->a:Laolu;

    .line 42
    .line 43
    iget v2, v1, Lhqi;->b:I

    .line 44
    .line 45
    if-eqz v2, :cond_46

    .line 46
    .line 47
    if-eq v2, v14, :cond_3e

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eq v2, v12, :cond_3b

    .line 53
    .line 54
    if-eq v2, v11, :cond_a4

    .line 55
    .line 56
    move-object/from16 v2, p1

    .line 57
    .line 58
    goto/16 :goto_b0

    .line 59
    .line 60
    :cond_3b
    move-object/from16 v2, p1

    .line 61
    .line 62
    goto :goto_75

    .line 63
    :cond_3e
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v3, p1

    .line 69
    .line 70
    goto :goto_58

    .line 71
    :cond_46
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 77
    .line 78
    iput v14, v1, Lhqi;->b:I

    .line 79
    .line 80
    move-object v3, v2

    .line 81
    check-cast v3, Llsn;

    .line 82
    .line 83
    invoke-virtual {v3, v1}, Llsn;->g(Laoln;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eq v3, v0, :cond_9cd

    .line 88
    .line 89
    :goto_58
    check-cast v3, Lj$/util/Optional;

    .line 90
    .line 91
    invoke-static {v3}, Laooh;->q(Lj$/util/Optional;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lhkd;

    .line 96
    .line 97
    check-cast v2, Llsn;

    .line 98
    .line 99
    iput-object v3, v2, Llsn;->o:Lhkd;

    .line 100
    .line 101
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v13, v1, Lhqi;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput v12, v1, Lhqi;->b:I

    .line 106
    .line 107
    move-object v3, v2

    .line 108
    check-cast v3, Llsn;

    .line 109
    .line 110
    iget-object v3, v3, Llsn;->d:Llug;

    .line 111
    .line 112
    invoke-virtual {v3, v2, v1}, Llug;->e(Lluc;Laoln;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eq v2, v0, :cond_9cd

    .line 117
    .line 118
    :goto_75
    check-cast v2, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_ce

    .line 125
    .line 126
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 127
    .line 128
    iput v11, v1, Lhqi;->b:I

    .line 129
    .line 130
    new-instance v3, Lldf;

    .line 131
    .line 132
    const/16 v4, 0x12

    .line 133
    .line 134
    invoke-direct {v3, v2, v4}, Lldf;-><init>(Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    check-cast v2, Llsn;

    .line 138
    .line 139
    iget-object v4, v2, Llsn;->e:Laoin;

    .line 140
    .line 141
    invoke-interface {v4}, Laoin;->a()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-static {v4, v9}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    check-cast v4, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v4

    .line 154
    iget-object v2, v2, Llsn;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 155
    .line 156
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 157
    .line 158
    invoke-interface {v2, v3, v4, v5, v6}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 159
    .line 160
    .line 161
    sget-object v2, Laojh;->a:Laojh;

    .line 162
    .line 163
    if-eq v2, v0, :cond_9cd

    .line 164
    .line 165
    :cond_a4
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 166
    .line 167
    iput v7, v1, Lhqi;->b:I

    .line 168
    .line 169
    check-cast v2, Llsn;

    .line 170
    .line 171
    invoke-virtual {v2, v1}, Llsn;->h(Laoln;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-eq v2, v0, :cond_9cd

    .line 176
    .line 177
    :goto_b0
    check-cast v2, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_ce

    .line 184
    .line 185
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 186
    .line 187
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    new-instance v3, Ljava/lang/Long;

    .line 192
    .line 193
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 194
    .line 195
    .line 196
    check-cast v0, Llsn;

    .line 197
    .line 198
    iput-object v3, v0, Llsn;->r:Ljava/lang/Long;

    .line 199
    .line 200
    iget-object v0, v0, Llsn;->k:Lmba;

    .line 201
    .line 202
    sget-object v1, Lmce;->ht:Lmce;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Lmba;->b(Lmce;)V

    .line 205
    .line 206
    .line 207
    :cond_ce
    sget-object v13, Laojh;->a:Laojh;

    .line 208
    .line 209
    return-object v13

    .line 210
    :pswitch_d1
    sget-object v0, Laolu;->a:Laolu;

    .line 211
    .line 212
    iget v2, v1, Lhqi;->b:I

    .line 213
    .line 214
    if-eqz v2, :cond_e8

    .line 215
    .line 216
    if-eq v2, v14, :cond_df

    .line 217
    .line 218
    :try_start_d9
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_dc
    .catch Ljava/lang/Exception; {:try_start_d9 .. :try_end_dc} :catch_123

    .line 219
    .line 220
    .line 221
    move-object/from16 v2, p1

    .line 222
    .line 223
    goto :goto_10e

    .line 224
    :cond_df
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 225
    .line 226
    :try_start_e1
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_e4
    .catch Ljava/lang/Exception; {:try_start_e1 .. :try_end_e4} :catch_123

    .line 227
    .line 228
    .line 229
    move-object v3, v2

    .line 230
    move-object/from16 v2, p1

    .line 231
    .line 232
    goto :goto_fe

    .line 233
    :cond_e8
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :try_start_eb
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 237
    .line 238
    move-object v3, v2

    .line 239
    check-cast v3, Lkus;

    .line 240
    .line 241
    iget-object v3, v3, Lkus;->d:Lhys;

    .line 242
    .line 243
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 244
    .line 245
    iput v14, v1, Lhqi;->b:I

    .line 246
    .line 247
    check-cast v2, Lkus;

    .line 248
    .line 249
    invoke-virtual {v2, v1}, Lkus;->c(Laoln;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    if-eq v2, v0, :cond_9cd

    .line 254
    .line 255
    :goto_fe
    check-cast v2, Landroid/speech/tts/TextToSpeech;

    .line 256
    .line 257
    sget-object v5, Lkus;->a:Lhxz;

    .line 258
    .line 259
    iput-object v13, v1, Lhqi;->a:Ljava/lang/Object;

    .line 260
    .line 261
    iput v12, v1, Lhqi;->b:I

    .line 262
    .line 263
    check-cast v3, Lhys;

    .line 264
    .line 265
    invoke-virtual {v3, v2, v5, v1}, Lhys;->b(Landroid/speech/tts/TextToSpeech;Lhxw;Laoln;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    if-eq v2, v0, :cond_9cd

    .line 270
    .line 271
    :goto_10e
    check-cast v2, Ljava/io/File;
    :try_end_110
    .catch Ljava/lang/Exception; {:try_start_eb .. :try_end_110} :catch_123

    .line 272
    .line 273
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 274
    .line 275
    sget-object v1, Lrmx;->mS:Lrmx;

    .line 276
    .line 277
    check-cast v0, Lkus;

    .line 278
    .line 279
    iget-object v0, v0, Lkus;->c:Lrlv;

    .line 280
    .line 281
    invoke-interface {v0, v1}, Lrlv;->o(Lrmx;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    invoke-static {v13, v4}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    return-object v13

    .line 292
    :catch_123
    move-exception v0

    .line 293
    iget-object v1, v1, Lhqi;->c:Ljava/lang/Object;

    .line 294
    .line 295
    sget-object v2, Lrmx;->mU:Lrmx;

    .line 296
    .line 297
    check-cast v1, Lkus;

    .line 298
    .line 299
    iget-object v1, v1, Lkus;->c:Lrlv;

    .line 300
    .line 301
    invoke-interface {v1, v2}, Lrlv;->o(Lrmx;)V

    .line 302
    .line 303
    .line 304
    throw v0

    .line 305
    :pswitch_130
    sget-object v0, Laolu;->a:Laolu;

    .line 306
    .line 307
    iget v2, v1, Lhqi;->b:I

    .line 308
    .line 309
    if-eqz v2, :cond_147

    .line 310
    .line 311
    if-eq v2, v14, :cond_13e

    .line 312
    .line 313
    :try_start_138
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_13b
    .catch Ljava/lang/Exception; {:try_start_138 .. :try_end_13b} :catch_182

    .line 314
    .line 315
    .line 316
    move-object/from16 v2, p1

    .line 317
    .line 318
    goto :goto_16d

    .line 319
    :cond_13e
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 320
    .line 321
    :try_start_140
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_143
    .catch Ljava/lang/Exception; {:try_start_140 .. :try_end_143} :catch_182

    .line 322
    .line 323
    .line 324
    move-object v3, v2

    .line 325
    move-object/from16 v2, p1

    .line 326
    .line 327
    goto :goto_15d

    .line 328
    :cond_147
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    :try_start_14a
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 332
    .line 333
    move-object v3, v2

    .line 334
    check-cast v3, Lkus;

    .line 335
    .line 336
    iget-object v3, v3, Lkus;->d:Lhys;

    .line 337
    .line 338
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 339
    .line 340
    iput v14, v1, Lhqi;->b:I

    .line 341
    .line 342
    check-cast v2, Lkus;

    .line 343
    .line 344
    invoke-virtual {v2, v1}, Lkus;->c(Laoln;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    if-eq v2, v0, :cond_9cd

    .line 349
    .line 350
    :goto_15d
    check-cast v2, Landroid/speech/tts/TextToSpeech;

    .line 351
    .line 352
    sget-object v5, Lkus;->b:Lhxz;

    .line 353
    .line 354
    iput-object v13, v1, Lhqi;->a:Ljava/lang/Object;

    .line 355
    .line 356
    iput v12, v1, Lhqi;->b:I

    .line 357
    .line 358
    check-cast v3, Lhys;

    .line 359
    .line 360
    invoke-virtual {v3, v2, v5, v1}, Lhys;->b(Landroid/speech/tts/TextToSpeech;Lhxw;Laoln;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    if-eq v2, v0, :cond_9cd

    .line 365
    .line 366
    :goto_16d
    check-cast v2, Ljava/io/File;
    :try_end_16f
    .catch Ljava/lang/Exception; {:try_start_14a .. :try_end_16f} :catch_182

    .line 367
    .line 368
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 369
    .line 370
    sget-object v1, Lrmx;->mT:Lrmx;

    .line 371
    .line 372
    check-cast v0, Lkus;

    .line 373
    .line 374
    iget-object v0, v0, Lkus;->c:Lrlv;

    .line 375
    .line 376
    invoke-interface {v0, v1}, Lrlv;->o(Lrmx;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v13

    .line 383
    invoke-static {v13, v4}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return-object v13

    .line 387
    :catch_182
    move-exception v0

    .line 388
    iget-object v1, v1, Lhqi;->c:Ljava/lang/Object;

    .line 389
    .line 390
    sget-object v2, Lrmx;->mU:Lrmx;

    .line 391
    .line 392
    check-cast v1, Lkus;

    .line 393
    .line 394
    iget-object v1, v1, Lkus;->c:Lrlv;

    .line 395
    .line 396
    invoke-interface {v1, v2}, Lrlv;->o(Lrmx;)V

    .line 397
    .line 398
    .line 399
    throw v0

    .line 400
    :pswitch_18f
    sget-object v13, Laolu;->a:Laolu;

    .line 401
    .line 402
    iget v0, v1, Lhqi;->b:I

    .line 403
    .line 404
    if-eqz v0, :cond_19e

    .line 405
    .line 406
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 407
    .line 408
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    move-object v2, v0

    .line 412
    move-object/from16 v0, p1

    .line 413
    .line 414
    goto :goto_1bf

    .line 415
    :cond_19e
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, Lgou;

    .line 421
    .line 422
    iget-object v2, v0, Lgou;->a:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v2, Lzzx;

    .line 425
    .line 426
    invoke-virtual {v2}, Lzzx;->k()Laigf;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    iget-object v0, v0, Lgou;->b:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, Laogc;

    .line 433
    .line 434
    invoke-virtual {v0}, Laogc;->aX()Lajcq;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 439
    .line 440
    iput v14, v1, Lhqi;->b:I

    .line 441
    .line 442
    invoke-static {v0, v1}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    if-eq v0, v13, :cond_b41

    .line 447
    .line 448
    :goto_1bf
    check-cast v0, Lkun;

    .line 449
    .line 450
    check-cast v2, Laigf;

    .line 451
    .line 452
    invoke-virtual {v2, v0}, Laigf;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    check-cast v0, Laoin;

    .line 457
    .line 458
    if-nez v0, :cond_227

    .line 459
    .line 460
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Lgou;

    .line 463
    .line 464
    iget-object v0, v0, Lgou;->a:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v0, Lzzx;

    .line 467
    .line 468
    invoke-virtual {v0}, Lzzx;->k()Laigf;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v0}, Laigf;->entrySet()Ljava/util/Set;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    const-string v1, "<get-entries>(...)"

    .line 477
    .line 478
    invoke-static {v0, v1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    if-eqz v1, :cond_221

    .line 490
    .line 491
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    if-eqz v2, :cond_218

    .line 500
    .line 501
    move-object v2, v1

    .line 502
    check-cast v2, Ljava/util/Map$Entry;

    .line 503
    .line 504
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    check-cast v2, Lkun;

    .line 509
    .line 510
    iget v2, v2, Lkun;->e:I

    .line 511
    .line 512
    :cond_1ff
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    move-object v4, v3

    .line 517
    check-cast v4, Ljava/util/Map$Entry;

    .line 518
    .line 519
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    check-cast v4, Lkun;

    .line 524
    .line 525
    iget v4, v4, Lkun;->e:I

    .line 526
    .line 527
    if-ge v2, v4, :cond_212

    .line 528
    .line 529
    move-object v1, v3

    .line 530
    move v2, v4

    .line 531
    :cond_212
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    if-nez v3, :cond_1ff

    .line 536
    .line 537
    :cond_218
    check-cast v1, Ljava/util/Map$Entry;

    .line 538
    .line 539
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    check-cast v0, Laoin;

    .line 544
    .line 545
    goto :goto_227

    .line 546
    :cond_221
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 547
    .line 548
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 549
    .line 550
    .line 551
    throw v0

    .line 552
    :cond_227
    :goto_227
    invoke-interface {v0}, Laoin;->a()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v13

    .line 556
    invoke-static {v13, v9}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    return-object v13

    .line 560
    :pswitch_22f
    sget-object v13, Laolu;->a:Laolu;

    .line 561
    .line 562
    iget v0, v1, Lhqi;->b:I

    .line 563
    .line 564
    if-eqz v0, :cond_245

    .line 565
    .line 566
    if-eq v0, v14, :cond_23f

    .line 567
    .line 568
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 569
    .line 570
    :try_start_239
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_23c
    .catch Ljava/lang/Exception; {:try_start_239 .. :try_end_23c} :catch_2a8

    .line 571
    .line 572
    .line 573
    move-object/from16 v0, p1

    .line 574
    .line 575
    goto :goto_2a4

    .line 576
    :cond_23f
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    move-object/from16 v0, p1

    .line 580
    .line 581
    goto :goto_254

    .line 582
    :cond_245
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 586
    .line 587
    iput v14, v1, Lhqi;->b:I

    .line 588
    .line 589
    check-cast v0, Lklt;

    .line 590
    .line 591
    invoke-virtual {v0, v1}, Lklt;->b(Laoln;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    if-eq v0, v13, :cond_b41

    .line 596
    .line 597
    :goto_254
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 598
    .line 599
    move-object v3, v0

    .line 600
    check-cast v3, Lkun;

    .line 601
    .line 602
    invoke-static {v3}, Laooh;->c(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v3}, Lkun;->ordinal()I

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    if-eqz v0, :cond_28e

    .line 610
    .line 611
    if-eq v0, v14, :cond_284

    .line 612
    .line 613
    if-eq v0, v12, :cond_279

    .line 614
    .line 615
    if-ne v0, v11, :cond_273

    .line 616
    .line 617
    move-object v0, v2

    .line 618
    check-cast v0, Lklt;

    .line 619
    .line 620
    iget-object v0, v0, Lklt;->d:Ljava/lang/Object;

    .line 621
    .line 622
    sget-object v4, Lrmx;->mS:Lrmx;

    .line 623
    .line 624
    invoke-interface {v0, v4}, Lrlv;->o(Lrmx;)V

    .line 625
    .line 626
    .line 627
    goto :goto_28e

    .line 628
    :cond_273
    new-instance v0, Laois;

    .line 629
    .line 630
    invoke-direct {v0}, Laois;-><init>()V

    .line 631
    .line 632
    .line 633
    throw v0

    .line 634
    :cond_279
    move-object v0, v2

    .line 635
    check-cast v0, Lklt;

    .line 636
    .line 637
    iget-object v0, v0, Lklt;->d:Ljava/lang/Object;

    .line 638
    .line 639
    sget-object v4, Lrmx;->mV:Lrmx;

    .line 640
    .line 641
    invoke-interface {v0, v4}, Lrlv;->o(Lrmx;)V

    .line 642
    .line 643
    .line 644
    goto :goto_28e

    .line 645
    :cond_284
    move-object v0, v2

    .line 646
    check-cast v0, Lklt;

    .line 647
    .line 648
    iget-object v0, v0, Lklt;->d:Ljava/lang/Object;

    .line 649
    .line 650
    sget-object v4, Lrmx;->mY:Lrmx;

    .line 651
    .line 652
    invoke-interface {v0, v4}, Lrlv;->o(Lrmx;)V

    .line 653
    .line 654
    .line 655
    :cond_28e
    :goto_28e
    :try_start_28e
    move-object v0, v2

    .line 656
    check-cast v0, Lklt;

    .line 657
    .line 658
    invoke-virtual {v0, v3}, Lklt;->a(Lkun;)Lkul;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    iget-object v0, v0, Lkul;->a:Lhxw;

    .line 663
    .line 664
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 665
    .line 666
    iput v12, v1, Lhqi;->b:I

    .line 667
    .line 668
    check-cast v2, Lklt;

    .line 669
    .line 670
    invoke-virtual {v2, v0, v1}, Lklt;->c(Lhxw;Laoln;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v0
    :try_end_2a1
    .catch Ljava/lang/Exception; {:try_start_28e .. :try_end_2a1} :catch_2aa

    .line 674
    if-eq v0, v13, :cond_b41

    .line 675
    .line 676
    move-object v2, v3

    .line 677
    :goto_2a4
    :try_start_2a4
    move-object v13, v0

    .line 678
    check-cast v13, Lhxf;
    :try_end_2a7
    .catch Ljava/lang/Exception; {:try_start_2a4 .. :try_end_2a7} :catch_2a8

    .line 679
    .line 680
    return-object v13

    .line 681
    :catch_2a8
    move-exception v0

    .line 682
    goto :goto_2ac

    .line 683
    :catch_2aa
    move-exception v0

    .line 684
    move-object v2, v3

    .line 685
    :goto_2ac
    iget-object v1, v1, Lhqi;->c:Ljava/lang/Object;

    .line 686
    .line 687
    invoke-static {v2}, Laooh;->c(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    check-cast v1, Lklt;

    .line 691
    .line 692
    check-cast v2, Lkun;

    .line 693
    .line 694
    invoke-virtual {v1, v2}, Lklt;->d(Lkun;)V

    .line 695
    .line 696
    .line 697
    throw v0

    .line 698
    :pswitch_2b9
    sget-object v13, Laolu;->a:Laolu;

    .line 699
    .line 700
    iget v0, v1, Lhqi;->b:I

    .line 701
    .line 702
    if-eqz v0, :cond_2cf

    .line 703
    .line 704
    if-eq v0, v14, :cond_2c9

    .line 705
    .line 706
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 707
    .line 708
    :try_start_2c3
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_2c6
    .catch Ljava/lang/Exception; {:try_start_2c3 .. :try_end_2c6} :catch_332

    .line 709
    .line 710
    .line 711
    move-object/from16 v0, p1

    .line 712
    .line 713
    goto :goto_32e

    .line 714
    :cond_2c9
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    move-object/from16 v0, p1

    .line 718
    .line 719
    goto :goto_2de

    .line 720
    :cond_2cf
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 724
    .line 725
    iput v14, v1, Lhqi;->b:I

    .line 726
    .line 727
    check-cast v0, Lklt;

    .line 728
    .line 729
    invoke-virtual {v0, v1}, Lklt;->b(Laoln;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    if-eq v0, v13, :cond_b41

    .line 734
    .line 735
    :goto_2de
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 736
    .line 737
    move-object v3, v0

    .line 738
    check-cast v3, Lkun;

    .line 739
    .line 740
    invoke-static {v3}, Laooh;->c(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v3}, Lkun;->ordinal()I

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    if-eqz v0, :cond_318

    .line 748
    .line 749
    if-eq v0, v14, :cond_30e

    .line 750
    .line 751
    if-eq v0, v12, :cond_303

    .line 752
    .line 753
    if-ne v0, v11, :cond_2fd

    .line 754
    .line 755
    move-object v0, v2

    .line 756
    check-cast v0, Lklt;

    .line 757
    .line 758
    iget-object v0, v0, Lklt;->d:Ljava/lang/Object;

    .line 759
    .line 760
    sget-object v4, Lrmx;->mT:Lrmx;

    .line 761
    .line 762
    invoke-interface {v0, v4}, Lrlv;->o(Lrmx;)V

    .line 763
    .line 764
    .line 765
    goto :goto_318

    .line 766
    :cond_2fd
    new-instance v0, Laois;

    .line 767
    .line 768
    invoke-direct {v0}, Laois;-><init>()V

    .line 769
    .line 770
    .line 771
    throw v0

    .line 772
    :cond_303
    move-object v0, v2

    .line 773
    check-cast v0, Lklt;

    .line 774
    .line 775
    iget-object v0, v0, Lklt;->d:Ljava/lang/Object;

    .line 776
    .line 777
    sget-object v4, Lrmx;->mW:Lrmx;

    .line 778
    .line 779
    invoke-interface {v0, v4}, Lrlv;->o(Lrmx;)V

    .line 780
    .line 781
    .line 782
    goto :goto_318

    .line 783
    :cond_30e
    move-object v0, v2

    .line 784
    check-cast v0, Lklt;

    .line 785
    .line 786
    iget-object v0, v0, Lklt;->d:Ljava/lang/Object;

    .line 787
    .line 788
    sget-object v4, Lrmx;->mZ:Lrmx;

    .line 789
    .line 790
    invoke-interface {v0, v4}, Lrlv;->o(Lrmx;)V

    .line 791
    .line 792
    .line 793
    :cond_318
    :goto_318
    :try_start_318
    move-object v0, v2

    .line 794
    check-cast v0, Lklt;

    .line 795
    .line 796
    invoke-virtual {v0, v3}, Lklt;->a(Lkun;)Lkul;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    iget-object v0, v0, Lkul;->b:Lhxw;

    .line 801
    .line 802
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 803
    .line 804
    iput v12, v1, Lhqi;->b:I

    .line 805
    .line 806
    check-cast v2, Lklt;

    .line 807
    .line 808
    invoke-virtual {v2, v0, v1}, Lklt;->c(Lhxw;Laoln;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v0
    :try_end_32b
    .catch Ljava/lang/Exception; {:try_start_318 .. :try_end_32b} :catch_334

    .line 812
    if-eq v0, v13, :cond_b41

    .line 813
    .line 814
    move-object v2, v3

    .line 815
    :goto_32e
    :try_start_32e
    move-object v13, v0

    .line 816
    check-cast v13, Lhxf;
    :try_end_331
    .catch Ljava/lang/Exception; {:try_start_32e .. :try_end_331} :catch_332

    .line 817
    .line 818
    return-object v13

    .line 819
    :catch_332
    move-exception v0

    .line 820
    goto :goto_336

    .line 821
    :catch_334
    move-exception v0

    .line 822
    move-object v2, v3

    .line 823
    :goto_336
    iget-object v1, v1, Lhqi;->c:Ljava/lang/Object;

    .line 824
    .line 825
    invoke-static {v2}, Laooh;->c(Ljava/lang/Object;)V

    .line 826
    .line 827
    .line 828
    check-cast v1, Lklt;

    .line 829
    .line 830
    check-cast v2, Lkun;

    .line 831
    .line 832
    invoke-virtual {v1, v2}, Lklt;->d(Lkun;)V

    .line 833
    .line 834
    .line 835
    throw v0

    .line 836
    :pswitch_343
    sget-object v0, Laolu;->a:Laolu;

    .line 837
    .line 838
    iget v2, v1, Lhqi;->b:I

    .line 839
    .line 840
    if-eqz v2, :cond_34f

    .line 841
    .line 842
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 843
    .line 844
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    goto :goto_365

    .line 848
    :cond_34f
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 849
    .line 850
    .line 851
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 852
    .line 853
    sget v3, Lkim;->b:I

    .line 854
    .line 855
    check-cast v2, Lkim;

    .line 856
    .line 857
    iget-object v2, v2, Lkim;->a:Lzzx;

    .line 858
    .line 859
    invoke-virtual {v2}, Lzzx;->e()Laihd;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-static {v2, v9}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    :cond_365
    :goto_365
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 871
    .line 872
    .line 873
    move-result v3

    .line 874
    if-eqz v3, :cond_b41

    .line 875
    .line 876
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    check-cast v3, Lkio;

    .line 881
    .line 882
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 883
    .line 884
    iput v14, v1, Lhqi;->b:I

    .line 885
    .line 886
    invoke-interface {v3, v1}, Lkio;->n(Laoln;)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v3

    .line 890
    if-ne v3, v0, :cond_365

    .line 891
    .line 892
    goto/16 :goto_9cd

    .line 893
    .line 894
    :pswitch_37d
    sget-object v0, Laolu;->a:Laolu;

    .line 895
    .line 896
    iget v2, v1, Lhqi;->b:I

    .line 897
    .line 898
    if-eqz v2, :cond_389

    .line 899
    .line 900
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 901
    .line 902
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    goto :goto_39f

    .line 906
    :cond_389
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 910
    .line 911
    sget v3, Lkim;->b:I

    .line 912
    .line 913
    check-cast v2, Lkim;

    .line 914
    .line 915
    iget-object v2, v2, Lkim;->a:Lzzx;

    .line 916
    .line 917
    invoke-virtual {v2}, Lzzx;->e()Laihd;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    invoke-static {v2, v9}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 922
    .line 923
    .line 924
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    :cond_39f
    :goto_39f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    if-eqz v3, :cond_b41

    .line 933
    .line 934
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    check-cast v3, Lkio;

    .line 939
    .line 940
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 941
    .line 942
    iput v14, v1, Lhqi;->b:I

    .line 943
    .line 944
    invoke-interface {v3, v1}, Lkio;->o(Laoln;)Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    if-ne v3, v0, :cond_39f

    .line 949
    .line 950
    goto/16 :goto_9cd

    .line 951
    .line 952
    :pswitch_3b7
    sget-object v0, Laolu;->a:Laolu;

    .line 953
    .line 954
    iget v2, v1, Lhqi;->b:I

    .line 955
    .line 956
    if-eqz v2, :cond_3cd

    .line 957
    .line 958
    if-eq v2, v14, :cond_3c7

    .line 959
    .line 960
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 961
    .line 962
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    move-object/from16 v2, p1

    .line 966
    .line 967
    goto :goto_420

    .line 968
    :cond_3c7
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    move-object/from16 v2, p1

    .line 972
    .line 973
    goto :goto_3e3

    .line 974
    :cond_3cd
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    invoke-static {}, Lkcq;->m()V

    .line 978
    .line 979
    .line 980
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 981
    .line 982
    iput v14, v1, Lhqi;->b:I

    .line 983
    .line 984
    check-cast v2, Lgpd;

    .line 985
    .line 986
    iget-object v2, v2, Lgpd;->e:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v2, Lrsr;

    .line 989
    .line 990
    invoke-static {v2, v1}, Lkcq;->S(Lrsr;Laoln;)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v2

    .line 994
    if-eq v2, v0, :cond_9cd

    .line 995
    .line 996
    :goto_3e3
    check-cast v2, Ljava/lang/Iterable;

    .line 997
    .line 998
    new-instance v3, Ljava/util/ArrayList;

    .line 999
    .line 1000
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1001
    .line 1002
    .line 1003
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    :cond_3ee
    :goto_3ee
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v4

    .line 1011
    if-eqz v4, :cond_403

    .line 1012
    .line 1013
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v4

    .line 1017
    move-object v5, v4

    .line 1018
    check-cast v5, Lkdy;

    .line 1019
    .line 1020
    iget-object v5, v5, Lkdy;->B:Ljava/lang/String;

    .line 1021
    .line 1022
    if-eqz v5, :cond_3ee

    .line 1023
    .line 1024
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    goto :goto_3ee

    .line 1028
    :cond_403
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v2, Lgpd;

    .line 1031
    .line 1032
    iget-object v4, v2, Lgpd;->b:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v4, Lkhr;

    .line 1035
    .line 1036
    invoke-virtual {v4}, Lkhr;->c()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v4

    .line 1040
    if-eqz v4, :cond_424

    .line 1041
    .line 1042
    iget-object v2, v2, Lgpd;->c:Ljava/lang/Object;

    .line 1043
    .line 1044
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1045
    .line 1046
    iput v12, v1, Lhqi;->b:I

    .line 1047
    .line 1048
    check-cast v2, Ltkl;

    .line 1049
    .line 1050
    invoke-virtual {v2, v1}, Ltkl;->w(Laoln;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    if-eq v2, v0, :cond_9cd

    .line 1055
    .line 1056
    move-object v0, v3

    .line 1057
    :goto_420
    check-cast v2, Ljava/util/Map;

    .line 1058
    .line 1059
    move-object v3, v0

    .line 1060
    goto :goto_426

    .line 1061
    :cond_424
    sget-object v2, Laokd;->a:Laokd;

    .line 1062
    .line 1063
    :goto_426
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1064
    .line 1065
    new-instance v1, Ljava/util/ArrayList;

    .line 1066
    .line 1067
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1068
    .line 1069
    .line 1070
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v4

    .line 1074
    :goto_431
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v5

    .line 1078
    if-eqz v5, :cond_4d8

    .line 1079
    .line 1080
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v5

    .line 1084
    check-cast v5, Lkdy;

    .line 1085
    .line 1086
    iget-object v6, v5, Lkdy;->B:Ljava/lang/String;

    .line 1087
    .line 1088
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v7

    .line 1092
    check-cast v7, Lkid;

    .line 1093
    .line 1094
    move-object v9, v0

    .line 1095
    check-cast v9, Lgpd;

    .line 1096
    .line 1097
    iget-object v10, v9, Lgpd;->b:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v10, Lkhr;

    .line 1100
    .line 1101
    invoke-virtual {v10}, Lkhr;->b()Z

    .line 1102
    .line 1103
    .line 1104
    move-result v10

    .line 1105
    if-nez v10, :cond_482

    .line 1106
    .line 1107
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v10

    .line 1111
    :cond_456
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v11

    .line 1115
    if-eqz v11, :cond_478

    .line 1116
    .line 1117
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v11

    .line 1121
    move-object v12, v11

    .line 1122
    check-cast v12, Lkdy;

    .line 1123
    .line 1124
    invoke-static {v12}, Lkcq;->n(Lkdy;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v14

    .line 1128
    invoke-static {v5}, Lkcq;->n(Lkdy;)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v15

    .line 1132
    if-eq v14, v15, :cond_456

    .line 1133
    .line 1134
    iget-object v14, v9, Lgpd;->d:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v14, Lsso;

    .line 1137
    .line 1138
    invoke-virtual {v14, v12, v5}, Lsso;->d(Lkdy;Lkdy;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v12

    .line 1142
    if-eqz v12, :cond_456

    .line 1143
    .line 1144
    goto :goto_479

    .line 1145
    :cond_478
    move-object v11, v13

    .line 1146
    :goto_479
    check-cast v11, Lkdy;

    .line 1147
    .line 1148
    if-eqz v11, :cond_482

    .line 1149
    .line 1150
    iget-object v9, v11, Lkdy;->B:Ljava/lang/String;

    .line 1151
    .line 1152
    move-object/from16 v23, v9

    .line 1153
    .line 1154
    goto :goto_484

    .line 1155
    :cond_482
    move-object/from16 v23, v13

    .line 1156
    .line 1157
    :goto_484
    const-string v9, "<this>"

    .line 1158
    .line 1159
    invoke-static {v5, v9}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1160
    .line 1161
    .line 1162
    if-eqz v6, :cond_4c7

    .line 1163
    .line 1164
    iget-wide v9, v5, Lkdy;->a:J

    .line 1165
    .line 1166
    iget-object v11, v5, Lkdy;->e:Ljava/lang/String;

    .line 1167
    .line 1168
    iget-object v12, v5, Lkdy;->C:Ljava/lang/String;

    .line 1169
    .line 1170
    iget-object v14, v5, Lkdy;->j:Ljava/lang/String;

    .line 1171
    .line 1172
    iget-object v15, v5, Lkdy;->d:Ljava/lang/String;

    .line 1173
    .line 1174
    iget v5, v5, Lkdy;->l:I

    .line 1175
    .line 1176
    if-eqz v7, :cond_4af

    .line 1177
    .line 1178
    iget v13, v7, Lkid;->f:I

    .line 1179
    .line 1180
    iget-object v8, v7, Lkid;->e:Ljava/lang/String;

    .line 1181
    .line 1182
    move-object/from16 p0, v0

    .line 1183
    .line 1184
    iget-object v0, v7, Lkid;->c:Ljava/lang/String;

    .line 1185
    .line 1186
    iget-object v7, v7, Lkid;->b:Ljava/lang/String;

    .line 1187
    .line 1188
    move-object/from16 p1, v2

    .line 1189
    .line 1190
    new-instance v2, Lkhq;

    .line 1191
    .line 1192
    invoke-direct {v2, v7, v0, v8, v13}, Lkhq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1193
    .line 1194
    .line 1195
    move-object/from16 v24, v2

    .line 1196
    .line 1197
    :goto_4ac
    move-object/from16 v20, v14

    .line 1198
    .line 1199
    goto :goto_4b6

    .line 1200
    :cond_4af
    move-object/from16 p0, v0

    .line 1201
    .line 1202
    move-object/from16 p1, v2

    .line 1203
    .line 1204
    const/16 v24, 0x0

    .line 1205
    .line 1206
    goto :goto_4ac

    .line 1207
    :goto_4b6
    new-instance v14, Lkho;

    .line 1208
    .line 1209
    move/from16 v22, v5

    .line 1210
    .line 1211
    move-object/from16 v17, v6

    .line 1212
    .line 1213
    move-object/from16 v18, v11

    .line 1214
    .line 1215
    move-object/from16 v19, v12

    .line 1216
    .line 1217
    move-object/from16 v21, v15

    .line 1218
    .line 1219
    move-wide v15, v9

    .line 1220
    invoke-direct/range {v14 .. v24}, Lkho;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkhq;)V

    .line 1221
    .line 1222
    .line 1223
    goto :goto_4cc

    .line 1224
    :cond_4c7
    move-object/from16 p0, v0

    .line 1225
    .line 1226
    move-object/from16 p1, v2

    .line 1227
    .line 1228
    const/4 v14, 0x0

    .line 1229
    :goto_4cc
    if-eqz v14, :cond_4d1

    .line 1230
    .line 1231
    invoke-interface {v1, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1232
    .line 1233
    .line 1234
    :cond_4d1
    move-object/from16 v0, p0

    .line 1235
    .line 1236
    move-object/from16 v2, p1

    .line 1237
    .line 1238
    const/4 v13, 0x0

    .line 1239
    goto/16 :goto_431

    .line 1240
    .line 1241
    :cond_4d8
    const/16 v0, 0xa

    .line 1242
    .line 1243
    invoke-static {v1, v0}, Lajsz;->bl(Ljava/lang/Iterable;I)I

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    invoke-static {v0}, Lajsz;->aL(I)I

    .line 1248
    .line 1249
    .line 1250
    move-result v0

    .line 1251
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 1252
    .line 1253
    const/16 v2, 0x10

    .line 1254
    .line 1255
    invoke-static {v0, v2}, Laooc;->t(II)I

    .line 1256
    .line 1257
    .line 1258
    move-result v0

    .line 1259
    invoke-direct {v13, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1260
    .line 1261
    .line 1262
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    :goto_4f1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1267
    .line 1268
    .line 1269
    move-result v1

    .line 1270
    if-eqz v1, :cond_b41

    .line 1271
    .line 1272
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v1

    .line 1276
    move-object v2, v1

    .line 1277
    check-cast v2, Lkho;

    .line 1278
    .line 1279
    iget-wide v2, v2, Lkho;->a:J

    .line 1280
    .line 1281
    new-instance v4, Ljava/lang/Long;

    .line 1282
    .line 1283
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 1284
    .line 1285
    .line 1286
    invoke-interface {v13, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    goto :goto_4f1

    .line 1290
    :pswitch_509
    sget-object v2, Laolu;->a:Laolu;

    .line 1291
    .line 1292
    iget v0, v1, Lhqi;->b:I

    .line 1293
    .line 1294
    const-string v3, "isDirty$<anonymous>"

    .line 1295
    .line 1296
    const-string v4, "SystemCallLogDataSource.kt"

    .line 1297
    .line 1298
    const-string v5, "com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource"

    .line 1299
    .line 1300
    if-eqz v0, :cond_526

    .line 1301
    .line 1302
    if-eq v0, v14, :cond_520

    .line 1303
    .line 1304
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1305
    .line 1306
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1307
    .line 1308
    .line 1309
    move-object/from16 v1, p1

    .line 1310
    .line 1311
    goto/16 :goto_5be

    .line 1312
    .line 1313
    :cond_520
    :try_start_520
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_523
    .catch Ljava/lang/Exception; {:try_start_520 .. :try_end_523} :catch_5ab

    .line 1314
    .line 1315
    .line 1316
    move-object/from16 v0, p1

    .line 1317
    .line 1318
    goto :goto_537

    .line 1319
    :cond_526
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1320
    .line 1321
    .line 1322
    :try_start_529
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1323
    .line 1324
    check-cast v0, Lkfm;

    .line 1325
    .line 1326
    iget-object v0, v0, Lkfm;->h:Lrsr;

    .line 1327
    .line 1328
    iput v14, v1, Lhqi;->b:I

    .line 1329
    .line 1330
    invoke-static {v0, v1}, Lkcq;->U(Lrsr;Laoln;)Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v0

    .line 1334
    if-eq v0, v2, :cond_5bc

    .line 1335
    .line 1336
    :goto_537
    check-cast v0, Ljava/lang/Boolean;

    .line 1337
    .line 1338
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    if-eqz v0, :cond_5e1

    .line 1343
    .line 1344
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1345
    .line 1346
    move-object v6, v0

    .line 1347
    check-cast v6, Lkfm;

    .line 1348
    .line 1349
    iget-object v6, v6, Lkfm;->d:Lojo;

    .line 1350
    .line 1351
    check-cast v0, Lkfm;

    .line 1352
    .line 1353
    iget-object v0, v0, Lkfm;->g:Laoir;

    .line 1354
    .line 1355
    invoke-interface {v0}, Laoir;->a()Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    const-string v7, "getValue(...)"

    .line 1360
    .line 1361
    invoke-static {v0, v7}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1362
    .line 1363
    .line 1364
    move-object v7, v0

    .line 1365
    check-cast v7, Landroid/net/Uri;

    .line 1366
    .line 1367
    const-string v0, "_id"

    .line 1368
    .line 1369
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v8

    .line 1373
    const/4 v10, 0x0

    .line 1374
    const/4 v11, 0x0

    .line 1375
    const/4 v9, 0x0

    .line 1376
    invoke-virtual/range {v6 .. v11}, Lojo;->b(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v6
    :try_end_563
    .catch Ljava/lang/Exception; {:try_start_529 .. :try_end_563} :catch_5ab

    .line 1380
    if-nez v6, :cond_583

    .line 1381
    .line 1382
    :try_start_565
    sget-object v0, Lkfm;->a:Laimz;

    .line 1383
    .line 1384
    invoke-virtual {v0}, Laimp;->c()Lainm;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    check-cast v0, Laimw;

    .line 1389
    .line 1390
    sget-object v7, Laioa;->b:Laioa;

    .line 1391
    .line 1392
    invoke-interface {v0, v7}, Laimw;->m(Laioa;)Lainm;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    const-string v7, "isSystemCallLogEmpty$<anonymous>"

    .line 1397
    .line 1398
    const/16 v8, 0x7b

    .line 1399
    .line 1400
    invoke-interface {v0, v5, v7, v8, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    check-cast v0, Laimw;

    .line 1405
    .line 1406
    const-string v7, "isSystemCallLogEmpty null cursor"

    .line 1407
    .line 1408
    invoke-interface {v0, v7}, Laimw;->v(Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    goto :goto_58d

    .line 1412
    :cond_583
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 1413
    .line 1414
    .line 1415
    move-result v0
    :try_end_587
    .catchall {:try_start_565 .. :try_end_587} :catchall_5a3

    .line 1416
    const/4 v7, 0x0

    .line 1417
    :try_start_588
    invoke-static {v6, v7}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1418
    .line 1419
    .line 1420
    if-eqz v0, :cond_5e1

    .line 1421
    .line 1422
    :goto_58d
    sget-object v0, Lkfm;->a:Laimz;

    .line 1423
    .line 1424
    invoke-virtual {v0}, Laimp;->b()Lainm;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v0

    .line 1428
    const/16 v6, 0x62

    .line 1429
    .line 1430
    invoke-interface {v0, v5, v3, v6, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v0

    .line 1434
    check-cast v0, Laimw;

    .line 1435
    .line 1436
    const-string v6, "the annotated call log is empty but the system call log is not"

    .line 1437
    .line 1438
    invoke-interface {v0, v6}, Laimw;->v(Ljava/lang/String;)V

    .line 1439
    .line 1440
    .line 1441
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_5a2
    .catch Ljava/lang/Exception; {:try_start_588 .. :try_end_5a2} :catch_5ab

    .line 1442
    .line 1443
    return-object v13

    .line 1444
    :catchall_5a3
    move-exception v0

    .line 1445
    move-object v7, v0

    .line 1446
    :try_start_5a5
    throw v7
    :try_end_5a6
    .catchall {:try_start_5a5 .. :try_end_5a6} :catchall_5a6

    .line 1447
    :catchall_5a6
    move-exception v0

    .line 1448
    :try_start_5a7
    invoke-static {v6, v7}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1449
    .line 1450
    .line 1451
    throw v0
    :try_end_5ab
    .catch Ljava/lang/Exception; {:try_start_5a7 .. :try_end_5ab} :catch_5ab

    .line 1452
    :catch_5ab
    move-exception v0

    .line 1453
    iget-object v6, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1454
    .line 1455
    iput-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1456
    .line 1457
    iput v12, v1, Lhqi;->b:I

    .line 1458
    .line 1459
    check-cast v6, Lkfm;

    .line 1460
    .line 1461
    iget-object v6, v6, Lkfm;->e:Lzrw;

    .line 1462
    .line 1463
    invoke-virtual {v6, v1}, Lzrw;->j(Laoln;)Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    if-ne v1, v2, :cond_5be

    .line 1468
    .line 1469
    :cond_5bc
    move-object v13, v2

    .line 1470
    return-object v13

    .line 1471
    :cond_5be
    :goto_5be
    check-cast v1, Ljava/lang/Boolean;

    .line 1472
    .line 1473
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1474
    .line 1475
    .line 1476
    move-result v1

    .line 1477
    if-nez v1, :cond_5e5

    .line 1478
    .line 1479
    sget-object v1, Lkfm;->a:Laimz;

    .line 1480
    .line 1481
    invoke-virtual {v1}, Laimp;->b()Lainm;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v1

    .line 1485
    check-cast v1, Laimw;

    .line 1486
    .line 1487
    check-cast v0, Ljava/lang/Throwable;

    .line 1488
    .line 1489
    invoke-interface {v1, v0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    const/16 v1, 0x67

    .line 1494
    .line 1495
    invoke-interface {v0, v5, v3, v1, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    check-cast v0, Laimw;

    .line 1500
    .line 1501
    const-string v1, "isDirty missing call log read permission"

    .line 1502
    .line 1503
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1504
    .line 1505
    .line 1506
    :cond_5e1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1507
    .line 1508
    goto/16 :goto_9cd

    .line 1509
    .line 1510
    :cond_5e5
    check-cast v0, Ljava/lang/Throwable;

    .line 1511
    .line 1512
    throw v0

    .line 1513
    :pswitch_5e8
    sget-object v0, Laolu;->a:Laolu;

    .line 1514
    .line 1515
    iget v4, v1, Lhqi;->b:I

    .line 1516
    .line 1517
    if-eqz v4, :cond_5fc

    .line 1518
    .line 1519
    iget-object v1, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1520
    .line 1521
    :try_start_5f0
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_5f3
    .catchall {:try_start_5f0 .. :try_end_5f3} :catchall_5f8

    .line 1522
    .line 1523
    .line 1524
    move-object v5, v1

    .line 1525
    const/4 v7, 0x0

    .line 1526
    move-object/from16 v1, p1

    .line 1527
    .line 1528
    goto :goto_63c

    .line 1529
    :catchall_5f8
    move-exception v0

    .line 1530
    move-object v5, v1

    .line 1531
    :goto_5fa
    move-object v1, v0

    .line 1532
    goto :goto_644

    .line 1533
    :cond_5fc
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1534
    .line 1535
    .line 1536
    iget-object v4, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1537
    .line 1538
    invoke-interface {v1}, Laoln;->u()Laolr;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v6

    .line 1542
    invoke-static {v6}, Lahvr;->R(Laolr;)Z

    .line 1543
    .line 1544
    .line 1545
    move-result v6

    .line 1546
    if-eqz v6, :cond_64a

    .line 1547
    .line 1548
    const/16 v5, 0xc2

    .line 1549
    .line 1550
    const-string v6, "CallLogFragmentDataService_loadInitialUiModel"

    .line 1551
    .line 1552
    invoke-static {v5, v6}, Lahvr;->Z(ILjava/lang/String;)Lahoq;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v5

    .line 1556
    :try_start_613
    iput-object v5, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1557
    .line 1558
    iput v14, v1, Lhqi;->b:I

    .line 1559
    .line 1560
    sget-object v6, Lkew;->a:Laimz;

    .line 1561
    .line 1562
    invoke-virtual {v6}, Laimp;->b()Lainm;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v6

    .line 1566
    const-string v7, "loadMinimalUiModel"

    .line 1567
    .line 1568
    const/16 v8, 0x6c

    .line 1569
    .line 1570
    invoke-interface {v6, v2, v7, v8, v3}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v2

    .line 1574
    check-cast v2, Laimw;

    .line 1575
    .line 1576
    const-string v3, "loading data to be used on startup"

    .line 1577
    .line 1578
    invoke-interface {v2, v3}, Laimw;->v(Ljava/lang/String;)V

    .line 1579
    .line 1580
    .line 1581
    new-instance v2, Lgbp;

    .line 1582
    .line 1583
    const/16 v3, 0x9

    .line 1584
    .line 1585
    const/4 v7, 0x0

    .line 1586
    invoke-direct {v2, v4, v3, v7}, Lgbp;-><init>(Ljava/lang/Object;I[[S)V

    .line 1587
    .line 1588
    .line 1589
    check-cast v4, Lkew;

    .line 1590
    .line 1591
    invoke-virtual {v4, v2, v1}, Lkew;->a(Laonj;Laoln;)Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    if-eq v1, v0, :cond_9cd

    .line 1596
    .line 1597
    :goto_63c
    check-cast v1, Lkfd;
    :try_end_63e
    .catchall {:try_start_613 .. :try_end_63e} :catchall_642

    .line 1598
    .line 1599
    invoke-static {v5, v7}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1600
    .line 1601
    .line 1602
    goto :goto_6a9

    .line 1603
    :catchall_642
    move-exception v0

    .line 1604
    goto :goto_5fa

    .line 1605
    :goto_644
    :try_start_644
    throw v1
    :try_end_645
    .catchall {:try_start_644 .. :try_end_645} :catchall_645

    .line 1606
    :catchall_645
    move-exception v0

    .line 1607
    invoke-static {v5, v1}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1608
    .line 1609
    .line 1610
    throw v0

    .line 1611
    :cond_64a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1612
    .line 1613
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1614
    .line 1615
    .line 1616
    throw v0

    .line 1617
    :pswitch_650
    sget-object v0, Laolu;->a:Laolu;

    .line 1618
    .line 1619
    iget v4, v1, Lhqi;->b:I

    .line 1620
    .line 1621
    if-eqz v4, :cond_664

    .line 1622
    .line 1623
    iget-object v1, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1624
    .line 1625
    :try_start_658
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_65b
    .catchall {:try_start_658 .. :try_end_65b} :catchall_660

    .line 1626
    .line 1627
    .line 1628
    move-object v5, v1

    .line 1629
    const/4 v7, 0x0

    .line 1630
    move-object/from16 v1, p1

    .line 1631
    .line 1632
    goto :goto_6a4

    .line 1633
    :catchall_660
    move-exception v0

    .line 1634
    move-object v5, v1

    .line 1635
    :goto_662
    move-object v1, v0

    .line 1636
    goto :goto_6ad

    .line 1637
    :cond_664
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1638
    .line 1639
    .line 1640
    iget-object v4, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1641
    .line 1642
    invoke-interface {v1}, Laoln;->u()Laolr;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v6

    .line 1646
    invoke-static {v6}, Lahvr;->R(Laolr;)Z

    .line 1647
    .line 1648
    .line 1649
    move-result v6

    .line 1650
    if-eqz v6, :cond_6b3

    .line 1651
    .line 1652
    const/16 v5, 0xc1

    .line 1653
    .line 1654
    const-string v6, "CallLogFragmentDataService_loadUiModel"

    .line 1655
    .line 1656
    invoke-static {v5, v6}, Lahvr;->Z(ILjava/lang/String;)Lahoq;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v5

    .line 1660
    :try_start_67b
    iput-object v5, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1661
    .line 1662
    iput v14, v1, Lhqi;->b:I

    .line 1663
    .line 1664
    sget-object v6, Lkew;->a:Laimz;

    .line 1665
    .line 1666
    invoke-virtual {v6}, Laimp;->b()Lainm;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v6

    .line 1670
    const-string v7, "loadUiModel"

    .line 1671
    .line 1672
    const/16 v8, 0x79

    .line 1673
    .line 1674
    invoke-interface {v6, v2, v7, v8, v3}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v2

    .line 1678
    check-cast v2, Laimw;

    .line 1679
    .line 1680
    const-string v3, "loading full data set"

    .line 1681
    .line 1682
    invoke-interface {v2, v3}, Laimw;->v(Ljava/lang/String;)V

    .line 1683
    .line 1684
    .line 1685
    new-instance v2, Lgbp;

    .line 1686
    .line 1687
    const/16 v3, 0xa

    .line 1688
    .line 1689
    const/4 v7, 0x0

    .line 1690
    invoke-direct {v2, v4, v3, v7}, Lgbp;-><init>(Ljava/lang/Object;I[[I)V

    .line 1691
    .line 1692
    .line 1693
    check-cast v4, Lkew;

    .line 1694
    .line 1695
    invoke-virtual {v4, v2, v1}, Lkew;->a(Laonj;Laoln;)Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v1

    .line 1699
    if-eq v1, v0, :cond_9cd

    .line 1700
    .line 1701
    :goto_6a4
    check-cast v1, Lkfd;
    :try_end_6a6
    .catchall {:try_start_67b .. :try_end_6a6} :catchall_6ab

    .line 1702
    .line 1703
    invoke-static {v5, v7}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1704
    .line 1705
    .line 1706
    :goto_6a9
    move-object v13, v1

    .line 1707
    return-object v13

    .line 1708
    :catchall_6ab
    move-exception v0

    .line 1709
    goto :goto_662

    .line 1710
    :goto_6ad
    :try_start_6ad
    throw v1
    :try_end_6ae
    .catchall {:try_start_6ad .. :try_end_6ae} :catchall_6ae

    .line 1711
    :catchall_6ae
    move-exception v0

    .line 1712
    invoke-static {v5, v1}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1713
    .line 1714
    .line 1715
    throw v0

    .line 1716
    :cond_6b3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1717
    .line 1718
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1719
    .line 1720
    .line 1721
    throw v0

    .line 1722
    :pswitch_6b9
    sget-object v0, Laolu;->a:Laolu;

    .line 1723
    .line 1724
    iget v2, v1, Lhqi;->b:I

    .line 1725
    .line 1726
    const-string v3, "getBeeslyGreetingsList(...)"

    .line 1727
    .line 1728
    if-eqz v2, :cond_6e0

    .line 1729
    .line 1730
    if-eq v2, v14, :cond_6da

    .line 1731
    .line 1732
    if-eq v2, v12, :cond_6d4

    .line 1733
    .line 1734
    if-eq v2, v11, :cond_6ce

    .line 1735
    .line 1736
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1737
    .line 1738
    .line 1739
    move-object/from16 v1, p1

    .line 1740
    .line 1741
    goto/16 :goto_75a

    .line 1742
    .line 1743
    :cond_6ce
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1744
    .line 1745
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1746
    .line 1747
    .line 1748
    goto :goto_72f

    .line 1749
    :cond_6d4
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1750
    .line 1751
    .line 1752
    move-object/from16 v2, p1

    .line 1753
    .line 1754
    goto :goto_729

    .line 1755
    :cond_6da
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1756
    .line 1757
    .line 1758
    move-object/from16 v2, p1

    .line 1759
    .line 1760
    goto :goto_6ef

    .line 1761
    :cond_6e0
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1762
    .line 1763
    .line 1764
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1765
    .line 1766
    iput v14, v1, Lhqi;->b:I

    .line 1767
    .line 1768
    check-cast v2, Lixt;

    .line 1769
    .line 1770
    invoke-virtual {v2, v1}, Lixt;->g(Laoln;)Ljava/lang/Object;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v2

    .line 1774
    if-eq v2, v0, :cond_9cd

    .line 1775
    .line 1776
    :goto_6ef
    check-cast v2, Lixh;

    .line 1777
    .line 1778
    iget-object v2, v2, Lixh;->e:Lalat;

    .line 1779
    .line 1780
    invoke-static {v2, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1781
    .line 1782
    .line 1783
    instance-of v4, v2, Ljava/util/Collection;

    .line 1784
    .line 1785
    if-eqz v4, :cond_700

    .line 1786
    .line 1787
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1788
    .line 1789
    .line 1790
    move-result v4

    .line 1791
    if-nez v4, :cond_71b

    .line 1792
    .line 1793
    :cond_700
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v2

    .line 1797
    :cond_704
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1798
    .line 1799
    .line 1800
    move-result v4

    .line 1801
    if-eqz v4, :cond_71b

    .line 1802
    .line 1803
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v4

    .line 1807
    check-cast v4, Lixd;

    .line 1808
    .line 1809
    iget v4, v4, Lixd;->b:I

    .line 1810
    .line 1811
    invoke-static {v4}, Lixc;->a(I)Lixc;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v4

    .line 1815
    sget-object v5, Lixc;->a:Lixc;

    .line 1816
    .line 1817
    if-ne v4, v5, :cond_704

    .line 1818
    .line 1819
    goto :goto_74b

    .line 1820
    :cond_71b
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1821
    .line 1822
    iput v12, v1, Lhqi;->b:I

    .line 1823
    .line 1824
    check-cast v2, Lixt;

    .line 1825
    .line 1826
    iget-object v2, v2, Lixt;->c:Lixx;

    .line 1827
    .line 1828
    invoke-virtual {v2, v1}, Lixx;->a(Laoln;)Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v2

    .line 1832
    if-eq v2, v0, :cond_9cd

    .line 1833
    .line 1834
    :goto_729
    check-cast v2, Ljava/util/List;

    .line 1835
    .line 1836
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v2

    .line 1840
    :cond_72f
    :goto_72f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1841
    .line 1842
    .line 1843
    move-result v4

    .line 1844
    if-eqz v4, :cond_74b

    .line 1845
    .line 1846
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v4

    .line 1850
    check-cast v4, Lixd;

    .line 1851
    .line 1852
    iget-object v5, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1853
    .line 1854
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1855
    .line 1856
    iput v11, v1, Lhqi;->b:I

    .line 1857
    .line 1858
    check-cast v5, Lixt;

    .line 1859
    .line 1860
    invoke-virtual {v5, v4, v1}, Lixt;->b(Lixd;Laoln;)Ljava/lang/Object;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v4

    .line 1864
    if-ne v4, v0, :cond_72f

    .line 1865
    .line 1866
    goto/16 :goto_9cd

    .line 1867
    .line 1868
    :cond_74b
    :goto_74b
    const/4 v2, 0x0

    .line 1869
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 1870
    .line 1871
    iput v7, v1, Lhqi;->b:I

    .line 1872
    .line 1873
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 1874
    .line 1875
    check-cast v2, Lixt;

    .line 1876
    .line 1877
    invoke-virtual {v2, v1}, Lixt;->g(Laoln;)Ljava/lang/Object;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v1

    .line 1881
    if-eq v1, v0, :cond_9cd

    .line 1882
    .line 1883
    :goto_75a
    check-cast v1, Lixh;

    .line 1884
    .line 1885
    sget-object v0, Lixu;->a:Lixu;

    .line 1886
    .line 1887
    invoke-virtual {v0}, Lalad;->m()Lakzx;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    const-string v2, "builder"

    .line 1892
    .line 1893
    invoke-static {v0, v2}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1894
    .line 1895
    .line 1896
    const-string v2, "value"

    .line 1897
    .line 1898
    invoke-static {v1, v2}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1899
    .line 1900
    .line 1901
    invoke-virtual {v0}, Lakzx;->u()V

    .line 1902
    .line 1903
    .line 1904
    iget-object v2, v0, Lakzx;->b:Lalad;

    .line 1905
    .line 1906
    check-cast v2, Lixu;

    .line 1907
    .line 1908
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1909
    .line 1910
    .line 1911
    iput-object v1, v2, Lixu;->c:Lixh;

    .line 1912
    .line 1913
    iget v4, v2, Lixu;->b:I

    .line 1914
    .line 1915
    or-int/2addr v4, v14

    .line 1916
    iput v4, v2, Lixu;->b:I

    .line 1917
    .line 1918
    iget-object v1, v1, Lixh;->e:Lalat;

    .line 1919
    .line 1920
    invoke-static {v1, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1921
    .line 1922
    .line 1923
    instance-of v2, v1, Ljava/util/Collection;

    .line 1924
    .line 1925
    if-eqz v2, :cond_78c

    .line 1926
    .line 1927
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1928
    .line 1929
    .line 1930
    move-result v2

    .line 1931
    if-nez v2, :cond_7b4

    .line 1932
    .line 1933
    :cond_78c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v1

    .line 1937
    move v2, v10

    .line 1938
    :cond_791
    :goto_791
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1939
    .line 1940
    .line 1941
    move-result v3

    .line 1942
    if-eqz v3, :cond_7af

    .line 1943
    .line 1944
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v3

    .line 1948
    check-cast v3, Lixd;

    .line 1949
    .line 1950
    iget v3, v3, Lixd;->b:I

    .line 1951
    .line 1952
    invoke-static {v3}, Lixc;->a(I)Lixc;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v3

    .line 1956
    sget-object v4, Lixc;->b:Lixc;

    .line 1957
    .line 1958
    if-ne v3, v4, :cond_791

    .line 1959
    .line 1960
    add-int/lit8 v2, v2, 0x1

    .line 1961
    .line 1962
    if-gez v2, :cond_791

    .line 1963
    .line 1964
    invoke-static {}, Lajsz;->bg()V

    .line 1965
    .line 1966
    .line 1967
    goto :goto_791

    .line 1968
    :cond_7af
    const/16 v3, 0xa

    .line 1969
    .line 1970
    if-lt v2, v3, :cond_7b4

    .line 1971
    .line 1972
    move v10, v14

    .line 1973
    :cond_7b4
    invoke-virtual {v0}, Lakzx;->u()V

    .line 1974
    .line 1975
    .line 1976
    iget-object v1, v0, Lakzx;->b:Lalad;

    .line 1977
    .line 1978
    check-cast v1, Lixu;

    .line 1979
    .line 1980
    sget-object v2, Lixu;->a:Lixu;

    .line 1981
    .line 1982
    iput-boolean v10, v1, Lixu;->d:Z

    .line 1983
    .line 1984
    invoke-virtual {v0}, Lakzx;->p()Lalad;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v0

    .line 1988
    const-string v1, "build(...)"

    .line 1989
    .line 1990
    invoke-static {v0, v1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1991
    .line 1992
    .line 1993
    move-object v13, v0

    .line 1994
    check-cast v13, Lixu;

    .line 1995
    .line 1996
    return-object v13

    .line 1997
    :pswitch_7cc
    sget-object v13, Laolu;->a:Laolu;

    .line 1998
    .line 1999
    iget v0, v1, Lhqi;->b:I

    .line 2000
    .line 2001
    if-eqz v0, :cond_7da

    .line 2002
    .line 2003
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2004
    .line 2005
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2006
    .line 2007
    .line 2008
    move-object/from16 v1, p1

    .line 2009
    .line 2010
    goto :goto_7f6

    .line 2011
    :cond_7da
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2012
    .line 2013
    .line 2014
    invoke-static {}, Lahar;->a()Lahaq;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v0

    .line 2018
    invoke-virtual {v0, v10}, Lahaq;->b(Z)V

    .line 2019
    .line 2020
    .line 2021
    sget-object v2, Lahap;->a:Lahap;

    .line 2022
    .line 2023
    iput-object v2, v0, Lahaq;->a:Lahap;

    .line 2024
    .line 2025
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2026
    .line 2027
    iput-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2028
    .line 2029
    iput v14, v1, Lhqi;->b:I

    .line 2030
    .line 2031
    check-cast v2, Ljbm;

    .line 2032
    .line 2033
    invoke-virtual {v2, v1}, Ljbm;->b(Laoln;)Ljava/lang/Object;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v1

    .line 2037
    if-eq v1, v13, :cond_b41

    .line 2038
    .line 2039
    :goto_7f6
    check-cast v1, Ljbr;

    .line 2040
    .line 2041
    iget v1, v1, Ljbr;->c:I

    .line 2042
    .line 2043
    invoke-static {v1}, Ljbn;->b(I)Ljbn;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v1

    .line 2047
    if-nez v1, :cond_802

    .line 2048
    .line 2049
    sget-object v1, Ljbn;->e:Ljbn;

    .line 2050
    .line 2051
    :cond_802
    invoke-virtual {v1}, Ljbn;->toString()Ljava/lang/String;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v1

    .line 2055
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2056
    .line 2057
    invoke-static {v1, v2}, Lakzc;->v(Ljava/lang/String;Ljava/nio/charset/Charset;)Lakzc;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v1

    .line 2061
    check-cast v0, Lahaq;

    .line 2062
    .line 2063
    invoke-virtual {v0, v1}, Lahaq;->c(Lakzc;)V

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v0}, Lahaq;->a()Lahar;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v13

    .line 2070
    return-object v13

    .line 2071
    :pswitch_816
    sget-object v0, Laolu;->a:Laolu;

    .line 2072
    .line 2073
    iget v2, v1, Lhqi;->b:I

    .line 2074
    .line 2075
    packed-switch v2, :pswitch_data_b6e

    .line 2076
    .line 2077
    .line 2078
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2079
    .line 2080
    .line 2081
    :cond_820
    const/4 v13, 0x0

    .line 2082
    return-object v13

    .line 2083
    :pswitch_822
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2084
    .line 2085
    .line 2086
    move-object/from16 v2, p1

    .line 2087
    .line 2088
    goto/16 :goto_90a

    .line 2089
    .line 2090
    :pswitch_829
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2091
    .line 2092
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2093
    .line 2094
    .line 2095
    move-object/from16 v3, p1

    .line 2096
    .line 2097
    goto/16 :goto_8cc

    .line 2098
    .line 2099
    :pswitch_832
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2100
    .line 2101
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2102
    .line 2103
    .line 2104
    move-object/from16 v3, p1

    .line 2105
    .line 2106
    goto/16 :goto_8b5

    .line 2107
    .line 2108
    :pswitch_83b
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2109
    .line 2110
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2111
    .line 2112
    .line 2113
    move-object/from16 v3, p1

    .line 2114
    .line 2115
    goto :goto_89f

    .line 2116
    :pswitch_843
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2117
    .line 2118
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2119
    .line 2120
    .line 2121
    move-object/from16 v3, p1

    .line 2122
    .line 2123
    goto :goto_889

    .line 2124
    :pswitch_84b
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2125
    .line 2126
    .line 2127
    move-object/from16 v2, p1

    .line 2128
    .line 2129
    goto :goto_879

    .line 2130
    :pswitch_851
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2131
    .line 2132
    .line 2133
    sget-object v2, Liqw;->a:Laimz;

    .line 2134
    .line 2135
    invoke-virtual {v2}, Laimp;->b()Lainm;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v2

    .line 2139
    const/16 v3, 0x3b

    .line 2140
    .line 2141
    const-string v4, "BeeslyCallMissedListener.kt"

    .line 2142
    .line 2143
    const-string v5, "com/android/dialer/beesly/impl/BeeslyCallMissedListener"

    .line 2144
    .line 2145
    const-string v8, "onCallMissed$<anonymous>"

    .line 2146
    .line 2147
    invoke-interface {v2, v5, v8, v3, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v2

    .line 2151
    check-cast v2, Laimw;

    .line 2152
    .line 2153
    const-string v3, "onCallMissed"

    .line 2154
    .line 2155
    invoke-interface {v2, v3}, Laimw;->v(Ljava/lang/String;)V

    .line 2156
    .line 2157
    .line 2158
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2159
    .line 2160
    iput v14, v1, Lhqi;->b:I

    .line 2161
    .line 2162
    check-cast v2, Liqw;

    .line 2163
    .line 2164
    invoke-virtual {v2, v1}, Liqw;->b(Laoln;)Ljava/lang/Object;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v2

    .line 2168
    if-eq v2, v0, :cond_9cd

    .line 2169
    .line 2170
    :goto_879
    iget-object v3, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2171
    .line 2172
    check-cast v2, Liqq;

    .line 2173
    .line 2174
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2175
    .line 2176
    iput v12, v1, Lhqi;->b:I

    .line 2177
    .line 2178
    check-cast v3, Liqw;

    .line 2179
    .line 2180
    invoke-virtual {v3, v2, v1}, Liqw;->c(Liqq;Laoln;)Ljava/lang/Object;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v3

    .line 2184
    if-eq v3, v0, :cond_9cd

    .line 2185
    .line 2186
    :goto_889
    check-cast v3, Ljava/lang/Boolean;

    .line 2187
    .line 2188
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2189
    .line 2190
    .line 2191
    move-result v3

    .line 2192
    if-eqz v3, :cond_820

    .line 2193
    .line 2194
    iget-object v3, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2195
    .line 2196
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2197
    .line 2198
    iput v11, v1, Lhqi;->b:I

    .line 2199
    .line 2200
    check-cast v3, Liqw;

    .line 2201
    .line 2202
    invoke-virtual {v3, v2, v1}, Liqw;->f(Liqq;Laoln;)Ljava/lang/Object;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v3

    .line 2206
    if-eq v3, v0, :cond_9cd

    .line 2207
    .line 2208
    :goto_89f
    check-cast v3, Ljava/lang/Boolean;

    .line 2209
    .line 2210
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2211
    .line 2212
    .line 2213
    move-result v3

    .line 2214
    if-eqz v3, :cond_820

    .line 2215
    .line 2216
    iget-object v3, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2217
    .line 2218
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2219
    .line 2220
    iput v7, v1, Lhqi;->b:I

    .line 2221
    .line 2222
    check-cast v3, Liqw;

    .line 2223
    .line 2224
    invoke-virtual {v3, v2, v1}, Liqw;->d(Liqq;Laoln;)Ljava/lang/Object;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v3

    .line 2228
    if-eq v3, v0, :cond_9cd

    .line 2229
    .line 2230
    :goto_8b5
    check-cast v3, Ljava/lang/Boolean;

    .line 2231
    .line 2232
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2233
    .line 2234
    .line 2235
    move-result v3

    .line 2236
    if-eqz v3, :cond_820

    .line 2237
    .line 2238
    iget-object v3, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2239
    .line 2240
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2241
    .line 2242
    const/4 v4, 0x5

    .line 2243
    iput v4, v1, Lhqi;->b:I

    .line 2244
    .line 2245
    check-cast v3, Liqw;

    .line 2246
    .line 2247
    invoke-virtual {v3, v2, v1}, Liqw;->e(Liqq;Laoln;)Ljava/lang/Object;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v3

    .line 2251
    if-eq v3, v0, :cond_9cd

    .line 2252
    .line 2253
    :goto_8cc
    check-cast v3, Ljava/lang/Boolean;

    .line 2254
    .line 2255
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2256
    .line 2257
    .line 2258
    move-result v3

    .line 2259
    if-eqz v3, :cond_820

    .line 2260
    .line 2261
    iget-object v3, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2262
    .line 2263
    sget-object v4, Lqbc;->ch:Lqbc;

    .line 2264
    .line 2265
    check-cast v3, Liqw;

    .line 2266
    .line 2267
    iget-object v5, v3, Liqw;->e:Lqbe;

    .line 2268
    .line 2269
    invoke-virtual {v5, v4}, Lqbe;->a(Lqbc;)V

    .line 2270
    .line 2271
    .line 2272
    iget-object v4, v3, Liqw;->c:Laoin;

    .line 2273
    .line 2274
    invoke-interface {v4}, Laoin;->a()Ljava/lang/Object;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v4

    .line 2278
    check-cast v4, Ljava/lang/Boolean;

    .line 2279
    .line 2280
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2281
    .line 2282
    .line 2283
    move-result v4

    .line 2284
    if-nez v4, :cond_8fb

    .line 2285
    .line 2286
    iget-object v3, v3, Liqw;->d:Laoin;

    .line 2287
    .line 2288
    invoke-interface {v3}, Laoin;->a()Ljava/lang/Object;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v3

    .line 2292
    check-cast v3, Ljava/lang/Boolean;

    .line 2293
    .line 2294
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2295
    .line 2296
    .line 2297
    move-result v3

    .line 2298
    if-eqz v3, :cond_820

    .line 2299
    .line 2300
    :cond_8fb
    invoke-interface {v2}, Liqq;->be()Lajcq;

    .line 2301
    .line 2302
    .line 2303
    move-result-object v2

    .line 2304
    const/4 v7, 0x0

    .line 2305
    iput-object v7, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2306
    .line 2307
    iput v6, v1, Lhqi;->b:I

    .line 2308
    .line 2309
    invoke-static {v2, v1}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v2

    .line 2313
    if-eq v2, v0, :cond_9cd

    .line 2314
    .line 2315
    :goto_90a
    check-cast v2, Lj$/util/Optional;

    .line 2316
    .line 2317
    invoke-static {v2}, Laooh;->q(Lj$/util/Optional;)Ljava/lang/Object;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v2

    .line 2321
    check-cast v2, Landroid/telecom/PhoneAccountHandle;

    .line 2322
    .line 2323
    if-eqz v2, :cond_820

    .line 2324
    .line 2325
    iget-object v3, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2326
    .line 2327
    const/4 v4, 0x7

    .line 2328
    iput v4, v1, Lhqi;->b:I

    .line 2329
    .line 2330
    check-cast v3, Liqw;

    .line 2331
    .line 2332
    iget-object v3, v3, Liqw;->b:Ljbm;

    .line 2333
    .line 2334
    invoke-virtual {v3, v2, v10, v1}, Ljbm;->a(Landroid/telecom/PhoneAccountHandle;ZLaoln;)Ljava/lang/Object;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v1

    .line 2338
    if-ne v1, v0, :cond_820

    .line 2339
    .line 2340
    goto/16 :goto_9cd

    .line 2341
    .line 2342
    :pswitch_925
    sget-object v0, Laolu;->a:Laolu;

    .line 2343
    .line 2344
    iget v2, v1, Lhqi;->b:I

    .line 2345
    .line 2346
    if-eqz v2, :cond_931

    .line 2347
    .line 2348
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2349
    .line 2350
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2351
    .line 2352
    .line 2353
    goto :goto_999

    .line 2354
    :cond_931
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2355
    .line 2356
    .line 2357
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2358
    .line 2359
    sget-object v3, Lrmx;->qS:Lrmx;

    .line 2360
    .line 2361
    check-cast v2, Lipo;

    .line 2362
    .line 2363
    iget-object v4, v2, Lipo;->g:Lrlv;

    .line 2364
    .line 2365
    invoke-interface {v4, v3}, Lrlv;->o(Lrmx;)V

    .line 2366
    .line 2367
    .line 2368
    sget-object v3, Lipb;->a:Lipb;

    .line 2369
    .line 2370
    invoke-virtual {v3}, Lalad;->m()Lakzx;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v3

    .line 2374
    invoke-static {v3}, Lkcq;->E(Lakzx;)Lipc;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v19

    .line 2378
    new-instance v18, Lapdp;

    .line 2379
    .line 2380
    invoke-direct/range {v18 .. v18}, Lapdp;-><init>()V

    .line 2381
    .line 2382
    .line 2383
    iget-object v3, v2, Lipo;->i:Lzzx;

    .line 2384
    .line 2385
    invoke-virtual {v3}, Lzzx;->e()Laihd;

    .line 2386
    .line 2387
    .line 2388
    move-result-object v3

    .line 2389
    invoke-static {v3, v9}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2390
    .line 2391
    .line 2392
    new-instance v4, Ljava/util/ArrayList;

    .line 2393
    .line 2394
    const/16 v5, 0xa

    .line 2395
    .line 2396
    invoke-static {v3, v5}, Lajsz;->bl(Ljava/lang/Iterable;I)I

    .line 2397
    .line 2398
    .line 2399
    move-result v5

    .line 2400
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2401
    .line 2402
    .line 2403
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2404
    .line 2405
    .line 2406
    move-result-object v3

    .line 2407
    :goto_966
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2408
    .line 2409
    .line 2410
    move-result v5

    .line 2411
    if-eqz v5, :cond_98c

    .line 2412
    .line 2413
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v5

    .line 2417
    move-object/from16 v17, v5

    .line 2418
    .line 2419
    check-cast v17, Liox;

    .line 2420
    .line 2421
    invoke-static/range {v17 .. v17}, Laooh;->c(Ljava/lang/Object;)V

    .line 2422
    .line 2423
    .line 2424
    iget-object v5, v2, Lipo;->e:Laoss;

    .line 2425
    .line 2426
    new-instance v15, Lipj;

    .line 2427
    .line 2428
    const/16 v20, 0x0

    .line 2429
    .line 2430
    move-object/from16 v16, v2

    .line 2431
    .line 2432
    invoke-direct/range {v15 .. v20}, Lipj;-><init>(Lipo;Liox;Lapdp;Lipc;Laoln;)V

    .line 2433
    .line 2434
    .line 2435
    invoke-static {v5, v10, v15, v11}, Laoov;->am(Laoss;ILaonn;I)Laosy;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v5

    .line 2439
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 2440
    .line 2441
    .line 2442
    move-object/from16 v2, v16

    .line 2443
    .line 2444
    goto :goto_966

    .line 2445
    :cond_98c
    move-object/from16 v2, v19

    .line 2446
    .line 2447
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2448
    .line 2449
    iput v14, v1, Lhqi;->b:I

    .line 2450
    .line 2451
    invoke-static {v4, v1}, Laooh;->v(Ljava/util/Collection;Laoln;)Ljava/lang/Object;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v3

    .line 2455
    if-eq v3, v0, :cond_9cd

    .line 2456
    .line 2457
    move-object v0, v2

    .line 2458
    :goto_999
    iget-object v1, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2459
    .line 2460
    check-cast v0, Lipc;

    .line 2461
    .line 2462
    invoke-virtual {v0}, Lipc;->a()Lipb;

    .line 2463
    .line 2464
    .line 2465
    move-result-object v0

    .line 2466
    sget-object v2, Lamoj;->a:Lamoj;

    .line 2467
    .line 2468
    invoke-virtual {v2}, Lalad;->m()Lakzx;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v2

    .line 2472
    invoke-static {v2}, Lakky;->P(Lakzx;)Lvaa;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v2

    .line 2476
    const/4 v7, 0x0

    .line 2477
    invoke-virtual {v0, v7}, Lakym;->e(Lalbw;)I

    .line 2478
    .line 2479
    .line 2480
    move-result v3

    .line 2481
    iget-object v4, v2, Lvaa;->a:Ljava/lang/Object;

    .line 2482
    .line 2483
    check-cast v4, Lakzx;

    .line 2484
    .line 2485
    invoke-virtual {v4}, Lakzx;->u()V

    .line 2486
    .line 2487
    .line 2488
    iget-object v4, v4, Lakzx;->b:Lalad;

    .line 2489
    .line 2490
    check-cast v4, Lamoj;

    .line 2491
    .line 2492
    iget v5, v4, Lamoj;->b:I

    .line 2493
    .line 2494
    or-int/2addr v5, v14

    .line 2495
    iput v5, v4, Lamoj;->b:I

    .line 2496
    .line 2497
    iput v3, v4, Lamoj;->c:I

    .line 2498
    .line 2499
    invoke-virtual {v2}, Lvaa;->al()Lamoj;

    .line 2500
    .line 2501
    .line 2502
    move-result-object v2

    .line 2503
    check-cast v1, Lipo;

    .line 2504
    .line 2505
    iget-object v1, v1, Lipo;->g:Lrlv;

    .line 2506
    .line 2507
    invoke-interface {v1, v2}, Lrlv;->d(Lamoj;)V

    .line 2508
    .line 2509
    .line 2510
    :cond_9cd
    :goto_9cd
    move-object v13, v0

    .line 2511
    return-object v13

    .line 2512
    :pswitch_9cf
    sget-object v0, Laolu;->a:Laolu;

    .line 2513
    .line 2514
    iget v2, v1, Lhqi;->b:I

    .line 2515
    .line 2516
    if-eqz v2, :cond_9db

    .line 2517
    .line 2518
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2519
    .line 2520
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2521
    .line 2522
    .line 2523
    goto :goto_a2b

    .line 2524
    :cond_9db
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2525
    .line 2526
    .line 2527
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2528
    .line 2529
    check-cast v2, Licu;

    .line 2530
    .line 2531
    iget-object v3, v2, Licu;->f:Landroid/media/MediaCodec;

    .line 2532
    .line 2533
    if-nez v3, :cond_9ec

    .line 2534
    .line 2535
    const-string v3, "codec"

    .line 2536
    .line 2537
    invoke-static {v3}, Laooh;->j(Ljava/lang/String;)V

    .line 2538
    .line 2539
    .line 2540
    const/4 v3, 0x0

    .line 2541
    :cond_9ec
    sget-object v4, Licu;->b:Laimz;

    .line 2542
    .line 2543
    invoke-virtual {v4}, Laimp;->b()Lainm;

    .line 2544
    .line 2545
    .line 2546
    move-result-object v4

    .line 2547
    const/16 v5, 0x8b

    .line 2548
    .line 2549
    const-string v6, "RecorderImpl.kt"

    .line 2550
    .line 2551
    const-string v7, "com/android/dialer/audio/recorder/impl/RecorderImpl"

    .line 2552
    .line 2553
    const-string v8, "finalizeTrack$<anonymous>$<anonymous>"

    .line 2554
    .line 2555
    invoke-interface {v4, v7, v8, v5, v6}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 2556
    .line 2557
    .line 2558
    move-result-object v4

    .line 2559
    check-cast v4, Laimw;

    .line 2560
    .line 2561
    iget-object v5, v2, Licu;->l:Laogy;

    .line 2562
    .line 2563
    iget-object v6, v2, Licu;->k:Laogy;

    .line 2564
    .line 2565
    invoke-virtual {v5}, Laogy;->k()I

    .line 2566
    .line 2567
    .line 2568
    move-result v5

    .line 2569
    invoke-virtual {v6}, Laogy;->k()I

    .line 2570
    .line 2571
    .line 2572
    move-result v6

    .line 2573
    const-string v7, "discarding uplink: %d downlink %d"

    .line 2574
    .line 2575
    invoke-interface {v4, v7, v5, v6}, Laimw;->z(Ljava/lang/String;II)V

    .line 2576
    .line 2577
    .line 2578
    const-wide/32 v4, 0x1c9c380

    .line 2579
    .line 2580
    .line 2581
    invoke-virtual {v3, v4, v5}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 2582
    .line 2583
    .line 2584
    move-result v4

    .line 2585
    const-wide/16 v7, 0x0

    .line 2586
    .line 2587
    const/4 v9, 0x4

    .line 2588
    const/4 v5, 0x0

    .line 2589
    const/4 v6, 0x0

    .line 2590
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 2591
    .line 2592
    .line 2593
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2594
    .line 2595
    iput v14, v1, Lhqi;->b:I

    .line 2596
    .line 2597
    invoke-virtual {v2, v1}, Licu;->e(Laoln;)Ljava/lang/Object;

    .line 2598
    .line 2599
    .line 2600
    move-result-object v1

    .line 2601
    if-eq v1, v0, :cond_9cd

    .line 2602
    .line 2603
    move-object v0, v3

    .line 2604
    :goto_a2b
    check-cast v0, Landroid/media/MediaCodec;

    .line 2605
    .line 2606
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 2607
    .line 2608
    .line 2609
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 2610
    .line 2611
    .line 2612
    sget-object v13, Laojh;->a:Laojh;

    .line 2613
    .line 2614
    return-object v13

    .line 2615
    :pswitch_a36
    sget-object v0, Laolu;->a:Laolu;

    .line 2616
    .line 2617
    iget v2, v1, Lhqi;->b:I

    .line 2618
    .line 2619
    if-eqz v2, :cond_a4a

    .line 2620
    .line 2621
    if-ne v2, v14, :cond_a46

    .line 2622
    .line 2623
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2624
    .line 2625
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2626
    .line 2627
    .line 2628
    move-object/from16 v3, p1

    .line 2629
    .line 2630
    goto :goto_a6c

    .line 2631
    :cond_a46
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2632
    .line 2633
    .line 2634
    goto :goto_a8a

    .line 2635
    :cond_a4a
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2636
    .line 2637
    .line 2638
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2639
    .line 2640
    move-object v3, v2

    .line 2641
    check-cast v3, Lhqv;

    .line 2642
    .line 2643
    iget-object v4, v3, Lhqv;->f:Ltt;

    .line 2644
    .line 2645
    iget-object v5, v3, Lhqv;->h:Lhqs;

    .line 2646
    .line 2647
    invoke-interface {v5}, Lhqs;->a()Laoxh;

    .line 2648
    .line 2649
    .line 2650
    move-result-object v5

    .line 2651
    iget-object v6, v3, Lhqv;->g:Lhqw;

    .line 2652
    .line 2653
    invoke-interface {v6, v5, v4}, Lhqw;->c(Laoxh;Ltt;)Laoxh;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v4

    .line 2657
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2658
    .line 2659
    iput v14, v1, Lhqi;->b:I

    .line 2660
    .line 2661
    iget-object v3, v3, Lhqv;->i:Laoss;

    .line 2662
    .line 2663
    invoke-static {v4, v3, v1}, Laoov;->ar(Laoxh;Laoss;Laoln;)Ljava/lang/Object;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v3

    .line 2667
    if-eq v3, v0, :cond_9cd

    .line 2668
    .line 2669
    :goto_a6c
    check-cast v3, Laozh;

    .line 2670
    .line 2671
    check-cast v2, Lhqv;

    .line 2672
    .line 2673
    iput-object v3, v2, Lhqv;->k:Laozh;

    .line 2674
    .line 2675
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2676
    .line 2677
    check-cast v2, Lhqv;

    .line 2678
    .line 2679
    iget-object v3, v2, Lhqv;->k:Laozh;

    .line 2680
    .line 2681
    if-eqz v3, :cond_a92

    .line 2682
    .line 2683
    new-instance v4, Lhqt;

    .line 2684
    .line 2685
    const/4 v7, 0x0

    .line 2686
    invoke-direct {v4, v2, v7, v10}, Lhqt;-><init>(Lhqv;Laoln;I)V

    .line 2687
    .line 2688
    .line 2689
    iput-object v7, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2690
    .line 2691
    iput v12, v1, Lhqi;->b:I

    .line 2692
    .line 2693
    invoke-static {v3, v4, v1}, Laoov;->aF(Laoxh;Laonn;Laoln;)Ljava/lang/Object;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v1

    .line 2697
    if-eq v1, v0, :cond_9cd

    .line 2698
    .line 2699
    :goto_a8a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2700
    .line 2701
    const-string v1, "SharedFlow never completes, this call should never return."

    .line 2702
    .line 2703
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2704
    .line 2705
    .line 2706
    throw v0

    .line 2707
    :cond_a92
    sget-object v13, Laojh;->a:Laojh;

    .line 2708
    .line 2709
    return-object v13

    .line 2710
    :pswitch_a95
    sget-object v0, Laolu;->a:Laolu;

    .line 2711
    .line 2712
    iget v2, v1, Lhqi;->b:I

    .line 2713
    .line 2714
    if-eqz v2, :cond_aa1

    .line 2715
    .line 2716
    iget-object v0, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2717
    .line 2718
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2719
    .line 2720
    .line 2721
    goto :goto_ad8

    .line 2722
    :cond_aa1
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2723
    .line 2724
    .line 2725
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2726
    .line 2727
    move-object v3, v2

    .line 2728
    check-cast v3, Lof;

    .line 2729
    .line 2730
    invoke-virtual {v3}, Lof;->f()Z

    .line 2731
    .line 2732
    .line 2733
    move-result v3

    .line 2734
    if-eqz v3, :cond_ae6

    .line 2735
    .line 2736
    new-instance v3, Laoop;

    .line 2737
    .line 2738
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2739
    .line 2740
    .line 2741
    check-cast v2, Lnp;

    .line 2742
    .line 2743
    iget-object v4, v2, Lnp;->a:Laonn;

    .line 2744
    .line 2745
    iget-object v2, v2, Lnp;->b:Laowi;

    .line 2746
    .line 2747
    invoke-static {v2}, Laooh;->c(Ljava/lang/Object;)V

    .line 2748
    .line 2749
    .line 2750
    new-instance v5, Laoxd;

    .line 2751
    .line 2752
    invoke-direct {v5, v2, v14}, Laoxd;-><init>(Laowu;Z)V

    .line 2753
    .line 2754
    .line 2755
    new-instance v2, Lbug;

    .line 2756
    .line 2757
    const/4 v7, 0x0

    .line 2758
    invoke-direct {v2, v3, v7, v14}, Lbug;-><init>(Laoop;Laoln;I)V

    .line 2759
    .line 2760
    .line 2761
    new-instance v7, Lgdc;

    .line 2762
    .line 2763
    invoke-direct {v7, v5, v2, v6}, Lgdc;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2764
    .line 2765
    .line 2766
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2767
    .line 2768
    iput v14, v1, Lhqi;->b:I

    .line 2769
    .line 2770
    invoke-interface {v4, v7, v1}, Laonn;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2771
    .line 2772
    .line 2773
    move-result-object v1

    .line 2774
    if-eq v1, v0, :cond_9cd

    .line 2775
    .line 2776
    move-object v0, v3

    .line 2777
    :goto_ad8
    check-cast v0, Laoop;

    .line 2778
    .line 2779
    iget-boolean v0, v0, Laoop;->a:Z

    .line 2780
    .line 2781
    if-nez v0, :cond_ae6

    .line 2782
    .line 2783
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2784
    .line 2785
    const-string v1, "You must collect the progress flow"

    .line 2786
    .line 2787
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2788
    .line 2789
    .line 2790
    throw v0

    .line 2791
    :cond_ae6
    sget-object v13, Laojh;->a:Laojh;

    .line 2792
    .line 2793
    goto :goto_b41

    .line 2794
    :pswitch_ae9
    sget-object v0, Laolu;->a:Laolu;

    .line 2795
    .line 2796
    iget v2, v1, Lhqi;->b:I

    .line 2797
    .line 2798
    if-eqz v2, :cond_aff

    .line 2799
    .line 2800
    if-eq v2, v14, :cond_af5

    .line 2801
    .line 2802
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2803
    .line 2804
    .line 2805
    goto :goto_b1f

    .line 2806
    :cond_af5
    iget-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2807
    .line 2808
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2809
    .line 2810
    .line 2811
    move-object v3, v2

    .line 2812
    move-object/from16 v2, p1

    .line 2813
    .line 2814
    :goto_afd
    const/4 v7, 0x0

    .line 2815
    goto :goto_b13

    .line 2816
    :cond_aff
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2817
    .line 2818
    .line 2819
    iget-object v2, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2820
    .line 2821
    check-cast v2, Lhql;

    .line 2822
    .line 2823
    iget-object v3, v2, Lhql;->a:Laozj;

    .line 2824
    .line 2825
    iput-object v3, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2826
    .line 2827
    iput v14, v1, Lhqi;->b:I

    .line 2828
    .line 2829
    invoke-virtual {v2, v1}, Lhql;->c(Laoln;)Ljava/lang/Object;

    .line 2830
    .line 2831
    .line 2832
    move-result-object v2

    .line 2833
    if-eq v2, v0, :cond_9cd

    .line 2834
    .line 2835
    goto :goto_afd

    .line 2836
    :goto_b13
    iput-object v7, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2837
    .line 2838
    iput v12, v1, Lhqi;->b:I

    .line 2839
    .line 2840
    check-cast v3, Laozj;

    .line 2841
    .line 2842
    invoke-virtual {v3, v2, v1}, Laozj;->a(Ljava/lang/Object;Laoln;)Ljava/lang/Object;

    .line 2843
    .line 2844
    .line 2845
    move-result-object v1

    .line 2846
    if-eq v1, v0, :cond_9cd

    .line 2847
    .line 2848
    :goto_b1f
    sget-object v13, Laojh;->a:Laojh;

    .line 2849
    .line 2850
    goto :goto_b41

    .line 2851
    :cond_b22
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 2852
    .line 2853
    .line 2854
    iget-object v0, v1, Lhqi;->c:Ljava/lang/Object;

    .line 2855
    .line 2856
    const-string v2, "STATE_DOBBY_DO_NOT_SCREEN_AND_NOT_SPAM_REPORT_IN_PAST_WEEK"

    .line 2857
    .line 2858
    iput-object v2, v1, Lhqi;->a:Ljava/lang/Object;

    .line 2859
    .line 2860
    iput v14, v1, Lhqi;->b:I

    .line 2861
    .line 2862
    check-cast v0, Lmux;

    .line 2863
    .line 2864
    invoke-virtual {v0, v1}, Lmux;->c(Laoln;)Ljava/lang/Object;

    .line 2865
    .line 2866
    .line 2867
    move-result-object v0

    .line 2868
    if-eq v0, v13, :cond_b41

    .line 2869
    .line 2870
    :goto_b35
    check-cast v0, Ljava/lang/Number;

    .line 2871
    .line 2872
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 2873
    .line 2874
    .line 2875
    move-result v0

    .line 2876
    check-cast v2, Ljava/lang/String;

    .line 2877
    .line 2878
    invoke-static {v2, v0}, Labxl;->L(Ljava/lang/String;I)Lafpl;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v13

    .line 2882
    :cond_b41
    :goto_b41
    return-object v13

    .line 2883
    :pswitch_data_b42
    .packed-switch 0x0
        :pswitch_ae9
        :pswitch_a95
        :pswitch_a36
        :pswitch_9cf
        :pswitch_925
        :pswitch_816
        :pswitch_7cc
        :pswitch_6b9
        :pswitch_650
        :pswitch_5e8
        :pswitch_509
        :pswitch_3b7
        :pswitch_37d
        :pswitch_343
        :pswitch_2b9
        :pswitch_22f
        :pswitch_18f
        :pswitch_130
        :pswitch_d1
        :pswitch_28
    .end packed-switch

    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    :pswitch_data_b6e
    .packed-switch 0x0
        :pswitch_851
        :pswitch_84b
        :pswitch_843
        :pswitch_83b
        :pswitch_832
        :pswitch_829
        :pswitch_822
    .end packed-switch
.end method
