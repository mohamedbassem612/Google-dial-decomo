.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    .line 1
    iget v0, p0, Lksy;->$cid:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x1f

    .line 6
    .line 7
    const/16 v4, 0xe

    .line 8
    .line 9
    const-string v5, "getAbsolutePath(...)"

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v0, :pswitch_data_44e

    .line 14
    .line 15
    .line 16
    sget-object v0, Laolu;->a:Laolu;

    .line 17
    .line 18
    iget v2, p0, Lksy;->a:I

    .line 19
    .line 20
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-eqz v2, :cond_41b

    .line 24
    .line 25
    if-eq v2, v7, :cond_42a

    .line 26
    .line 27
    :cond_1a
    move-object p1, v6

    .line 28
    return-object p1

    .line 29
    :pswitch_1c
    sget-object v0, Laolu;->a:Laolu;

    .line 30
    .line 31
    iget v2, p0, Lksy;->a:I

    .line 32
    .line 33
    const-string v4, "getBondedBluetoothDevices$<anonymous>"

    .line 34
    .line 35
    const-string v5, "com/android/dialer/contactchecker/remote/WearDeviceCoordinator"

    .line 36
    .line 37
    const-string v6, "WearDeviceCoordinator.kt"

    .line 38
    .line 39
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    if-eqz v2, :cond_2e

    .line 43
    .line 44
    if-eq v2, v7, :cond_40

    .line 45
    .line 46
    goto :goto_70

    .line 47
    :cond_2e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    if-ge p1, v3, :cond_5e

    .line 50
    .line 51
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput v7, p0, Lksy;->a:I

    .line 54
    .line 55
    check-cast p1, Llum;

    .line 56
    .line 57
    iget-object p1, p1, Llum;->c:Lzrw;

    .line 58
    .line 59
    invoke-virtual {p1, p0}, Lzrw;->h(Laoln;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eq p1, v0, :cond_44c

    .line 64
    .line 65
    :cond_40
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_5e

    .line 72
    .line 73
    sget-object p0, Llum;->a:Laimz;

    .line 74
    .line 75
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const/16 p1, 0x44

    .line 80
    .line 81
    invoke-interface {p0, v5, v4, p1, v6}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Laimw;

    .line 86
    .line 87
    const-string p1, "Does not have BLUETOOTH permission required to get bonded device info for Android below S."

    .line 88
    .line 89
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sget-object p1, Laoke;->a:Laoke;

    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_5e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    if-lt p1, v3, :cond_8e

    .line 98
    .line 99
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 100
    .line 101
    iput v1, p0, Lksy;->a:I

    .line 102
    .line 103
    check-cast p1, Llum;

    .line 104
    .line 105
    iget-object p1, p1, Llum;->c:Lzrw;

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Lzrw;->i(Laoln;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eq p1, v0, :cond_44c

    .line 112
    .line 113
    :goto_70
    check-cast p1, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_8e

    .line 120
    .line 121
    sget-object p0, Llum;->a:Laimz;

    .line 122
    .line 123
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const/16 p1, 0x4d

    .line 128
    .line 129
    invoke-interface {p0, v5, v4, p1, v6}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Laimw;

    .line 134
    .line 135
    const-string p1, "Does not have BLUETOOTH_CONNECT permission required to get bonded device info."

    .line 136
    .line 137
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    sget-object p1, Laoke;->a:Laoke;

    .line 141
    .line 142
    return-object p1

    .line 143
    :cond_8e
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Llum;

    .line 146
    .line 147
    iget-object p0, p0, Llum;->b:Landroid/content/Context;

    .line 148
    .line 149
    const-class p1, Landroid/bluetooth/BluetoothManager;

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, Landroid/bluetooth/BluetoothManager;

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_bd

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-nez p1, :cond_44d

    .line 168
    .line 169
    sget-object p0, Llum;->a:Laimz;

    .line 170
    .line 171
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    const-string p1, "getBondedBluetoothDevices$<anonymous>$<anonymous>"

    .line 176
    .line 177
    const/16 v0, 0x55

    .line 178
    .line 179
    invoke-interface {p0, v5, p1, v0, v6}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast p0, Laimw;

    .line 184
    .line 185
    const-string p1, "Cannot fetch bonded devices."

    .line 186
    .line 187
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_bd
    sget-object p1, Laoke;->a:Laoke;

    .line 191
    .line 192
    return-object p1

    .line 193
    :pswitch_c0
    sget-object v0, Laolu;->a:Laolu;

    .line 194
    .line 195
    iget v1, p0, Lksy;->a:I

    .line 196
    .line 197
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    if-nez v1, :cond_d9

    .line 201
    .line 202
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p1, Llug;

    .line 205
    .line 206
    iget-object p1, p1, Llug;->d:Lzfu;

    .line 207
    .line 208
    if-eqz p1, :cond_d9

    .line 209
    .line 210
    iput v7, p0, Lksy;->a:I

    .line 211
    .line 212
    invoke-virtual {p1, p0}, Lzfu;->a(Laoln;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    if-eq p0, v0, :cond_44c

    .line 217
    .line 218
    :cond_d9
    sget-object p1, Laojh;->a:Laojh;

    .line 219
    .line 220
    return-object p1

    .line 221
    :pswitch_dc
    sget-object v0, Laolu;->a:Laolu;

    .line 222
    .line 223
    iget v1, p0, Lksy;->a:I

    .line 224
    .line 225
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    if-nez v1, :cond_f7

    .line 229
    .line 230
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p1, Llsn;

    .line 233
    .line 234
    iget-boolean v1, p1, Llsn;->s:Z

    .line 235
    .line 236
    if-nez v1, :cond_fe

    .line 237
    .line 238
    iget-object p1, p1, Llsn;->d:Llug;

    .line 239
    .line 240
    iput v7, p0, Lksy;->a:I

    .line 241
    .line 242
    invoke-virtual {p1, p0}, Llug;->c(Laoln;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    if-eq p1, v0, :cond_44c

    .line 247
    .line 248
    :cond_f7
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p0, Llsn;

    .line 251
    .line 252
    invoke-static {p0}, Llsn;->l(Llsn;)V

    .line 253
    .line 254
    .line 255
    :cond_fe
    sget-object p1, Laojh;->a:Laojh;

    .line 256
    .line 257
    return-object p1

    .line 258
    :pswitch_101
    sget-object v0, Laolu;->a:Laolu;

    .line 259
    .line 260
    iget v1, p0, Lksy;->a:I

    .line 261
    .line 262
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    if-nez v1, :cond_11c

    .line 266
    .line 267
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p1, Llsn;

    .line 270
    .line 271
    iget-boolean v1, p1, Llsn;->s:Z

    .line 272
    .line 273
    if-nez v1, :cond_123

    .line 274
    .line 275
    iget-object p1, p1, Llsn;->d:Llug;

    .line 276
    .line 277
    iput v7, p0, Lksy;->a:I

    .line 278
    .line 279
    invoke-virtual {p1, p0}, Llug;->c(Laoln;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    if-eq p1, v0, :cond_44c

    .line 284
    .line 285
    :cond_11c
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast p0, Llsn;

    .line 288
    .line 289
    invoke-static {p0}, Llsn;->l(Llsn;)V

    .line 290
    .line 291
    .line 292
    :cond_123
    sget-object p1, Laojh;->a:Laojh;

    .line 293
    .line 294
    return-object p1

    .line 295
    :pswitch_126
    sget-object v0, Laolu;->a:Laolu;

    .line 296
    .line 297
    iget v1, p0, Lksy;->a:I

    .line 298
    .line 299
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    if-nez v1, :cond_139

    .line 303
    .line 304
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 305
    .line 306
    iput v7, p0, Lksy;->a:I

    .line 307
    .line 308
    invoke-interface {p1, p0}, Lhrb;->b(Laoln;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    if-eq p1, v0, :cond_44c

    .line 313
    .line 314
    :cond_139
    check-cast p1, Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    xor-int/2addr p0, v7

    .line 321
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    return-object p1

    .line 326
    :pswitch_145
    sget-object v0, Laolu;->a:Laolu;

    .line 327
    .line 328
    iget v1, p0, Lksy;->a:I

    .line 329
    .line 330
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    if-nez v1, :cond_44d

    .line 334
    .line 335
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 336
    .line 337
    iput v7, p0, Lksy;->a:I

    .line 338
    .line 339
    check-cast p1, Lrsr;

    .line 340
    .line 341
    iget-object p1, p1, Lrsr;->b:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p1, Lgpd;

    .line 344
    .line 345
    invoke-virtual {p1, p0}, Lgpd;->k(Laoln;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    if-ne p1, v0, :cond_44d

    .line 350
    .line 351
    goto/16 :goto_44c

    .line 352
    .line 353
    :pswitch_160
    sget-object v0, Laolu;->a:Laolu;

    .line 354
    .line 355
    iget v1, p0, Lksy;->a:I

    .line 356
    .line 357
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    if-nez v1, :cond_179

    .line 361
    .line 362
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 363
    .line 364
    iput v7, p0, Lksy;->a:I

    .line 365
    .line 366
    check-cast p1, Lrsr;

    .line 367
    .line 368
    iget-object p1, p1, Lrsr;->b:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast p1, Lgpd;

    .line 371
    .line 372
    invoke-virtual {p1, p0}, Lgpd;->l(Laoln;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    if-eq p1, v0, :cond_44c

    .line 377
    .line 378
    :cond_179
    check-cast p1, Ljava/util/Map;

    .line 379
    .line 380
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 381
    .line 382
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    invoke-static {v0}, Lajsz;->aL(I)I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    :goto_190
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    if-eqz v0, :cond_1ac

    .line 406
    .line 407
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    check-cast v0, Ljava/util/Map$Entry;

    .line 412
    .line 413
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, Lltc;

    .line 422
    .line 423
    iget-object v0, v0, Lltc;->b:Lltj;

    .line 424
    .line 425
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    goto :goto_190

    .line 429
    :cond_1ac
    move-object p1, p0

    .line 430
    return-object p1

    .line 431
    :pswitch_1ae
    sget-object v0, Laolu;->a:Laolu;

    .line 432
    .line 433
    iget v1, p0, Lksy;->a:I

    .line 434
    .line 435
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    if-nez v1, :cond_44d

    .line 439
    .line 440
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 441
    .line 442
    iput v7, p0, Lksy;->a:I

    .line 443
    .line 444
    new-instance v1, Ltmm;

    .line 445
    .line 446
    check-cast p1, Llrh;

    .line 447
    .line 448
    invoke-direct {v1, p1, v6, v7}, Ltmm;-><init>(Llrh;Laoln;I)V

    .line 449
    .line 450
    .line 451
    iget-object p1, p1, Llrh;->b:Laolr;

    .line 452
    .line 453
    invoke-static {p1, v1, p0}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    if-ne p1, v0, :cond_44d

    .line 458
    .line 459
    goto/16 :goto_44c

    .line 460
    .line 461
    :pswitch_1cc
    sget-object v0, Laolu;->a:Laolu;

    .line 462
    .line 463
    iget v1, p0, Lksy;->a:I

    .line 464
    .line 465
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    if-nez v1, :cond_44d

    .line 469
    .line 470
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 471
    .line 472
    iput v7, p0, Lksy;->a:I

    .line 473
    .line 474
    check-cast p1, Llrh;

    .line 475
    .line 476
    invoke-virtual {p1, p0}, Llrh;->c(Laoln;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    if-ne p1, v0, :cond_44d

    .line 481
    .line 482
    goto/16 :goto_44c

    .line 483
    .line 484
    :pswitch_1e3
    sget-object v0, Laolu;->a:Laolu;

    .line 485
    .line 486
    iget v1, p0, Lksy;->a:I

    .line 487
    .line 488
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    if-nez v1, :cond_44d

    .line 492
    .line 493
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 494
    .line 495
    iput v7, p0, Lksy;->a:I

    .line 496
    .line 497
    new-instance v1, Ljrb;

    .line 498
    .line 499
    check-cast p1, Ljig;

    .line 500
    .line 501
    iget-object p1, p1, Ljig;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast p1, Llrc;

    .line 504
    .line 505
    invoke-direct {v1, p1, v6, v4}, Ljrb;-><init>(Llrc;Laoln;I)V

    .line 506
    .line 507
    .line 508
    iget-object v2, p1, Llrc;->a:Laoss;

    .line 509
    .line 510
    iget-object p1, p1, Llrc;->g:Lahda;

    .line 511
    .line 512
    invoke-static {v2, p1, v1}, Lahvr;->ag(Laoss;Lahda;Laonn;)Laosy;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    invoke-interface {p1, p0}, Laosy;->a(Laoln;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    if-ne p1, v0, :cond_44d

    .line 521
    .line 522
    goto/16 :goto_44c

    .line 523
    .line 524
    :pswitch_20b
    sget-object v0, Laolu;->a:Laolu;

    .line 525
    .line 526
    iget v1, p0, Lksy;->a:I

    .line 527
    .line 528
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    if-nez v1, :cond_236

    .line 532
    .line 533
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 534
    .line 535
    new-instance v1, Lbug;

    .line 536
    .line 537
    check-cast p1, Lloi;

    .line 538
    .line 539
    const/4 v3, 0x3

    .line 540
    invoke-direct {v1, p1, v6, v3}, Lbug;-><init>(Lloi;Laoln;I)V

    .line 541
    .line 542
    .line 543
    new-instance v3, Lgdc;

    .line 544
    .line 545
    iget-object v4, p1, Lloi;->j:Llon;

    .line 546
    .line 547
    iget-object v4, v4, Llon;->c:Laoxh;

    .line 548
    .line 549
    const/16 v5, 0x8

    .line 550
    .line 551
    invoke-direct {v3, v4, v1, v5}, Lgdc;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 552
    .line 553
    .line 554
    new-instance v1, Lloe;

    .line 555
    .line 556
    invoke-direct {v1, p1, v6, v2}, Lloe;-><init>(Lloi;Laoln;I)V

    .line 557
    .line 558
    .line 559
    iput v7, p0, Lksy;->a:I

    .line 560
    .line 561
    invoke-static {v3, v1, p0}, Laoov;->aF(Laoxh;Laonn;Laoln;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    if-eq p0, v0, :cond_44c

    .line 566
    .line 567
    :cond_236
    sget-object p1, Laojh;->a:Laojh;

    .line 568
    .line 569
    return-object p1

    .line 570
    :pswitch_239
    sget-object v0, Laolu;->a:Laolu;

    .line 571
    .line 572
    iget v1, p0, Lksy;->a:I

    .line 573
    .line 574
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    if-nez v1, :cond_252

    .line 578
    .line 579
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast p1, Laogc;

    .line 582
    .line 583
    invoke-virtual {p1}, Laogc;->aX()Lajcq;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    iput v7, p0, Lksy;->a:I

    .line 588
    .line 589
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    if-eq p1, v0, :cond_44c

    .line 594
    .line 595
    :cond_252
    check-cast p1, Lkun;

    .line 596
    .line 597
    sget-object p0, Lkun;->b:Lkun;

    .line 598
    .line 599
    if-ne p1, p0, :cond_259

    .line 600
    .line 601
    move v2, v7

    .line 602
    :cond_259
    const-string p0, "CALL_RECORDING_DISCLOSURE_BEEP_SOUND_ENABLED"

    .line 603
    .line 604
    invoke-static {p0, v2}, Labxl;->L(Ljava/lang/String;I)Lafpl;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    return-object p1

    .line 609
    :pswitch_260
    sget-object v0, Laolu;->a:Laolu;

    .line 610
    .line 611
    iget v1, p0, Lksy;->a:I

    .line 612
    .line 613
    if-eqz v1, :cond_26a

    .line 614
    .line 615
    :try_start_266
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_269
    .catch Ljava/lang/Exception; {:try_start_266 .. :try_end_269} :catch_292

    .line 616
    .line 617
    .line 618
    goto :goto_27d

    .line 619
    :cond_26a
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    :try_start_26d
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast p1, Lkuv;

    .line 625
    .line 626
    iget-object p1, p1, Lkuv;->a:Lkuu;

    .line 627
    .line 628
    sget-object v1, Lkut;->c:Lkut;

    .line 629
    .line 630
    iput v7, p0, Lksy;->a:I

    .line 631
    .line 632
    invoke-virtual {p1, v1, p0}, Lkuu;->a(Lkut;Laoln;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    if-eq p1, v0, :cond_44c

    .line 637
    .line 638
    :goto_27d
    check-cast p1, Ljava/io/File;
    :try_end_27f
    .catch Ljava/lang/Exception; {:try_start_26d .. :try_end_27f} :catch_292

    .line 639
    .line 640
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 641
    .line 642
    sget-object v0, Lrmx;->mY:Lrmx;

    .line 643
    .line 644
    check-cast p0, Lkuv;

    .line 645
    .line 646
    iget-object p0, p0, Lkuv;->b:Lrlv;

    .line 647
    .line 648
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    invoke-static {p1, v5}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    return-object p1

    .line 659
    :catch_292
    move-exception p1

    .line 660
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 661
    .line 662
    sget-object v0, Lrmx;->na:Lrmx;

    .line 663
    .line 664
    check-cast p0, Lkuv;

    .line 665
    .line 666
    iget-object p0, p0, Lkuv;->b:Lrlv;

    .line 667
    .line 668
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 669
    .line 670
    .line 671
    throw p1

    .line 672
    :pswitch_29f
    sget-object v0, Laolu;->a:Laolu;

    .line 673
    .line 674
    iget v1, p0, Lksy;->a:I

    .line 675
    .line 676
    if-eqz v1, :cond_2a9

    .line 677
    .line 678
    :try_start_2a5
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_2a8
    .catch Ljava/lang/Exception; {:try_start_2a5 .. :try_end_2a8} :catch_2d1

    .line 679
    .line 680
    .line 681
    goto :goto_2bc

    .line 682
    :cond_2a9
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    :try_start_2ac
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast p1, Lkuv;

    .line 688
    .line 689
    iget-object p1, p1, Lkuv;->a:Lkuu;

    .line 690
    .line 691
    sget-object v1, Lkut;->d:Lkut;

    .line 692
    .line 693
    iput v7, p0, Lksy;->a:I

    .line 694
    .line 695
    invoke-virtual {p1, v1, p0}, Lkuu;->a(Lkut;Laoln;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    if-eq p1, v0, :cond_44c

    .line 700
    .line 701
    :goto_2bc
    check-cast p1, Ljava/io/File;
    :try_end_2be
    .catch Ljava/lang/Exception; {:try_start_2ac .. :try_end_2be} :catch_2d1

    .line 702
    .line 703
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 704
    .line 705
    sget-object v0, Lrmx;->mZ:Lrmx;

    .line 706
    .line 707
    check-cast p0, Lkuv;

    .line 708
    .line 709
    iget-object p0, p0, Lkuv;->b:Lrlv;

    .line 710
    .line 711
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object p1

    .line 718
    invoke-static {p1, v5}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    return-object p1

    .line 722
    :catch_2d1
    move-exception p1

    .line 723
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 724
    .line 725
    sget-object v0, Lrmx;->na:Lrmx;

    .line 726
    .line 727
    check-cast p0, Lkuv;

    .line 728
    .line 729
    iget-object p0, p0, Lkuv;->b:Lrlv;

    .line 730
    .line 731
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 732
    .line 733
    .line 734
    throw p1

    .line 735
    :pswitch_2de
    sget-object v0, Laolu;->a:Laolu;

    .line 736
    .line 737
    iget v1, p0, Lksy;->a:I

    .line 738
    .line 739
    if-eqz v1, :cond_2e8

    .line 740
    .line 741
    :try_start_2e4
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_2e7
    .catch Ljava/lang/Exception; {:try_start_2e4 .. :try_end_2e7} :catch_30e

    .line 742
    .line 743
    .line 744
    goto :goto_2f9

    .line 745
    :cond_2e8
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    :try_start_2eb
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 749
    .line 750
    const-string v1, "starting_voice-"

    .line 751
    .line 752
    iput v7, p0, Lksy;->a:I

    .line 753
    .line 754
    check-cast p1, Lkup;

    .line 755
    .line 756
    invoke-virtual {p1, v1, p0}, Lkup;->c(Ljava/lang/String;Laoln;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object p1

    .line 760
    if-eq p1, v0, :cond_44c

    .line 761
    .line 762
    :goto_2f9
    check-cast p1, Ljava/io/File;
    :try_end_2fb
    .catch Ljava/lang/Exception; {:try_start_2eb .. :try_end_2fb} :catch_30e

    .line 763
    .line 764
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 765
    .line 766
    sget-object v0, Lrmx;->mV:Lrmx;

    .line 767
    .line 768
    check-cast p0, Lkup;

    .line 769
    .line 770
    iget-object p0, p0, Lkup;->d:Lrlv;

    .line 771
    .line 772
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object p1

    .line 779
    invoke-static {p1, v5}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    return-object p1

    .line 783
    :catch_30e
    move-exception p1

    .line 784
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 785
    .line 786
    sget-object v0, Lrmx;->mX:Lrmx;

    .line 787
    .line 788
    check-cast p0, Lkup;

    .line 789
    .line 790
    iget-object p0, p0, Lkup;->d:Lrlv;

    .line 791
    .line 792
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 793
    .line 794
    .line 795
    throw p1

    .line 796
    :pswitch_31b
    sget-object v0, Laolu;->a:Laolu;

    .line 797
    .line 798
    iget v1, p0, Lksy;->a:I

    .line 799
    .line 800
    if-eqz v1, :cond_325

    .line 801
    .line 802
    :try_start_321
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_324
    .catch Ljava/lang/Exception; {:try_start_321 .. :try_end_324} :catch_34b

    .line 803
    .line 804
    .line 805
    goto :goto_336

    .line 806
    :cond_325
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    :try_start_328
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 810
    .line 811
    const-string v1, "ending_voice-"

    .line 812
    .line 813
    iput v7, p0, Lksy;->a:I

    .line 814
    .line 815
    check-cast p1, Lkup;

    .line 816
    .line 817
    invoke-virtual {p1, v1, p0}, Lkup;->c(Ljava/lang/String;Laoln;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object p1

    .line 821
    if-eq p1, v0, :cond_44c

    .line 822
    .line 823
    :goto_336
    check-cast p1, Ljava/io/File;
    :try_end_338
    .catch Ljava/lang/Exception; {:try_start_328 .. :try_end_338} :catch_34b

    .line 824
    .line 825
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 826
    .line 827
    sget-object v0, Lrmx;->mW:Lrmx;

    .line 828
    .line 829
    check-cast p0, Lkup;

    .line 830
    .line 831
    iget-object p0, p0, Lkup;->d:Lrlv;

    .line 832
    .line 833
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object p1

    .line 840
    invoke-static {p1, v5}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    return-object p1

    .line 844
    :catch_34b
    move-exception p1

    .line 845
    iget-object p0, p0, Lksy;->b:Ljava/lang/Object;

    .line 846
    .line 847
    sget-object v0, Lrmx;->mX:Lrmx;

    .line 848
    .line 849
    check-cast p0, Lkup;

    .line 850
    .line 851
    iget-object p0, p0, Lkup;->d:Lrlv;

    .line 852
    .line 853
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 854
    .line 855
    .line 856
    throw p1

    .line 857
    :pswitch_358
    sget-object v0, Laolu;->a:Laolu;

    .line 858
    .line 859
    iget v1, p0, Lksy;->a:I

    .line 860
    .line 861
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    if-nez v1, :cond_44d

    .line 865
    .line 866
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 867
    .line 868
    iput v7, p0, Lksy;->a:I

    .line 869
    .line 870
    new-instance v1, Lhqi;

    .line 871
    .line 872
    check-cast p1, Lklt;

    .line 873
    .line 874
    const/16 v2, 0xf

    .line 875
    .line 876
    invoke-direct {v1, p1, v6, v2, v6}, Lhqi;-><init>(Lklt;Laoln;I[B)V

    .line 877
    .line 878
    .line 879
    iget-object p1, p1, Lklt;->c:Ljava/lang/Object;

    .line 880
    .line 881
    invoke-static {p1, v1, p0}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object p1

    .line 885
    if-ne p1, v0, :cond_44d

    .line 886
    .line 887
    goto/16 :goto_44c

    .line 888
    .line 889
    :pswitch_378
    sget-object v0, Laolu;->a:Laolu;

    .line 890
    .line 891
    iget v1, p0, Lksy;->a:I

    .line 892
    .line 893
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    if-nez v1, :cond_44d

    .line 897
    .line 898
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 899
    .line 900
    iput v7, p0, Lksy;->a:I

    .line 901
    .line 902
    new-instance v1, Lhqi;

    .line 903
    .line 904
    check-cast p1, Lklt;

    .line 905
    .line 906
    invoke-direct {v1, p1, v6, v4}, Lhqi;-><init>(Lklt;Laoln;I)V

    .line 907
    .line 908
    .line 909
    iget-object p1, p1, Lklt;->c:Ljava/lang/Object;

    .line 910
    .line 911
    invoke-static {p1, v1, p0}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object p1

    .line 915
    if-ne p1, v0, :cond_44d

    .line 916
    .line 917
    goto/16 :goto_44c

    .line 918
    .line 919
    :pswitch_396
    sget-object v0, Laolu;->a:Laolu;

    .line 920
    .line 921
    iget v1, p0, Lksy;->a:I

    .line 922
    .line 923
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    if-nez v1, :cond_44d

    .line 927
    .line 928
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast p1, Lahdv;

    .line 931
    .line 932
    invoke-virtual {p1}, Lahdv;->c()Laoxh;

    .line 933
    .line 934
    .line 935
    move-result-object p1

    .line 936
    new-instance v1, Lipv;

    .line 937
    .line 938
    invoke-direct {v1, v6, v4, v6}, Lipv;-><init>(Laoln;I[[[C)V

    .line 939
    .line 940
    .line 941
    iput v7, p0, Lksy;->a:I

    .line 942
    .line 943
    invoke-static {p1, v1, p0}, Laoov;->av(Laoxh;Laonn;Laoln;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object p1

    .line 947
    if-ne p1, v0, :cond_44d

    .line 948
    .line 949
    goto/16 :goto_44c

    .line 950
    .line 951
    :pswitch_3b6
    sget-object v0, Laolu;->a:Laolu;

    .line 952
    .line 953
    iget v1, p0, Lksy;->a:I

    .line 954
    .line 955
    const-string v2, "onFlagsCommittedSuccessfully$<anonymous>"

    .line 956
    .line 957
    const-string v4, "com/android/dialer/calloptions/ui/CallOptionsPhenotypeFlagsCommitSucceededListener"

    .line 958
    .line 959
    const-string v5, "CallOptionsPhenotypeFlagsCommitSucceededListener.kt"

    .line 960
    .line 961
    if-eqz v1, :cond_3c6

    .line 962
    .line 963
    :try_start_3c2
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_3c5
    .catch Ljava/lang/Exception; {:try_start_3c2 .. :try_end_3c5} :catch_3f8

    .line 964
    .line 965
    .line 966
    goto :goto_3e4

    .line 967
    :cond_3c6
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    :try_start_3c9
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast p1, Lksz;

    .line 973
    .line 974
    iget-object p1, p1, Lksz;->b:Lksx;

    .line 975
    .line 976
    iput v7, p0, Lksy;->a:I

    .line 977
    .line 978
    iget-object v1, p1, Lksx;->c:Laolr;

    .line 979
    .line 980
    new-instance v7, Ljrb;

    .line 981
    .line 982
    const/16 v8, 0x9

    .line 983
    .line 984
    invoke-direct {v7, p1, v6, v8}, Ljrb;-><init>(Lksx;Laoln;I)V

    .line 985
    .line 986
    .line 987
    invoke-static {v1, v7, p0}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object p0

    .line 991
    if-eq p0, v0, :cond_3e2

    .line 992
    .line 993
    sget-object p0, Laojh;->a:Laojh;

    .line 994
    .line 995
    :cond_3e2
    if-eq p0, v0, :cond_44c

    .line 996
    .line 997
    :goto_3e4
    sget-object p0, Lksz;->a:Laimz;

    .line 998
    .line 999
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 1000
    .line 1001
    .line 1002
    move-result-object p0

    .line 1003
    const/16 p1, 0x19

    .line 1004
    .line 1005
    invoke-interface {p0, v4, v2, p1, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1006
    .line 1007
    .line 1008
    move-result-object p0

    .line 1009
    check-cast p0, Laimw;

    .line 1010
    .line 1011
    const-string p1, "Updated CallOptions component enabled states successfully"

    .line 1012
    .line 1013
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V
    :try_end_3f7
    .catch Ljava/lang/Exception; {:try_start_3c9 .. :try_end_3f7} :catch_3f8

    .line 1014
    .line 1015
    .line 1016
    goto :goto_418

    .line 1017
    :catch_3f8
    move-exception p0

    .line 1018
    sget-object p1, Lksz;->a:Laimz;

    .line 1019
    .line 1020
    invoke-virtual {p1}, Laimp;->c()Lainm;

    .line 1021
    .line 1022
    .line 1023
    move-result-object p1

    .line 1024
    check-cast p1, Laimw;

    .line 1025
    .line 1026
    sget-object v0, Laioa;->b:Laioa;

    .line 1027
    .line 1028
    invoke-interface {p1, v0}, Laimw;->m(Laioa;)Lainm;

    .line 1029
    .line 1030
    .line 1031
    move-result-object p1

    .line 1032
    check-cast p1, Laimw;

    .line 1033
    .line 1034
    invoke-interface {p1, p0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 1035
    .line 1036
    .line 1037
    move-result-object p0

    .line 1038
    invoke-interface {p0, v4, v2, v3, v5}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1039
    .line 1040
    .line 1041
    move-result-object p0

    .line 1042
    check-cast p0, Laimw;

    .line 1043
    .line 1044
    const-string p1, "Failed to update CallOptions component enabled states"

    .line 1045
    .line 1046
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 1047
    .line 1048
    .line 1049
    :goto_418
    sget-object p1, Laojh;->a:Laojh;

    .line 1050
    .line 1051
    goto :goto_44d

    .line 1052
    :cond_41b
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 1053
    .line 1054
    iput v7, p0, Lksy;->a:I

    .line 1055
    .line 1056
    move-object v2, p1

    .line 1057
    check-cast v2, Llus;

    .line 1058
    .line 1059
    iget-object v2, v2, Llus;->a:Llug;

    .line 1060
    .line 1061
    invoke-virtual {v2, p1, p0}, Llug;->e(Lluc;Laoln;)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object p1

    .line 1065
    if-eq p1, v0, :cond_44c

    .line 1066
    .line 1067
    :cond_42a
    check-cast p1, Ljava/lang/Boolean;

    .line 1068
    .line 1069
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1070
    .line 1071
    .line 1072
    move-result p1

    .line 1073
    if-eqz p1, :cond_1a

    .line 1074
    .line 1075
    iget-object p1, p0, Lksy;->b:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast p1, Llus;

    .line 1078
    .line 1079
    iget-object v2, p1, Llus;->b:Laoin;

    .line 1080
    .line 1081
    invoke-interface {v2}, Laoin;->a()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    check-cast v2, Ljava/lang/Boolean;

    .line 1086
    .line 1087
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v2

    .line 1091
    if-nez v2, :cond_1a

    .line 1092
    .line 1093
    iput v1, p0, Lksy;->a:I

    .line 1094
    .line 1095
    invoke-virtual {p1, p0}, Llus;->e(Laoln;)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object p0

    .line 1099
    if-ne p0, v0, :cond_1a

    .line 1100
    .line 1101
    :cond_44c
    :goto_44c
    move-object p1, v0

    .line 1102
    :cond_44d
    :goto_44d
    return-object p1

    .line 1103
    :pswitch_data_44e
    .packed-switch 0x0
        :pswitch_3b6
        :pswitch_396
        :pswitch_378
        :pswitch_358
        :pswitch_31b
        :pswitch_2de
        :pswitch_29f
        :pswitch_260
        :pswitch_239
        :pswitch_20b
        :pswitch_1e3
        :pswitch_1cc
        :pswitch_1ae
        :pswitch_160
        :pswitch_145
        :pswitch_126
        :pswitch_101
        :pswitch_dc
        :pswitch_c0
        :pswitch_1c
    .end packed-switch
.end method
