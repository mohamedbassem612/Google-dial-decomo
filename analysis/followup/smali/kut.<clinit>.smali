.method static constructor <clinit>()V
    .registers 15

    .line 1
    new-instance v0, Lkut;

    .line 2
    .line 3
    const v1, 0x7f13005c

    .line 4
    .line 5
    .line 6
    const-string v2, "AR_XA_START"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const-string v4, "starting_voice-ar_XA.m4a"

    .line 10
    .line 11
    invoke-direct {v0, v2, v3, v1, v4}, Lkut;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lkut;->a:Lkut;

    .line 15
    .line 16
    new-instance v1, Lkut;

    .line 17
    .line 18
    const v2, 0x7f13003e

    .line 19
    .line 20
    .line 21
    const-string v4, "AR_XA_END"

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    const-string v6, "ending_voice-ar_XA.m4a"

    .line 25
    .line 26
    invoke-direct {v1, v4, v5, v2, v6}, Lkut;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lkut;->b:Lkut;

    .line 30
    .line 31
    new-instance v2, Lkut;

    .line 32
    .line 33
    const v4, 0x7f13005d

    .line 34
    .line 35
    .line 36
    const-string v6, "BEEP_SOUND_START"

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    const-string v8, "starting_voice-beep_sound.ogg"

    .line 40
    .line 41
    invoke-direct {v2, v6, v7, v4, v8}, Lkut;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v2, Lkut;->c:Lkut;

    .line 45
    .line 46
    new-instance v4, Lkut;

    .line 47
    .line 48
    const v6, 0x7f13003f

    .line 49
    .line 50
    .line 51
    const-string v8, "BEEP_SOUND_END"

    .line 52
    .line 53
    const/4 v9, 0x3

    .line 54
    const-string v10, "ending_voice-beep_sound.ogg"

    .line 55
    .line 56
    invoke-direct {v4, v8, v9, v6, v10}, Lkut;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lkut;->d:Lkut;

    .line 60
    .line 61
    new-instance v6, Lkut;

    .line 62
    .line 63
    const v8, 0x7f13005e

    .line 64
    .line 65
    .line 66
    const-string v10, "MY_MM_START"

    .line 67
    .line 68
    const/4 v11, 0x4

    .line 69
    const-string v12, "starting_voice-my_MM.m4a"

    .line 70
    .line 71
    invoke-direct {v6, v10, v11, v8, v12}, Lkut;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sput-object v6, Lkut;->e:Lkut;

    .line 75
    .line 76
    new-instance v8, Lkut;

    .line 77
    .line 78
    const v10, 0x7f130040

    .line 79
    .line 80
    .line 81
    const-string v12, "MY_MM_END"

    .line 82
    .line 83
    const/4 v13, 0x5

    .line 84
    const-string v14, "ending_voice-my_MM.m4a"

    .line 85
    .line 86
    invoke-direct {v8, v12, v13, v10, v14}, Lkut;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sput-object v8, Lkut;->f:Lkut;

    .line 90
    .line 91
    const/4 v10, 0x6

    .line 92
    new-array v10, v10, [Lkut;

    .line 93
    .line 94
    aput-object v0, v10, v3

    .line 95
    .line 96
    aput-object v1, v10, v5

    .line 97
    .line 98
    aput-object v2, v10, v7

    .line 99
    .line 100
    aput-object v4, v10, v9

    .line 101
    .line 102
    aput-object v6, v10, v11

    .line 103
    .line 104
    aput-object v8, v10, v13

    .line 105
    .line 106
    sput-object v10, Lkut;->i:[Lkut;

    .line 107
    .line 108
    invoke-static {v10}, Lajsz;->am([Ljava/lang/Enum;)Laomi;

    .line 109
    .line 110
    .line 111
    return-void
.end method
