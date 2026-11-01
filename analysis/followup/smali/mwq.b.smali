.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 15

    .line 1
    iget v0, p0, Lmwq;->$cid:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    if-eqz v0, :cond_17e

    .line 8
    .line 9
    if-eq v0, v4, :cond_ec

    .line 10
    .line 11
    sget-object v0, Laolu;->a:Laolu;

    .line 12
    .line 13
    iget v5, p0, Lmwq;->b:I

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    if-eqz v5, :cond_26

    .line 17
    .line 18
    if-eq v5, v4, :cond_22

    .line 19
    .line 20
    if-eq v5, v3, :cond_1e

    .line 21
    .line 22
    iget-object v3, p0, Lmwq;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    if-eq v5, v2, :cond_96

    .line 28
    .line 29
    goto/16 :goto_a6

    .line 30
    .line 31
    :cond_1e
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_6c

    .line 35
    :cond_22
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_51

    .line 39
    :cond_26
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lmwq;->c:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v5, p0, Lmwq;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lryf;

    .line 47
    .line 48
    iget-object v7, p1, Lryf;->d:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 59
    .line 60
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 69
    .line 70
    iput v4, p0, Lmwq;->b:I

    .line 71
    .line 72
    iget-object p1, p1, Lryf;->a:Lsjy;

    .line 73
    .line 74
    check-cast v5, Labxt;

    .line 75
    .line 76
    invoke-virtual {p1, v5, v8, v7, p0}, Lsjy;->f(Labxt;IILaoln;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eq p1, v0, :cond_230

    .line 81
    .line 82
    :goto_51
    check-cast p1, Labxt;

    .line 83
    .line 84
    if-eqz p1, :cond_e4

    .line 85
    .line 86
    iget-object v5, p0, Lmwq;->c:Ljava/lang/Object;

    .line 87
    .line 88
    iput v3, p0, Lmwq;->b:I

    .line 89
    .line 90
    new-instance v3, Lrka;

    .line 91
    .line 92
    check-cast v5, Lryf;

    .line 93
    .line 94
    iget-object v5, v5, Lryf;->b:Lrzs;

    .line 95
    .line 96
    const/16 v7, 0x9

    .line 97
    .line 98
    invoke-direct {v3, v5, p1, v6, v7}, Lrka;-><init>(Lrzs;Labxt;Laoln;I)V

    .line 99
    .line 100
    .line 101
    iget-object p1, v5, Lrzs;->c:Laolr;

    .line 102
    .line 103
    invoke-static {p1, v3, p0}, Laoov;->aj(Laolr;Laonn;Laoln;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eq p1, v0, :cond_230

    .line 108
    .line 109
    :goto_6c
    move-object v3, p1

    .line 110
    check-cast v3, Lsnl;

    .line 111
    .line 112
    invoke-static {v3}, Lanty;->W(Ljava/lang/Object;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_82

    .line 117
    .line 118
    if-eq p1, v4, :cond_7d

    .line 119
    .line 120
    new-instance p0, Laois;

    .line 121
    .line 122
    invoke-direct {p0}, Laois;-><init>()V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :cond_7d
    check-cast v3, Lrzj;

    .line 127
    .line 128
    iget-object p0, v3, Lrzj;->a:Ljava/lang/Throwable;

    .line 129
    .line 130
    throw p0

    .line 131
    :cond_82
    iget-object p1, p0, Lmwq;->c:Ljava/lang/Object;

    .line 132
    .line 133
    iget-object v5, p0, Lmwq;->d:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v3, p0, Lmwq;->a:Ljava/lang/Object;

    .line 136
    .line 137
    iput v2, p0, Lmwq;->b:I

    .line 138
    .line 139
    check-cast p1, Lryf;

    .line 140
    .line 141
    iget-object p1, p1, Lryf;->c:Lsfa;

    .line 142
    .line 143
    check-cast v5, Lsfb;

    .line 144
    .line 145
    invoke-virtual {p1, v5, p0}, Lsfa;->i(Lsfb;Laoln;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eq p1, v0, :cond_230

    .line 150
    .line 151
    :cond_96
    iget-object p1, p0, Lmwq;->c:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v3, p0, Lmwq;->a:Ljava/lang/Object;

    .line 154
    .line 155
    iput v1, p0, Lmwq;->b:I

    .line 156
    .line 157
    check-cast p1, Lryf;

    .line 158
    .line 159
    iget-object p1, p1, Lryf;->a:Lsjy;

    .line 160
    .line 161
    invoke-virtual {p1, p0}, Lsjy;->b(Laoln;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-eq p1, v0, :cond_230

    .line 166
    .line 167
    :goto_a6
    iget-object p0, p0, Lmwq;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, Lryf;

    .line 170
    .line 171
    iget-object p1, p0, Lryf;->f:Laoin;

    .line 172
    .line 173
    invoke-interface {p1}, Laoin;->a()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-eqz p1, :cond_df

    .line 184
    .line 185
    move-object p1, v3

    .line 186
    check-cast p1, Lrzm;

    .line 187
    .line 188
    iget-object p1, p1, Lrzm;->a:Ljava/lang/Object;

    .line 189
    .line 190
    if-eqz p1, :cond_cd

    .line 191
    .line 192
    invoke-static {p1}, Labxl;->e(Labxu;)Labxp;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-eqz p1, :cond_cd

    .line 197
    .line 198
    invoke-static {p1}, Labxl;->g(Labxq;)Labxs;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-eqz p1, :cond_cd

    .line 203
    .line 204
    iget-object v6, p1, Labxs;->f:Ljava/lang/String;

    .line 205
    .line 206
    :cond_cd
    if-eqz v6, :cond_df

    .line 207
    .line 208
    iget-object p0, p0, Lryf;->d:Landroid/content/Context;

    .line 209
    .line 210
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string v0, "parse(...)"

    .line 215
    .line 216
    invoke-static {p1, v0}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const-string v0, "com.google.android.contacts"

    .line 220
    .line 221
    invoke-virtual {p0, v0, p1, v4}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    .line 222
    .line 223
    .line 224
    :cond_df
    check-cast v3, Lrzm;

    .line 225
    .line 226
    iget-object v0, v3, Lrzm;->a:Ljava/lang/Object;

    .line 227
    .line 228
    return-object v0

    .line 229
    :cond_e4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 230
    .line 231
    const-string p1, "My Calling Card crop failed"

    .line 232
    .line 233
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p0

    .line 237
    :cond_ec
    sget-object v0, Laolu;->a:Laolu;

    .line 238
    .line 239
    iget v1, p0, Lmwq;->b:I

    .line 240
    .line 241
    if-eqz v1, :cond_f8

    .line 242
    .line 243
    iget-object v0, p0, Lmwq;->a:Ljava/lang/Object;

    .line 244
    .line 245
    :try_start_f4
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V
    :try_end_f7
    .catch Laovk; {:try_start_f4 .. :try_end_f7} :catch_168

    .line 246
    .line 247
    .line 248
    goto :goto_12b

    .line 249
    :cond_f8
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    iget-object p1, p0, Lmwq;->e:Ljava/lang/Object;

    .line 253
    .line 254
    iget-object v8, p0, Lmwq;->d:Ljava/lang/Object;

    .line 255
    .line 256
    move-object v1, p1

    .line 257
    check-cast v1, Lhys;

    .line 258
    .line 259
    invoke-virtual {v1, v8}, Lhys;->a(Lhxw;)Ljava/io/File;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    if-eqz v1, :cond_176

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 270
    .line 271
    .line 272
    :try_start_10f
    sget-wide v1, Lhys;->b:J

    .line 273
    .line 274
    new-instance v5, Lblv;

    .line 275
    .line 276
    iget-object v3, p0, Lmwq;->c:Ljava/lang/Object;

    .line 277
    .line 278
    move-object v7, v3

    .line 279
    check-cast v7, Landroid/speech/tts/TextToSpeech;

    .line 280
    .line 281
    move-object v6, p1

    .line 282
    check-cast v6, Lhys;

    .line 283
    .line 284
    const/4 v10, 0x0

    .line 285
    const/4 v11, 0x6

    .line 286
    invoke-direct/range {v5 .. v11}, Lblv;-><init>(Lhys;Landroid/speech/tts/TextToSpeech;Lhxw;Ljava/io/File;Laoln;I)V

    .line 287
    .line 288
    .line 289
    iput-object v9, p0, Lmwq;->a:Ljava/lang/Object;

    .line 290
    .line 291
    iput v4, p0, Lmwq;->b:I

    .line 292
    .line 293
    invoke-static {v1, v2, v5, p0}, Laooh;->L(JLaonn;Laoln;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1
    :try_end_128
    .catch Laovk; {:try_start_10f .. :try_end_128} :catch_168

    .line 297
    if-eq p1, v0, :cond_230

    .line 298
    .line 299
    move-object v0, v9

    .line 300
    :goto_12b
    iget-object p0, p0, Lmwq;->e:Ljava/lang/Object;

    .line 301
    .line 302
    move-object p1, v0

    .line 303
    check-cast p1, Ljava/io/File;

    .line 304
    .line 305
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 306
    .line 307
    .line 308
    move-result-wide v1

    .line 309
    const-wide/16 v3, 0x0

    .line 310
    .line 311
    cmp-long v1, v1, v3

    .line 312
    .line 313
    if-eqz v1, :cond_154

    .line 314
    .line 315
    sget-object p0, Lhys;->a:Laimz;

    .line 316
    .line 317
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    const/16 p1, 0x5f

    .line 322
    .line 323
    const-string v1, "TtsFileProvider.kt"

    .line 324
    .line 325
    const-string v2, "com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider"

    .line 326
    .line 327
    const-string v3, "innerGetTtsAudioFileUsingTtsInstance$<anonymous>"

    .line 328
    .line 329
    invoke-interface {p0, v2, v3, p1, v1}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    check-cast p0, Laimw;

    .line 334
    .line 335
    const-string p1, "tts file synthesis completed"

    .line 336
    .line 337
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    return-object v0

    .line 341
    :cond_154
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 342
    .line 343
    .line 344
    check-cast p0, Lhys;

    .line 345
    .line 346
    iget-object p0, p0, Lhys;->e:Lrlv;

    .line 347
    .line 348
    sget-object p1, Lrmx;->nm:Lrmx;

    .line 349
    .line 350
    invoke-interface {p0, p1}, Lrlv;->o(Lrmx;)V

    .line 351
    .line 352
    .line 353
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 354
    .line 355
    const-string p1, "generated 0 size audio file"

    .line 356
    .line 357
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw p0

    .line 361
    :catch_168
    move-exception v0

    .line 362
    move-object p1, v0

    .line 363
    iget-object p0, p0, Lmwq;->e:Ljava/lang/Object;

    .line 364
    .line 365
    sget-object v0, Lrmx;->nj:Lrmx;

    .line 366
    .line 367
    check-cast p0, Lhys;

    .line 368
    .line 369
    iget-object p0, p0, Lhys;->e:Lrlv;

    .line 370
    .line 371
    invoke-interface {p0, v0}, Lrlv;->o(Lrmx;)V

    .line 372
    .line 373
    .line 374
    throw p1

    .line 375
    :cond_176
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 376
    .line 377
    const-string p1, "Required value was null."

    .line 378
    .line 379
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw p0

    .line 383
    :cond_17e
    sget-object v0, Laolu;->a:Laolu;

    .line 384
    .line 385
    iget v5, p0, Lmwq;->b:I

    .line 386
    .line 387
    if-eqz v5, :cond_19f

    .line 388
    .line 389
    if-eq v5, v4, :cond_19b

    .line 390
    .line 391
    if-eq v5, v3, :cond_197

    .line 392
    .line 393
    if-eq v5, v2, :cond_191

    .line 394
    .line 395
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    if-eq v5, v1, :cond_209

    .line 399
    .line 400
    goto/16 :goto_22c

    .line 401
    .line 402
    :cond_191
    iget-object p0, p0, Lmwq;->a:Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    goto :goto_1e1

    .line 408
    :cond_197
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    goto :goto_1c2

    .line 412
    :cond_19b
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    goto :goto_1ae

    .line 416
    :cond_19f
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    iget-object p1, p0, Lmwq;->c:Ljava/lang/Object;

    .line 420
    .line 421
    iput v4, p0, Lmwq;->b:I

    .line 422
    .line 423
    check-cast p1, Logj;

    .line 424
    .line 425
    invoke-virtual {p1, p0}, Logj;->a(Laoln;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    if-eq p1, v0, :cond_230

    .line 430
    .line 431
    :goto_1ae
    check-cast p1, Lnmu;

    .line 432
    .line 433
    iget p1, p1, Lnmu;->b:I

    .line 434
    .line 435
    and-int/lit8 p1, p1, 0x20

    .line 436
    .line 437
    if-eqz p1, :cond_21d

    .line 438
    .line 439
    iget-object p1, p0, Lmwq;->c:Ljava/lang/Object;

    .line 440
    .line 441
    iput v3, p0, Lmwq;->b:I

    .line 442
    .line 443
    check-cast p1, Logj;

    .line 444
    .line 445
    invoke-virtual {p1, p0}, Logj;->a(Laoln;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    if-eq p1, v0, :cond_230

    .line 450
    .line 451
    :goto_1c2
    check-cast p1, Lnmu;

    .line 452
    .line 453
    iget-object p1, p1, Lnmu;->k:Lnmt;

    .line 454
    .line 455
    if-nez p1, :cond_1ca

    .line 456
    .line 457
    sget-object p1, Lnmt;->a:Lnmt;

    .line 458
    .line 459
    :cond_1ca
    iget-boolean p1, p1, Lnmt;->d:Z

    .line 460
    .line 461
    if-eqz p1, :cond_1fd

    .line 462
    .line 463
    iget-object p1, p0, Lmwq;->d:Ljava/lang/Object;

    .line 464
    .line 465
    iget-object v1, p0, Lmwq;->c:Ljava/lang/Object;

    .line 466
    .line 467
    iput-object p1, p0, Lmwq;->a:Ljava/lang/Object;

    .line 468
    .line 469
    iput v2, p0, Lmwq;->b:I

    .line 470
    .line 471
    check-cast v1, Logj;

    .line 472
    .line 473
    invoke-virtual {v1, p0}, Logj;->a(Laoln;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    if-eq p0, v0, :cond_230

    .line 478
    .line 479
    move-object v12, p1

    .line 480
    move-object p1, p0

    .line 481
    move-object p0, v12

    .line 482
    :goto_1e1
    check-cast p1, Lnmu;

    .line 483
    .line 484
    iget-object p1, p1, Lnmu;->k:Lnmt;

    .line 485
    .line 486
    if-nez p1, :cond_1e9

    .line 487
    .line 488
    sget-object p1, Lnmt;->a:Lnmt;

    .line 489
    .line 490
    :cond_1e9
    iget-object p1, p1, Lnmt;->c:Lalwf;

    .line 491
    .line 492
    if-nez p1, :cond_1ef

    .line 493
    .line 494
    sget-object p1, Lalwf;->a:Lalwf;

    .line 495
    .line 496
    :cond_1ef
    iget-object p1, p1, Lalwf;->c:Ljava/lang/String;

    .line 497
    .line 498
    const-string v0, "getText(...)"

    .line 499
    .line 500
    invoke-static {p1, v0}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    check-cast p0, Lkaw;

    .line 504
    .line 505
    invoke-virtual {p0, p1}, Lkaw;->B(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    goto :goto_230

    .line 510
    :cond_1fd
    iget-object p1, p0, Lmwq;->c:Ljava/lang/Object;

    .line 511
    .line 512
    iput v1, p0, Lmwq;->b:I

    .line 513
    .line 514
    check-cast p1, Logj;

    .line 515
    .line 516
    invoke-virtual {p1, p0}, Logj;->a(Laoln;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    if-eq p1, v0, :cond_230

    .line 521
    .line 522
    :cond_209
    check-cast p1, Lnmu;

    .line 523
    .line 524
    iget-object p0, p1, Lnmu;->k:Lnmt;

    .line 525
    .line 526
    if-nez p0, :cond_211

    .line 527
    .line 528
    sget-object p0, Lnmt;->a:Lnmt;

    .line 529
    .line 530
    :cond_211
    iget-object p0, p0, Lnmt;->c:Lalwf;

    .line 531
    .line 532
    if-nez p0, :cond_217

    .line 533
    .line 534
    sget-object p0, Lalwf;->a:Lalwf;

    .line 535
    .line 536
    :cond_217
    iget-object v0, p0, Lalwf;->c:Ljava/lang/String;

    .line 537
    .line 538
    invoke-static {v0}, Laooh;->c(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    goto :goto_230

    .line 542
    :cond_21d
    iget-object p1, p0, Lmwq;->e:Ljava/lang/Object;

    .line 543
    .line 544
    invoke-interface {p1}, Lamzg;->d()Lajcq;

    .line 545
    .line 546
    .line 547
    move-result-object p1

    .line 548
    const/4 v1, 0x5

    .line 549
    iput v1, p0, Lmwq;->b:I

    .line 550
    .line 551
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    if-eq p1, v0, :cond_230

    .line 556
    .line 557
    :goto_22c
    check-cast p1, Lqin;

    .line 558
    .line 559
    iget-object v0, p1, Lqin;->c:Ljava/lang/CharSequence;

    .line 560
    .line 561
    :cond_230
    :goto_230
    return-object v0
.end method
