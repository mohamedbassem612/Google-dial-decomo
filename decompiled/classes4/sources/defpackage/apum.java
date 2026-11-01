package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apum {
    private static java.lang.String a;
    private static final java.lang.Object b = new java.lang.Object();
    private static uzx c;

    /* JADX WARN: Code duplicated, block: B:142:0x01f7 A[Catch: all -> 0x03e3, TryCatch #3 {all -> 0x03e3, blocks: (B:16:0x0028, B:19:0x0039, B:142:0x01f7, B:143:0x0203, B:253:0x03a1, B:259:0x03bd, B:260:0x03d1, B:270:0x03e2, B:269:0x03df, B:21:0x0044, B:25:0x0063, B:30:0x0071, B:72:0x0146, B:120:0x01c4, B:122:0x01cc, B:118:0x01be, B:130:0x01e2, B:129:0x01df, B:28:0x006c, B:137:0x01ed, B:136:0x01ea, B:139:0x01ef, B:144:0x0210, B:145:0x0227, B:147:0x022e, B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e, B:250:0x0378, B:251:0x0399, B:252:0x039a, B:266:0x03da), top: B:286:0x0028, outer: #9, inners: #5, #14, #20 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x022e A[Catch: all -> 0x03d8, TRY_LEAVE, TryCatch #14 {all -> 0x03d8, blocks: (B:144:0x0210, B:145:0x0227, B:147:0x022e, B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e, B:250:0x0378, B:251:0x0399, B:252:0x039a), top: B:294:0x0210, outer: #3, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0246 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0257 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x025f A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0279 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x028c A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x028f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0293 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0296  */
    /* JADX WARN: Code duplicated, block: B:177:0x029a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x02a3 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, LOOP:2: B:168:0x0282->B:179:0x02a3, LOOP_END, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x02b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x02b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:189:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:190:0x02be  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:194:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:197:0x02cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x02df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:212:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:213:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:215:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:216:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:219:0x0300  */
    /* JADX WARN: Code duplicated, block: B:220:0x0304 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0309 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x030e A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0314 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x031c A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0325 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x032a A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0333  */
    /* JADX WARN: Code duplicated, block: B:234:0x0338 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x033c A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0345  */
    /* JADX WARN: Code duplicated, block: B:239:0x034b A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x034f A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x0358  */
    /* JADX WARN: Code duplicated, block: B:247:0x0367 A[Catch: RuntimeException -> 0x0377, all -> 0x03d8, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0377, blocks: (B:148:0x0234, B:149:0x0240, B:151:0x0246, B:153:0x024e, B:155:0x0252, B:157:0x0257, B:159:0x025f, B:161:0x0269, B:165:0x0274, B:167:0x0279, B:168:0x0282, B:171:0x028c, B:174:0x0293, B:179:0x02a3, B:181:0x02a8, B:195:0x02c7, B:205:0x02d9, B:217:0x02f6, B:218:0x02ff, B:247:0x0367, B:220:0x0304, B:222:0x0309, B:224:0x0310, B:223:0x030e, B:225:0x0314, B:227:0x031c, B:228:0x0321, B:229:0x0325, B:231:0x032a, B:233:0x0334, B:234:0x0338, B:236:0x033c, B:238:0x0347, B:239:0x034b, B:241:0x034f, B:243:0x035a, B:244:0x035e), top: B:285:0x0234, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:258:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:305:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x029c A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x0314, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static uzx a(android.content.Context context, boolean z, boolean z2) {
        android.content.pm.ApplicationInfo applicationInfo;
        defpackage.apul apulVar;
        defpackage.apyf apyfVarK;
        java.lang.String packageName;
        int[] iArrBs;
        java.util.HashMap map;
        java.util.Iterator it;
        int i;
        int i2;
        defpackage.apun apunVar;
        java.lang.String str;
        java.util.Map.Entry entry;
        java.util.Iterator it2;
        java.lang.Throwable th;
        int i3;
        java.lang.Object apunVar2;
        defpackage.apui apuiVar;
        int i4;
        int i5;
        int i6;
        boolean zBooleanValue;
        long jLongValue;
        float fFloatValue;
        defpackage.apxo apxoVar;
        java.lang.String str2;
        int[] iArrBs2;
        int i7;
        int length;
        int length2;
        int i8;
        int i9;
        java.lang.String str3;
        synchronized (b) {
            java.lang.String str4 = a;
            if (str4 != null && !"156.0.8078.39".equals(str4)) {
                throw new java.lang.IllegalStateException("getHttpFlags() called multiple times with different versions");
            }
            uzx uzxVar = c;
            if (uzxVar != null) {
                return uzxVar;
            }
            a = "156.0.8078.39";
            java.lang.Throwable th2 = null;
            new xkn("HttpFlagsLoader#getHttpFlags loading flags", 3, (byte[]) null);
            try {
                int i10 = 1;
                int i11 = 7;
                int i12 = 0;
                try {
                    if (defpackage.apvu.a(context).getBoolean("android.net.http.ReadHttpFlags", true)) {
                        try {
                            new xkn("HttpFlagsLoader#getProviderApplicationInfo", 3, (byte[]) null);
                            try {
                                android.content.pm.ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new android.content.Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
                                if (resolveInfoResolveService == null) {
                                    android.util.Log.i("cn_HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                                    android.os.Trace.endSection();
                                    applicationInfo = null;
                                } else {
                                    applicationInfo = resolveInfoResolveService.serviceInfo.applicationInfo;
                                    android.os.Trace.endSection();
                                }
                                if (applicationInfo != null) {
                                    aodc.q("HttpFlagsLoader", "Found application exporting HTTP flags: %s", new java.lang.Object[]{applicationInfo.packageName});
                                    java.io.File file = new java.io.File(new java.io.File(new java.io.File(applicationInfo.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                                    aodc.q("HttpFlagsLoader", "HTTP flags file path: %s", new java.lang.Object[]{file.getAbsolutePath()});
                                    new xkn("HttpFlagsLoader#loadFlagsFile", 3, (byte[]) null);
                                    try {
                                        try {
                                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                                            try {
                                                defpackage.apul apulVar2 = defpackage.apul.DEFAULT_INSTANCE;
                                                defpackage.apxy apxyVarA = defpackage.apxy.a();
                                                try {
                                                    int i13 = fileInputStream.read();
                                                    if (i13 == -1) {
                                                        apyfVarK = null;
                                                    } else {
                                                        int i14 = defpackage.apxs.e;
                                                        if ((i13 & 128) != 0) {
                                                            i13 &= 127;
                                                            int i15 = 7;
                                                            while (true) {
                                                                if (i15 < 32) {
                                                                    int i16 = fileInputStream.read();
                                                                    if (i16 == -1) {
                                                                        throw new defpackage.apym("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                    }
                                                                    i13 |= (i16 & 127) << i15;
                                                                    if ((i16 & 128) == 0) {
                                                                        break;
                                                                    }
                                                                    i15 += 7;
                                                                } else {
                                                                    while (true) {
                                                                        if (i15 >= 64) {
                                                                            throw new defpackage.apym("CodedInputStream encountered a malformed varint.");
                                                                        }
                                                                        int i17 = fileInputStream.read();
                                                                        if (i17 == -1) {
                                                                            throw new defpackage.apym("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                        }
                                                                        if ((i17 & 128) == 0) {
                                                                            break;
                                                                        }
                                                                        i15 += 7;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        defpackage.apxr apxrVar = new defpackage.apxr(new defpackage.apxd(fileInputStream, i13));
                                                        apyfVarK = apulVar2.k();
                                                        try {
                                                            try {
                                                                try {
                                                                    defpackage.apze apzeVarB = defpackage.apzb.a.b(apyfVarK);
                                                                    java.lang.Object apxtVar = apxrVar.d;
                                                                    if (apxtVar == null) {
                                                                        apxtVar = new defpackage.apxt(apxrVar);
                                                                    }
                                                                    apzeVarB.f(apyfVarK, (defpackage.apxt) apxtVar, apxyVarA);
                                                                    apzeVarB.d(apyfVarK);
                                                                    try {
                                                                        apxrVar.x(0);
                                                                    } catch (defpackage.apym e) {
                                                                        throw e;
                                                                    }
                                                                } catch (java.io.IOException e2) {
                                                                    if (e2.getCause() instanceof defpackage.apym) {
                                                                        throw ((defpackage.apym) e2.getCause());
                                                                    }
                                                                    throw new defpackage.apym(e2);
                                                                }
                                                            } catch (defpackage.apzl e3) {
                                                                throw e3.a();
                                                            }
                                                        } catch (defpackage.apym e4) {
                                                            if (e4.a) {
                                                                throw new defpackage.apym(e4);
                                                            }
                                                            throw e4;
                                                        } catch (java.lang.RuntimeException e5) {
                                                            if (e5.getCause() instanceof defpackage.apym) {
                                                                throw ((defpackage.apym) e5.getCause());
                                                            }
                                                            throw e5;
                                                        }
                                                    }
                                                    if (apyfVarK != null && !defpackage.apyf.s(apyfVarK)) {
                                                        throw new defpackage.apzl().a();
                                                    }
                                                    apulVar = (defpackage.apul) apyfVarK;
                                                    fileInputStream.close();
                                                    android.os.Trace.endSection();
                                                    if (apulVar != null) {
                                                        if (android.util.Log.isLoggable("HttpFlagsLoader", 3)) {
                                                            aodc.q("HttpFlagsLoader", "Successfully loaded HTTP flags: %s", new java.lang.Object[]{apulVar});
                                                        }
                                                    }
                                                } catch (defpackage.apym e6) {
                                                    if (e6.a) {
                                                        throw new defpackage.apym(e6);
                                                    }
                                                    throw e6;
                                                } catch (java.io.IOException e7) {
                                                    throw new defpackage.apym(e7);
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                try {
                                                    fileInputStream.close();
                                                    throw th3;
                                                } catch (java.lang.Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                    throw th3;
                                                }
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            try {
                                                android.os.Trace.endSection();
                                                throw th5;
                                            } catch (java.lang.Throwable th6) {
                                                th5.addSuppressed(th6);
                                                throw th5;
                                            }
                                        }
                                    } catch (java.io.FileNotFoundException unused) {
                                        android.util.Log.i("cn_HttpFlagsLoader", java.lang.String.format("HTTP flags file `%s` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.", file.getPath()));
                                        android.os.Trace.endSection();
                                        apulVar = null;
                                    } catch (java.io.IOException e8) {
                                        throw new java.lang.RuntimeException("Unable to read HTTP flags file", e8);
                                    }
                                }
                                while (true) {
                                    i = 2;
                                    if (it.hasNext()) {
                                        i2 = i12;
                                        uzx uzxVar2 = new uzx(map);
                                        android.os.Trace.endSection();
                                        c = uzxVar2;
                                        apunVar = (defpackage.apun) uzxVar2.br().get("Cronet_log_me");
                                        if (apunVar != null) {
                                            if (z) {
                                                str = "API";
                                            } else {
                                                str = "Impl";
                                            }
                                            java.lang.String strA = apunVar.a();
                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                            objArr[i2] = str;
                                            objArr[1] = strA;
                                            android.util.Log.i("cn_HttpFlagsLoader", java.lang.String.format("HTTP flags log line (%s): %s", objArr));
                                        }
                                        uzx uzxVar3 = c;
                                        android.os.Trace.endSection();
                                        return uzxVar3;
                                    }
                                    entry = (java.util.Map.Entry) it.next();
                                    try {
                                        it2 = ((defpackage.apuj) entry.getValue()).constrainedValues_.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                apuiVar = (defpackage.apui) it2.next();
                                                if (!z2 || apuiVar.applyEvenIfCronetTelemetryDisabled_) {
                                                    if ((apuiVar.bitField0_ & i10) != 0) {
                                                        str3 = apuiVar.appId_;
                                                        if (!str3.equals(packageName)) {
                                                            th = th2;
                                                            if (str3.endsWith(".") || !packageName.startsWith(str3)) {
                                                                th2 = th;
                                                            } else {
                                                                if ((apuiVar.bitField0_ & i) != 0) {
                                                                    iArrBs2 = uzx.bs(apuiVar.minVersion_);
                                                                    i7 = i12;
                                                                    i3 = i7;
                                                                    while (true) {
                                                                        length = iArrBs.length;
                                                                        length2 = iArrBs2.length;
                                                                        if (i7 < java.lang.Math.max(length, length2)) {
                                                                            if (i7 < length) {
                                                                                i8 = iArrBs[i7];
                                                                            } else {
                                                                                i8 = i3;
                                                                            }
                                                                            if (i7 < length2) {
                                                                                i9 = iArrBs2[i7];
                                                                            } else {
                                                                                i9 = i3;
                                                                            }
                                                                            if (i8 <= i9) {
                                                                                if (i8 < i9) {
                                                                                    th2 = th;
                                                                                    i12 = i3;
                                                                                    i10 = 1;
                                                                                    i = 2;
                                                                                } else {
                                                                                    i7++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    i3 = i12;
                                                                }
                                                                i4 = apuiVar.valueCase_;
                                                                if (i4 == 0) {
                                                                    i5 = 6;
                                                                } else if (i4 == 3) {
                                                                    i5 = 1;
                                                                } else if (i4 == 4) {
                                                                    i5 = 2;
                                                                } else if (i4 == 5) {
                                                                    i5 = 3;
                                                                } else if (i4 == 6) {
                                                                    i5 = 4;
                                                                } else if (i4 != i11) {
                                                                    i5 = i3;
                                                                } else {
                                                                    i5 = 5;
                                                                }
                                                                i6 = i5 - 1;
                                                                if (i5 == 0) {
                                                                    throw th;
                                                                }
                                                                if (i6 == 0) {
                                                                    if (i4 == 3) {
                                                                        zBooleanValue = ((java.lang.Boolean) apuiVar.value_).booleanValue();
                                                                    } else {
                                                                        zBooleanValue = i3;
                                                                    }
                                                                    apunVar2 = new defpackage.apun(zBooleanValue);
                                                                } else if (i6 == 1) {
                                                                    if (i4 == 4) {
                                                                        jLongValue = ((java.lang.Long) apuiVar.value_).longValue();
                                                                    } else {
                                                                        jLongValue = 0;
                                                                    }
                                                                    apunVar2 = new defpackage.apun(jLongValue);
                                                                } else if (i6 == 2) {
                                                                    i11 = 7;
                                                                    if (i4 == 5) {
                                                                        fFloatValue = ((java.lang.Float) apuiVar.value_).floatValue();
                                                                    } else {
                                                                        fFloatValue = 0.0f;
                                                                    }
                                                                    apunVar2 = new defpackage.apun(fFloatValue);
                                                                } else if (i6 == 3) {
                                                                    i11 = 7;
                                                                    apunVar2 = new defpackage.apun(i4 == 6 ? (java.lang.String) apuiVar.value_ : "");
                                                                } else if (i6 == 4) {
                                                                    i11 = 7;
                                                                    if (i4 == 7) {
                                                                        apxoVar = (defpackage.apxo) apuiVar.value_;
                                                                    } else {
                                                                        apxoVar = defpackage.apxo.d;
                                                                    }
                                                                    apunVar2 = new defpackage.apun(apxoVar);
                                                                } else {
                                                                    if (i6 != 5) {
                                                                        if (i5 == 1) {
                                                                            str2 = "BOOL_VALUE";
                                                                        } else if (i5 == 2) {
                                                                            str2 = "INT_VALUE";
                                                                        } else if (i5 == 3) {
                                                                            str2 = "FLOAT_VALUE";
                                                                        } else if (i5 == 4) {
                                                                            str2 = "STRING_VALUE";
                                                                        } else if (i5 != 5) {
                                                                            str2 = "VALUE_NOT_SET";
                                                                        } else {
                                                                            str2 = "BYTES_VALUE";
                                                                        }
                                                                        throw new java.lang.IllegalArgumentException("Flag value uses unknown value type ".concat(str2));
                                                                    }
                                                                    apunVar2 = th;
                                                                    i11 = 7;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    th = th2;
                                                    if ((apuiVar.bitField0_ & i) != 0) {
                                                        iArrBs2 = uzx.bs(apuiVar.minVersion_);
                                                        i7 = i12;
                                                        i3 = i7;
                                                        while (true) {
                                                            length = iArrBs.length;
                                                            length2 = iArrBs2.length;
                                                            if (i7 < java.lang.Math.max(length, length2)) {
                                                                if (i7 < length) {
                                                                    i8 = iArrBs[i7];
                                                                } else {
                                                                    i8 = i3;
                                                                }
                                                                if (i7 < length2) {
                                                                    i9 = iArrBs2[i7];
                                                                } else {
                                                                    i9 = i3;
                                                                }
                                                                if (i8 <= i9) {
                                                                    if (i8 < i9) {
                                                                        th2 = th;
                                                                        i12 = i3;
                                                                        i10 = 1;
                                                                        i = 2;
                                                                    } else {
                                                                        i7++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i3 = i12;
                                                    }
                                                    i4 = apuiVar.valueCase_;
                                                    if (i4 == 0) {
                                                        i5 = 6;
                                                    } else if (i4 == 3) {
                                                        i5 = 1;
                                                    } else if (i4 == 4) {
                                                        i5 = 2;
                                                    } else if (i4 == 5) {
                                                        i5 = 3;
                                                    } else if (i4 == 6) {
                                                        i5 = 4;
                                                    } else if (i4 != i11) {
                                                        i5 = i3;
                                                    } else {
                                                        i5 = 5;
                                                    }
                                                    i6 = i5 - 1;
                                                    if (i5 == 0) {
                                                        throw th;
                                                    }
                                                    if (i6 == 0) {
                                                        if (i4 == 3) {
                                                            zBooleanValue = ((java.lang.Boolean) apuiVar.value_).booleanValue();
                                                        } else {
                                                            zBooleanValue = i3;
                                                        }
                                                        apunVar2 = new defpackage.apun(zBooleanValue);
                                                    } else if (i6 == 1) {
                                                        if (i4 == 4) {
                                                            jLongValue = ((java.lang.Long) apuiVar.value_).longValue();
                                                        } else {
                                                            jLongValue = 0;
                                                        }
                                                        apunVar2 = new defpackage.apun(jLongValue);
                                                    } else if (i6 == 2) {
                                                        i11 = 7;
                                                        if (i4 == 5) {
                                                            fFloatValue = ((java.lang.Float) apuiVar.value_).floatValue();
                                                        } else {
                                                            fFloatValue = 0.0f;
                                                        }
                                                        apunVar2 = new defpackage.apun(fFloatValue);
                                                    } else if (i6 == 3) {
                                                        i11 = 7;
                                                        apunVar2 = new defpackage.apun(i4 == 6 ? (java.lang.String) apuiVar.value_ : "");
                                                    } else if (i6 == 4) {
                                                        i11 = 7;
                                                        if (i4 == 7) {
                                                            apxoVar = (defpackage.apxo) apuiVar.value_;
                                                        } else {
                                                            apxoVar = defpackage.apxo.d;
                                                        }
                                                        apunVar2 = new defpackage.apun(apxoVar);
                                                    } else {
                                                        if (i6 != 5) {
                                                            if (i5 == 1) {
                                                                str2 = "BOOL_VALUE";
                                                            } else if (i5 == 2) {
                                                                str2 = "INT_VALUE";
                                                            } else if (i5 == 3) {
                                                                str2 = "FLOAT_VALUE";
                                                            } else if (i5 == 4) {
                                                                str2 = "STRING_VALUE";
                                                            } else if (i5 != 5) {
                                                                str2 = "VALUE_NOT_SET";
                                                            } else {
                                                                str2 = "BYTES_VALUE";
                                                            }
                                                            throw new java.lang.IllegalArgumentException("Flag value uses unknown value type ".concat(str2));
                                                        }
                                                        apunVar2 = th;
                                                        i11 = 7;
                                                    }
                                                }
                                            } else {
                                                th = th2;
                                                i3 = i12;
                                                apunVar2 = th;
                                            }
                                            if (apunVar2 != null) {
                                                map.put((java.lang.String) entry.getKey(), apunVar2);
                                            }
                                            th2 = th;
                                            i12 = i3;
                                            i10 = 1;
                                        }
                                    } catch (java.lang.RuntimeException e9) {
                                        throw new java.lang.IllegalArgumentException("Unable to resolve HTTP flag `" + ((java.lang.String) entry.getKey()) + '`', e9);
                                    }
                                    try {
                                        android.os.Trace.endSection();
                                        throw th;
                                    } catch (java.lang.Throwable th7) {
                                        th.addSuppressed(th7);
                                        throw th;
                                    }
                                }
                            } catch (java.lang.Throwable th8) {
                                try {
                                    android.os.Trace.endSection();
                                    throw th8;
                                } catch (java.lang.Throwable th9) {
                                    th8.addSuppressed(th9);
                                    throw th8;
                                }
                            }
                        } catch (java.lang.RuntimeException e10) {
                            android.util.Log.i("cn_HttpFlagsLoader", "Unable to load HTTP flags file", e10);
                        }
                        if (apulVar == null) {
                            apulVar = (defpackage.apul) defpackage.apul.DEFAULT_INSTANCE.h().c();
                        }
                        packageName = context.getPackageName();
                        new xkn("Cronet ResolvedFlags#resolve", 3, (byte[]) null);
                        iArrBs = uzx.bs("156.0.8078.39");
                        map = new java.util.HashMap();
                        it = j$.util.DesugarCollections.unmodifiableMap(apulVar.flags_).entrySet().iterator();
                    } else {
                        aodc.q("HttpFlagsLoader", "Not loading HTTP flags because they are disabled in the manifest", new java.lang.Object[0]);
                    }
                    iArrBs = uzx.bs("156.0.8078.39");
                    map = new java.util.HashMap();
                    it = j$.util.DesugarCollections.unmodifiableMap(apulVar.flags_).entrySet().iterator();
                    while (true) {
                        i = 2;
                        if (it.hasNext()) {
                            i2 = i12;
                            uzx uzxVar4 = new uzx(map);
                            android.os.Trace.endSection();
                            c = uzxVar4;
                            apunVar = (defpackage.apun) uzxVar4.br().get("Cronet_log_me");
                            if (apunVar != null) {
                                if (z) {
                                    str = "API";
                                } else {
                                    str = "Impl";
                                }
                                java.lang.String strA2 = apunVar.a();
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                objArr2[i2] = str;
                                objArr2[1] = strA2;
                                android.util.Log.i("cn_HttpFlagsLoader", java.lang.String.format("HTTP flags log line (%s): %s", objArr2));
                            }
                            uzx uzxVar5 = c;
                            android.os.Trace.endSection();
                            return uzxVar5;
                        }
                        entry = (java.util.Map.Entry) it.next();
                        it2 = ((defpackage.apuj) entry.getValue()).constrainedValues_.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                apuiVar = (defpackage.apui) it2.next();
                                if (!z2) {
                                }
                                if ((apuiVar.bitField0_ & i10) != 0) {
                                    str3 = apuiVar.appId_;
                                    if (!str3.equals(packageName)) {
                                        th = th2;
                                        if (str3.endsWith(".")) {
                                        }
                                        th2 = th;
                                    }
                                }
                                th = th2;
                                if ((apuiVar.bitField0_ & i) != 0) {
                                    iArrBs2 = uzx.bs(apuiVar.minVersion_);
                                    i7 = i12;
                                    i3 = i7;
                                    while (true) {
                                        length = iArrBs.length;
                                        length2 = iArrBs2.length;
                                        if (i7 < java.lang.Math.max(length, length2)) {
                                            if (i7 < length) {
                                                i8 = iArrBs[i7];
                                            } else {
                                                i8 = i3;
                                            }
                                            if (i7 < length2) {
                                                i9 = iArrBs2[i7];
                                            } else {
                                                i9 = i3;
                                            }
                                            if (i8 <= i9) {
                                                if (i8 < i9) {
                                                    th2 = th;
                                                    i12 = i3;
                                                    i10 = 1;
                                                    i = 2;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i3 = i12;
                                }
                                i4 = apuiVar.valueCase_;
                                if (i4 == 0) {
                                    i5 = 6;
                                } else if (i4 == 3) {
                                    i5 = 1;
                                } else if (i4 == 4) {
                                    i5 = 2;
                                } else if (i4 == 5) {
                                    i5 = 3;
                                } else if (i4 == 6) {
                                    i5 = 4;
                                } else if (i4 != i11) {
                                    i5 = i3;
                                } else {
                                    i5 = 5;
                                }
                                i6 = i5 - 1;
                                if (i5 == 0) {
                                    throw th;
                                }
                                if (i6 == 0) {
                                    if (i4 == 3) {
                                        zBooleanValue = ((java.lang.Boolean) apuiVar.value_).booleanValue();
                                    } else {
                                        zBooleanValue = i3;
                                    }
                                    apunVar2 = new defpackage.apun(zBooleanValue);
                                } else if (i6 == 1) {
                                    if (i4 == 4) {
                                        jLongValue = ((java.lang.Long) apuiVar.value_).longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    apunVar2 = new defpackage.apun(jLongValue);
                                } else if (i6 == 2) {
                                    i11 = 7;
                                    if (i4 == 5) {
                                        fFloatValue = ((java.lang.Float) apuiVar.value_).floatValue();
                                    } else {
                                        fFloatValue = 0.0f;
                                    }
                                    apunVar2 = new defpackage.apun(fFloatValue);
                                } else if (i6 == 3) {
                                    i11 = 7;
                                    apunVar2 = new defpackage.apun(i4 == 6 ? (java.lang.String) apuiVar.value_ : "");
                                } else if (i6 == 4) {
                                    i11 = 7;
                                    if (i4 == 7) {
                                        apxoVar = (defpackage.apxo) apuiVar.value_;
                                    } else {
                                        apxoVar = defpackage.apxo.d;
                                    }
                                    apunVar2 = new defpackage.apun(apxoVar);
                                } else {
                                    if (i6 != 5) {
                                        if (i5 == 1) {
                                            str2 = "BOOL_VALUE";
                                        } else if (i5 == 2) {
                                            str2 = "INT_VALUE";
                                        } else if (i5 == 3) {
                                            str2 = "FLOAT_VALUE";
                                        } else if (i5 == 4) {
                                            str2 = "STRING_VALUE";
                                        } else if (i5 != 5) {
                                            str2 = "VALUE_NOT_SET";
                                        } else {
                                            str2 = "BYTES_VALUE";
                                        }
                                        throw new java.lang.IllegalArgumentException("Flag value uses unknown value type ".concat(str2));
                                    }
                                    apunVar2 = th;
                                    i11 = 7;
                                }
                            } else {
                                th = th2;
                                i3 = i12;
                                apunVar2 = th;
                            }
                            if (apunVar2 != null) {
                                map.put((java.lang.String) entry.getKey(), apunVar2);
                            }
                            th2 = th;
                            i12 = i3;
                            i10 = 1;
                        }
                        android.os.Trace.endSection();
                        throw th;
                    }
                } catch (java.lang.Throwable th10) {
                    try {
                        android.os.Trace.endSection();
                        throw th10;
                    } catch (java.lang.Throwable th11) {
                        th10.addSuppressed(th11);
                        throw th10;
                    }
                }
                apulVar = null;
                if (apulVar == null) {
                    apulVar = (defpackage.apul) defpackage.apul.DEFAULT_INSTANCE.h().c();
                }
                packageName = context.getPackageName();
                new xkn("Cronet ResolvedFlags#resolve", 3, (byte[]) null);
            } catch (java.lang.Throwable th12) {
                android.os.Trace.endSection();
                throw th12;
            }
        }
    }
}
