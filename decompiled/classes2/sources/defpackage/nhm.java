package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nhm extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    final /* synthetic */ defpackage.nje g;
    final /* synthetic */ defpackage.nhq h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhm(defpackage.nje njeVar, defpackage.nhq nhqVar, aoln aolnVar) {
        super(2, aolnVar);
        this.g = njeVar;
        this.h = nhqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x035e A[Catch: IllegalStateException -> 0x0363, all -> 0x076b, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0363, blocks: (B:98:0x033d, B:100:0x035e), top: B:211:0x033d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x038f A[Catch: all -> 0x076b, PHI: r3 r7 r8 r11
      0x038f: PHI (r3v33 apdp) = (r3v30 apdp), (r3v32 apdp), (r3v35 apdp) binds: [B:101:0x0360, B:104:0x0364, B:55:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r7v14 java.lang.Object) = (r7v11 java.lang.Object), (r7v13 java.lang.Object), (r7v15 java.lang.Object) binds: [B:101:0x0360, B:104:0x0364, B:55:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r8v24 nje) = (r8v20 nje), (r8v23 nje), (r8v26 nje) binds: [B:101:0x0360, B:104:0x0364, B:55:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r11v26 aoss) = (r11v22 aoss), (r11v25 aoss), (r11v28 aoss) binds: [B:101:0x0360, B:104:0x0364, B:55:0x0183] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0393 A[Catch: all -> 0x076b, TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0399  */
    /* JADX WARN: Code duplicated, block: B:113:0x03d1 A[Catch: all -> 0x076b, TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x03f9 A[DONT_INVERT, PHI: r0 r3 r4 r8 r11
      0x03f9: PHI (r0v68 java.lang.Object) = (r0v66 java.lang.Object), (r0v70 java.lang.Object) binds: [B:117:0x03f7, B:47:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x03f9: PHI (r3v40 apdp) = (r3v36 apdp), (r3v43 apdp) binds: [B:117:0x03f7, B:47:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x03f9: PHI (r4v8 java.lang.Object) = (r4v7 java.lang.Object), (r4v14 java.lang.Object) binds: [B:117:0x03f7, B:47:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x03f9: PHI (r8v31 nje) = (r8v27 nje), (r8v34 nje) binds: [B:117:0x03f7, B:47:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x03f9: PHI (r11v31 aoss) = (r11v29 aoss), (r11v32 aoss) binds: [B:117:0x03f7, B:47:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x03fb A[Catch: all -> 0x076b, TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x040d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0427  */
    /* JADX WARN: Code duplicated, block: B:126:0x0460  */
    /* JADX WARN: Code duplicated, block: B:129:0x049d  */
    /* JADX WARN: Code duplicated, block: B:132:0x04c3 A[Catch: all -> 0x0583, TRY_LEAVE, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:137:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0500 A[Catch: all -> 0x0583, TRY_ENTER, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0512 A[Catch: all -> 0x0583, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x051d  */
    /* JADX WARN: Code duplicated, block: B:146:0x052a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x052c A[Catch: all -> 0x0583, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0533 A[Catch: all -> 0x0583, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0547 A[Catch: all -> 0x0583, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x054e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0587  */
    /* JADX WARN: Code duplicated, block: B:161:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:164:0x05ab A[Catch: all -> 0x076b, TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:168:0x05fa A[Catch: all -> 0x076b, PHI: r0 r3 r6 r10 r11 r12
      0x05fa: PHI (r0v96 ihu) = (r0v92 ihu), (r0v109 ihu) binds: [B:163:0x05a9, B:167:0x05da] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r3v80 apdp) = (r3v132 apdp), (r3v133 apdp) binds: [B:163:0x05a9, B:167:0x05da] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r6v8 java.lang.Object) = (r6v3 java.lang.Object), (r6v10 java.lang.Object) binds: [B:163:0x05a9, B:167:0x05da] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r10v70 nje) = (r10v66 nje), (r10v73 nje) binds: [B:163:0x05a9, B:167:0x05da] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r11v62 boolean) = (r11v60 boolean), (r11v63 boolean) binds: [B:163:0x05a9, B:167:0x05da] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r12v42 aoss) = (r12v40 aoss), (r12v44 aoss) binds: [B:163:0x05a9, B:167:0x05da] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0664  */
    /* JADX WARN: Code duplicated, block: B:175:0x0686 A[Catch: all -> 0x0583, TRY_ENTER, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x06b0 A[Catch: all -> 0x0583, TryCatch #3 {all -> 0x0583, blocks: (B:155:0x057e, B:32:0x00d3, B:139:0x0500, B:141:0x0512, B:143:0x051e, B:144:0x0526, B:147:0x052c, B:149:0x0533, B:151:0x0547, B:153:0x054f, B:159:0x0588, B:175:0x0686, B:177:0x06b0, B:178:0x06b2, B:35:0x00ef, B:130:0x04a3, B:132:0x04c3, B:43:0x0131), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:183:0x06e5 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x0046, B:181:0x06d8, B:183:0x06e5, B:184:0x06e7), top: B:208:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:190:0x0719 A[Catch: all -> 0x076b, PHI: r0 r3
      0x0719: PHI (r0v131 java.lang.Object) = (r0v127 java.lang.Object), (r0v133 java.lang.Object) binds: [B:189:0x0717, B:6:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r3v112 apdp) = (r3v123 apdp), (r3v124 apdp) binds: [B:189:0x0717, B:6:0x0028] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x072a A[Catch: all -> 0x076b, TryCatch #8 {all -> 0x076b, blocks: (B:200:0x075a, B:201:0x075d, B:202:0x0763, B:6:0x0028, B:190:0x0719, B:192:0x072a, B:194:0x0733, B:196:0x073c, B:197:0x0748, B:9:0x0035, B:187:0x06f9, B:188:0x0703, B:17:0x005c, B:20:0x006d, B:173:0x0676, B:23:0x007b, B:171:0x0665, B:167:0x05da, B:168:0x05fa, B:162:0x05a7, B:164:0x05ab, B:135:0x04f0, B:127:0x0467, B:124:0x042b, B:119:0x03fb, B:121:0x040e, B:116:0x03e3, B:105:0x038f, B:107:0x0393, B:111:0x039a, B:113:0x03d1, B:104:0x0364, B:98:0x033d, B:100:0x035e), top: B:210:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0759  */
    /* JADX WARN: Code duplicated, block: B:77:0x0272 A[Catch: all -> 0x016a, TryCatch #6 {all -> 0x016a, blocks: (B:26:0x0097, B:29:0x00b1, B:46:0x014a, B:49:0x0162, B:83:0x02b4, B:85:0x02c5, B:87:0x02c9, B:89:0x02cd, B:92:0x02db, B:93:0x02f4, B:95:0x0335, B:80:0x028a, B:75:0x022b, B:77:0x0272), top: B:210:0x0012, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0288 A[DONT_INVERT, PHI: r0 r3 r7 r8 r12
      0x0288: PHI (r0v13 java.lang.Object) = (r0v10 java.lang.Object), (r0v14 java.lang.Object) binds: [B:78:0x0286, B:68:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r3v17 java.lang.Object) = (r3v15 java.lang.Object), (r3v26 java.lang.Object) binds: [B:78:0x0286, B:68:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r7v6 apdp) = (r7v3 apdp), (r7v7 apdp) binds: [B:78:0x0286, B:68:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r8v14 nje) = (r8v10 nje), (r8v16 nje) binds: [B:78:0x0286, B:68:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r12v9 aoss) = (r12v5 aoss), (r12v11 aoss) binds: [B:78:0x0286, B:68:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x028a A[Catch: all -> 0x016a, TryCatch #6 {all -> 0x016a, blocks: (B:26:0x0097, B:29:0x00b1, B:46:0x014a, B:49:0x0162, B:83:0x02b4, B:85:0x02c5, B:87:0x02c9, B:89:0x02cd, B:92:0x02db, B:93:0x02f4, B:95:0x0335, B:80:0x028a, B:75:0x022b, B:77:0x0272), top: B:210:0x0012, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02b3 A[PHI: r0 r7 r8 r12
      0x02b3: PHI (r0v12 java.lang.Object) = (r0v10 java.lang.Object), (r0v13 java.lang.Object), (r0v13 java.lang.Object) binds: [B:76:0x0270, B:79:0x0288, B:81:0x02b1] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r7v5 apdp) = (r7v3 apdp), (r7v6 apdp), (r7v6 apdp) binds: [B:76:0x0270, B:79:0x0288, B:81:0x02b1] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r8v13 nje) = (r8v10 nje), (r8v14 nje), (r8v14 nje) binds: [B:76:0x0270, B:79:0x0288, B:81:0x02b1] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r12v8 aoss) = (r12v5 aoss), (r12v9 aoss), (r12v9 aoss) binds: [B:76:0x0270, B:79:0x0288, B:81:0x02b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02c5 A[Catch: all -> 0x016a, TryCatch #6 {all -> 0x016a, blocks: (B:26:0x0097, B:29:0x00b1, B:46:0x014a, B:49:0x0162, B:83:0x02b4, B:85:0x02c5, B:87:0x02c9, B:89:0x02cd, B:92:0x02db, B:93:0x02f4, B:95:0x0335, B:80:0x028a, B:75:0x022b, B:77:0x0272), top: B:210:0x0012, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0335 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #6 {all -> 0x016a, blocks: (B:26:0x0097, B:29:0x00b1, B:46:0x014a, B:49:0x0162, B:83:0x02b4, B:85:0x02c5, B:87:0x02c9, B:89:0x02cd, B:92:0x02db, B:93:0x02f4, B:95:0x0335, B:80:0x028a, B:75:0x022b, B:77:0x0272), top: B:210:0x0012, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0339  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03e0, code lost:
    
        if (r10.a(r18) != r2) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x057c, code lost:
    
        if (r3 != r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0674, code lost:
    
        if (((defpackage.nhq) r0).m(r18) != r2) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b1, code lost:
    
        if (r3.b(r18) != r2) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01d3: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:468), block:B:70:0x01d3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01a4: MOVE (r3 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:421), block:B:62:0x01a4 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0584: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:1413), block:B:157:0x0584 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v115, types: [apdp] */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhm.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.nhm nhmVar = new defpackage.nhm(this.g, this.h, aolnVar);
        nhmVar.i = obj;
        return nhmVar;
    }
}
