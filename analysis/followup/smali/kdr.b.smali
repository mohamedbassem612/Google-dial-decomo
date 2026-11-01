.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 14

    .line 1
    iget v0, p0, Lkdr;->$cid:I

    .line 2
    .line 3
    const-string v1, "DobbyAudioDonationScottyUploader.kt"

    .line 4
    .line 5
    const-string v2, "com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader"

    .line 6
    .line 7
    const-string v3, "NO_DATA"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_5ba

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lkdr;->a:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    check-cast p1, Landroid/content/Intent;

    .line 25
    .line 26
    const/high16 v0, 0x10000

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "queryIntentActivities(...)"

    .line 33
    .line 34
    invoke-static {p0, p1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    xor-int/2addr p0, v4

    .line 42
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    return-object v5

    .line 47
    :pswitch_2e
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {p1}, Laoin;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_49

    .line 63
    .line 64
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lwae;

    .line 67
    .line 68
    invoke-virtual {p0}, Lwae;->a()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_4a

    .line 73
    .line 74
    :cond_49
    move v4, v6

    .line 75
    :cond_4a
    const-string p0, "STATE_BAM_ENABLED_ON_PHONE"

    .line 76
    .line 77
    invoke-static {p0, v4}, Labxl;->L(Ljava/lang/String;I)Lafpl;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    return-object v5

    .line 82
    :pswitch_51
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Lnrv;->a:Laimz;

    .line 86
    .line 87
    invoke-virtual {p1}, Laimp;->b()Lainm;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/16 v0, 0x13d

    .line 92
    .line 93
    const-string v1, "DobbySessionWriter.kt"

    .line 94
    .line 95
    const-string v2, "com/android/dialer/dobby/impl/storage/DobbySessionWriter"

    .line 96
    .line 97
    const-string v3, "writeSpamReportLogs$<anonymous>"

    .line 98
    .line 99
    invoke-interface {p1, v2, v3, v0, v1}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Laimw;

    .line 104
    .line 105
    const-string v0, "persisting dobby spam session logs"

    .line 106
    .line 107
    invoke-interface {p1, v0}, Laimw;->v(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lkdr;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Lnrv;

    .line 113
    .line 114
    iget-wide v0, p1, Lnrv;->c:J

    .line 115
    .line 116
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v3, Lucu;->a:Lucu;

    .line 121
    .line 122
    invoke-virtual {v3}, Lalad;->m()Lakzx;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v3}, Lwsc;->ce(Lakzx;)Lvaa;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3, v0, v1}, Lvaa;->u(J)V

    .line 131
    .line 132
    .line 133
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Laivr;

    .line 136
    .line 137
    invoke-virtual {v3, p0}, Lvaa;->v(Laivr;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Lvaa;->t()Lucu;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    iget-object p1, p1, Lnrv;->f:Ltvn;

    .line 145
    .line 146
    invoke-virtual {p1, v2, p0}, Ltvn;->b(Ljava/lang/String;Lucu;)V

    .line 147
    .line 148
    .line 149
    sget-object v5, Laojh;->a:Laojh;

    .line 150
    .line 151
    return-object v5

    .line 152
    :pswitch_97
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Lnqs;

    .line 158
    .line 159
    iget-object v0, p1, Lnqs;->g:Lnqj;

    .line 160
    .line 161
    const-string v1, "com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter"

    .line 162
    .line 163
    const-string v2, "DobbyAudioWaveFileWriter.kt"

    .line 164
    .line 165
    if-eqz v0, :cond_184

    .line 166
    .line 167
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 168
    .line 169
    iget-boolean v3, v0, Lnqj;->e:Z

    .line 170
    .line 171
    const-string v4, "writeAudioChunk$<anonymous>$<anonymous>$<anonymous>"

    .line 172
    .line 173
    if-eqz v3, :cond_ce

    .line 174
    .line 175
    sget-object p0, Lnqs;->a:Laimz;

    .line 176
    .line 177
    invoke-virtual {p0}, Laimp;->c()Lainm;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Laimw;

    .line 182
    .line 183
    sget-object v0, Laioa;->b:Laioa;

    .line 184
    .line 185
    invoke-interface {p0, v0}, Laimw;->m(Laioa;)Lainm;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const/16 v0, 0x72

    .line 190
    .line 191
    invoke-interface {p0, v1, v4, v0, v2}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, Laimw;

    .line 196
    .line 197
    iget-wide v0, p1, Lnqs;->c:J

    .line 198
    .line 199
    const-string p1, "Write audio chunk on a closed session, callCreationTime:%d"

    .line 200
    .line 201
    invoke-interface {p0, p1, v0, v1}, Laimw;->x(Ljava/lang/String;J)V

    .line 202
    .line 203
    .line 204
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 205
    .line 206
    return-object v5

    .line 207
    :cond_ce
    iget-wide v5, v0, Lnqj;->c:J

    .line 208
    .line 209
    const-wide/16 v7, 0x0

    .line 210
    .line 211
    cmp-long p1, v5, v7

    .line 212
    .line 213
    if-nez p1, :cond_108

    .line 214
    .line 215
    sget-object p1, Lnsk;->a:Lnsk;

    .line 216
    .line 217
    invoke-virtual {p1}, Lalad;->m()Lakzx;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    const-string v3, "builder"

    .line 222
    .line 223
    invoke-static {p1, v3}, Laooh;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    move-object v3, p0

    .line 227
    check-cast v3, Ligb;

    .line 228
    .line 229
    iget v5, v3, Ligb;->d:I

    .line 230
    .line 231
    invoke-virtual {p1}, Lakzx;->u()V

    .line 232
    .line 233
    .line 234
    iget-object v6, p1, Lakzx;->b:Lalad;

    .line 235
    .line 236
    check-cast v6, Lnsk;

    .line 237
    .line 238
    iput v5, v6, Lnsk;->b:I

    .line 239
    .line 240
    iget v3, v3, Ligb;->e:I

    .line 241
    .line 242
    invoke-virtual {p1}, Lakzx;->u()V

    .line 243
    .line 244
    .line 245
    iget-object v5, p1, Lakzx;->b:Lalad;

    .line 246
    .line 247
    check-cast v5, Lnsk;

    .line 248
    .line 249
    iput v3, v5, Lnsk;->c:I

    .line 250
    .line 251
    invoke-virtual {p1}, Lakzx;->p()Lalad;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    const-string v3, "build(...)"

    .line 256
    .line 257
    invoke-static {p1, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    check-cast p1, Lnsk;

    .line 261
    .line 262
    iput-object p1, v0, Lnqj;->d:Lnsk;

    .line 263
    .line 264
    goto :goto_11b

    .line 265
    :cond_108
    iget-object p1, v0, Lnqj;->d:Lnsk;

    .line 266
    .line 267
    if-eqz p1, :cond_15e

    .line 268
    .line 269
    iget v3, p1, Lnsk;->b:I

    .line 270
    .line 271
    move-object v5, p0

    .line 272
    check-cast v5, Ligb;

    .line 273
    .line 274
    iget v6, v5, Ligb;->d:I

    .line 275
    .line 276
    if-ne v3, v6, :cond_15e

    .line 277
    .line 278
    iget p1, p1, Lnsk;->c:I

    .line 279
    .line 280
    iget v3, v5, Ligb;->e:I

    .line 281
    .line 282
    if-ne p1, v3, :cond_15e

    .line 283
    .line 284
    :goto_11b
    :try_start_11b
    move-object p1, p0

    .line 285
    check-cast p1, Ligb;

    .line 286
    .line 287
    iget-object p1, p1, Ligb;->c:Lakzc;

    .line 288
    .line 289
    iget-object v3, v0, Lnqj;->a:Lakzb;

    .line 290
    .line 291
    invoke-virtual {p1, v3}, Lakzc;->m(Ljava/io/OutputStream;)V
    :try_end_125
    .catch Ljava/io/IOException; {:try_start_11b .. :try_end_125} :catch_139

    .line 292
    .line 293
    .line 294
    iget-wide v1, v0, Lnqj;->c:J

    .line 295
    .line 296
    check-cast p0, Ligb;

    .line 297
    .line 298
    iget-object p1, p0, Ligb;->c:Lakzc;

    .line 299
    .line 300
    invoke-virtual {p1}, Lakzc;->c()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    iget p0, p0, Ligb;->e:I

    .line 305
    .line 306
    div-int/2addr p1, p0

    .line 307
    int-to-long p0, p1

    .line 308
    add-long/2addr v1, p0

    .line 309
    iput-wide v1, v0, Lnqj;->c:J

    .line 310
    .line 311
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 312
    .line 313
    return-object v5

    .line 314
    :catch_139
    move-exception p0

    .line 315
    sget-object p1, Lnqs;->a:Laimz;

    .line 316
    .line 317
    invoke-virtual {p1}, Laimp;->c()Lainm;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    check-cast p1, Laimw;

    .line 322
    .line 323
    sget-object v0, Lzct;->b:Lainp;

    .line 324
    .line 325
    invoke-interface {p1, v0}, Laimw;->i(Lainp;)Lainm;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    check-cast p1, Laimw;

    .line 330
    .line 331
    invoke-interface {p1, p0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    const/16 p1, 0x8b

    .line 336
    .line 337
    invoke-interface {p0, v1, v4, p1, v2}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    check-cast p0, Laimw;

    .line 342
    .line 343
    const-string p1, "Write audio truck file failed"

    .line 344
    .line 345
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 349
    .line 350
    return-object v5

    .line 351
    :cond_15e
    sget-object p0, Lnqs;->a:Laimz;

    .line 352
    .line 353
    invoke-virtual {p0}, Laimp;->c()Lainm;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    check-cast p0, Laimw;

    .line 358
    .line 359
    sget-object p1, Laioa;->b:Laioa;

    .line 360
    .line 361
    invoke-interface {p0, p1}, Laimw;->m(Laioa;)Lainm;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    check-cast p0, Laimw;

    .line 366
    .line 367
    sget-object p1, Lzct;->b:Lainp;

    .line 368
    .line 369
    invoke-interface {p0, p1}, Laimw;->i(Lainp;)Lainm;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    const/16 p1, 0x83

    .line 374
    .line 375
    invoke-interface {p0, v1, v4, p1, v2}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    check-cast p0, Laimw;

    .line 380
    .line 381
    const-string p1, "Mismatched chunk format"

    .line 382
    .line 383
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 387
    .line 388
    return-object v5

    .line 389
    :cond_184
    sget-object p0, Lnqs;->a:Laimz;

    .line 390
    .line 391
    invoke-virtual {p0}, Laimp;->c()Lainm;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    check-cast p0, Laimw;

    .line 396
    .line 397
    sget-object p1, Laioa;->b:Laioa;

    .line 398
    .line 399
    invoke-interface {p0, p1}, Laimw;->m(Laioa;)Lainm;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    const-string p1, "writeAudioChunk$<anonymous>$<anonymous>"

    .line 404
    .line 405
    const/16 v0, 0x95

    .line 406
    .line 407
    invoke-interface {p0, v1, p1, v0, v2}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    check-cast p0, Laimw;

    .line 412
    .line 413
    const-string p1, "No output stream or file opened for writing, please call createAudioFile() first"

    .line 414
    .line 415
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 419
    .line 420
    return-object v5

    .line 421
    :pswitch_1a4
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast p1, Lahau;

    .line 427
    .line 428
    iget-object p1, p1, Lahau;->a:Laify;

    .line 429
    .line 430
    sget-object v0, Lahap;->a:Lahap;

    .line 431
    .line 432
    invoke-virtual {p1, v0}, Laify;->contains(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result p1

    .line 436
    if-nez p1, :cond_1bb

    .line 437
    .line 438
    sget-object v5, Lahas;->d:Lahar;

    .line 439
    .line 440
    invoke-static {v5, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    return-object v5

    .line 444
    :cond_1bb
    invoke-static {}, Lahar;->a()Lahaq;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-virtual {p1, v6}, Lahaq;->b(Z)V

    .line 449
    .line 450
    .line 451
    iput-object v0, p1, Lahaq;->a:Lahap;

    .line 452
    .line 453
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast p0, Lmzi;

    .line 456
    .line 457
    iget-object p0, p0, Lmzi;->a:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast p0, Lmnl;

    .line 460
    .line 461
    invoke-virtual {p0}, Lmnl;->a()Lmnm;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {p0}, Lmnm;->name()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 470
    .line 471
    invoke-static {p0, v0}, Lakzc;->v(Ljava/lang/String;Ljava/nio/charset/Charset;)Lakzc;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    invoke-virtual {p1, p0}, Lahaq;->c(Lakzc;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p1}, Lahaq;->a()Lahar;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    return-object v5

    .line 483
    :pswitch_1e2
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast p1, Lahau;

    .line 489
    .line 490
    iget-object p1, p1, Lahau;->a:Laify;

    .line 491
    .line 492
    sget-object v0, Lahap;->a:Lahap;

    .line 493
    .line 494
    invoke-virtual {p1, v0}, Laify;->contains(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result p1

    .line 498
    if-nez p1, :cond_1f9

    .line 499
    .line 500
    sget-object v5, Lahas;->d:Lahar;

    .line 501
    .line 502
    invoke-static {v5, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    return-object v5

    .line 506
    :cond_1f9
    invoke-static {}, Lahar;->a()Lahaq;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    invoke-virtual {p1, v6}, Lahaq;->b(Z)V

    .line 511
    .line 512
    .line 513
    iput-object v0, p1, Lahaq;->a:Lahap;

    .line 514
    .line 515
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p0, Lmzi;

    .line 518
    .line 519
    iget-object p0, p0, Lmzi;->a:Ljava/lang/Object;

    .line 520
    .line 521
    invoke-interface {p0}, Lmvz;->a()Lacux;

    .line 522
    .line 523
    .line 524
    move-result-object p0

    .line 525
    iget p0, p0, Lacux;->e:I

    .line 526
    .line 527
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 532
    .line 533
    invoke-static {p0, v0}, Lakzc;->v(Ljava/lang/String;Ljava/nio/charset/Charset;)Lakzc;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    invoke-virtual {p1, p0}, Lahaq;->c(Lakzc;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {p1}, Lahaq;->a()Lahar;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    return-object v5

    .line 545
    :pswitch_220
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast p1, Lahau;

    .line 551
    .line 552
    iget-object p1, p1, Lahau;->a:Laify;

    .line 553
    .line 554
    sget-object v0, Lahap;->a:Lahap;

    .line 555
    .line 556
    invoke-virtual {p1, v0}, Laify;->contains(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result p1

    .line 560
    if-nez p1, :cond_237

    .line 561
    .line 562
    sget-object v5, Lahas;->d:Lahar;

    .line 563
    .line 564
    invoke-static {v5, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    return-object v5

    .line 568
    :cond_237
    invoke-static {}, Lahar;->a()Lahaq;

    .line 569
    .line 570
    .line 571
    move-result-object p1

    .line 572
    invoke-virtual {p1, v6}, Lahaq;->b(Z)V

    .line 573
    .line 574
    .line 575
    iput-object v0, p1, Lahaq;->a:Lahap;

    .line 576
    .line 577
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast p0, Lmzi;

    .line 580
    .line 581
    iget-object p0, p0, Lmzi;->a:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast p0, Lmnk;

    .line 584
    .line 585
    invoke-virtual {p0}, Lmnk;->a()Z

    .line 586
    .line 587
    .line 588
    move-result p0

    .line 589
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object p0

    .line 593
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 594
    .line 595
    invoke-static {p0, v0}, Lakzc;->v(Ljava/lang/String;Ljava/nio/charset/Charset;)Lakzc;

    .line 596
    .line 597
    .line 598
    move-result-object p0

    .line 599
    invoke-virtual {p1, p0}, Lahaq;->c(Lakzc;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {p1}, Lahaq;->a()Lahar;

    .line 603
    .line 604
    .line 605
    move-result-object v5

    .line 606
    return-object v5

    .line 607
    :pswitch_25e
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    iget-object p1, p0, Lkdr;->a:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast p1, Lmys;

    .line 613
    .line 614
    iget-object v0, p1, Lmys;->a:Landroid/content/Context;

    .line 615
    .line 616
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 617
    .line 618
    invoke-static {v0, v5}, Lrlt;->a(Landroid/content/Context;Landroid/telecom/PhoneAccountHandle;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    iget-object p1, p1, Lmys;->b:Lssq;

    .line 623
    .line 624
    check-cast p0, Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {p1, p0, v0}, Lssq;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v5

    .line 630
    return-object v5

    .line 631
    :pswitch_276
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 635
    .line 636
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 637
    .line 638
    new-instance v1, Ljava/io/FileInputStream;

    .line 639
    .line 640
    move-object v2, p1

    .line 641
    check-cast v2, Ljava/lang/String;

    .line 642
    .line 643
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 647
    .line 648
    .line 649
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 650
    .line 651
    :try_start_28a
    new-instance v1, Ljava/io/File;

    .line 652
    .line 653
    check-cast p1, Ljava/lang/String;

    .line 654
    .line 655
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-static {v1}, Lhgu;->d(Ljava/io/File;)Lidn;

    .line 659
    .line 660
    .line 661
    move-result-object p1

    .line 662
    const-string v1, "parse(...)"

    .line 663
    .line 664
    invoke-static {p1, v1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    iget-object v1, p1, Lidn;->c:Lidm;

    .line 668
    .line 669
    if-nez v1, :cond_2a0

    .line 670
    .line 671
    sget-object v1, Lidm;->a:Lidm;

    .line 672
    .line 673
    :cond_2a0
    iget v1, v1, Lidm;->c:I

    .line 674
    .line 675
    add-int/lit8 v1, v1, 0x1c

    .line 676
    .line 677
    check-cast p0, Lmuf;

    .line 678
    .line 679
    iget-object p0, p0, Lmuf;->b:Linv;

    .line 680
    .line 681
    invoke-static {v0}, Lakzc;->F(Ljava/io/InputStream;)Lakzc;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    invoke-virtual {v2, v1}, Lakzc;->x(I)Lakzc;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    iget-object p1, p1, Lidn;->c:Lidm;

    .line 690
    .line 691
    if-nez p1, :cond_2b6

    .line 692
    .line 693
    sget-object p1, Lidm;->a:Lidm;

    .line 694
    .line 695
    :cond_2b6
    iget p1, p1, Lidm;->e:I

    .line 696
    .line 697
    const/16 v2, 0x3e80

    .line 698
    .line 699
    invoke-interface {p0, v1, p1, v2}, Linv;->a(Lakzc;II)Lakzc;

    .line 700
    .line 701
    .line 702
    move-result-object p0
    :try_end_2be
    .catchall {:try_start_28a .. :try_end_2be} :catchall_2c3

    .line 703
    invoke-static {v0, v5}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 704
    .line 705
    .line 706
    move-object v5, p0

    .line 707
    return-object v5

    .line 708
    :catchall_2c3
    move-exception p0

    .line 709
    :try_start_2c4
    throw p0
    :try_end_2c5
    .catchall {:try_start_2c4 .. :try_end_2c5} :catchall_2c5

    .line 710
    :catchall_2c5
    move-exception p1

    .line 711
    invoke-static {v0, p0}, Lajsz;->ak(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 712
    .line 713
    .line 714
    throw p1

    .line 715
    :pswitch_2ca
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 719
    .line 720
    new-instance p1, Ljava/io/File;

    .line 721
    .line 722
    check-cast p0, Lnss;

    .line 723
    .line 724
    iget-object p0, p0, Lnss;->c:Ljava/lang/String;

    .line 725
    .line 726
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 730
    .line 731
    .line 732
    move-result p0

    .line 733
    if-nez p0, :cond_2f4

    .line 734
    .line 735
    sget-object p0, Lmuf;->a:Laimz;

    .line 736
    .line 737
    invoke-virtual {p0}, Laimp;->d()Lainm;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    const-string p1, "prepareTranscriptsForUpload$<anonymous>"

    .line 742
    .line 743
    const/16 v0, 0x80

    .line 744
    .line 745
    invoke-interface {p0, v2, p1, v0, v1}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 746
    .line 747
    .line 748
    move-result-object p0

    .line 749
    check-cast p0, Laimw;

    .line 750
    .line 751
    const-string p1, "no transcript file exists, cannot upload"

    .line 752
    .line 753
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    return-object v5

    .line 757
    :cond_2f4
    invoke-static {p1}, Lmuf;->c(Ljava/io/File;)Lakzc;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    sget-object p1, Lnst;->a:Lnst;

    .line 762
    .line 763
    invoke-static {p1, p0}, Lalad;->v(Lalad;Lakzc;)Lalad;

    .line 764
    .line 765
    .line 766
    move-result-object p0

    .line 767
    move-object v5, p0

    .line 768
    check-cast v5, Lnst;

    .line 769
    .line 770
    return-object v5

    .line 771
    :pswitch_302
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 775
    .line 776
    new-instance p1, Ljava/io/File;

    .line 777
    .line 778
    check-cast p0, Lnso;

    .line 779
    .line 780
    iget-object p0, p0, Lnso;->b:Ljava/lang/String;

    .line 781
    .line 782
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 786
    .line 787
    .line 788
    move-result p0

    .line 789
    if-nez p0, :cond_32c

    .line 790
    .line 791
    sget-object p0, Lmuf;->a:Laimz;

    .line 792
    .line 793
    invoke-virtual {p0}, Laimp;->d()Lainm;

    .line 794
    .line 795
    .line 796
    move-result-object p0

    .line 797
    const-string p1, "prepareLogsToUpload$<anonymous>"

    .line 798
    .line 799
    const/16 v0, 0x8d

    .line 800
    .line 801
    invoke-interface {p0, v2, p1, v0, v1}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 802
    .line 803
    .line 804
    move-result-object p0

    .line 805
    check-cast p0, Laimw;

    .line 806
    .line 807
    const-string p1, "no logs file exists, cannot upload"

    .line 808
    .line 809
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    return-object v5

    .line 813
    :cond_32c
    invoke-static {p1}, Lmuf;->c(Ljava/io/File;)Lakzc;

    .line 814
    .line 815
    .line 816
    move-result-object p0

    .line 817
    sget-object p1, Lnsn;->a:Lnsn;

    .line 818
    .line 819
    invoke-static {p1, p0}, Lalad;->v(Lalad;Lakzc;)Lalad;

    .line 820
    .line 821
    .line 822
    move-result-object p0

    .line 823
    move-object v5, p0

    .line 824
    check-cast v5, Lnsn;

    .line 825
    .line 826
    return-object v5

    .line 827
    :pswitch_33a
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 831
    .line 832
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast p0, Lmaw;

    .line 835
    .line 836
    iput-object p1, p0, Lmaw;->d:Ljava/lang/Object;

    .line 837
    .line 838
    sget-object v5, Laojh;->a:Laojh;

    .line 839
    .line 840
    return-object v5

    .line 841
    :pswitch_348
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 845
    .line 846
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 847
    .line 848
    new-instance v0, Lkqd;

    .line 849
    .line 850
    check-cast p0, Llub;

    .line 851
    .line 852
    const/4 v1, 0x7

    .line 853
    invoke-direct {v0, p1, p0, v5, v1}, Lkqd;-><init>(Laowu;Llub;Laoln;I)V

    .line 854
    .line 855
    .line 856
    iget-object p0, p0, Llub;->c:Laoss;

    .line 857
    .line 858
    const/4 p1, 0x3

    .line 859
    invoke-static {p0, v5, v6, v0, p1}, Laoov;->an(Laoss;Laolr;ILaonn;I)Laoub;

    .line 860
    .line 861
    .line 862
    move-result-object v5

    .line 863
    return-object v5

    .line 864
    :pswitch_35f
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    iget-object p1, p0, Lkdr;->a:Ljava/lang/Object;

    .line 868
    .line 869
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 870
    .line 871
    new-instance v5, Lltc;

    .line 872
    .line 873
    check-cast p0, Ljava/lang/String;

    .line 874
    .line 875
    check-cast p1, Lltj;

    .line 876
    .line 877
    invoke-direct {v5, p0, p1}, Lltc;-><init>(Ljava/lang/String;Lltj;)V

    .line 878
    .line 879
    .line 880
    return-object v5

    .line 881
    :pswitch_370
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 885
    .line 886
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast p0, Llrc;

    .line 889
    .line 890
    check-cast p1, Lampm;

    .line 891
    .line 892
    iput-object p1, p0, Llrc;->b:Lampm;

    .line 893
    .line 894
    sget-object v5, Laojh;->a:Laojh;

    .line 895
    .line 896
    return-object v5

    .line 897
    :pswitch_380
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 901
    .line 902
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast p0, Llrc;

    .line 905
    .line 906
    check-cast p1, Lakzm;

    .line 907
    .line 908
    iput-object p1, p0, Llrc;->c:Lakzm;

    .line 909
    .line 910
    sget-object v5, Laojh;->a:Laojh;

    .line 911
    .line 912
    return-object v5

    .line 913
    :pswitch_390
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast p1, Laoop;

    .line 919
    .line 920
    iget-boolean v0, p1, Laoop;->a:Z

    .line 921
    .line 922
    if-nez v0, :cond_3a2

    .line 923
    .line 924
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast p0, Lgcp;

    .line 927
    .line 928
    invoke-virtual {p0}, Lgcp;->c()V

    .line 929
    .line 930
    .line 931
    :cond_3a2
    iput-boolean v6, p1, Laoop;->a:Z

    .line 932
    .line 933
    sget-object v5, Laojh;->a:Laojh;

    .line 934
    .line 935
    return-object v5

    .line 936
    :pswitch_3a7
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 937
    .line 938
    .line 939
    iget-object p1, p0, Lkdr;->b:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast p1, Lkuu;

    .line 942
    .line 943
    iget-object p1, p1, Lkuu;->b:Landroid/content/Context;

    .line 944
    .line 945
    new-instance v0, Ljava/io/File;

    .line 946
    .line 947
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    const-string v2, "callrecordingprompt"

    .line 952
    .line 953
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast p0, Lkut;

    .line 959
    .line 960
    iget-object v1, p0, Lkut;->h:Ljava/lang/String;

    .line 961
    .line 962
    new-instance v5, Ljava/io/File;

    .line 963
    .line 964
    invoke-direct {v5, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    if-nez v0, :cond_5b8

    .line 972
    .line 973
    new-instance v0, Ljava/io/File;

    .line 974
    .line 975
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    invoke-direct {v0, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 983
    .line 984
    .line 985
    move-result v2

    .line 986
    if-nez v2, :cond_3de

    .line 987
    .line 988
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 989
    .line 990
    .line 991
    :cond_3de
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    filled-new-array {v1}, [Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    invoke-static {v0, v2}, Lj$/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Lj$/nio/file/Path;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1004
    .line 1005
    .line 1006
    move-result-object p1

    .line 1007
    iget p0, p0, Lkut;->g:I

    .line 1008
    .line 1009
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 1010
    .line 1011
    .line 1012
    move-result-object p0

    .line 1013
    const-string p1, "openRawResource(...)"

    .line 1014
    .line 1015
    invoke-static {p0, p1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    new-array p1, v6, [Lj$/nio/file/CopyOption;

    .line 1019
    .line 1020
    invoke-static {p0, v0, p1}, Lj$/nio/file/Files;->copy(Ljava/io/InputStream;Lj$/nio/file/Path;[Lj$/nio/file/CopyOption;)J

    .line 1021
    .line 1022
    .line 1023
    sget-object p0, Lkuu;->a:Laimz;

    .line 1024
    .line 1025
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 1026
    .line 1027
    .line 1028
    move-result-object p0

    .line 1029
    const/16 p1, 0x2e

    .line 1030
    .line 1031
    const-string v2, "CallRecordingDisclosureAudioFiles.kt"

    .line 1032
    .line 1033
    const-string v3, "com/android/dialer/callrecording/disclosure/impl/audiofiles/CallRecordingDisclosureAudioFiles"

    .line 1034
    .line 1035
    const-string v4, "createAudioFile"

    .line 1036
    .line 1037
    invoke-interface {p0, v3, v4, p1, v2}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1038
    .line 1039
    .line 1040
    move-result-object p0

    .line 1041
    check-cast p0, Laimw;

    .line 1042
    .line 1043
    const-string p1, "Created file: %s"

    .line 1044
    .line 1045
    invoke-interface {p0, p1, v1}, Laimw;->y(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1046
    .line 1047
    .line 1048
    invoke-interface {v0}, Lj$/nio/file/Path;->toFile()Ljava/io/File;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v5

    .line 1052
    const-string p0, "toFile(...)"

    .line 1053
    .line 1054
    invoke-static {v5, p0}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1055
    .line 1056
    .line 1057
    return-object v5

    .line 1058
    :pswitch_421
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    :try_start_424
    iget-object p1, p0, Lkdr;->a:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast p1, Lrsr;

    .line 1064
    .line 1065
    iget-object p1, p1, Lrsr;->a:Ljava/lang/Object;

    .line 1066
    .line 1067
    iget-object v0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v0, Ljava/lang/String;

    .line 1070
    .line 1071
    check-cast p1, Landroid/content/pm/PackageManager;

    .line 1072
    .line 1073
    invoke-virtual {p1, v0, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 1074
    .line 1075
    .line 1076
    move-result-object p1
    :try_end_434
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_424 .. :try_end_434} :catch_5b8

    .line 1077
    invoke-static {p1}, Laooh;->c(Ljava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    iget-object p0, p0, Lkdr;->a:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast p0, Lrsr;

    .line 1083
    .line 1084
    iget-object p0, p0, Lrsr;->a:Ljava/lang/Object;

    .line 1085
    .line 1086
    check-cast p0, Landroid/content/pm/PackageManager;

    .line 1087
    .line 1088
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 1089
    .line 1090
    .line 1091
    move-result-object p0

    .line 1092
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v5

    .line 1096
    return-object v5

    .line 1097
    :pswitch_448
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1098
    .line 1099
    .line 1100
    iget-object p1, p0, Lkdr;->a:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast p1, Landroid/content/Context;

    .line 1103
    .line 1104
    invoke-static {p1}, Lhgu;->u(Landroid/content/Context;)Lknn;

    .line 1105
    .line 1106
    .line 1107
    move-result-object p1

    .line 1108
    invoke-interface {p1}, Lknn;->sJ()Lipc;

    .line 1109
    .line 1110
    .line 1111
    move-result-object p1

    .line 1112
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 1113
    .line 1114
    check-cast p0, Lrmu;

    .line 1115
    .line 1116
    invoke-virtual {p1, p0}, Lipc;->bm(Lrmu;)V

    .line 1117
    .line 1118
    .line 1119
    sget-object v5, Laojh;->a:Laojh;

    .line 1120
    .line 1121
    return-object v5

    .line 1122
    :pswitch_461
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    iget-object p1, p0, Lkdr;->a:Ljava/lang/Object;

    .line 1126
    .line 1127
    check-cast p1, Lkdw;

    .line 1128
    .line 1129
    iget-object p1, p1, Lkdw;->f:Lkdx;

    .line 1130
    .line 1131
    invoke-virtual {p1}, Lkdx;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 1132
    .line 1133
    .line 1134
    move-result-object p1

    .line 1135
    invoke-static {p1}, Laooh;->c(Ljava/lang/Object;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 1139
    .line 1140
    .line 1141
    iget-object p0, p0, Lkdr;->b:Ljava/lang/Object;

    .line 1142
    .line 1143
    :try_start_476
    move-object v0, p0

    .line 1144
    check-cast v0, Lahbq;

    .line 1145
    .line 1146
    iget-object v0, v0, Lahbq;->b:Ljava/lang/Object;

    .line 1147
    .line 1148
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    :cond_483
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v1
    :try_end_487
    .catchall {:try_start_476 .. :try_end_487} :catchall_5b3

    .line 1160
    const-string v2, "applyChanges$<anonymous>$<anonymous>"

    .line 1161
    .line 1162
    const-string v3, "com/android/dialer/calllog/database/AnnotatedCallLogDataRepository$keyValueStore$<anonymous>"

    .line 1163
    .line 1164
    const-string v6, "AnnotatedCallLog"

    .line 1165
    .line 1166
    const-string v7, "AnnotatedCallLogDataRepository.kt"

    .line 1167
    .line 1168
    if-eqz v1, :cond_4dd

    .line 1169
    .line 1170
    :try_start_491
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v1

    .line 1174
    check-cast v1, Ljava/util/Map$Entry;

    .line 1175
    .line 1176
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v8

    .line 1180
    check-cast v8, Ljava/lang/Number;

    .line 1181
    .line 1182
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 1183
    .line 1184
    .line 1185
    move-result-wide v8

    .line 1186
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v1

    .line 1190
    check-cast v1, Labwj;
    :try_end_4a7
    .catchall {:try_start_491 .. :try_end_4a7} :catchall_5b3

    .line 1191
    .line 1192
    :try_start_4a7
    iget-object v1, v1, Labwj;->a:Ljava/lang/Object;

    .line 1193
    .line 1194
    check-cast v1, Lkdy;

    .line 1195
    .line 1196
    invoke-virtual {v1}, Lkdy;->o()V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v1}, Lkdy;->a()Landroid/content/ContentValues;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v1

    .line 1203
    invoke-virtual {p1, v6, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 1204
    .line 1205
    .line 1206
    move-result-wide v10

    .line 1207
    cmp-long v1, v10, v8

    .line 1208
    .line 1209
    if-eqz v1, :cond_483

    .line 1210
    .line 1211
    new-instance p0, Ljava/io/IOException;

    .line 1212
    .line 1213
    const-string v0, "Insert failed"

    .line 1214
    .line 1215
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    throw p0
    :try_end_4c2
    .catch Ljava/lang/Exception; {:try_start_4a7 .. :try_end_4c2} :catch_4c2
    .catchall {:try_start_4a7 .. :try_end_4c2} :catchall_5b3

    .line 1219
    :catch_4c2
    move-exception p0

    .line 1220
    :try_start_4c3
    sget-object v0, Lkdw;->a:Laimz;

    .line 1221
    .line 1222
    invoke-virtual {v0}, Laimp;->c()Lainm;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    check-cast v0, Laimw;

    .line 1227
    .line 1228
    invoke-interface {v0, p0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    const/16 v1, 0xe4

    .line 1233
    .line 1234
    invoke-interface {v0, v3, v2, v1, v7}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    check-cast v0, Laimw;

    .line 1239
    .line 1240
    const-string v1, "AnnotatedCallLogDataRepository failed to insert"

    .line 1241
    .line 1242
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    throw p0

    .line 1246
    :cond_4dd
    move-object v0, p0

    .line 1247
    check-cast v0, Lahbq;

    .line 1248
    .line 1249
    iget-object v0, v0, Lahbq;->a:Ljava/lang/Object;

    .line 1250
    .line 1251
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    :cond_4ea
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1260
    .line 1261
    .line 1262
    move-result v1

    .line 1263
    if-eqz v1, :cond_553

    .line 1264
    .line 1265
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    check-cast v1, Ljava/util/Map$Entry;

    .line 1270
    .line 1271
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v5

    .line 1275
    check-cast v5, Ljava/lang/Number;

    .line 1276
    .line 1277
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 1278
    .line 1279
    .line 1280
    move-result-wide v8

    .line 1281
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v1

    .line 1285
    check-cast v1, Labwk;

    .line 1286
    .line 1287
    iget-object v1, v1, Labwk;->b:Ljava/lang/Object;

    .line 1288
    .line 1289
    check-cast v1, Lkdy;

    .line 1290
    .line 1291
    invoke-virtual {v1}, Lkdy;->o()V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v1}, Lkdy;->a()Landroid/content/ContentValues;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    const-string v5, "_id"

    .line 1299
    .line 1300
    new-instance v10, Lkaw;

    .line 1301
    .line 1302
    invoke-direct {v10, v5}, Lkaw;-><init>(Ljava/lang/Object;)V

    .line 1303
    .line 1304
    .line 1305
    const-string v5, "= "

    .line 1306
    .line 1307
    invoke-static {v8, v9, v5}, La;->bz(JLjava/lang/String;)Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v5

    .line 1311
    invoke-virtual {v10, v5}, Lkaw;->aH(Ljava/lang/String;)Lrsr;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v5
    :try_end_522
    .catchall {:try_start_4c3 .. :try_end_522} :catchall_5b3

    .line 1315
    :try_start_522
    iget-object v8, v5, Lrsr;->b:Ljava/lang/Object;

    .line 1316
    .line 1317
    iget-object v5, v5, Lrsr;->a:Ljava/lang/Object;

    .line 1318
    .line 1319
    check-cast v5, [Ljava/lang/String;

    .line 1320
    .line 1321
    check-cast v8, Ljava/lang/String;

    .line 1322
    .line 1323
    invoke-virtual {p1, v6, v1, v8, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1324
    .line 1325
    .line 1326
    move-result v1

    .line 1327
    if-eq v1, v4, :cond_4ea

    .line 1328
    .line 1329
    new-instance p0, Ljava/io/IOException;

    .line 1330
    .line 1331
    const-string v0, "Update failed"

    .line 1332
    .line 1333
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1334
    .line 1335
    .line 1336
    throw p0
    :try_end_538
    .catch Ljava/lang/Exception; {:try_start_522 .. :try_end_538} :catch_538
    .catchall {:try_start_522 .. :try_end_538} :catchall_5b3

    .line 1337
    :catch_538
    move-exception p0

    .line 1338
    :try_start_539
    sget-object v0, Lkdw;->a:Laimz;

    .line 1339
    .line 1340
    invoke-virtual {v0}, Laimp;->c()Lainm;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    check-cast v0, Laimw;

    .line 1345
    .line 1346
    invoke-interface {v0, p0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    const/16 v1, 0xf4

    .line 1351
    .line 1352
    invoke-interface {v0, v3, v2, v1, v7}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v0

    .line 1356
    check-cast v0, Laimw;

    .line 1357
    .line 1358
    const-string v1, "AnnotatedCallLogDataRepository failed to update"

    .line 1359
    .line 1360
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1361
    .line 1362
    .line 1363
    throw p0

    .line 1364
    :cond_553
    check-cast p0, Lahbq;

    .line 1365
    .line 1366
    iget-object p0, p0, Lahbq;->d:Ljava/lang/Object;

    .line 1367
    .line 1368
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 1369
    .line 1370
    .line 1371
    move-result-object p0

    .line 1372
    const/16 v0, 0x3e7

    .line 1373
    .line 1374
    invoke-static {p0, v0}, Lajsz;->bP(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1375
    .line 1376
    .line 1377
    move-result-object p0

    .line 1378
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1379
    .line 1380
    .line 1381
    move-result-object p0

    .line 1382
    :cond_565
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1383
    .line 1384
    .line 1385
    move-result v0

    .line 1386
    if-eqz v0, :cond_5aa

    .line 1387
    .line 1388
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    check-cast v0, Ljava/util/List;

    .line 1393
    .line 1394
    invoke-static {v0}, Lkcq;->R(Ljava/util/List;)Lrsr;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1
    :try_end_575
    .catchall {:try_start_539 .. :try_end_575} :catchall_5b3

    .line 1398
    :try_start_575
    iget-object v4, v1, Lrsr;->b:Ljava/lang/Object;

    .line 1399
    .line 1400
    iget-object v1, v1, Lrsr;->a:Ljava/lang/Object;

    .line 1401
    .line 1402
    check-cast v1, [Ljava/lang/String;

    .line 1403
    .line 1404
    check-cast v4, Ljava/lang/String;

    .line 1405
    .line 1406
    invoke-virtual {p1, v6, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1407
    .line 1408
    .line 1409
    move-result v1

    .line 1410
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1411
    .line 1412
    .line 1413
    move-result v0

    .line 1414
    if-eq v1, v0, :cond_565

    .line 1415
    .line 1416
    new-instance p0, Ljava/io/IOException;

    .line 1417
    .line 1418
    const-string v0, "Delete failed"

    .line 1419
    .line 1420
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1421
    .line 1422
    .line 1423
    throw p0
    :try_end_58f
    .catch Ljava/lang/Exception; {:try_start_575 .. :try_end_58f} :catch_58f
    .catchall {:try_start_575 .. :try_end_58f} :catchall_5b3

    .line 1424
    :catch_58f
    move-exception p0

    .line 1425
    :try_start_590
    sget-object v0, Lkdw;->a:Laimz;

    .line 1426
    .line 1427
    invoke-virtual {v0}, Laimp;->c()Lainm;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    check-cast v0, Laimw;

    .line 1432
    .line 1433
    invoke-interface {v0, p0}, Laimw;->k(Ljava/lang/Throwable;)Lainm;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    const/16 v1, 0x102

    .line 1438
    .line 1439
    invoke-interface {v0, v3, v2, v1, v7}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v0

    .line 1443
    check-cast v0, Laimw;

    .line 1444
    .line 1445
    const-string v1, "AnnotatedCallLogDataRepository failed to delete"

    .line 1446
    .line 1447
    invoke-interface {v0, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 1448
    .line 1449
    .line 1450
    throw p0

    .line 1451
    :cond_5aa
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_5ad
    .catchall {:try_start_590 .. :try_end_5ad} :catchall_5b3

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1455
    .line 1456
    .line 1457
    sget-object v5, Laojh;->a:Laojh;

    .line 1458
    .line 1459
    goto :goto_5b8

    .line 1460
    :catchall_5b3
    move-exception p0

    .line 1461
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1462
    .line 1463
    .line 1464
    throw p0

    .line 1465
    :catch_5b8
    :cond_5b8
    :goto_5b8
    return-object v5

    .line 1466
    nop

    .line 1467
    :pswitch_data_5ba
    .packed-switch 0x0
        :pswitch_461
        :pswitch_448
        :pswitch_421
        :pswitch_3a7
        :pswitch_390
        :pswitch_380
        :pswitch_370
        :pswitch_35f
        :pswitch_348
        :pswitch_33a
        :pswitch_302
        :pswitch_2ca
        :pswitch_276
        :pswitch_25e
        :pswitch_220
        :pswitch_1e2
        :pswitch_1a4
        :pswitch_97
        :pswitch_51
        :pswitch_2e
    .end packed-switch
.end method
