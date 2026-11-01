.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 23

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget v0, v7, Lkqd;->$cid:I

    .line 4
    .line 5
    const-string v1, "Received at a cancellation channel"

    .line 6
    .line 7
    const-string v2, "Received at a closed channel"

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const-string v4, "ContactCheckerRemote.kt"

    .line 11
    .line 12
    const-string v5, "DialerCallScreeningServiceMixinImpl.kt"

    .line 13
    .line 14
    const-string v6, "com/android/dialer/contactchecker/remote/ContactCheckerRemote"

    .line 15
    .line 16
    const-string v8, "value"

    .line 17
    .line 18
    const-string v9, "com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl"

    .line 19
    .line 20
    const/4 v10, 0x2

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x1

    .line 24
    packed-switch v0, :pswitch_data_874

    .line 25
    .line 26
    .line 27
    sget-object v0, Laolu;->a:Laolu;

    .line 28
    .line 29
    iget v1, v7, Lkqd;->a:I

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    if-eqz v1, :cond_817

    .line 35
    .line 36
    goto/16 :goto_871

    .line 37
    .line 38
    :pswitch_25
    sget-object v0, Laolu;->a:Laolu;

    .line 39
    .line 40
    iget v1, v7, Lkqd;->a:I

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    if-eqz v1, :cond_31

    .line 46
    .line 47
    move-object/from16 v1, p1

    .line 48
    .line 49
    goto :goto_41

    .line 50
    :cond_31
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v1, v2}, Lzkb;->b(Ljava/util/Set;Lajct;)Lajcq;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput v13, v7, Lkqd;->a:I

    .line 59
    .line 60
    invoke-static {v1, v7}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eq v1, v0, :cond_873

    .line 65
    .line 66
    :goto_41
    check-cast v1, Laihd;

    .line 67
    .line 68
    sget-object v0, Lmma;->b:Laimz;

    .line 69
    .line 70
    invoke-virtual {v0}, Laimp;->b()Lainm;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/16 v2, 0x4c

    .line 75
    .line 76
    const-string v3, "DisconnectPromptProducerModule.kt"

    .line 77
    .line 78
    const-string v4, "com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion"

    .line 79
    .line 80
    const-string v5, "produceDisconnectPrompt$<anonymous>"

    .line 81
    .line 82
    invoke-interface {v0, v4, v5, v2, v3}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Laimw;

    .line 87
    .line 88
    invoke-virtual {v1}, Laihd;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    const-string v3, "The count of contributed DisconnectPromptModels is: %d"

    .line 93
    .line 94
    invoke-interface {v0, v3, v2}, Laimw;->w(Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Laooh;->c(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lhte;

    .line 101
    .line 102
    const/16 v2, 0x12

    .line 103
    .line 104
    invoke-direct {v0, v2}, Lhte;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v0}, Lajsz;->bX(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lajsz;->bG(Ljava/util/List;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Lj$/util/Optional;->ofNullable(Ljava/lang/Object;)Lj$/util/Optional;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v1, "ofNullable(...)"

    .line 120
    .line 121
    invoke-static {v0, v1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_7c
    sget-object v0, Laolu;->a:Laolu;

    .line 126
    .line 127
    iget v1, v7, Lkqd;->a:I

    .line 128
    .line 129
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    if-nez v1, :cond_6f8

    .line 133
    .line 134
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 135
    .line 136
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 137
    .line 138
    iput v13, v7, Lkqd;->a:I

    .line 139
    .line 140
    check-cast v1, Lmki;

    .line 141
    .line 142
    iget-object v1, v1, Lmki;->f:Lzjs;

    .line 143
    .line 144
    check-cast v2, Landroid/telecom/PhoneAccountHandle;

    .line 145
    .line 146
    invoke-virtual {v1, v2, v7}, Lzjs;->p(Landroid/telecom/PhoneAccountHandle;Laoln;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-ne v1, v0, :cond_738

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_98
    sget-object v0, Laolu;->a:Laolu;

    .line 154
    .line 155
    iget v1, v7, Lkqd;->a:I

    .line 156
    .line 157
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    if-eqz v1, :cond_a9

    .line 161
    .line 162
    if-eq v1, v13, :cond_a6

    .line 163
    .line 164
    move-object/from16 v1, p1

    .line 165
    .line 166
    goto :goto_cd

    .line 167
    :cond_a6
    move-object/from16 v1, p1

    .line 168
    .line 169
    goto :goto_b9

    .line 170
    :cond_a9
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 173
    .line 174
    iput v13, v7, Lkqd;->a:I

    .line 175
    .line 176
    check-cast v2, Landroid/telecom/PhoneAccountHandle;

    .line 177
    .line 178
    check-cast v1, Lmki;

    .line 179
    .line 180
    invoke-virtual {v1, v2, v7}, Lmki;->a(Landroid/telecom/PhoneAccountHandle;Laoln;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-eq v1, v0, :cond_873

    .line 185
    .line 186
    :goto_b9
    check-cast v1, Ljava/lang/String;

    .line 187
    .line 188
    if-nez v1, :cond_738

    .line 189
    .line 190
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 191
    .line 192
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 193
    .line 194
    iput v10, v7, Lkqd;->a:I

    .line 195
    .line 196
    check-cast v2, Landroid/telecom/PhoneAccountHandle;

    .line 197
    .line 198
    check-cast v1, Lmki;

    .line 199
    .line 200
    invoke-virtual {v1, v2, v7}, Lmki;->b(Landroid/telecom/PhoneAccountHandle;Laoln;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-eq v1, v0, :cond_873

    .line 205
    .line 206
    :goto_cd
    move-object v0, v1

    .line 207
    check-cast v0, Ljava/lang/String;

    .line 208
    .line 209
    return-object v0

    .line 210
    :pswitch_d1
    sget-object v0, Laolu;->a:Laolu;

    .line 211
    .line 212
    iget v1, v7, Lkqd;->a:I

    .line 213
    .line 214
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    if-nez v1, :cond_6f8

    .line 218
    .line 219
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 220
    .line 221
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 222
    .line 223
    iput v13, v7, Lkqd;->a:I

    .line 224
    .line 225
    check-cast v1, Lmki;

    .line 226
    .line 227
    iget-object v1, v1, Lmki;->e:Lnvw;

    .line 228
    .line 229
    check-cast v2, Landroid/telecom/PhoneAccountHandle;

    .line 230
    .line 231
    invoke-virtual {v1, v2, v11, v7}, Lnvw;->a(Landroid/telecom/PhoneAccountHandle;ZLaoln;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-ne v1, v0, :cond_738

    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_ed
    sget-object v0, Laolu;->a:Laolu;

    .line 239
    .line 240
    iget v1, v7, Lkqd;->a:I

    .line 241
    .line 242
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    if-nez v1, :cond_6f8

    .line 246
    .line 247
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 248
    .line 249
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v2, Lkiu;

    .line 252
    .line 253
    iget-object v2, v2, Lkiu;->f:Lhkd;

    .line 254
    .line 255
    if-nez v2, :cond_102

    .line 256
    .line 257
    sget-object v2, Lhkd;->a:Lhkd;

    .line 258
    .line 259
    :cond_102
    const-string v3, "getNumber(...)"

    .line 260
    .line 261
    invoke-static {v2, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iput v13, v7, Lkqd;->a:I

    .line 265
    .line 266
    check-cast v1, Llzz;

    .line 267
    .line 268
    iget-object v3, v1, Llzz;->d:Laolr;

    .line 269
    .line 270
    new-instance v4, Lkqd;

    .line 271
    .line 272
    const/16 v5, 0xe

    .line 273
    .line 274
    invoke-direct {v4, v1, v2, v12, v5}, Lkqd;-><init>(Llzz;Lhkd;Laoln;I)V

    .line 275
    .line 276
    .line 277
    invoke-static {v3, v4, v7}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    if-ne v1, v0, :cond_738

    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_11b
    sget-object v8, Laolu;->a:Laolu;

    .line 285
    .line 286
    iget v0, v7, Lkqd;->a:I

    .line 287
    .line 288
    const-string v9, "queryPhoneLookupHistory$<anonymous>"

    .line 289
    .line 290
    const-string v10, "com/android/dialer/conversationhistorycalldetails/dataservice/UiModelDataSource"

    .line 291
    .line 292
    const-string v12, "UiModelDataSource.kt"

    .line 293
    .line 294
    if-eqz v0, :cond_12d

    .line 295
    .line 296
    :try_start_127
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_12a
    .catch Lagui; {:try_start_127 .. :try_end_12a} :catch_1b7
    .catch Ljava/lang/RuntimeException; {:try_start_127 .. :try_end_12a} :catch_19c

    .line 297
    .line 298
    .line 299
    move-object/from16 v0, p1

    .line 300
    .line 301
    goto :goto_15a

    .line 302
    :cond_12d
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :try_start_130
    iget-object v0, v7, Lkqd;->c:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Llzz;

    .line 308
    .line 309
    iget-object v0, v0, Llzz;->e:Lojo;

    .line 310
    .line 311
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v1, Lhkd;

    .line 314
    .line 315
    iget-object v1, v1, Lhkd;->c:Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v1}, Lsro;->a(Ljava/lang/String;)Landroid/net/Uri;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    const-string v2, "contentUriForNumber(...)"

    .line 322
    .line 323
    invoke-static {v1, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const-string v2, "phone_lookup_info"

    .line 327
    .line 328
    filled-new-array {v2}, [Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    sget-object v6, Lbbb;->h:Lbbb;

    .line 333
    .line 334
    iput v13, v7, Lkqd;->a:I

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    const/4 v5, 0x0

    .line 338
    const/4 v3, 0x0

    .line 339
    invoke-virtual/range {v0 .. v7}, Lojo;->i(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Laonj;Laoln;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-ne v0, v8, :cond_15a

    .line 344
    .line 345
    move-object v0, v8

    .line 346
    return-object v0

    .line 347
    :cond_15a
    :goto_15a
    check-cast v0, Laify;
    :try_end_15c
    .catch Lagui; {:try_start_130 .. :try_end_15c} :catch_1b7
    .catch Ljava/lang/RuntimeException; {:try_start_130 .. :try_end_15c} :catch_19c

    .line 348
    .line 349
    invoke-virtual {v0}, Laify;->isEmpty()Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_192

    .line 354
    .line 355
    sget-object v0, Llzz;->a:Laimz;

    .line 356
    .line 357
    invoke-virtual {v0}, Laimp;->d()Lainm;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    check-cast v0, Laimw;

    .line 362
    .line 363
    sget-object v1, Lzct;->b:Lainp;

    .line 364
    .line 365
    invoke-interface {v0, v1}, Laimw;->i(Lainp;)Lainm;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    const/16 v1, 0x80

    .line 370
    .line 371
    invoke-interface {v0, v10, v9, v1, v12}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    check-cast v0, Laimw;

    .line 376
    .line 377
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v1, Lhkd;

    .line 380
    .line 381
    const-string v2, "Missing phone lookup history for number %s"

    .line 382
    .line 383
    iget-object v1, v1, Lhkd;->d:Ljava/lang/String;

    .line 384
    .line 385
    invoke-interface {v0, v2, v1}, Laimw;->y(Ljava/lang/String;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    sget-object v0, Lspn;->a:Lspn;

    .line 389
    .line 390
    invoke-virtual {v0}, Lalad;->m()Lakzx;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-static {v0}, Lsns;->h(Lakzx;)Lryu;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v0}, Lryu;->c()Lspn;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    return-object v0

    .line 403
    :cond_192
    invoke-virtual {v0, v11}, Laify;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    const-string v1, "get(...)"

    .line 408
    .line 409
    invoke-static {v0, v1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-object v0

    .line 413
    :catch_19c
    move-exception v0

    .line 414
    sget-object v1, Llzz;->a:Laimz;

    .line 415
    .line 416
    invoke-virtual {v1}, Laimp;->d()Lainm;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    check-cast v1, Laimw;

    .line 421
    .line 422
    invoke-interface {v1, v0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    const/16 v2, 0x79

    .line 427
    .line 428
    invoke-interface {v1, v10, v9, v2, v12}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    check-cast v1, Laimw;

    .line 433
    .line 434
    const-string v2, "queryPhoneLookupHistory failed"

    .line 435
    .line 436
    invoke-interface {v1, v2}, Laimw;->v(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :catch_1b7
    move-exception v0

    .line 441
    sget-object v1, Llzz;->a:Laimz;

    .line 442
    .line 443
    invoke-virtual {v1}, Laimp;->d()Lainm;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, Laimw;

    .line 448
    .line 449
    sget-object v2, Lzct;->b:Lainp;

    .line 450
    .line 451
    invoke-interface {v1, v2}, Laimw;->i(Lainp;)Lainm;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    check-cast v1, Laimw;

    .line 456
    .line 457
    invoke-interface {v1, v0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    const/16 v1, 0x76

    .line 462
    .line 463
    invoke-interface {v0, v10, v9, v1, v12}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, Laimw;

    .line 468
    .line 469
    const-string v1, "Exception when querying phone lookup history in call details data service."

    .line 470
    .line 471
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    sget-object v0, Lspn;->a:Lspn;

    .line 475
    .line 476
    invoke-virtual {v0}, Lalad;->m()Lakzx;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-static {v0}, Lsns;->h(Lakzx;)Lryu;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Lryu;->c()Lspn;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    return-object v0

    .line 489
    :pswitch_1e8
    sget-object v0, Laolu;->a:Laolu;

    .line 490
    .line 491
    iget v1, v7, Lkqd;->a:I

    .line 492
    .line 493
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    if-eqz v1, :cond_1f4

    .line 497
    .line 498
    move-object/from16 v1, p1

    .line 499
    .line 500
    goto :goto_208

    .line 501
    :cond_1f4
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v1, Llzt;

    .line 504
    .line 505
    iget-boolean v2, v1, Llzt;->d:Z

    .line 506
    .line 507
    if-eqz v2, :cond_219

    .line 508
    .line 509
    iget-object v2, v7, Lkqd;->c:Ljava/lang/Object;

    .line 510
    .line 511
    iget-object v1, v1, Llzt;->e:Lkiu;

    .line 512
    .line 513
    iput v13, v7, Lkqd;->a:I

    .line 514
    .line 515
    invoke-interface {v2, v1, v7}, Laonn;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    if-eq v1, v0, :cond_873

    .line 520
    .line 521
    :goto_208
    check-cast v1, Lkiu;

    .line 522
    .line 523
    if-eqz v1, :cond_213

    .line 524
    .line 525
    iget-object v0, v7, Lkqd;->b:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v0, Llzt;

    .line 528
    .line 529
    invoke-virtual {v0, v1}, Llzt;->a(Lkiu;)V

    .line 530
    .line 531
    .line 532
    :cond_213
    iget-object v0, v7, Lkqd;->b:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v0, Llzt;

    .line 535
    .line 536
    iput-boolean v11, v0, Llzt;->d:Z

    .line 537
    .line 538
    :cond_219
    sget-object v0, Laojh;->a:Laojh;

    .line 539
    .line 540
    return-object v0

    .line 541
    :pswitch_21c
    sget-object v0, Laolu;->a:Laolu;

    .line 542
    .line 543
    iget v1, v7, Lkqd;->a:I

    .line 544
    .line 545
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    if-nez v1, :cond_6f8

    .line 549
    .line 550
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 551
    .line 552
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 553
    .line 554
    iput v13, v7, Lkqd;->a:I

    .line 555
    .line 556
    new-instance v3, Lkqd;

    .line 557
    .line 558
    check-cast v2, Lkiq;

    .line 559
    .line 560
    check-cast v1, Ljyn;

    .line 561
    .line 562
    const/16 v4, 0xb

    .line 563
    .line 564
    invoke-direct {v3, v1, v2, v12, v4}, Lkqd;-><init>(Ljyn;Lkiq;Laoln;I)V

    .line 565
    .line 566
    .line 567
    iget-object v1, v1, Ljyn;->b:Ljava/lang/Object;

    .line 568
    .line 569
    invoke-static {v1, v3, v7}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    if-ne v1, v0, :cond_738

    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_23f
    sget-object v0, Laolu;->a:Laolu;

    .line 577
    .line 578
    iget v1, v7, Lkqd;->a:I

    .line 579
    .line 580
    const/16 v2, 0xa

    .line 581
    .line 582
    const-string v3, "getCallDetailsList(...)"

    .line 583
    .line 584
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    if-eqz v1, :cond_24f

    .line 588
    .line 589
    move-object/from16 v1, p1

    .line 590
    .line 591
    goto :goto_2a4

    .line 592
    :cond_24f
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v1, Ljyn;

    .line 595
    .line 596
    iget-object v4, v1, Ljyn;->d:Ljava/lang/Object;

    .line 597
    .line 598
    invoke-interface {v4}, Laoir;->a()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    move-object/from16 v16, v4

    .line 603
    .line 604
    check-cast v16, Ljava/util/EnumMap;

    .line 605
    .line 606
    iget-object v4, v7, Lkqd;->b:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v4, Lkiq;

    .line 609
    .line 610
    iget-object v4, v4, Lkiq;->b:Lalat;

    .line 611
    .line 612
    invoke-static {v4, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-interface/range {v16 .. v16}, Ljava/util/Map;->isEmpty()Z

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    if-eqz v5, :cond_288

    .line 620
    .line 621
    new-instance v0, Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-static {v4, v2}, Lajsz;->bl(Ljava/lang/Iterable;I)I

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 628
    .line 629
    .line 630
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    :goto_279
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 635
    .line 636
    .line 637
    move-result v4

    .line 638
    if-eqz v4, :cond_2a7

    .line 639
    .line 640
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    sget-object v4, Laokd;->a:Laokd;

    .line 644
    .line 645
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    goto :goto_279

    .line 649
    :cond_288
    iget-object v1, v1, Ljyn;->c:Ljava/lang/Object;

    .line 650
    .line 651
    new-instance v14, Llwm;

    .line 652
    .line 653
    move-object v15, v1

    .line 654
    check-cast v15, Lkaw;

    .line 655
    .line 656
    const/16 v19, 0x2

    .line 657
    .line 658
    const/16 v20, 0x0

    .line 659
    .line 660
    const/16 v18, 0x0

    .line 661
    .line 662
    move-object/from16 v17, v4

    .line 663
    .line 664
    invoke-direct/range {v14 .. v20}, Llwm;-><init>(Lkaw;Ljava/util/Map;Ljava/util/List;Laoln;I[B)V

    .line 665
    .line 666
    .line 667
    iput v13, v7, Lkqd;->a:I

    .line 668
    .line 669
    iget-object v1, v15, Lkaw;->a:Ljava/lang/Object;

    .line 670
    .line 671
    invoke-static {v1, v14, v7}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    if-eq v1, v0, :cond_873

    .line 676
    .line 677
    :goto_2a4
    move-object v0, v1

    .line 678
    check-cast v0, Ljava/util/List;

    .line 679
    .line 680
    :cond_2a7
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 681
    .line 682
    const-string v4, "<this>"

    .line 683
    .line 684
    invoke-static {v1, v4}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    const-string v4, "data"

    .line 688
    .line 689
    invoke-static {v0, v4}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    check-cast v1, Lkiq;

    .line 693
    .line 694
    iget-object v4, v1, Lkiq;->b:Lalat;

    .line 695
    .line 696
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 701
    .line 702
    .line 703
    move-result v5

    .line 704
    if-ne v4, v5, :cond_37c

    .line 705
    .line 706
    sget-object v4, Lkiq;->a:Lkiq;

    .line 707
    .line 708
    invoke-virtual {v4}, Lalad;->m()Lakzx;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-static {v4}, Lhgt;->E(Lakzx;)Ljhw;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    invoke-virtual {v4}, Ljhw;->r()V

    .line 717
    .line 718
    .line 719
    iget-object v1, v1, Lkiq;->b:Lalat;

    .line 720
    .line 721
    invoke-static {v1, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    new-instance v3, Ljava/util/ArrayList;

    .line 725
    .line 726
    invoke-static {v1, v2}, Lajsz;->bl(Ljava/lang/Iterable;I)I

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 731
    .line 732
    .line 733
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    :goto_2e0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    if-eqz v2, :cond_374

    .line 742
    .line 743
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    add-int/lit8 v5, v11, 0x1

    .line 748
    .line 749
    if-gez v11, :cond_2f1

    .line 750
    .line 751
    invoke-static {}, Lajsz;->bh()V

    .line 752
    .line 753
    .line 754
    :cond_2f1
    check-cast v2, Lkip;

    .line 755
    .line 756
    invoke-static {v2}, Laooh;->c(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    check-cast v6, Ljava/util/Map;

    .line 764
    .line 765
    const-string v7, "<this>"

    .line 766
    .line 767
    invoke-static {v2, v7}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    const-string v7, "data"

    .line 771
    .line 772
    invoke-static {v6, v7}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    .line 776
    .line 777
    .line 778
    move-result v7

    .line 779
    if-eqz v7, :cond_314

    .line 780
    .line 781
    iget-object v7, v2, Lkip;->v:Lalbe;

    .line 782
    .line 783
    invoke-virtual {v7}, Lalbe;->size()I

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    if-eqz v7, :cond_36e

    .line 788
    .line 789
    :cond_314
    invoke-virtual {v2}, Lalad;->p()Lakzx;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    invoke-virtual {v2}, Lakzx;->u()V

    .line 794
    .line 795
    .line 796
    iget-object v7, v2, Lakzx;->b:Lalad;

    .line 797
    .line 798
    check-cast v7, Lkip;

    .line 799
    .line 800
    invoke-virtual {v7}, Lkip;->b()Lalbe;

    .line 801
    .line 802
    .line 803
    move-result-object v7

    .line 804
    invoke-interface {v7}, Ljava/util/Map;->clear()V

    .line 805
    .line 806
    .line 807
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 808
    .line 809
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 810
    .line 811
    .line 812
    move-result v8

    .line 813
    invoke-static {v8}, Lajsz;->aL(I)I

    .line 814
    .line 815
    .line 816
    move-result v8

    .line 817
    invoke-direct {v7, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 818
    .line 819
    .line 820
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 821
    .line 822
    .line 823
    move-result-object v6

    .line 824
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 825
    .line 826
    .line 827
    move-result-object v6

    .line 828
    :goto_33b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 829
    .line 830
    .line 831
    move-result v8

    .line 832
    if-eqz v8, :cond_357

    .line 833
    .line 834
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v8

    .line 838
    check-cast v8, Ljava/util/Map$Entry;

    .line 839
    .line 840
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v9

    .line 844
    check-cast v9, Llzk;

    .line 845
    .line 846
    iget-object v9, v9, Llzk;->f:Ljava/lang/String;

    .line 847
    .line 848
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v8

    .line 852
    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    goto :goto_33b

    .line 856
    :cond_357
    invoke-virtual {v2}, Lakzx;->u()V

    .line 857
    .line 858
    .line 859
    iget-object v6, v2, Lakzx;->b:Lalad;

    .line 860
    .line 861
    check-cast v6, Lkip;

    .line 862
    .line 863
    invoke-virtual {v6}, Lkip;->b()Lalbe;

    .line 864
    .line 865
    .line 866
    move-result-object v6

    .line 867
    invoke-interface {v6, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v2}, Lakzx;->p()Lalad;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    invoke-static {v2}, Laooh;->c(Ljava/lang/Object;)V

    .line 875
    .line 876
    .line 877
    check-cast v2, Lkip;

    .line 878
    .line 879
    :cond_36e
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    move v11, v5

    .line 883
    goto/16 :goto_2e0

    .line 884
    .line 885
    :cond_374
    invoke-virtual {v4, v3}, Ljhw;->q(Ljava/lang/Iterable;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v4}, Ljhw;->p()Lkiq;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    return-object v0

    .line 893
    :cond_37c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 894
    .line 895
    const-string v1, "Provided data does not match call details count"

    .line 896
    .line 897
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    throw v0

    .line 901
    :pswitch_384
    sget-object v0, Laolu;->a:Laolu;

    .line 902
    .line 903
    iget v1, v7, Lkqd;->a:I

    .line 904
    .line 905
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    if-nez v1, :cond_6f8

    .line 909
    .line 910
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 911
    .line 912
    iget-object v2, v7, Lkqd;->c:Ljava/lang/Object;

    .line 913
    .line 914
    iput v13, v7, Lkqd;->a:I

    .line 915
    .line 916
    check-cast v2, Ltei;

    .line 917
    .line 918
    check-cast v1, Llvx;

    .line 919
    .line 920
    invoke-virtual {v1, v2, v7}, Llvx;->b(Ltei;Laoln;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    if-ne v1, v0, :cond_738

    .line 925
    .line 926
    return-object v0

    .line 927
    :pswitch_39e
    sget-object v0, Laolu;->a:Laolu;

    .line 928
    .line 929
    iget v1, v7, Lkqd;->a:I

    .line 930
    .line 931
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 932
    .line 933
    .line 934
    if-eqz v1, :cond_3af

    .line 935
    .line 936
    if-eq v1, v13, :cond_3ac

    .line 937
    .line 938
    move-object/from16 v1, p1

    .line 939
    .line 940
    goto :goto_3d4

    .line 941
    :cond_3ac
    move-object/from16 v1, p1

    .line 942
    .line 943
    goto :goto_3bf

    .line 944
    :cond_3af
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v1, Llug;

    .line 947
    .line 948
    iget-object v2, v1, Llug;->d:Lzfu;

    .line 949
    .line 950
    if-nez v2, :cond_419

    .line 951
    .line 952
    iput v13, v7, Lkqd;->a:I

    .line 953
    .line 954
    invoke-virtual {v1, v7}, Llug;->a(Laoln;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    if-eq v1, v0, :cond_873

    .line 959
    .line 960
    :goto_3bf
    check-cast v1, Lrcr;

    .line 961
    .line 962
    if-nez v1, :cond_3c6

    .line 963
    .line 964
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 965
    .line 966
    return-object v0

    .line 967
    :cond_3c6
    iget-object v2, v7, Lkqd;->c:Ljava/lang/Object;

    .line 968
    .line 969
    iput v10, v7, Lkqd;->a:I

    .line 970
    .line 971
    check-cast v2, Llug;

    .line 972
    .line 973
    iget-object v2, v2, Llug;->c:Lzdt;

    .line 974
    .line 975
    invoke-virtual {v1, v2, v11, v7}, Lrcr;->e(Lzdt;ZLaoln;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    if-eq v1, v0, :cond_873

    .line 980
    .line 981
    :goto_3d4
    check-cast v1, Lzfr;

    .line 982
    .line 983
    invoke-static {v1}, Lanty;->X(Ljava/lang/Object;)I

    .line 984
    .line 985
    .line 986
    move-result v0

    .line 987
    if-eqz v0, :cond_3fd

    .line 988
    .line 989
    if-ne v0, v13, :cond_3f7

    .line 990
    .line 991
    iget-object v0, v7, Lkqd;->c:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v1, Lzfq;

    .line 994
    .line 995
    iget-object v1, v1, Lzfq;->a:Lzfu;

    .line 996
    .line 997
    check-cast v0, Llug;

    .line 998
    .line 999
    iput-object v1, v0, Llug;->d:Lzfu;

    .line 1000
    .line 1001
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1002
    .line 1003
    new-instance v2, Lkqd;

    .line 1004
    .line 1005
    const/16 v4, 0x8

    .line 1006
    .line 1007
    invoke-direct {v2, v0, v1, v12, v4}, Lkqd;-><init>(Llug;Lluc;Laoln;I)V

    .line 1008
    .line 1009
    .line 1010
    iget-object v0, v0, Llug;->b:Laoss;

    .line 1011
    .line 1012
    invoke-static {v0, v12, v11, v2, v3}, Laoov;->an(Laoss;Laolr;ILaonn;I)Laoub;

    .line 1013
    .line 1014
    .line 1015
    goto :goto_419

    .line 1016
    :cond_3f7
    new-instance v0, Laois;

    .line 1017
    .line 1018
    invoke-direct {v0}, Laois;-><init>()V

    .line 1019
    .line 1020
    .line 1021
    throw v0

    .line 1022
    :cond_3fd
    sget-object v0, Llug;->a:Laimz;

    .line 1023
    .line 1024
    invoke-virtual {v0}, Laimp;->b()Lainm;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    const-string v2, "startSession$<anonymous>"

    .line 1029
    .line 1030
    const/16 v3, 0x74

    .line 1031
    .line 1032
    invoke-interface {v0, v6, v2, v3, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    check-cast v0, Laimw;

    .line 1037
    .line 1038
    check-cast v1, Lzfo;

    .line 1039
    .line 1040
    iget-object v1, v1, Lzfo;->a:Lzfp;

    .line 1041
    .line 1042
    const-string v2, "Fail to create the session with the error %s: "

    .line 1043
    .line 1044
    invoke-interface {v0, v2, v1}, Laimw;->y(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1045
    .line 1046
    .line 1047
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1048
    .line 1049
    return-object v0

    .line 1050
    :cond_419
    :goto_419
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1051
    .line 1052
    return-object v0

    .line 1053
    :pswitch_41c
    sget-object v0, Laolu;->a:Laolu;

    .line 1054
    .line 1055
    iget v3, v7, Lkqd;->a:I

    .line 1056
    .line 1057
    if-eqz v3, :cond_42a

    .line 1058
    .line 1059
    if-ne v3, v13, :cond_42a

    .line 1060
    .line 1061
    :try_start_424
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_427
    .catch Laowo; {:try_start_424 .. :try_end_427} :catch_47b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_424 .. :try_end_427} :catch_465

    .line 1062
    .line 1063
    .line 1064
    move-object/from16 v3, p1

    .line 1065
    .line 1066
    goto :goto_454

    .line 1067
    :cond_42a
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1068
    .line 1069
    .line 1070
    :cond_42d
    iget-object v3, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1071
    .line 1072
    move-object v5, v3

    .line 1073
    check-cast v5, Llug;

    .line 1074
    .line 1075
    iget-object v5, v5, Llug;->d:Lzfu;

    .line 1076
    .line 1077
    const-string v8, "session"

    .line 1078
    .line 1079
    if-nez v5, :cond_43c

    .line 1080
    .line 1081
    invoke-static {v8}, Laooh;->j(Ljava/lang/String;)V

    .line 1082
    .line 1083
    .line 1084
    move-object v5, v12

    .line 1085
    :cond_43c
    iget-boolean v5, v5, Lzfu;->g:Z

    .line 1086
    .line 1087
    if-nez v5, :cond_491

    .line 1088
    .line 1089
    :try_start_440
    check-cast v3, Llug;

    .line 1090
    .line 1091
    iget-object v3, v3, Llug;->d:Lzfu;

    .line 1092
    .line 1093
    if-nez v3, :cond_44a

    .line 1094
    .line 1095
    invoke-static {v8}, Laooh;->j(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    move-object v3, v12

    .line 1099
    :cond_44a
    iget-object v3, v3, Lzfu;->i:Laowu;

    .line 1100
    .line 1101
    iput v13, v7, Lkqd;->a:I

    .line 1102
    .line 1103
    invoke-interface {v3, v7}, Laowu;->i(Laoln;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v3

    .line 1107
    if-eq v3, v0, :cond_873

    .line 1108
    .line 1109
    :goto_454
    check-cast v3, Lzdw;

    .line 1110
    .line 1111
    iget-object v3, v3, Lzdw;->a:Lalbh;

    .line 1112
    .line 1113
    check-cast v3, Lltu;
    :try_end_45a
    .catch Laowo; {:try_start_440 .. :try_end_45a} :catch_47b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_440 .. :try_end_45a} :catch_465

    .line 1114
    .line 1115
    iget-object v5, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1116
    .line 1117
    iput v10, v7, Lkqd;->a:I

    .line 1118
    .line 1119
    invoke-interface {v5, v3, v7}, Lluc;->k(Lltu;Laoln;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v3

    .line 1123
    if-ne v3, v0, :cond_42d

    .line 1124
    .line 1125
    return-object v0

    .line 1126
    :catch_465
    sget-object v0, Llug;->a:Laimz;

    .line 1127
    .line 1128
    invoke-virtual {v0}, Laimp;->d()Lainm;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    const-string v2, "startSession$<anonymous>$<anonymous>"

    .line 1133
    .line 1134
    const/16 v3, 0x85

    .line 1135
    .line 1136
    invoke-interface {v0, v6, v2, v3, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    check-cast v0, Laimw;

    .line 1141
    .line 1142
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1143
    .line 1144
    .line 1145
    sget-object v0, Laojh;->a:Laojh;

    .line 1146
    .line 1147
    return-object v0

    .line 1148
    :catch_47b
    sget-object v0, Llug;->a:Laimz;

    .line 1149
    .line 1150
    invoke-virtual {v0}, Laimp;->d()Lainm;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    const-string v1, "startSession$<anonymous>$<anonymous>"

    .line 1155
    .line 1156
    const/16 v3, 0x82

    .line 1157
    .line 1158
    invoke-interface {v0, v6, v1, v3, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    check-cast v0, Laimw;

    .line 1163
    .line 1164
    invoke-interface {v0, v2}, Laimw;->v(Ljava/lang/String;)V

    .line 1165
    .line 1166
    .line 1167
    sget-object v0, Laojh;->a:Laojh;

    .line 1168
    .line 1169
    return-object v0

    .line 1170
    :cond_491
    sget-object v0, Laojh;->a:Laojh;

    .line 1171
    .line 1172
    return-object v0

    .line 1173
    :pswitch_494
    sget-object v0, Laolu;->a:Laolu;

    .line 1174
    .line 1175
    iget v3, v7, Lkqd;->a:I

    .line 1176
    .line 1177
    const-string v4, "setupChannel$<anonymous>$<anonymous>"

    .line 1178
    .line 1179
    const-string v5, "ContactCheckerOutOfCallRemote.kt"

    .line 1180
    .line 1181
    const-string v6, "com/android/dialer/contactchecker/remote/ContactCheckerOutOfCallRemote"

    .line 1182
    .line 1183
    if-eqz v3, :cond_4a8

    .line 1184
    .line 1185
    if-ne v3, v13, :cond_4a8

    .line 1186
    .line 1187
    :try_start_4a2
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_4a5
    .catch Laowo; {:try_start_4a2 .. :try_end_4a5} :catch_530
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4a2 .. :try_end_4a5} :catch_51c

    .line 1188
    .line 1189
    .line 1190
    move-object/from16 v3, p1

    .line 1191
    .line 1192
    goto :goto_4b5

    .line 1193
    :cond_4a8
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1194
    .line 1195
    .line 1196
    :cond_4ab
    :try_start_4ab
    iget-object v3, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1197
    .line 1198
    iput v13, v7, Lkqd;->a:I

    .line 1199
    .line 1200
    invoke-interface {v3, v7}, Laowu;->i(Laoln;)Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v3

    .line 1204
    if-eq v3, v0, :cond_873

    .line 1205
    .line 1206
    :goto_4b5
    check-cast v3, Lzdw;
    :try_end_4b7
    .catch Laowo; {:try_start_4ab .. :try_end_4b7} :catch_530
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4ab .. :try_end_4b7} :catch_51c

    .line 1207
    .line 1208
    iget-object v8, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1209
    .line 1210
    iput v10, v7, Lkqd;->a:I

    .line 1211
    .line 1212
    sget-object v9, Llub;->a:Laimz;

    .line 1213
    .line 1214
    invoke-virtual {v9}, Laimp;->b()Lainm;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v11

    .line 1218
    const/16 v14, 0x55

    .line 1219
    .line 1220
    const-string v15, "onRemoteEvent"

    .line 1221
    .line 1222
    invoke-interface {v11, v6, v15, v14, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v11

    .line 1226
    check-cast v11, Laimw;

    .line 1227
    .line 1228
    invoke-interface {v11, v15}, Laimw;->v(Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    iget-object v11, v3, Lzdw;->a:Lalbh;

    .line 1232
    .line 1233
    check-cast v11, Lltu;

    .line 1234
    .line 1235
    iget v11, v11, Lltu;->b:I

    .line 1236
    .line 1237
    invoke-static {v11}, Lmni;->bW(I)I

    .line 1238
    .line 1239
    .line 1240
    move-result v11

    .line 1241
    if-eqz v11, :cond_51b

    .line 1242
    .line 1243
    add-int/lit8 v11, v11, -0x1

    .line 1244
    .line 1245
    if-eqz v11, :cond_505

    .line 1246
    .line 1247
    if-eq v11, v13, :cond_4fa

    .line 1248
    .line 1249
    if-ne v11, v10, :cond_4f4

    .line 1250
    .line 1251
    invoke-virtual {v9}, Laimp;->b()Lainm;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v3

    .line 1255
    const/16 v8, 0x5c

    .line 1256
    .line 1257
    invoke-interface {v3, v6, v15, v8, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v3

    .line 1261
    check-cast v3, Laimw;

    .line 1262
    .line 1263
    const-string v8, "can\'t identify the type of an incoming message"

    .line 1264
    .line 1265
    invoke-interface {v3, v8}, Laimw;->v(Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_516

    .line 1269
    :cond_4f4
    new-instance v0, Laois;

    .line 1270
    .line 1271
    invoke-direct {v0}, Laois;-><init>()V

    .line 1272
    .line 1273
    .line 1274
    throw v0

    .line 1275
    :cond_4fa
    check-cast v8, Llub;

    .line 1276
    .line 1277
    invoke-virtual {v8, v3, v7}, Llub;->b(Lzdw;Laoln;)Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v3

    .line 1281
    if-eq v3, v0, :cond_518

    .line 1282
    .line 1283
    sget-object v3, Laojh;->a:Laojh;

    .line 1284
    .line 1285
    goto :goto_518

    .line 1286
    :cond_505
    invoke-virtual {v9}, Laimp;->b()Lainm;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v3

    .line 1290
    const/16 v8, 0x59

    .line 1291
    .line 1292
    invoke-interface {v3, v6, v15, v8, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v3

    .line 1296
    check-cast v3, Laimw;

    .line 1297
    .line 1298
    const-string v8, "Ignore the verification message in the OutOfCall receiver"

    .line 1299
    .line 1300
    invoke-interface {v3, v8}, Laimw;->v(Ljava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    :goto_516
    sget-object v3, Laojh;->a:Laojh;

    .line 1304
    .line 1305
    :cond_518
    :goto_518
    if-ne v3, v0, :cond_4ab

    .line 1306
    .line 1307
    return-object v0

    .line 1308
    :cond_51b
    throw v12

    .line 1309
    :catch_51c
    sget-object v0, Llub;->a:Laimz;

    .line 1310
    .line 1311
    invoke-virtual {v0}, Laimp;->d()Lainm;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    const/16 v2, 0x4b

    .line 1316
    .line 1317
    invoke-interface {v0, v6, v4, v2, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    check-cast v0, Laimw;

    .line 1322
    .line 1323
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    sget-object v0, Laojh;->a:Laojh;

    .line 1327
    .line 1328
    return-object v0

    .line 1329
    :catch_530
    sget-object v0, Llub;->a:Laimz;

    .line 1330
    .line 1331
    invoke-virtual {v0}, Laimp;->d()Lainm;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v0

    .line 1335
    const/16 v1, 0x48

    .line 1336
    .line 1337
    invoke-interface {v0, v6, v4, v1, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    check-cast v0, Laimw;

    .line 1342
    .line 1343
    invoke-interface {v0, v2}, Laimw;->v(Ljava/lang/String;)V

    .line 1344
    .line 1345
    .line 1346
    sget-object v0, Laojh;->a:Laojh;

    .line 1347
    .line 1348
    return-object v0

    .line 1349
    :pswitch_544
    sget-object v0, Laolu;->a:Laolu;

    .line 1350
    .line 1351
    iget v1, v7, Lkqd;->a:I

    .line 1352
    .line 1353
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1354
    .line 1355
    .line 1356
    if-nez v1, :cond_6f8

    .line 1357
    .line 1358
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1359
    .line 1360
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1361
    .line 1362
    iput v13, v7, Lkqd;->a:I

    .line 1363
    .line 1364
    check-cast v2, Llmq;

    .line 1365
    .line 1366
    check-cast v1, Llnh;

    .line 1367
    .line 1368
    invoke-virtual {v1, v2, v7}, Llnh;->c(Llmq;Laoln;)Ljava/lang/Object;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v1

    .line 1372
    if-ne v1, v0, :cond_738

    .line 1373
    .line 1374
    return-object v0

    .line 1375
    :pswitch_55e
    sget-object v0, Laolu;->a:Laolu;

    .line 1376
    .line 1377
    iget v1, v7, Lkqd;->a:I

    .line 1378
    .line 1379
    if-eqz v1, :cond_56a

    .line 1380
    .line 1381
    :try_start_564
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_567
    .catch Ljava/lang/Exception; {:try_start_564 .. :try_end_567} :catch_5da

    .line 1382
    .line 1383
    .line 1384
    move-object/from16 v1, p1

    .line 1385
    .line 1386
    goto :goto_590

    .line 1387
    :cond_56a
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1388
    .line 1389
    .line 1390
    :try_start_56d
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1391
    .line 1392
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    check-cast v1, Laoin;

    .line 1397
    .line 1398
    invoke-interface {v1}, Laoin;->a()Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v1

    .line 1402
    check-cast v1, Llnq;

    .line 1403
    .line 1404
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1405
    .line 1406
    check-cast v2, Llmq;

    .line 1407
    .line 1408
    invoke-interface {v1, v2}, Llnq;->a(Llmq;)Lajcq;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    const-string v2, "shouldReject(...)"

    .line 1413
    .line 1414
    invoke-static {v1, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1415
    .line 1416
    .line 1417
    iput v13, v7, Lkqd;->a:I

    .line 1418
    .line 1419
    invoke-static {v1, v7}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v1

    .line 1423
    if-eq v1, v0, :cond_873

    .line 1424
    .line 1425
    :goto_590
    const-string v0, "await(...)"

    .line 1426
    .line 1427
    invoke-static {v1, v0}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1428
    .line 1429
    .line 1430
    check-cast v1, Ljava/lang/Boolean;

    .line 1431
    .line 1432
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1433
    .line 1434
    .line 1435
    move-result v0

    .line 1436
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1437
    .line 1438
    sget-object v2, Llnk;->a:Llnk;

    .line 1439
    .line 1440
    invoke-virtual {v2}, Lalad;->m()Lakzx;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    invoke-static {v2}, Lmni;->cP(Lakzx;)Loq;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v2

    .line 1448
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v1

    .line 1452
    const-string v3, "<get-key>(...)"

    .line 1453
    .line 1454
    invoke-static {v1, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1455
    .line 1456
    .line 1457
    check-cast v1, Llno;

    .line 1458
    .line 1459
    invoke-static {v1, v8}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    iget-object v3, v2, Loq;->a:Ljava/lang/Object;

    .line 1463
    .line 1464
    move-object v4, v3

    .line 1465
    check-cast v4, Lakzx;

    .line 1466
    .line 1467
    invoke-virtual {v4}, Lakzx;->u()V

    .line 1468
    .line 1469
    .line 1470
    check-cast v3, Lakzx;

    .line 1471
    .line 1472
    iget-object v3, v3, Lakzx;->b:Lalad;

    .line 1473
    .line 1474
    check-cast v3, Llnk;

    .line 1475
    .line 1476
    invoke-virtual {v1}, Llno;->a()I

    .line 1477
    .line 1478
    .line 1479
    move-result v1

    .line 1480
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v1

    .line 1484
    iput-object v1, v3, Llnk;->c:Ljava/lang/Object;

    .line 1485
    .line 1486
    iput v10, v3, Llnk;->b:I

    .line 1487
    .line 1488
    invoke-virtual {v2}, Loq;->r()Llnk;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v1

    .line 1492
    new-instance v2, Llmz;

    .line 1493
    .line 1494
    invoke-direct {v2, v0, v1}, Llmz;-><init>(ZLlnk;)V
    :try_end_5d8
    .catch Ljava/lang/Exception; {:try_start_56d .. :try_end_5d8} :catch_5da

    .line 1495
    .line 1496
    .line 1497
    move-object v0, v2

    .line 1498
    return-object v0

    .line 1499
    :catch_5da
    move-exception v0

    .line 1500
    sget-object v1, Llnh;->a:Laimz;

    .line 1501
    .line 1502
    invoke-virtual {v1}, Laimp;->c()Lainm;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    check-cast v1, Laimw;

    .line 1507
    .line 1508
    sget-object v2, Lzct;->b:Lainp;

    .line 1509
    .line 1510
    invoke-interface {v1, v2}, Laimw;->i(Lainp;)Lainm;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v1

    .line 1514
    check-cast v1, Laimw;

    .line 1515
    .line 1516
    invoke-interface {v1, v0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v0

    .line 1520
    const-string v1, "getCallInfoBasedScreeningVerdictWithCause$<anonymous>$<anonymous>$<anonymous>"

    .line 1521
    .line 1522
    const/16 v2, 0x2ec

    .line 1523
    .line 1524
    invoke-interface {v0, v9, v1, v2, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    check-cast v0, Laimw;

    .line 1529
    .line 1530
    const-string v1, "failed to retrieve vote from call info based screening voter"

    .line 1531
    .line 1532
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1533
    .line 1534
    .line 1535
    new-instance v0, Llmz;

    .line 1536
    .line 1537
    invoke-direct {v0, v11, v12}, Llmz;-><init>(ZLlnk;)V

    .line 1538
    .line 1539
    .line 1540
    return-object v0

    .line 1541
    :pswitch_604
    sget-object v0, Laolu;->a:Laolu;

    .line 1542
    .line 1543
    iget v1, v7, Lkqd;->a:I

    .line 1544
    .line 1545
    const-string v2, "getAudioBasedScreeningVerdictWithCause$<anonymous>"

    .line 1546
    .line 1547
    if-eqz v1, :cond_612

    .line 1548
    .line 1549
    :try_start_60c
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_60f
    .catch Ljava/lang/Exception; {:try_start_60c .. :try_end_60f} :catch_680

    .line 1550
    .line 1551
    .line 1552
    move-object/from16 v1, p1

    .line 1553
    .line 1554
    goto :goto_643

    .line 1555
    :cond_612
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1556
    .line 1557
    .line 1558
    sget-object v1, Llnh;->a:Laimz;

    .line 1559
    .line 1560
    invoke-virtual {v1}, Laimp;->b()Lainm;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v1

    .line 1564
    const/16 v3, 0x2ba

    .line 1565
    .line 1566
    invoke-interface {v1, v9, v2, v3, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v1

    .line 1570
    check-cast v1, Laimw;

    .line 1571
    .line 1572
    const-string v3, "retrieving audio based screening vote"

    .line 1573
    .line 1574
    invoke-interface {v1, v3}, Laimw;->v(Ljava/lang/String;)V

    .line 1575
    .line 1576
    .line 1577
    :try_start_628
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v1, Llmy;

    .line 1580
    .line 1581
    iget-object v1, v1, Llmy;->a:Llnp;

    .line 1582
    .line 1583
    iget-object v3, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1584
    .line 1585
    check-cast v3, Llmq;

    .line 1586
    .line 1587
    invoke-interface {v1, v3}, Llnp;->b(Llmq;)Lajcq;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v1

    .line 1591
    const-string v3, "vote(...)"

    .line 1592
    .line 1593
    invoke-static {v1, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1594
    .line 1595
    .line 1596
    iput v13, v7, Lkqd;->a:I

    .line 1597
    .line 1598
    invoke-static {v1, v7}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v1

    .line 1602
    if-eq v1, v0, :cond_873

    .line 1603
    .line 1604
    :goto_643
    iget-object v0, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1605
    .line 1606
    check-cast v1, Llnm;

    .line 1607
    .line 1608
    invoke-static {v1}, Laooh;->c(Ljava/lang/Object;)V

    .line 1609
    .line 1610
    .line 1611
    sget-object v3, Llnk;->a:Llnk;

    .line 1612
    .line 1613
    invoke-virtual {v3}, Lalad;->m()Lakzx;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v3

    .line 1617
    invoke-static {v3}, Lmni;->cP(Lakzx;)Loq;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v3

    .line 1621
    check-cast v0, Llmy;

    .line 1622
    .line 1623
    iget-object v0, v0, Llmy;->b:Llnn;

    .line 1624
    .line 1625
    invoke-static {v0, v8}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1626
    .line 1627
    .line 1628
    iget-object v4, v3, Loq;->a:Ljava/lang/Object;

    .line 1629
    .line 1630
    move-object v6, v4

    .line 1631
    check-cast v6, Lakzx;

    .line 1632
    .line 1633
    invoke-virtual {v6}, Lakzx;->u()V

    .line 1634
    .line 1635
    .line 1636
    check-cast v4, Lakzx;

    .line 1637
    .line 1638
    iget-object v4, v4, Lakzx;->b:Lalad;

    .line 1639
    .line 1640
    check-cast v4, Llnk;

    .line 1641
    .line 1642
    invoke-virtual {v0}, Llnn;->a()I

    .line 1643
    .line 1644
    .line 1645
    move-result v0

    .line 1646
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v0

    .line 1650
    iput-object v0, v4, Llnk;->c:Ljava/lang/Object;

    .line 1651
    .line 1652
    iput v13, v4, Llnk;->b:I

    .line 1653
    .line 1654
    invoke-virtual {v3}, Loq;->r()Llnk;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    new-instance v3, Llmx;

    .line 1659
    .line 1660
    invoke-direct {v3, v1, v0}, Llmx;-><init>(Llnm;Llnk;)V
    :try_end_67e
    .catch Ljava/lang/Exception; {:try_start_628 .. :try_end_67e} :catch_680

    .line 1661
    .line 1662
    .line 1663
    move-object v0, v3

    .line 1664
    return-object v0

    .line 1665
    :catch_680
    move-exception v0

    .line 1666
    sget-object v1, Llnh;->a:Laimz;

    .line 1667
    .line 1668
    invoke-virtual {v1}, Laimp;->c()Lainm;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v1

    .line 1672
    check-cast v1, Laimw;

    .line 1673
    .line 1674
    sget-object v3, Lzct;->b:Lainp;

    .line 1675
    .line 1676
    invoke-interface {v1, v3}, Laimw;->i(Lainp;)Lainm;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v1

    .line 1680
    check-cast v1, Laimw;

    .line 1681
    .line 1682
    invoke-interface {v1, v0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    const/16 v1, 0x2ca

    .line 1687
    .line 1688
    invoke-interface {v0, v9, v2, v1, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    check-cast v0, Laimw;

    .line 1693
    .line 1694
    const-string v1, "failed to retrieve audio based screening vote"

    .line 1695
    .line 1696
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1697
    .line 1698
    .line 1699
    new-instance v0, Llmx;

    .line 1700
    .line 1701
    sget-object v1, Llnm;->b:Llnm;

    .line 1702
    .line 1703
    invoke-direct {v0, v1, v12}, Llmx;-><init>(Llnm;Llnk;)V

    .line 1704
    .line 1705
    .line 1706
    return-object v0

    .line 1707
    :pswitch_6aa
    sget-object v0, Laolu;->a:Laolu;

    .line 1708
    .line 1709
    iget v1, v7, Lkqd;->a:I

    .line 1710
    .line 1711
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1712
    .line 1713
    .line 1714
    if-eqz v1, :cond_6b6

    .line 1715
    .line 1716
    move-object/from16 v1, p1

    .line 1717
    .line 1718
    goto :goto_6df

    .line 1719
    :cond_6b6
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1720
    .line 1721
    invoke-static {}, Lj$/time/Instant;->now()Lj$/time/Instant;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v2

    .line 1725
    invoke-virtual {v2}, Lj$/time/Instant;->toEpochMilli()J

    .line 1726
    .line 1727
    .line 1728
    move-result-wide v2

    .line 1729
    sget-wide v4, Laorh;->a:J

    .line 1730
    .line 1731
    const/4 v4, 0x7

    .line 1732
    sget-object v5, Laorj;->g:Laorj;

    .line 1733
    .line 1734
    invoke-static {v4, v5}, Laooh;->A(ILaorj;)J

    .line 1735
    .line 1736
    .line 1737
    move-result-wide v4

    .line 1738
    invoke-static {v4, v5}, Laorh;->g(J)J

    .line 1739
    .line 1740
    .line 1741
    move-result-wide v4

    .line 1742
    sub-long/2addr v2, v4

    .line 1743
    invoke-interface {v1, v2, v3}, Llbi;->b(J)Lajcq;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v1

    .line 1747
    const-string v2, "countByCallCreationTimestampMoreThan(...)"

    .line 1748
    .line 1749
    invoke-static {v1, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1750
    .line 1751
    .line 1752
    iput v13, v7, Lkqd;->a:I

    .line 1753
    .line 1754
    invoke-static {v1, v7}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v1

    .line 1758
    if-eq v1, v0, :cond_873

    .line 1759
    .line 1760
    :goto_6df
    check-cast v1, Ljava/lang/Number;

    .line 1761
    .line 1762
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1763
    .line 1764
    .line 1765
    move-result v0

    .line 1766
    if-lez v0, :cond_6e8

    .line 1767
    .line 1768
    move v11, v13

    .line 1769
    :cond_6e8
    const-string v0, "CALL_RECORDING_RECENTLY_USED"

    .line 1770
    .line 1771
    invoke-static {v0, v11}, Labxl;->L(Ljava/lang/String;I)Lafpl;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v0

    .line 1775
    return-object v0

    .line 1776
    :pswitch_6ef
    sget-object v0, Laolu;->a:Laolu;

    .line 1777
    .line 1778
    iget v1, v7, Lkqd;->a:I

    .line 1779
    .line 1780
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1781
    .line 1782
    .line 1783
    if-eqz v1, :cond_6fb

    .line 1784
    .line 1785
    :cond_6f8
    move-object/from16 v0, p1

    .line 1786
    .line 1787
    return-object v0

    .line 1788
    :cond_6fb
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1789
    .line 1790
    iget-object v2, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1791
    .line 1792
    check-cast v2, Lkup;

    .line 1793
    .line 1794
    iget-object v3, v2, Lkup;->c:Lkwt;

    .line 1795
    .line 1796
    invoke-virtual {v3}, Lkwt;->a()Lj$/util/Optional;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v3

    .line 1800
    invoke-virtual {v3, v12}, Lj$/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v3

    .line 1804
    check-cast v3, Ljava/util/Locale;

    .line 1805
    .line 1806
    if-eqz v3, :cond_74a

    .line 1807
    .line 1808
    check-cast v1, Ljava/lang/String;

    .line 1809
    .line 1810
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v3

    .line 1817
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v1

    .line 1821
    const/16 v3, 0x2d

    .line 1822
    .line 1823
    const/16 v4, 0x5f

    .line 1824
    .line 1825
    invoke-static {v1, v3, v4}, Laoov;->P(Ljava/lang/String;CC)Ljava/lang/String;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v1

    .line 1829
    sget-object v3, Lkup;->a:Ljava/util/Map;

    .line 1830
    .line 1831
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v3

    .line 1835
    check-cast v3, Lkut;

    .line 1836
    .line 1837
    if-eqz v3, :cond_73a

    .line 1838
    .line 1839
    iget-object v1, v2, Lkup;->b:Lkuu;

    .line 1840
    .line 1841
    iput v13, v7, Lkqd;->a:I

    .line 1842
    .line 1843
    invoke-virtual {v1, v3, v7}, Lkuu;->a(Lkut;Laoln;)Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v1

    .line 1847
    if-eq v1, v0, :cond_873

    .line 1848
    .line 1849
    :cond_738
    move-object v0, v1

    .line 1850
    return-object v0

    .line 1851
    :cond_73a
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v0

    .line 1855
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1856
    .line 1857
    const-string v2, "Resource file not found: "

    .line 1858
    .line 1859
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v0

    .line 1863
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1864
    .line 1865
    .line 1866
    throw v1

    .line 1867
    :cond_74a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1868
    .line 1869
    const-string v1, "currentLocaleForBuiltInAudioFile is null"

    .line 1870
    .line 1871
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1872
    .line 1873
    .line 1874
    throw v0

    .line 1875
    :pswitch_752
    sget-object v0, Laolu;->a:Laolu;

    .line 1876
    .line 1877
    iget v1, v7, Lkqd;->a:I

    .line 1878
    .line 1879
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1880
    .line 1881
    .line 1882
    if-nez v1, :cond_76b

    .line 1883
    .line 1884
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1885
    .line 1886
    iget-object v2, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1887
    .line 1888
    iput v13, v7, Lkqd;->a:I

    .line 1889
    .line 1890
    check-cast v2, Ljyh;

    .line 1891
    .line 1892
    iget-object v2, v2, Ljyh;->a:Ljyd;

    .line 1893
    .line 1894
    invoke-interface {v1, v2}, Ljye;->c(Ljyd;)Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v1

    .line 1898
    if-eq v1, v0, :cond_873

    .line 1899
    .line 1900
    :cond_76b
    sget-object v0, Laojh;->a:Laojh;

    .line 1901
    .line 1902
    return-object v0

    .line 1903
    :pswitch_76e
    sget-object v0, Laolu;->a:Laolu;

    .line 1904
    .line 1905
    iget v1, v7, Lkqd;->a:I

    .line 1906
    .line 1907
    invoke-static/range {p1 .. p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1908
    .line 1909
    .line 1910
    if-eqz v1, :cond_783

    .line 1911
    .line 1912
    if-eq v1, v13, :cond_77c

    .line 1913
    .line 1914
    move-object/from16 v1, p1

    .line 1915
    .line 1916
    goto :goto_7af

    .line 1917
    :cond_77c
    move-object/from16 v1, p1

    .line 1918
    .line 1919
    check-cast v1, Laoiw;

    .line 1920
    .line 1921
    iget-object v1, v1, Laoiw;->a:Ljava/lang/Object;

    .line 1922
    .line 1923
    goto :goto_795

    .line 1924
    :cond_783
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1925
    .line 1926
    iget-object v2, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1927
    .line 1928
    iput v13, v7, Lkqd;->a:I

    .line 1929
    .line 1930
    check-cast v1, Lkqj;

    .line 1931
    .line 1932
    iget-object v1, v1, Lkqj;->b:Lkpu;

    .line 1933
    .line 1934
    check-cast v2, Lyse;

    .line 1935
    .line 1936
    invoke-virtual {v1, v2, v7}, Lkpu;->a(Lyse;Laoln;)Ljava/lang/Object;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v1

    .line 1940
    if-eq v1, v0, :cond_873

    .line 1941
    .line 1942
    :goto_795
    invoke-static {v1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1943
    .line 1944
    .line 1945
    iget-object v1, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1946
    .line 1947
    new-instance v2, Lyts;

    .line 1948
    .line 1949
    check-cast v1, Lyse;

    .line 1950
    .line 1951
    invoke-direct {v2, v1, v12, v3}, Lyts;-><init>(Lyse;Ljava/lang/Integer;I)V

    .line 1952
    .line 1953
    .line 1954
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 1955
    .line 1956
    iput v10, v7, Lkqd;->a:I

    .line 1957
    .line 1958
    check-cast v1, Lkqj;

    .line 1959
    .line 1960
    iget-object v1, v1, Lkqj;->c:Lyuo;

    .line 1961
    .line 1962
    invoke-virtual {v1, v2, v7}, Lyuo;->c(Lyts;Laoln;)Ljava/lang/Object;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v1

    .line 1966
    if-eq v1, v0, :cond_873

    .line 1967
    .line 1968
    :goto_7af
    check-cast v1, Lyty;

    .line 1969
    .line 1970
    invoke-static {v1}, Lanty;->Y(Ljava/lang/Object;)I

    .line 1971
    .line 1972
    .line 1973
    move-result v0

    .line 1974
    if-eqz v0, :cond_812

    .line 1975
    .line 1976
    if-ne v0, v13, :cond_80c

    .line 1977
    .line 1978
    sget-object v0, Lkqj;->a:Laimz;

    .line 1979
    .line 1980
    invoke-virtual {v0}, Laimp;->d()Lainm;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v0

    .line 1984
    const/16 v2, 0x8b

    .line 1985
    .line 1986
    const-string v3, "SummarizationSessions.kt"

    .line 1987
    .line 1988
    const-string v4, "com/android/dialer/callnotesinfra/summarizer/aicore/SummarizationSessions"

    .line 1989
    .line 1990
    const-string v5, "createSession$<anonymous>$<anonymous>"

    .line 1991
    .line 1992
    invoke-interface {v0, v4, v5, v2, v3}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v0

    .line 1996
    check-cast v0, Laimw;

    .line 1997
    .line 1998
    iget-object v2, v7, Lkqd;->c:Ljava/lang/Object;

    .line 1999
    .line 2000
    check-cast v1, Lytw;

    .line 2001
    .line 2002
    invoke-interface {v1}, Lytw;->a()Lytt;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v3

    .line 2006
    const-string v4, "AiCore summarization session creation failed for feature %s with reason: %s"

    .line 2007
    .line 2008
    invoke-interface {v0, v4, v2, v3}, Laimw;->I(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2009
    .line 2010
    .line 2011
    invoke-interface {v1}, Lytw;->a()Lytt;

    .line 2012
    .line 2013
    .line 2014
    move-result-object v0

    .line 2015
    invoke-virtual {v0}, Lytt;->ordinal()I

    .line 2016
    .line 2017
    .line 2018
    move-result v0

    .line 2019
    if-eqz v0, :cond_802

    .line 2020
    .line 2021
    if-eq v0, v13, :cond_7f8

    .line 2022
    .line 2023
    if-eq v0, v10, :cond_7ee

    .line 2024
    .line 2025
    new-instance v0, Laois;

    .line 2026
    .line 2027
    invoke-direct {v0}, Laois;-><init>()V

    .line 2028
    .line 2029
    .line 2030
    throw v0

    .line 2031
    :cond_7ee
    new-instance v0, Lkpk;

    .line 2032
    .line 2033
    sget-object v1, Lkqz;->f:Lkqz;

    .line 2034
    .line 2035
    const-string v2, "Failed to prepare AiCore inference engine."

    .line 2036
    .line 2037
    invoke-direct {v0, v1, v2, v12}, Lkpk;-><init>(Lkqz;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2038
    .line 2039
    .line 2040
    goto :goto_80b

    .line 2041
    :cond_7f8
    new-instance v0, Lkpk;

    .line 2042
    .line 2043
    sget-object v1, Lkqz;->b:Lkqz;

    .line 2044
    .line 2045
    const-string v2, "AiCore feature type mismatch."

    .line 2046
    .line 2047
    invoke-direct {v0, v1, v2, v12}, Lkpk;-><init>(Lkqz;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2048
    .line 2049
    .line 2050
    goto :goto_80b

    .line 2051
    :cond_802
    new-instance v0, Lkpk;

    .line 2052
    .line 2053
    sget-object v1, Lkqz;->b:Lkqz;

    .line 2054
    .line 2055
    const-string v2, "Failed to get feature from AiCore."

    .line 2056
    .line 2057
    invoke-direct {v0, v1, v2, v12}, Lkpk;-><init>(Lkqz;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2058
    .line 2059
    .line 2060
    :goto_80b
    throw v0

    .line 2061
    :cond_80c
    new-instance v0, Laois;

    .line 2062
    .line 2063
    invoke-direct {v0}, Laois;-><init>()V

    .line 2064
    .line 2065
    .line 2066
    throw v0

    .line 2067
    :cond_812
    check-cast v1, Lytx;

    .line 2068
    .line 2069
    iget-object v0, v1, Lytx;->a:Lahdv;

    .line 2070
    .line 2071
    goto :goto_873

    .line 2072
    :cond_817
    iget-object v1, v7, Lkqd;->b:Ljava/lang/Object;

    .line 2073
    .line 2074
    iget-object v2, v7, Lkqd;->c:Ljava/lang/Object;

    .line 2075
    .line 2076
    invoke-interface {v1}, Lmnn;->cI()Logj;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v1

    .line 2080
    sget-object v3, Lnmk;->a:Lnmk;

    .line 2081
    .line 2082
    invoke-virtual {v3}, Lalad;->m()Lakzx;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v3

    .line 2086
    invoke-static {v3}, Lmni;->aB(Lakzx;)Lnpw;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v3

    .line 2090
    sget-object v4, Lnlq;->a:Lnlq;

    .line 2091
    .line 2092
    invoke-virtual {v4}, Lalad;->m()Lakzx;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v4

    .line 2096
    const-string v5, "builder"

    .line 2097
    .line 2098
    invoke-static {v4, v5}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2099
    .line 2100
    .line 2101
    invoke-virtual {v4}, Lakzx;->u()V

    .line 2102
    .line 2103
    .line 2104
    iget-object v5, v4, Lakzx;->b:Lalad;

    .line 2105
    .line 2106
    check-cast v5, Lnlq;

    .line 2107
    .line 2108
    check-cast v2, Loet;

    .line 2109
    .line 2110
    invoke-virtual {v2}, Loet;->a()I

    .line 2111
    .line 2112
    .line 2113
    move-result v2

    .line 2114
    iput v2, v5, Lnlq;->b:I

    .line 2115
    .line 2116
    invoke-virtual {v4}, Lakzx;->p()Lalad;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v2

    .line 2120
    const-string v4, "build(...)"

    .line 2121
    .line 2122
    invoke-static {v2, v4}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2123
    .line 2124
    .line 2125
    check-cast v2, Lnlq;

    .line 2126
    .line 2127
    invoke-static {v2, v8}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2128
    .line 2129
    .line 2130
    iget-object v4, v3, Lnpw;->a:Ljava/lang/Object;

    .line 2131
    .line 2132
    check-cast v4, Lakzx;

    .line 2133
    .line 2134
    invoke-virtual {v4}, Lakzx;->u()V

    .line 2135
    .line 2136
    .line 2137
    iget-object v4, v4, Lakzx;->b:Lalad;

    .line 2138
    .line 2139
    check-cast v4, Lnmk;

    .line 2140
    .line 2141
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2142
    .line 2143
    .line 2144
    iput-object v2, v4, Lnmk;->c:Ljava/lang/Object;

    .line 2145
    .line 2146
    const/16 v2, 0x11

    .line 2147
    .line 2148
    iput v2, v4, Lnmk;->b:I

    .line 2149
    .line 2150
    invoke-virtual {v3}, Lnpw;->D()Lnmk;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v2

    .line 2154
    iput v13, v7, Lkqd;->a:I

    .line 2155
    .line 2156
    invoke-virtual {v1, v2, v7}, Logj;->b(Lnmk;Laoln;)Ljava/lang/Object;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v1

    .line 2160
    if-eq v1, v0, :cond_873

    .line 2161
    .line 2162
    :goto_871
    sget-object v0, Laojh;->a:Laojh;

    .line 2163
    .line 2164
    :cond_873
    :goto_873
    return-object v0

    .line 2165
    :pswitch_data_874
    .packed-switch 0x0
        :pswitch_76e
        :pswitch_752
        :pswitch_6ef
        :pswitch_6aa
        :pswitch_604
        :pswitch_55e
        :pswitch_544
        :pswitch_494
        :pswitch_41c
        :pswitch_39e
        :pswitch_384
        :pswitch_23f
        :pswitch_21c
        :pswitch_1e8
        :pswitch_11b
        :pswitch_ed
        :pswitch_d1
        :pswitch_98
        :pswitch_7c
        :pswitch_25
    .end packed-switch
.end method
