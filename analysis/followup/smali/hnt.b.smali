.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    .line 1
    iget v0, p0, Lhnt;->$cid:I

    .line 2
    .line 3
    const-string v1, "await(...)"

    .line 4
    .line 5
    const-string v2, "playbackStartedFuture(...)"

    .line 6
    .line 7
    const-string v3, "durationMillis(...)"

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const-string v5, "playbackEndedFuture(...)"

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v0, :pswitch_data_322

    .line 17
    .line 18
    .line 19
    sget-object v0, Laolu;->a:Laolu;

    .line 20
    .line 21
    iget v1, p0, Lhnt;->a:I

    .line 22
    .line 23
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz v1, :cond_30c

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_1c
    sget-object v0, Laolu;->a:Laolu;

    .line 30
    .line 31
    iget v1, p0, Lhnt;->a:I

    .line 32
    .line 33
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    if-nez v1, :cond_321

    .line 37
    .line 38
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lizg;

    .line 41
    .line 42
    invoke-virtual {p1}, Lizg;->n()Ljava/util/Locale;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput v8, p0, Lhnt;->a:I

    .line 47
    .line 48
    iget-object p1, p1, Lizg;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lhyo;

    .line 51
    .line 52
    invoke-virtual {p1, v1, p0}, Lhyo;->a(Ljava/util/Locale;Laoln;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_321

    .line 57
    .line 58
    goto/16 :goto_320

    .line 59
    .line 60
    :pswitch_3b
    sget-object v0, Laolu;->a:Laolu;

    .line 61
    .line 62
    iget v1, p0, Lhnt;->a:I

    .line 63
    .line 64
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    if-nez v1, :cond_321

    .line 68
    .line 69
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 70
    .line 71
    iput v8, p0, Lhnt;->a:I

    .line 72
    .line 73
    check-cast p1, Lhyo;

    .line 74
    .line 75
    invoke-virtual {p1, p0}, Lhyo;->c(Laoln;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_321

    .line 80
    .line 81
    goto/16 :goto_320

    .line 82
    .line 83
    :pswitch_52
    sget-object v0, Laolu;->a:Laolu;

    .line 84
    .line 85
    iget v1, p0, Lhnt;->a:I

    .line 86
    .line 87
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    if-nez v1, :cond_321

    .line 91
    .line 92
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-interface {p1}, Lhxf;->b()Lajcq;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1, v5}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput v8, p0, Lhnt;->a:I

    .line 102
    .line 103
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_321

    .line 108
    .line 109
    goto/16 :goto_320

    .line 110
    .line 111
    :pswitch_6e
    sget-object v0, Laolu;->a:Laolu;

    .line 112
    .line 113
    iget v1, p0, Lhnt;->a:I

    .line 114
    .line 115
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    if-nez v1, :cond_bb

    .line 119
    .line 120
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lhxj;

    .line 123
    .line 124
    iget-object v1, p1, Lhxj;->b:Lajcq;

    .line 125
    .line 126
    invoke-interface {v1}, Lajcq;->isCancelled()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    const-string v2, "startAudio$<anonymous>"

    .line 131
    .line 132
    const-string v3, "com/android/dialer/audio/audioinjector/AudioInjector$QueuedPlaybackSession"

    .line 133
    .line 134
    const-string v4, "AudioInjector.kt"

    .line 135
    .line 136
    if-eqz v1, :cond_9e

    .line 137
    .line 138
    sget-object p0, Lhxv;->a:Laimz;

    .line 139
    .line 140
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    const/16 p1, 0x1a6

    .line 145
    .line 146
    invoke-interface {p0, v3, v2, p1, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Laimw;

    .line 151
    .line 152
    const-string p1, "skipping playback since it\'s already cancelled"

    .line 153
    .line 154
    invoke-interface {p0, p1}, Laimw;->v(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    move-object p1, v7

    .line 158
    return-object p1

    .line 159
    :cond_9e
    sget-object v1, Lhxv;->a:Laimz;

    .line 160
    .line 161
    invoke-virtual {v1}, Laimp;->b()Lainm;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const/16 v5, 0x1aa

    .line 166
    .line 167
    invoke-interface {v1, v3, v2, v5, v4}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Laimw;

    .line 172
    .line 173
    const-string v2, "starting playback"

    .line 174
    .line 175
    invoke-interface {v1, v2}, Laimw;->v(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p1, Lhxj;->a:Laonj;

    .line 179
    .line 180
    iput v8, p0, Lhnt;->a:I

    .line 181
    .line 182
    invoke-interface {p1, p0}, Laonj;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-eq p1, v0, :cond_320

    .line 187
    .line 188
    :cond_bb
    iget-object p0, p0, Lhnt;->b:Ljava/lang/Object;

    .line 189
    .line 190
    move-object v0, p1

    .line 191
    check-cast v0, Lhxf;

    .line 192
    .line 193
    check-cast p0, Lhxj;

    .line 194
    .line 195
    iget-object v1, p0, Lhxj;->c:Ldsd;

    .line 196
    .line 197
    if-eqz v1, :cond_c9

    .line 198
    .line 199
    invoke-virtual {v1, v0}, Ldsd;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_c9
    invoke-static {p0}, Lhxj;->f(Lhxj;)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :pswitch_cd
    sget-object v0, Laolu;->a:Laolu;

    .line 207
    .line 208
    iget v1, p0, Lhnt;->a:I

    .line 209
    .line 210
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    if-eqz v1, :cond_d9

    .line 214
    .line 215
    if-eq v1, v8, :cond_e7

    .line 216
    .line 217
    return-object p1

    .line 218
    :cond_d9
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 219
    .line 220
    iput v8, p0, Lhnt;->a:I

    .line 221
    .line 222
    check-cast p1, Lhxj;

    .line 223
    .line 224
    iget-object p1, p1, Lhxj;->b:Lajcq;

    .line 225
    .line 226
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    if-eq p1, v0, :cond_320

    .line 231
    .line 232
    :cond_e7
    check-cast p1, Lhxf;

    .line 233
    .line 234
    invoke-interface {p1}, Lhxf;->c()Lajcq;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-static {p1, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    iput v6, p0, Lhnt;->a:I

    .line 242
    .line 243
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-ne p1, v0, :cond_321

    .line 248
    .line 249
    goto/16 :goto_320

    .line 250
    .line 251
    :pswitch_fa
    sget-object v0, Laolu;->a:Laolu;

    .line 252
    .line 253
    iget v2, p0, Lhnt;->a:I

    .line 254
    .line 255
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    if-eqz v2, :cond_106

    .line 259
    .line 260
    if-eq v2, v8, :cond_114

    .line 261
    .line 262
    goto :goto_125

    .line 263
    :cond_106
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 264
    .line 265
    iput v8, p0, Lhnt;->a:I

    .line 266
    .line 267
    check-cast p1, Lhxj;

    .line 268
    .line 269
    iget-object p1, p1, Lhxj;->b:Lajcq;

    .line 270
    .line 271
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    if-eq p1, v0, :cond_320

    .line 276
    .line 277
    :cond_114
    check-cast p1, Lhxf;

    .line 278
    .line 279
    invoke-interface {p1}, Lhxf;->b()Lajcq;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-static {p1, v5}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iput v6, p0, Lhnt;->a:I

    .line 287
    .line 288
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    if-eq p1, v0, :cond_320

    .line 293
    .line 294
    :goto_125
    invoke-static {p1, v1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    return-object p1

    .line 298
    :pswitch_129
    sget-object v0, Laolu;->a:Laolu;

    .line 299
    .line 300
    iget v2, p0, Lhnt;->a:I

    .line 301
    .line 302
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    if-eqz v2, :cond_135

    .line 306
    .line 307
    if-eq v2, v8, :cond_143

    .line 308
    .line 309
    goto :goto_154

    .line 310
    :cond_135
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 311
    .line 312
    iput v8, p0, Lhnt;->a:I

    .line 313
    .line 314
    check-cast p1, Lhxj;

    .line 315
    .line 316
    iget-object p1, p1, Lhxj;->b:Lajcq;

    .line 317
    .line 318
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    if-eq p1, v0, :cond_320

    .line 323
    .line 324
    :cond_143
    check-cast p1, Lhxf;

    .line 325
    .line 326
    invoke-interface {p1}, Lhxf;->a()Lajcq;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-static {p1, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iput v6, p0, Lhnt;->a:I

    .line 334
    .line 335
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    if-eq p1, v0, :cond_320

    .line 340
    .line 341
    :goto_154
    invoke-static {p1, v1}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    return-object p1

    .line 345
    :pswitch_158
    sget-object v0, Laolu;->a:Laolu;

    .line 346
    .line 347
    iget v1, p0, Lhnt;->a:I

    .line 348
    .line 349
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    if-nez v1, :cond_321

    .line 353
    .line 354
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 355
    .line 356
    invoke-interface {p1}, Lhxf;->c()Lajcq;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    invoke-static {p1, v2}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    iput v8, p0, Lhnt;->a:I

    .line 364
    .line 365
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    if-ne p1, v0, :cond_321

    .line 370
    .line 371
    goto/16 :goto_320

    .line 372
    .line 373
    :pswitch_174
    sget-object v0, Laolu;->a:Laolu;

    .line 374
    .line 375
    iget v1, p0, Lhnt;->a:I

    .line 376
    .line 377
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    if-nez v1, :cond_321

    .line 381
    .line 382
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 383
    .line 384
    invoke-interface {p1}, Lhxf;->b()Lajcq;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    invoke-static {p1, v5}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    iput v8, p0, Lhnt;->a:I

    .line 392
    .line 393
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    if-ne p1, v0, :cond_321

    .line 398
    .line 399
    goto/16 :goto_320

    .line 400
    .line 401
    :pswitch_190
    sget-object v0, Laolu;->a:Laolu;

    .line 402
    .line 403
    iget v1, p0, Lhnt;->a:I

    .line 404
    .line 405
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    if-nez v1, :cond_321

    .line 409
    .line 410
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 411
    .line 412
    invoke-interface {p1}, Lhxf;->a()Lajcq;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-static {p1, v3}, Laooh;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    iput v8, p0, Lhnt;->a:I

    .line 420
    .line 421
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    if-ne p1, v0, :cond_321

    .line 426
    .line 427
    goto/16 :goto_320

    .line 428
    .line 429
    :pswitch_1ac
    sget-object v0, Laolu;->a:Laolu;

    .line 430
    .line 431
    iget v1, p0, Lhnt;->a:I

    .line 432
    .line 433
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    if-nez v1, :cond_321

    .line 437
    .line 438
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 439
    .line 440
    new-instance v1, Lhnt;

    .line 441
    .line 442
    check-cast p1, Lhvy;

    .line 443
    .line 444
    invoke-direct {v1, p1, v7, v4}, Lhnt;-><init>(Lhvy;Laoln;I)V

    .line 445
    .line 446
    .line 447
    iput v8, p0, Lhnt;->a:I

    .line 448
    .line 449
    const-wide/16 v2, 0x2710

    .line 450
    .line 451
    invoke-static {v2, v3, v1, p0}, Laooh;->K(JLaonn;Laoln;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    if-ne p1, v0, :cond_321

    .line 456
    .line 457
    goto/16 :goto_320

    .line 458
    .line 459
    :pswitch_1ca
    sget-object v0, Laolu;->a:Laolu;

    .line 460
    .line 461
    iget v1, p0, Lhnt;->a:I

    .line 462
    .line 463
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    if-nez v1, :cond_321

    .line 467
    .line 468
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 469
    .line 470
    iput v8, p0, Lhnt;->a:I

    .line 471
    .line 472
    new-instance v1, Laosc;

    .line 473
    .line 474
    invoke-static {p0}, Lajsz;->ap(Laoln;)Laoln;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    invoke-direct {v1, p0, v8}, Laosc;-><init>(Laoln;I)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1}, Laosc;->z()V

    .line 482
    .line 483
    .line 484
    sget-object p0, Lhvy;->a:Laimz;

    .line 485
    .line 486
    invoke-virtual {p0}, Laimp;->b()Lainm;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    const/16 v2, 0x4e

    .line 491
    .line 492
    const-string v3, "VoiceAssistAudioGeneratorImpl.kt"

    .line 493
    .line 494
    const-string v5, "com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl"

    .line 495
    .line 496
    const-string v6, "setupTts"

    .line 497
    .line 498
    invoke-interface {p0, v5, v6, v2, v3}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    check-cast p0, Laimw;

    .line 503
    .line 504
    const-string v2, "enter"

    .line 505
    .line 506
    invoke-interface {p0, v2}, Laimw;->v(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    new-instance p0, Lhyn;

    .line 510
    .line 511
    check-cast p1, Lhvy;

    .line 512
    .line 513
    invoke-direct {p0, p1, v1, v8}, Lhyn;-><init>(Lhvy;Laosb;I)V

    .line 514
    .line 515
    .line 516
    sget-object v2, Lzih;->a:Laimz;

    .line 517
    .line 518
    sget-object v2, Laols;->a:Laols;

    .line 519
    .line 520
    sget-object v3, Lzih;->b:Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 521
    .line 522
    invoke-interface {v3, v2}, Lkotlinx/coroutines/CoroutineExceptionHandler;->plus(Laolr;)Laolr;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    new-instance v3, Lblj;

    .line 527
    .line 528
    invoke-direct {v3, v7, p1, p0, v4}, Lblj;-><init>(Laoln;Lhvy;Landroid/speech/tts/TextToSpeech$OnInitListener;I)V

    .line 529
    .line 530
    .line 531
    iget-object p0, p1, Lhvy;->c:Laoss;

    .line 532
    .line 533
    invoke-static {p0, v2, v8, v3}, Laoov;->al(Laoss;Laolr;ILaonn;)Laoub;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1}, Laosc;->k()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    if-ne p1, v0, :cond_321

    .line 541
    .line 542
    goto/16 :goto_320

    .line 543
    .line 544
    :pswitch_21f
    sget-object v0, Laolu;->a:Laolu;

    .line 545
    .line 546
    iget v1, p0, Lhnt;->a:I

    .line 547
    .line 548
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    if-nez v1, :cond_321

    .line 552
    .line 553
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 554
    .line 555
    iput v8, p0, Lhnt;->a:I

    .line 556
    .line 557
    check-cast p1, Lhrj;

    .line 558
    .line 559
    invoke-virtual {p1, p0}, Lhrj;->b(Laoln;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    if-ne p1, v0, :cond_321

    .line 564
    .line 565
    goto/16 :goto_320

    .line 566
    .line 567
    :pswitch_236
    sget-object v0, Laolu;->a:Laolu;

    .line 568
    .line 569
    iget v1, p0, Lhnt;->a:I

    .line 570
    .line 571
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    if-nez v1, :cond_24b

    .line 575
    .line 576
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 577
    .line 578
    iput v8, p0, Lhnt;->a:I

    .line 579
    .line 580
    check-cast p1, Lhqa;

    .line 581
    .line 582
    invoke-virtual {p1, p0}, Lhqa;->b(Laoln;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    if-eq p0, v0, :cond_320

    .line 587
    .line 588
    :cond_24b
    sget-object p1, Laojh;->a:Laojh;

    .line 589
    .line 590
    return-object p1

    .line 591
    :pswitch_24e
    sget-object v0, Laolu;->a:Laolu;

    .line 592
    .line 593
    iget v1, p0, Lhnt;->a:I

    .line 594
    .line 595
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    if-eqz v1, :cond_25a

    .line 599
    .line 600
    if-eq v1, v8, :cond_27f

    .line 601
    .line 602
    goto :goto_295

    .line 603
    :cond_25a
    sget-object p1, Lhpw;->a:Laimz;

    .line 604
    .line 605
    invoke-virtual {p1}, Laimp;->b()Lainm;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    const/16 v1, 0x2b

    .line 610
    .line 611
    const-string v2, "CarCallDisconnectedListener.kt"

    .line 612
    .line 613
    const-string v3, "com/android/dialer/androidauto/impl/incall/listener/CarCallDisconnectedListener"

    .line 614
    .line 615
    const-string v4, "onCallDisconnected$<anonymous>"

    .line 616
    .line 617
    invoke-interface {p1, v3, v4, v1, v2}, Lainm;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lainm;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    check-cast p1, Laimw;

    .line 622
    .line 623
    const-string v1, "Emitting to CarCallDisconnected flow."

    .line 624
    .line 625
    invoke-interface {p1, v1}, Laimw;->v(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 629
    .line 630
    iput v8, p0, Lhnt;->a:I

    .line 631
    .line 632
    check-cast p1, Lhpw;

    .line 633
    .line 634
    invoke-virtual {p1, p0}, Lhpw;->b(Laoln;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object p1

    .line 638
    if-eq p1, v0, :cond_320

    .line 639
    .line 640
    :cond_27f
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 641
    .line 642
    iput v6, p0, Lhnt;->a:I

    .line 643
    .line 644
    check-cast p1, Lhpw;

    .line 645
    .line 646
    iget-object p1, p1, Lhpw;->b:Lipc;

    .line 647
    .line 648
    iget-object p1, p1, Lipc;->a:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast p1, Laozj;

    .line 651
    .line 652
    invoke-virtual {p1, v7, p0}, Laozj;->a(Ljava/lang/Object;Laoln;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    if-eq p0, v0, :cond_293

    .line 657
    .line 658
    sget-object p0, Laojh;->a:Laojh;

    .line 659
    .line 660
    :cond_293
    if-eq p0, v0, :cond_320

    .line 661
    .line 662
    :goto_295
    sget-object p1, Laojh;->a:Laojh;

    .line 663
    .line 664
    return-object p1

    .line 665
    :pswitch_298
    sget-object v0, Laolu;->a:Laolu;

    .line 666
    .line 667
    iget v1, p0, Lhnt;->a:I

    .line 668
    .line 669
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    if-nez v1, :cond_2b7

    .line 673
    .line 674
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 675
    .line 676
    iput v8, p0, Lhnt;->a:I

    .line 677
    .line 678
    check-cast p1, Lhpt;

    .line 679
    .line 680
    iget-object p1, p1, Lhpt;->a:Lipc;

    .line 681
    .line 682
    iget-object p1, p1, Lipc;->a:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast p1, Laozj;

    .line 685
    .line 686
    invoke-virtual {p1, v7, p0}, Laozj;->a(Ljava/lang/Object;Laoln;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    if-eq p0, v0, :cond_2b5

    .line 691
    .line 692
    sget-object p0, Laojh;->a:Laojh;

    .line 693
    .line 694
    :cond_2b5
    if-eq p0, v0, :cond_320

    .line 695
    .line 696
    :cond_2b7
    sget-object p1, Laojh;->a:Laojh;

    .line 697
    .line 698
    goto :goto_321

    .line 699
    :pswitch_2ba
    sget-object v0, Laolu;->a:Laolu;

    .line 700
    .line 701
    iget v1, p0, Lhnt;->a:I

    .line 702
    .line 703
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    if-nez v1, :cond_321

    .line 707
    .line 708
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 709
    .line 710
    iput v8, p0, Lhnt;->a:I

    .line 711
    .line 712
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object p1

    .line 716
    if-ne p1, v0, :cond_321

    .line 717
    .line 718
    goto :goto_320

    .line 719
    :pswitch_2ce
    sget-object v0, Laolu;->a:Laolu;

    .line 720
    .line 721
    iget v1, p0, Lhnt;->a:I

    .line 722
    .line 723
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    if-nez v1, :cond_321

    .line 727
    .line 728
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 729
    .line 730
    iput v8, p0, Lhnt;->a:I

    .line 731
    .line 732
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    if-ne p1, v0, :cond_321

    .line 737
    .line 738
    goto :goto_320

    .line 739
    :pswitch_2e2
    sget-object v0, Laolu;->a:Laolu;

    .line 740
    .line 741
    iget v1, p0, Lhnt;->a:I

    .line 742
    .line 743
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    if-nez v1, :cond_321

    .line 747
    .line 748
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 749
    .line 750
    iput v8, p0, Lhnt;->a:I

    .line 751
    .line 752
    invoke-static {p1, p0}, Laosv;->D(Lajcq;Laoln;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object p1

    .line 756
    if-ne p1, v0, :cond_321

    .line 757
    .line 758
    goto :goto_320

    .line 759
    :pswitch_2f6
    sget-object v0, Laolu;->a:Laolu;

    .line 760
    .line 761
    iget v1, p0, Lhnt;->a:I

    .line 762
    .line 763
    invoke-static {p1}, Laooc;->af(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    if-nez v1, :cond_321

    .line 767
    .line 768
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 769
    .line 770
    iput v8, p0, Lhnt;->a:I

    .line 771
    .line 772
    check-cast p1, Lhnx;

    .line 773
    .line 774
    invoke-virtual {p1, p0}, Lhnx;->b(Laoln;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object p1

    .line 778
    if-ne p1, v0, :cond_321

    .line 779
    .line 780
    goto :goto_320

    .line 781
    :cond_30c
    iget-object p1, p0, Lhnt;->b:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast p1, Lizg;

    .line 784
    .line 785
    invoke-virtual {p1}, Lizg;->n()Ljava/util/Locale;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    iput v8, p0, Lhnt;->a:I

    .line 790
    .line 791
    iget-object p1, p1, Lizg;->a:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast p1, Lhyo;

    .line 794
    .line 795
    invoke-virtual {p1, v1, p0}, Lhyo;->b(Ljava/util/Locale;Laoln;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object p1

    .line 799
    if-ne p1, v0, :cond_321

    .line 800
    .line 801
    :cond_320
    :goto_320
    move-object p1, v0

    .line 802
    :cond_321
    :goto_321
    return-object p1

    .line 803
    :pswitch_data_322
    .packed-switch 0x0
        :pswitch_2f6
        :pswitch_2e2
        :pswitch_2ce
        :pswitch_2ba
        :pswitch_298
        :pswitch_24e
        :pswitch_236
        :pswitch_21f
        :pswitch_1ca
        :pswitch_1ac
        :pswitch_190
        :pswitch_174
        :pswitch_158
        :pswitch_129
        :pswitch_fa
        :pswitch_cd
        :pswitch_6e
        :pswitch_52
        :pswitch_3b
        :pswitch_1c
    .end packed-switch
.end method
