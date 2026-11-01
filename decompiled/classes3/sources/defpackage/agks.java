package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agks extends cmv implements dat {
    private static final java.lang.String o;
    private java.lang.Long E;
    private final long F;
    private float G;
    private float H;
    private final int I;
    private final java.util.concurrent.atomic.AtomicInteger J;
    private java.lang.Integer K;
    private java.lang.String L;
    private defpackage.alln M;
    public final defpackage.agja a;
    public defpackage.agiz b;
    public final aii c;
    public final aii d;
    public aoub e;
    public defpackage.aglb f;
    public crb g;
    public defpackage.agjb h;
    public java.util.Map i;
    public defpackage.agjx j;
    public java.util.List k;
    public int l;
    public java.util.Map m;
    public defpackage.amdx n;
    private final java.util.Map p;
    private final aonn q;
    private final aomy r;
    private aoub s;

    static {
        aooh.e("agks", "getSimpleName(...)");
        o = "agks";
    }

    public agks(defpackage.agja agjaVar, defpackage.agiz agizVar, java.util.Map map, aonn aonnVar, aomy aomyVar) {
        aooh.f(agizVar, "state");
        aooh.f(aonnVar, "onStateFinishedCallback");
        aooh.f(aomyVar, "timeSupplierMs");
        this.a = agjaVar;
        this.b = agizVar;
        this.p = map;
        this.q = aonnVar;
        this.r = aomyVar;
        this.c = aij.a(0.0f);
        aopj aopjVar = aopk.a;
        this.F = aopk.b.d();
        this.d = aij.a(0.0f);
        new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.agkr.a, cdu.c);
        defpackage.aglb aglbVar = new defpackage.aglb(agjaVar);
        this.f = aglbVar;
        this.g = new cqe(aglbVar);
        int i = defpackage.agjj.a;
        this.h = null;
        this.i = agjaVar.a();
        this.k = aokc.a;
        this.I = java.lang.System.identityHashCode(this);
        this.J = new java.util.concurrent.atomic.AtomicInteger(2000);
        this.m = aokd.a;
        this.n = new defpackage.amdx(agjaVar);
    }

    private final void f() {
        java.lang.String str;
        java.lang.Integer num;
        if (!da$.ExternalSyntheticApiModelOutline0.m() || (str = this.L) == null || (num = this.K) == null) {
            return;
        }
        da$.ExternalSyntheticApiModelOutline0.m(str, num.intValue());
        this.L = null;
        this.K = null;
    }

    public final void b() {
        defpackage.amdx amdxVar = this.n;
        java.util.Map map = this.i;
        aooh.f(map, "unresolvedUniforms");
        defpackage.agji agjiVar = ((defpackage.agja) amdxVar.a).l;
        defpackage.agle agleVar = defpackage.agln.a;
        defpackage.agle agleVar2 = defpackage.agln.bg;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        map.put(agleVar2, fValueOf);
        map.put(defpackage.agln.bh, 0);
        map.put(defpackage.agln.bi, fValueOf);
        map.put(defpackage.agln.bj, 0);
        map.put(defpackage.agln.bk, fValueOf);
        cfo.w(this);
    }

    public final void d() {
        if (!((cmv) this).D) {
            this.j = null;
            return;
        }
        if (this.l >= this.k.size()) {
            defpackage.agju agjuVar = (defpackage.agju) this.p.get(this.b);
            if (agjuVar == null || !agjuVar.b || this.k.isEmpty()) {
                this.j = null;
                if (((cmv) this).D) {
                    aoov.an(M(), (aolr) null, 0, new defpackage.adzb(this, (aoln) null, 18, (byte[]) null), 3);
                    this.q.a(this.b, this.i);
                    cfo.w(this);
                    f();
                    return;
                }
                return;
            }
            this.l = 0;
        }
        this.s = aoov.an(M(), (aolr) null, 0, new uxg(this, (aoln) null, 5), 3);
    }

    public final void dc() {
        da$.ExternalSyntheticApiModelOutline0.m$1("EnergyShaderNode#lifetime", this.I);
        this.E = (java.lang.Long) this.r.a();
        e(this.b);
        b();
    }

    public final void e(defpackage.agiz agizVar) {
        defpackage.agjx agjxVar;
        aooh.f(agizVar, "newState");
        if (this.b != agizVar) {
            f();
        }
        int andIncrement = this.J.getAndIncrement();
        if (da$.ExternalSyntheticApiModelOutline0.m()) {
            java.util.Objects.toString(agizVar);
            java.lang.String strConcat = "EnergyShaderNode#State:".concat(java.lang.String.valueOf(agizVar));
            da$.ExternalSyntheticApiModelOutline0.m$1(strConcat, andIncrement);
            this.K = java.lang.Integer.valueOf(andIncrement);
            this.L = strConcat;
        }
        if (this.E == null && agizVar != defpackage.agiz.HIDDEN) {
            this.E = (java.lang.Long) this.r.a();
        } else if (agizVar == defpackage.agiz.HIDDEN) {
            this.E = null;
        }
        float fFloatValue = ((java.lang.Number) this.c.d()).floatValue();
        aoub aoubVar = this.s;
        if (((cmv) this).D && aoubVar != null && aoubVar.t() && (agjxVar = this.j) != null) {
            for (defpackage.agjt agjtVar : agjxVar.d) {
                ajh ajhVar = agjtVar.c;
                if (ajhVar == null) {
                    ajhVar = agjxVar.c;
                }
                float fA = ajhVar.a(fFloatValue);
                defpackage.aglv aglvVar = agjtVar.a;
                java.lang.Object obj = agjtVar.b;
                java.lang.Object obj2 = this.i.get(aglvVar);
                if (obj2 != null && obj != null) {
                    this.i.put(aglvVar, defpackage.agmc.s(aglvVar, obj2, obj, fA));
                } else if (obj != null) {
                    this.i.put(aglvVar, obj);
                }
            }
            android.util.Log.d(o, "Rebased currentBaseValues at progress " + fFloatValue + " for transition to " + agizVar);
        }
        aoub aoubVar2 = this.s;
        if (aoubVar2 != null) {
            aoubVar2.s((java.util.concurrent.CancellationException) null);
        }
        this.s = null;
        java.util.Map map = this.p;
        defpackage.agju agjuVar = (defpackage.agju) map.get(agizVar);
        this.k = agjuVar != null ? agjuVar.a : aokc.a;
        defpackage.agju agjuVar2 = (defpackage.agju) map.get(agizVar);
        this.M = agjuVar2 != null ? agjuVar2.c : null;
        this.l = 0;
        this.j = null;
        if (((cmv) this).D) {
            d();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX INFO: Thrown type has an unknown type hierarchy: aolr */
    /* JADX WARN: Code duplicated, block: B:101:0x0283  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x0329  */
    /* JADX WARN: Code duplicated, block: B:110:0x032c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0331  */
    /* JADX WARN: Code duplicated, block: B:116:0x033f  */
    /* JADX WARN: Code duplicated, block: B:142:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:147:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:148:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:150:0x0403  */
    /* JADX WARN: Code duplicated, block: B:153:0x040d A[LOOP:4: B:151:0x0405->B:153:0x040d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0416  */
    /* JADX WARN: Code duplicated, block: B:157:0x041b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0463  */
    /* JADX WARN: Code duplicated, block: B:162:0x0468  */
    /* JADX WARN: Code duplicated, block: B:165:0x0481  */
    /* JADX WARN: Code duplicated, block: B:166:0x0486  */
    /* JADX WARN: Code duplicated, block: B:170:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:172:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:181:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:183:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:186:0x050a  */
    /* JADX WARN: Code duplicated, block: B:190:0x051c A[Catch: Exception -> 0x062f, TryCatch #0 {Exception -> 0x062f, blocks: (B:188:0x0510, B:190:0x051c, B:192:0x0520, B:193:0x0530, B:196:0x0536, B:197:0x0544, B:199:0x0548, B:200:0x0558), top: B:329:0x0510 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0520 A[Catch: Exception -> 0x062f, TryCatch #0 {Exception -> 0x062f, blocks: (B:188:0x0510, B:190:0x051c, B:192:0x0520, B:193:0x0530, B:196:0x0536, B:197:0x0544, B:199:0x0548, B:200:0x0558), top: B:329:0x0510 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0530 A[Catch: Exception -> 0x062f, TRY_LEAVE, TryCatch #0 {Exception -> 0x062f, blocks: (B:188:0x0510, B:190:0x051c, B:192:0x0520, B:193:0x0530, B:196:0x0536, B:197:0x0544, B:199:0x0548, B:200:0x0558), top: B:329:0x0510 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0536 A[Catch: Exception -> 0x062f, TRY_ENTER, TryCatch #0 {Exception -> 0x062f, blocks: (B:188:0x0510, B:190:0x051c, B:192:0x0520, B:193:0x0530, B:196:0x0536, B:197:0x0544, B:199:0x0548, B:200:0x0558), top: B:329:0x0510 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0544 A[Catch: Exception -> 0x062f, TryCatch #0 {Exception -> 0x062f, blocks: (B:188:0x0510, B:190:0x051c, B:192:0x0520, B:193:0x0530, B:196:0x0536, B:197:0x0544, B:199:0x0548, B:200:0x0558), top: B:329:0x0510 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0548 A[Catch: Exception -> 0x062f, TryCatch #0 {Exception -> 0x062f, blocks: (B:188:0x0510, B:190:0x051c, B:192:0x0520, B:193:0x0530, B:196:0x0536, B:197:0x0544, B:199:0x0548, B:200:0x0558), top: B:329:0x0510 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0558 A[Catch: Exception -> 0x062f, TRY_LEAVE, TryCatch #0 {Exception -> 0x062f, blocks: (B:188:0x0510, B:190:0x051c, B:192:0x0520, B:193:0x0530, B:196:0x0536, B:197:0x0544, B:199:0x0548, B:200:0x0558), top: B:329:0x0510 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x055c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0565 A[Catch: Exception -> 0x0595, TryCatch #2 {Exception -> 0x0595, blocks: (B:203:0x0560, B:205:0x0565, B:207:0x0569), top: B:332:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0569 A[Catch: Exception -> 0x0595, TRY_LEAVE, TryCatch #2 {Exception -> 0x0595, blocks: (B:203:0x0560, B:205:0x0565, B:207:0x0569), top: B:332:0x0560 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0574 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:212:0x057a A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0598 A[Catch: Exception -> 0x062d, TRY_LEAVE, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:222:0x05a3 A[Catch: Exception -> 0x062d, TRY_ENTER, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:223:0x05ad A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:225:0x05b1 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:227:0x05b5 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:228:0x05bc A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:229:0x05c8 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:231:0x05cc A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:232:0x05d8 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:234:0x05dc A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:235:0x05e5 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:237:0x05e9 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0606 A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:240:0x060a A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:242:0x060e A[Catch: Exception -> 0x062d, TryCatch #1 {Exception -> 0x062d, blocks: (B:209:0x056d, B:213:0x0580, B:210:0x0574, B:212:0x057a, B:215:0x0587, B:216:0x0594, B:219:0x0598, B:222:0x05a3, B:223:0x05ad, B:225:0x05b1, B:227:0x05b5, B:228:0x05bc, B:229:0x05c8, B:231:0x05cc, B:232:0x05d8, B:234:0x05dc, B:235:0x05e5, B:237:0x05e9, B:238:0x0606, B:240:0x060a, B:242:0x060e, B:246:0x0627, B:247:0x062c, B:243:0x061b, B:244:0x0622), top: B:331:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:258:0x066f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0672  */
    /* JADX WARN: Code duplicated, block: B:262:0x0684  */
    /* JADX WARN: Code duplicated, block: B:263:0x0689  */
    /* JADX WARN: Code duplicated, block: B:266:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:268:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:270:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:271:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:274:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:276:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:277:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:280:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:281:0x0706  */
    /* JADX WARN: Code duplicated, block: B:284:0x071a  */
    /* JADX WARN: Code duplicated, block: B:286:0x0720  */
    /* JADX WARN: Code duplicated, block: B:288:0x0726  */
    /* JADX WARN: Code duplicated, block: B:290:0x0767  */
    /* JADX WARN: Code duplicated, block: B:291:0x076b  */
    /* JADX WARN: Code duplicated, block: B:294:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:295:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:298:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:306:0x0876  */
    /* JADX WARN: Code duplicated, block: B:312:0x089a  */
    /* JADX WARN: Code duplicated, block: B:314:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:324:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:329:0x0510 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0410 A[EDGE_INSN: B:351:0x0410->B:154:0x0410 BREAK  A[LOOP:4: B:151:0x0405->B:153:0x040d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0623 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0585 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0587 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0214  */
    /* JADX WARN: Code duplicated, block: B:79:0x0228  */
    /* JADX WARN: Code duplicated, block: B:81:0x0235  */
    /* JADX WARN: Code duplicated, block: B:82:0x0238  */
    /* JADX WARN: Code duplicated, block: B:84:0x023b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0240  */
    /* JADX WARN: Code duplicated, block: B:88:0x0254  */
    /* JADX WARN: Code duplicated, block: B:95:0x0270  */
    /* JADX WARN: Code duplicated, block: B:98:0x0276  */
    /* JADX WARN: Code duplicated, block: B:99:0x027d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96, types: [float] */
    /* JADX WARN: Type inference failed for: r0v98, types: [float] */
    /* JADX WARN: Type inference failed for: r0v99, types: [float] */
    /* JADX WARN: Type inference failed for: r10v43, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v12, types: [float] */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [float[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v55, types: [float] */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r6v40, types: [float] */
    /* JADX WARN: Type inference failed for: r6v48, types: [float] */
    /* JADX WARN: Type inference failed for: r6v51, types: [float] */
    /* JADX WARN: Type inference failed for: r6v54, types: [float] */
    /* JADX WARN: Type inference failed for: r7v36, types: [float] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40, types: [int] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r9v34, types: [float] */
    /* JADX WARN: Type inference failed for: r9v35, types: [float] */
    public final void o(dbm dbmVar) throws aois, aolr {
        java.util.LinkedHashMap linkedHashMap;
        float fIntBitsToFloat;
        float fB;
        float fFloatValue;
        ?? r17;
        char c;
        int i;
        aolr aolrVar;
        java.lang.Object obj;
        java.lang.Float f;
        float fIntBitsToFloat2;
        float f2;
        float fFloatValue2;
        aolr aolrVar2;
        aolr aolrVar3;
        float fMin;
        float f3;
        aolr aolrVar4;
        int i2;
        float f4;
        defpackage.agjx agjxVar;
        long jO;
        java.lang.Object obj2;
        java.lang.Object obj3;
        ?? r3;
        int i3;
        float f5;
        ?? r4;
        android.graphics.PointF pointF;
        float fD;
        float fA;
        defpackage.aglb aglbVar;
        java.util.Map map;
        java.lang.Object obj4;
        aolr aolrVar5;
        java.lang.Long l;
        long jLongValue;
        long j;
        float f6;
        defpackage.agjm agjmVar;
        float f7;
        float f8;
        aii aiiVar;
        aoub aoubVar;
        float f9;
        float f10;
        float fL;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float fMin2;
        float f16;
        float f17;
        float f18;
        defpackage.aglv aglvVar;
        java.lang.Object value;
        java.lang.Object obj5;
        float[] fArr;
        float f19;
        java.lang.String strA;
        int iIntValue;
        int length;
        ?? Min;
        int iCD;
        aolr aolrVarValueOf;
        ?? r8;
        ?? r0;
        float fFloatValue3;
        boolean z;
        char c2;
        long j2;
        long j3 = 4294967295L;
        float f20 = 0.0f;
        if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() & 4294967295L)) > 0.0f) {
            char c3 = ' ';
            if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> 32)) > 0.0f) {
                float fFloatValue4 = ((java.lang.Number) this.c.d()).floatValue();
                defpackage.alln allnVar = this.M;
                if (allnVar != null) {
                    linkedHashMap = new java.util.LinkedHashMap();
                    ?? r10 = allnVar.d;
                    int size = r10.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        java.lang.Object obj6 = ((java.util.ArrayList) r10).get(i4);
                        aooh.e(obj6, "get(...)");
                        linkedHashMap.put((defpackage.aglv) obj6, ((defpackage.aglx) ((java.util.ArrayList) allnVar.b).get(i4)).a());
                    }
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    this.i.putAll(linkedHashMap);
                }
                defpackage.agjx agjxVar2 = this.j;
                java.util.Map mapAT = ajsz.aT(this.i);
                if (agjxVar2 != null) {
                    for (defpackage.agjt agjtVar : agjxVar2.d) {
                        ajh ajhVar = agjtVar.c;
                        if (ajhVar == null) {
                            ajhVar = agjxVar2.c;
                        }
                        float fA2 = ajhVar.a(fFloatValue4);
                        defpackage.aglv aglvVar2 = agjtVar.a;
                        java.lang.Object obj7 = agjtVar.b;
                        java.lang.Object obj8 = this.i.get(aglvVar2);
                        if (obj8 != null && obj7 != null) {
                            mapAT.put(aglvVar2, defpackage.agmc.s(aglvVar2, obj8, obj7, fA2));
                        } else if (obj7 != null) {
                            mapAT.put(aglvVar2, obj7);
                        }
                    }
                }
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(ajsz.aL(mapAT.size()));
                for (java.util.Map.Entry entry : mapAT.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    defpackage.aglv aglvVar3 = (defpackage.aglv) entry.getKey();
                    java.lang.Object value2 = entry.getValue();
                    defpackage.agle agleVar = defpackage.agln.a;
                    aooh.f(aglvVar3, "uniform");
                    char c4 = c3;
                    aooh.f(value2, "value");
                    float fA3 = dbmVar.a();
                    aooh.f(aglvVar3, "uniform");
                    aooh.f(value2, "value");
                    j$.util.Objects.checkIndex(0, 3);
                    if (aglvVar3 == null) {
                        value2 = value2;
                        j2 = j3;
                    } else if (!(aglvVar3 instanceof defpackage.agla)) {
                        j2 = j3;
                        if (!(aglvVar3 instanceof defpackage.agkz)) {
                            value2 = value2;
                        } else if (value2 instanceof float[]) {
                            float[] fArr2 = (float[]) value2;
                            java.util.ArrayList arrayList = new java.util.ArrayList(fArr2.length);
                            for (float f21 : fArr2) {
                                value2 = value2;
                                arrayList.add(java.lang.Float.valueOf(f21 * fA3));
                            }
                            value2 = value2;
                            value2 = ajsz.cl(arrayList);
                        } else {
                            value2 = value2;
                            android.util.Log.e("ShaderUniforms", "Mismatched value type for DpArrayUniform " + ((defpackage.agkz) aglvVar3).a + ": " + value2.getClass());
                        }
                    } else if (value2 instanceof java.lang.Float) {
                        value2 = value2;
                        value2 = java.lang.Float.valueOf(((java.lang.Number) value2).floatValue() * fA3);
                        value2 = value2;
                        j2 = j3;
                    } else {
                        value2 = value2;
                        j2 = j3;
                        android.util.Log.e("ShaderUniforms", "Mismatched value type for DpUniform " + ((defpackage.agla) aglvVar3).a + ": " + value2.getClass());
                    }
                    linkedHashMap2.put(key, value2);
                    c3 = c4;
                    j3 = j2;
                }
                char c5 = c3;
                long j4 = j3;
                java.util.Map mapAT2 = ajsz.aT(linkedHashMap2);
                defpackage.agle agleVar2 = defpackage.agln.a;
                defpackage.agkz agkzVar = defpackage.agln.h;
                java.lang.Object obj9 = mapAT2.get(agkzVar);
                float[] fArr3 = obj9 instanceof float[] ? (float[]) obj9 : null;
                if (fArr3 == null) {
                    fArr3 = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
                }
                mapAT2.put(agkzVar, fArr3);
                java.lang.Object obj10 = mapAT2.get(defpackage.agln.i);
                java.lang.Float f22 = obj10 instanceof java.lang.Float ? (java.lang.Float) obj10 : null;
                float fFloatValue5 = f22 != null ? f22.floatValue() : 0.0f;
                defpackage.agja agjaVar = this.a;
                defpackage.agjl agjlVar = agjaVar.a;
                if (!agjlVar.f) {
                    char c6 = 2;
                    boolean z2 = true;
                    java.lang.Object obj11 = mapAT2.get(defpackage.agln.f);
                    java.lang.Float f23 = obj11 instanceof java.lang.Float ? (java.lang.Float) obj11 : null;
                    if (f23 != null) {
                        fFloatValue = f23.floatValue();
                        c = c6;
                        r17 = z2;
                    } else {
                        fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5));
                        fB = defpackage.aglz.b(fArr3);
                        c2 = c6;
                        z = z2;
                    }
                    if (agjlVar.e) {
                        i = 0;
                        aolrVar = null;
                        obj = mapAT2.get(defpackage.agln.e);
                        if (obj instanceof java.lang.Float) {
                            f = (java.lang.Float) obj;
                        } else {
                            f = null;
                        }
                        if (f != null) {
                            fFloatValue2 = f.floatValue();
                        } else {
                            fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4));
                            f2 = defpackage.aglz.f(fArr3);
                        }
                        aolrVar2 = agjaVar.k;
                        if (aolrVar2 == null && fFloatValue != fFloatValue2) {
                            aolrVar3 = aolrVar;
                            if (this.G != fFloatValue || this.H != fFloatValue2) {
                                android.util.Log.w(o, "Loader size is not square, setting size to a square of the smallest dimension");
                            }
                            if (aolrVar2 != null) {
                                fMin = java.lang.Math.min(fFloatValue, fFloatValue2);
                                aolrVar4 = aolrVar2;
                                f3 = fMin;
                            } else {
                                fMin = fFloatValue2;
                                f3 = fFloatValue;
                                aolrVar4 = aolrVar3;
                            }
                            if (aolrVar4 != null) {
                                i2 = 3;
                                f4 = fFloatValue5;
                                agjxVar = agjxVar2;
                                if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)) != java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5))) {
                                    mapAT2 = mapAT2;
                                    float fMin3 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                                    fFloatValue2 = fFloatValue2;
                                    float fMin4 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                                    f3 = f3;
                                    long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fMin3);
                                    int iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fMin4);
                                    f20 = 0.0f;
                                    jO = (jFloatToRawIntBits << c5) | (((long) iFloatToRawIntBits) & j4);
                                }
                                this.G = fFloatValue;
                                this.H = fFloatValue2;
                                mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                                mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                                defpackage.agkz agkzVar2 = defpackage.agln.g;
                                obj2 = mapAT2.get(agkzVar2);
                                if (obj2 instanceof float[]) {
                                    obj3 = (float[]) obj2;
                                } else {
                                    obj3 = aolrVar3;
                                }
                                r3 = obj3;
                                if (obj3 == null) {
                                    float[] fArr4 = new float[4];
                                    fArr4[i] = f20;
                                    fArr4[r17] = f20;
                                    fArr4[c] = f20;
                                    fArr4[i2] = f20;
                                    r3 = fArr4;
                                }
                                if (agjlVar.g || r3.length != 4) {
                                    i3 = i2;
                                    f5 = f3;
                                    r4 = r3;
                                } else {
                                    float fMax = java.lang.Math.max(f20, (float) r3[i]);
                                    float fMax2 = java.lang.Math.max(f20, (float) r3[r17]);
                                    float fMax3 = java.lang.Math.max(f20, (float) r3[c]);
                                    i3 = i2;
                                    float fMax4 = java.lang.Math.max(f20, (float) r3[i3]);
                                    defpackage.agjk agjkVar = new defpackage.agjk(fMax4 + fMax2, fMax3 + fMax, fMax4 + fMax3, fMax2 + fMax);
                                    f5 = f3;
                                    float fMax5 = java.lang.Math.max(0.0f, f5);
                                    float fMax6 = java.lang.Math.max(0.0f, fMin);
                                    float f24 = agjkVar.a;
                                    float fMin5 = (f24 <= fMax5 || f24 <= 1.0E-6f) ? 1.0f : java.lang.Math.min(1.0f, fMax5 / f24);
                                    float f25 = agjkVar.b;
                                    if (f25 > fMax5 && f25 > 1.0E-6f) {
                                        fMin5 = java.lang.Math.min(fMin5, fMax5 / f25);
                                    }
                                    float f26 = agjkVar.c;
                                    if (f26 > fMax6 && f26 > 1.0E-6f) {
                                        fMin5 = java.lang.Math.min(fMin5, fMax6 / f26);
                                    }
                                    float f27 = agjkVar.d;
                                    if (f27 > fMax6 && f27 > 1.0E-6f) {
                                        fMin5 = java.lang.Math.min(fMin5, fMax6 / f27);
                                    }
                                    r4 = r3;
                                    if (fMin5 != 1.0f) {
                                        float[] fArr5 = new float[4];
                                        fArr5[i] = java.lang.Math.max(0.0f, (float) r3[i]) * fMin5;
                                        fArr5[r17] = java.lang.Math.max(0.0f, (float) r3[r17]) * fMin5;
                                        fArr5[c] = java.lang.Math.max(0.0f, (float) r3[c]) * fMin5;
                                        fArr5[i3] = java.lang.Math.max(0.0f, (float) r3[i3]) * fMin5;
                                        r4 = fArr5;
                                    }
                                }
                                mapAT2.put(agkzVar2, r4);
                                if (agjaVar.d != null) {
                                    length = r4.length;
                                    defpackage.agla aglaVar = defpackage.agln.z;
                                    if (length == 0) {
                                        aolrVarValueOf = aolrVar3;
                                    } else {
                                        Min = r4[i];
                                        iCD = ajsz.cD((float[]) r4);
                                        if (iCD > 0) {
                                            r8 = r17;
                                            r0 = Min;
                                            while (true) {
                                                Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                                if (r8 != iCD) {
                                                    break;
                                                }
                                                r0 = Min;
                                                r8++;
                                            }
                                        }
                                        aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                                    }
                                    if (aolrVarValueOf != null) {
                                        fFloatValue3 = aolrVarValueOf.floatValue();
                                    } else {
                                        fFloatValue3 = 0.0f;
                                    }
                                    mapAT2.put(aglaVar, java.lang.Float.valueOf(fFloatValue3));
                                }
                                pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                                android.util.SizeF sizeF = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                                android.util.SizeF sizeF2 = new android.util.SizeF(f5, fMin);
                                float f28 = pointF.x;
                                float width = sizeF.getWidth();
                                float width2 = sizeF2.getWidth();
                                if (pointF.x < 0.5d) {
                                    fD = defpackage.aglz.c(fArr3);
                                } else {
                                    fD = defpackage.aglz.d(fArr3);
                                }
                                float fM = defpackage.agmc.m(f28, width, width2, fD);
                                float f29 = pointF.y;
                                float height = sizeF.getHeight();
                                float height2 = sizeF2.getHeight();
                                if (pointF.y < 0.5d) {
                                    fA = defpackage.aglz.e(fArr3);
                                } else {
                                    fA = defpackage.aglz.a(fArr3);
                                }
                                android.graphics.PointF pointF2 = new android.graphics.PointF(fM, defpackage.agmc.m(f29, height, height2, fA));
                                mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF2.x));
                                mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF2.y));
                                aglbVar = this.f;
                                map = this.m;
                                aooh.f(aglbVar, "shader");
                                aooh.f(map, "lastSetResolvedUniforms");
                                for (java.util.Map.Entry entry2 : mapAT2.entrySet()) {
                                    aglvVar = (defpackage.aglv) entry2.getKey();
                                    value = entry2.getValue();
                                    obj5 = map.get(aglvVar);
                                    j$.util.Objects.checkIndex(i, i3);
                                    if (value == null) {
                                        if (aooh.n(obj5, value)) {
                                            continue;
                                        } else {
                                            try {
                                                strA = aglvVar.a();
                                                j$.util.Objects.checkIndex(0, 12);
                                                if (aglvVar == null) {
                                                    if (aglvVar instanceof defpackage.agkw) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                    } else if (aglvVar instanceof defpackage.agle) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    } else if (aglvVar instanceof defpackage.aglg) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                    } else {
                                                        if (aglvVar instanceof defpackage.agkx) {
                                                            fArr = fArr3;
                                                            try {
                                                                j$.util.Objects.checkIndex(0, 3);
                                                                if (value == null) {
                                                                    if (value instanceof cqg) {
                                                                        f19 = f5;
                                                                        try {
                                                                            iIntValue = cfd.L(((cqg) value).a);
                                                                        } catch (java.lang.Exception e) {
                                                                            e = e;
                                                                            android.util.Log.e("UniformShaderSetter", "Failed to set uniform " + aglvVar.a() + ": " + e, e);
                                                                        }
                                                                    } else {
                                                                        f19 = f5;
                                                                        if (value instanceof java.lang.Integer) {
                                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                                        }
                                                                    }
                                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                                }
                                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                            } catch (java.lang.Exception e2) {
                                                                e = e2;
                                                                f19 = f5;
                                                                android.util.Log.e("UniformShaderSetter", "Failed to set uniform " + aglvVar.a() + ": " + e, e);
                                                                fArr3 = fArr;
                                                                f5 = f19;
                                                                i = 0;
                                                                i3 = 3;
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            f19 = f5;
                                                            if (aglvVar instanceof defpackage.aglc) {
                                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                                            } else if (aglvVar instanceof defpackage.agll) {
                                                                if (value instanceof android.graphics.BitmapShader) {
                                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                                } else {
                                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                                }
                                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                                aglbVar.setIntUniform(strA, (int[]) value);
                                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                                            } else if (aglvVar instanceof defpackage.agli) {
                                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                                long j5 = ((cpm) value).a;
                                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j5 >> c5)), java.lang.Float.intBitsToFloat((int) (j5 & j4)));
                                                            } else {
                                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                                    throw aolrVar3;
                                                                }
                                                                if (aglvVar instanceof defpackage.aglu) {
                                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                                }
                                                            }
                                                        }
                                                        fArr3 = fArr;
                                                        f5 = f19;
                                                    }
                                                }
                                                throw new aois();
                                            } catch (java.lang.Exception e3) {
                                                e = e3;
                                                fArr = fArr3;
                                            }
                                        }
                                    } else if (value instanceof float[]) {
                                        if ((obj5 instanceof float[]) || !java.util.Arrays.equals((float[]) obj5, (float[]) value)) {
                                            strA = aglvVar.a();
                                            j$.util.Objects.checkIndex(0, 12);
                                            if (aglvVar == null) {
                                                if (aglvVar instanceof defpackage.agkw) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                } else if (aglvVar instanceof defpackage.agle) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                } else if (aglvVar instanceof defpackage.aglg) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                } else {
                                                    if (aglvVar instanceof defpackage.agkx) {
                                                        fArr = fArr3;
                                                        j$.util.Objects.checkIndex(0, 3);
                                                        if (value == null) {
                                                            if (value instanceof cqg) {
                                                                f19 = f5;
                                                                iIntValue = cfd.L(((cqg) value).a);
                                                            } else {
                                                                f19 = f5;
                                                                if (value instanceof java.lang.Integer) {
                                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                                }
                                                            }
                                                            aglbVar.setColorUniform(strA, iIntValue);
                                                        }
                                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                    }
                                                    fArr = fArr3;
                                                    f19 = f5;
                                                    if (aglvVar instanceof defpackage.aglc) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agll) {
                                                        if (value instanceof android.graphics.BitmapShader) {
                                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                        } else {
                                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                        }
                                                    } else if (aglvVar instanceof defpackage.aglf) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                        aglbVar.setIntUniform(strA, (int[]) value);
                                                    } else if (aglvVar instanceof defpackage.aglh) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agli) {
                                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                        long j6 = ((cpm) value).a;
                                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j6 >> c5)), java.lang.Float.intBitsToFloat((int) (j6 & j4)));
                                                    } else {
                                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                            throw aolrVar3;
                                                        }
                                                        if (aglvVar instanceof defpackage.aglu) {
                                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                        }
                                                    }
                                                    fArr3 = fArr;
                                                    f5 = f19;
                                                }
                                            }
                                            throw new aois();
                                        }
                                    } else if (value instanceof int[]) {
                                        if ((obj5 instanceof int[]) || !java.util.Arrays.equals((int[]) obj5, (int[]) value)) {
                                            strA = aglvVar.a();
                                            j$.util.Objects.checkIndex(0, 12);
                                            if (aglvVar == null) {
                                                if (aglvVar instanceof defpackage.agkw) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                } else if (aglvVar instanceof defpackage.agle) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                } else if (aglvVar instanceof defpackage.aglg) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                } else {
                                                    if (aglvVar instanceof defpackage.agkx) {
                                                        fArr = fArr3;
                                                        j$.util.Objects.checkIndex(0, 3);
                                                        if (value == null) {
                                                            if (value instanceof cqg) {
                                                                f19 = f5;
                                                                iIntValue = cfd.L(((cqg) value).a);
                                                            } else {
                                                                f19 = f5;
                                                                if (value instanceof java.lang.Integer) {
                                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                                }
                                                            }
                                                            aglbVar.setColorUniform(strA, iIntValue);
                                                        }
                                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                    }
                                                    fArr = fArr3;
                                                    f19 = f5;
                                                    if (aglvVar instanceof defpackage.aglc) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agll) {
                                                        if (value instanceof android.graphics.BitmapShader) {
                                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                        } else {
                                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                        }
                                                    } else if (aglvVar instanceof defpackage.aglf) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                        aglbVar.setIntUniform(strA, (int[]) value);
                                                    } else if (aglvVar instanceof defpackage.aglh) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agli) {
                                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                        long j7 = ((cpm) value).a;
                                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j7 >> c5)), java.lang.Float.intBitsToFloat((int) (j7 & j4)));
                                                    } else {
                                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                            throw aolrVar3;
                                                        }
                                                        if (aglvVar instanceof defpackage.aglu) {
                                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                        }
                                                    }
                                                    fArr3 = fArr;
                                                    f5 = f19;
                                                }
                                            }
                                            throw new aois();
                                        }
                                    } else {
                                        if (aooh.n(obj5, value)) {
                                            strA = aglvVar.a();
                                            j$.util.Objects.checkIndex(0, 12);
                                            if (aglvVar == null) {
                                                if (aglvVar instanceof defpackage.agkw) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                } else if (aglvVar instanceof defpackage.agle) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                } else if (aglvVar instanceof defpackage.aglg) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                } else {
                                                    if (aglvVar instanceof defpackage.agkx) {
                                                        fArr = fArr3;
                                                        j$.util.Objects.checkIndex(0, 3);
                                                        if (value == null) {
                                                            if (value instanceof cqg) {
                                                                f19 = f5;
                                                                iIntValue = cfd.L(((cqg) value).a);
                                                            } else {
                                                                f19 = f5;
                                                                if (value instanceof java.lang.Integer) {
                                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                                }
                                                            }
                                                            aglbVar.setColorUniform(strA, iIntValue);
                                                        }
                                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                    }
                                                    fArr = fArr3;
                                                    f19 = f5;
                                                    if (aglvVar instanceof defpackage.aglc) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agll) {
                                                        if (value instanceof android.graphics.BitmapShader) {
                                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                        } else {
                                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                        }
                                                    } else if (aglvVar instanceof defpackage.aglf) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                        aglbVar.setIntUniform(strA, (int[]) value);
                                                    } else if (aglvVar instanceof defpackage.aglh) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agli) {
                                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                        long j8 = ((cpm) value).a;
                                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j8 >> c5)), java.lang.Float.intBitsToFloat((int) (j8 & j4)));
                                                    } else {
                                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                            throw aolrVar3;
                                                        }
                                                        if (aglvVar instanceof defpackage.aglu) {
                                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                        }
                                                    }
                                                    fArr3 = fArr;
                                                    f5 = f19;
                                                }
                                            }
                                            throw new aois();
                                        }
                                        continue;
                                    }
                                    i = 0;
                                    i3 = 3;
                                }
                                float[] fArr6 = fArr3;
                                float f30 = f5;
                                this.m = ajsz.aS(mapAT2);
                                obj4 = mapAT2.get(defpackage.agln.aS);
                                if (obj4 instanceof java.lang.Float) {
                                    aolrVar5 = (java.lang.Float) obj4;
                                } else {
                                    aolrVar5 = aolrVar3;
                                }
                                long jLongValue2 = ((java.lang.Number) this.r.a()).longValue();
                                l = this.E;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                j = jLongValue2 - jLongValue;
                                f6 = j / 1000.0f;
                                this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                                agjmVar = this.a.k;
                                if (agjmVar != null) {
                                    if (agjmVar.i != 0.0f) {
                                        f18 = agjmVar.j;
                                        if (f18 != 0.0f) {
                                            this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                            f9 = 0.0f;
                                        } else {
                                            f9 = 0.0f;
                                            this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                        }
                                    } else {
                                        f9 = 0.0f;
                                        this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                    }
                                    f10 = agjmVar.f;
                                    if (f10 > f9) {
                                        f17 = agjmVar.g;
                                        if (f17 > f9) {
                                            fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                                        } else {
                                            fL = f9;
                                        }
                                    } else {
                                        fL = f9;
                                    }
                                    f11 = agjmVar.h;
                                    if (f11 > f9) {
                                        f12 = ((6.2831855f / f11) * f6) + fL;
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    f7 = 2.0f;
                                    this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                                    if (agjmVar.c != 0.0f) {
                                        f13 = agjmVar.b;
                                        if (f13 != 0.0f) {
                                            f14 = agjmVar.e;
                                            if (f14 != 0.0f) {
                                                f15 = f6 % f14;
                                                float fL2 = defpackage.agmc.l(f13);
                                                java.util.List list = agjmVar.a;
                                                float fFloor = (float) java.lang.Math.floor((f6 / f14) % list.size());
                                                float f31 = fFloor * fL2;
                                                float fC = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f31, (fFloor + 1.0f) * fL2, 0.0f);
                                                float f32 = fC - f31;
                                                if (this.b == defpackage.agiz.EXIT) {
                                                    defpackage.agmc.M(r17);
                                                } else {
                                                    defpackage.agmc.M(false);
                                                }
                                                this.f.setFloatUniform(defpackage.agln.aZ.b, fC + fL);
                                                this.f.setFloatUniform(defpackage.agln.bd.b, ((f32 / fL2) + fFloor) % list.size());
                                                fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                                defpackage.aglb aglbVar2 = this.f;
                                                java.lang.String str = defpackage.agln.aY.b;
                                                if (f15 < fMin2) {
                                                    f16 = f15 / fMin2;
                                                } else {
                                                    f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                                }
                                                aglbVar2.setFloatUniform(str, f16);
                                            }
                                            if (aolrVar5 != null && aolrVar5.floatValue() > f8) {
                                                int i5 = defpackage.agjj.a;
                                                this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                            }
                                            float fB2 = f30 + defpackage.aglz.b(fArr6);
                                            float f33 = f4 + f4;
                                            float f34 = defpackage.aglz.f(fArr6) + fMin;
                                            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fB2 + f33);
                                            long jFloatToRawIntBits3 = ((long) java.lang.Float.floatToRawIntBits(f34 + f33)) & j4;
                                            long jFloatToRawIntBits4 = (((long) java.lang.Float.floatToRawIntBits(f30 + defpackage.aglz.b(fArr6))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr6))) & j4);
                                            den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF2.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF2.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits4 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits2 << c5) | jFloatToRawIntBits3, 0.0f, (den) null, 0, 120);
                                            aiiVar = this.d;
                                            if (aiiVar.k() && (defpackage.agmc.n(mapAT2) || !(agjmVar == null || this.b == defpackage.agiz.HIDDEN))) {
                                                aolr aolrVar6 = aolrVar3;
                                                this.e = aoov.an(M(), aolrVar6, 0, new defpackage.adzb(this, (aoln) aolrVar6, 17), 3);
                                            } else if (aiiVar.k() && !defpackage.agmc.n(mapAT2) && ((agjmVar == null || this.b == defpackage.agiz.HIDDEN) && (aoubVar = this.e) != null)) {
                                                aoubVar.s((java.util.concurrent.CancellationException) null);
                                            }
                                            dbmVar.D();
                                            if (agjxVar == null || !this.k.isEmpty()) {
                                                cfo.w(this);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                                    f8 = 0.0f;
                                    this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                                    this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                                    if (aolrVar5 != null) {
                                        int i6 = defpackage.agjj.a;
                                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                    }
                                    float fB3 = f30 + defpackage.aglz.b(fArr6);
                                    float f35 = f4 + f4;
                                    float f36 = defpackage.aglz.f(fArr6) + fMin;
                                    long jFloatToRawIntBits5 = java.lang.Float.floatToRawIntBits(fB3 + f35);
                                    long jFloatToRawIntBits6 = ((long) java.lang.Float.floatToRawIntBits(f36 + f35)) & j4;
                                    long jFloatToRawIntBits7 = (((long) java.lang.Float.floatToRawIntBits(f30 + defpackage.aglz.b(fArr6))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr6))) & j4);
                                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF2.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits7 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF2.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits7 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits5 << c5) | jFloatToRawIntBits6, 0.0f, (den) null, 0, 120);
                                    aiiVar = this.d;
                                    if (aiiVar.k()) {
                                        if (aiiVar.k()) {
                                            aoubVar.s((java.util.concurrent.CancellationException) null);
                                        }
                                    } else if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                    dbmVar.D();
                                    if (agjxVar == null) {
                                    }
                                    cfo.w(this);
                                    return;
                                }
                                f7 = 2.0f;
                                f8 = 0.0f;
                                if (aolrVar5 != null) {
                                    int i7 = defpackage.agjj.a;
                                    this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                }
                                float fB4 = f30 + defpackage.aglz.b(fArr6);
                                float f37 = f4 + f4;
                                float f38 = defpackage.aglz.f(fArr6) + fMin;
                                long jFloatToRawIntBits8 = java.lang.Float.floatToRawIntBits(fB4 + f37);
                                long jFloatToRawIntBits9 = ((long) java.lang.Float.floatToRawIntBits(f38 + f37)) & j4;
                                long jFloatToRawIntBits10 = (((long) java.lang.Float.floatToRawIntBits(f30 + defpackage.aglz.b(fArr6))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr6))) & j4);
                                den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF2.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits10 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF2.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits10 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits8 << c5) | jFloatToRawIntBits9, 0.0f, (den) null, 0, 120);
                                aiiVar = this.d;
                                if (aiiVar.k()) {
                                    if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                } else if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                dbmVar.D();
                                if (agjxVar == null) {
                                }
                                cfo.w(this);
                                return;
                            }
                            i2 = 3;
                            f4 = fFloatValue5;
                            agjxVar = agjxVar2;
                            jO = dbmVar.o();
                            this.G = fFloatValue;
                            this.H = fFloatValue2;
                            mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                            mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                            defpackage.agkz agkzVar3 = defpackage.agln.g;
                            obj2 = mapAT2.get(agkzVar3);
                            if (obj2 instanceof float[]) {
                                obj3 = (float[]) obj2;
                            } else {
                                obj3 = aolrVar3;
                            }
                            r3 = obj3;
                            if (obj3 == null) {
                                float[] fArr7 = new float[4];
                                fArr7[i] = f20;
                                fArr7[r17] = f20;
                                fArr7[c] = f20;
                                fArr7[i2] = f20;
                                r3 = fArr7;
                            }
                            if (agjlVar.g) {
                                i3 = i2;
                                f5 = f3;
                                r4 = r3;
                            } else {
                                i3 = i2;
                                f5 = f3;
                                r4 = r3;
                            }
                            mapAT2.put(agkzVar3, r4);
                            if (agjaVar.d != null) {
                                length = r4.length;
                                defpackage.agla aglaVar2 = defpackage.agln.z;
                                if (length == 0) {
                                    aolrVarValueOf = aolrVar3;
                                } else {
                                    Min = r4[i];
                                    iCD = ajsz.cD((float[]) r4);
                                    if (iCD > 0) {
                                        r8 = r17;
                                        r0 = Min;
                                        while (true) {
                                            Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                            if (r8 != iCD) {
                                                break;
                                                break;
                                            } else {
                                                r0 = Min;
                                                r8++;
                                            }
                                        }
                                    }
                                    aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                                }
                                if (aolrVarValueOf != null) {
                                    fFloatValue3 = aolrVarValueOf.floatValue();
                                } else {
                                    fFloatValue3 = 0.0f;
                                }
                                mapAT2.put(aglaVar2, java.lang.Float.valueOf(fFloatValue3));
                            }
                            pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                            android.util.SizeF sizeF3 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                            android.util.SizeF sizeF4 = new android.util.SizeF(f5, fMin);
                            float f210 = pointF.x;
                            float width3 = sizeF3.getWidth();
                            float width4 = sizeF4.getWidth();
                            if (pointF.x < 0.5d) {
                                fD = defpackage.aglz.c(fArr3);
                            } else {
                                fD = defpackage.aglz.d(fArr3);
                            }
                            float fM2 = defpackage.agmc.m(f210, width3, width4, fD);
                            float f211 = pointF.y;
                            float height3 = sizeF3.getHeight();
                            float height4 = sizeF4.getHeight();
                            if (pointF.y < 0.5d) {
                                fA = defpackage.aglz.e(fArr3);
                            } else {
                                fA = defpackage.aglz.a(fArr3);
                            }
                            android.graphics.PointF pointF3 = new android.graphics.PointF(fM2, defpackage.agmc.m(f211, height3, height4, fA));
                            mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF3.x));
                            mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF3.y));
                            aglbVar = this.f;
                            map = this.m;
                            aooh.f(aglbVar, "shader");
                            aooh.f(map, "lastSetResolvedUniforms");
                            while (r7.hasNext()) {
                                aglvVar = (defpackage.aglv) entry2.getKey();
                                value = entry2.getValue();
                                obj5 = map.get(aglvVar);
                                j$.util.Objects.checkIndex(i, i3);
                                if (value == null) {
                                    if (aooh.n(obj5, value)) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j9 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j9 >> c5)), java.lang.Float.intBitsToFloat((int) (j9 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    continue;
                                } else {
                                    if (value instanceof float[]) {
                                        if (obj5 instanceof float[]) {
                                            strA = aglvVar.a();
                                            j$.util.Objects.checkIndex(0, 12);
                                            if (aglvVar == null) {
                                                if (aglvVar instanceof defpackage.agkw) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                } else if (aglvVar instanceof defpackage.agle) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                } else if (aglvVar instanceof defpackage.aglg) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                } else {
                                                    if (aglvVar instanceof defpackage.agkx) {
                                                        fArr = fArr3;
                                                        j$.util.Objects.checkIndex(0, 3);
                                                        if (value == null) {
                                                            if (value instanceof cqg) {
                                                                f19 = f5;
                                                                iIntValue = cfd.L(((cqg) value).a);
                                                            } else {
                                                                f19 = f5;
                                                                if (value instanceof java.lang.Integer) {
                                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                                }
                                                            }
                                                            aglbVar.setColorUniform(strA, iIntValue);
                                                        }
                                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                    }
                                                    fArr = fArr3;
                                                    f19 = f5;
                                                    if (aglvVar instanceof defpackage.aglc) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agll) {
                                                        if (value instanceof android.graphics.BitmapShader) {
                                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                        } else {
                                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                        }
                                                    } else if (aglvVar instanceof defpackage.aglf) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                        aglbVar.setIntUniform(strA, (int[]) value);
                                                    } else if (aglvVar instanceof defpackage.aglh) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agli) {
                                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                        long j10 = ((cpm) value).a;
                                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j10 >> c5)), java.lang.Float.intBitsToFloat((int) (j10 & j4)));
                                                    } else {
                                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                            throw aolrVar3;
                                                        }
                                                        if (aglvVar instanceof defpackage.aglu) {
                                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                        }
                                                    }
                                                    fArr3 = fArr;
                                                    f5 = f19;
                                                }
                                            }
                                            throw new aois();
                                        }
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j11 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11 >> c5)), java.lang.Float.intBitsToFloat((int) (j11 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    if (value instanceof int[]) {
                                        if (obj5 instanceof int[]) {
                                            strA = aglvVar.a();
                                            j$.util.Objects.checkIndex(0, 12);
                                            if (aglvVar == null) {
                                                if (aglvVar instanceof defpackage.agkw) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                } else if (aglvVar instanceof defpackage.agle) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                } else if (aglvVar instanceof defpackage.aglg) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                } else {
                                                    if (aglvVar instanceof defpackage.agkx) {
                                                        fArr = fArr3;
                                                        j$.util.Objects.checkIndex(0, 3);
                                                        if (value == null) {
                                                            if (value instanceof cqg) {
                                                                f19 = f5;
                                                                iIntValue = cfd.L(((cqg) value).a);
                                                            } else {
                                                                f19 = f5;
                                                                if (value instanceof java.lang.Integer) {
                                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                                }
                                                            }
                                                            aglbVar.setColorUniform(strA, iIntValue);
                                                        }
                                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                    }
                                                    fArr = fArr3;
                                                    f19 = f5;
                                                    if (aglvVar instanceof defpackage.aglc) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agll) {
                                                        if (value instanceof android.graphics.BitmapShader) {
                                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                        } else {
                                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                        }
                                                    } else if (aglvVar instanceof defpackage.aglf) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                        aglbVar.setIntUniform(strA, (int[]) value);
                                                    } else if (aglvVar instanceof defpackage.aglh) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agli) {
                                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                        long j12 = ((cpm) value).a;
                                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j12 >> c5)), java.lang.Float.intBitsToFloat((int) (j12 & j4)));
                                                    } else {
                                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                            throw aolrVar3;
                                                        }
                                                        if (aglvVar instanceof defpackage.aglu) {
                                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                        }
                                                    }
                                                    fArr3 = fArr;
                                                    f5 = f19;
                                                }
                                            }
                                            throw new aois();
                                        }
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j13 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j13 >> c5)), java.lang.Float.intBitsToFloat((int) (j13 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    if (aooh.n(obj5, value)) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j14 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j14 >> c5)), java.lang.Float.intBitsToFloat((int) (j14 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    continue;
                                }
                                i = 0;
                                i3 = 3;
                            }
                            float[] fArr8 = fArr3;
                            float f39 = f5;
                            this.m = ajsz.aS(mapAT2);
                            obj4 = mapAT2.get(defpackage.agln.aS);
                            if (obj4 instanceof java.lang.Float) {
                                aolrVar5 = (java.lang.Float) obj4;
                            } else {
                                aolrVar5 = aolrVar3;
                            }
                            long jLongValue3 = ((java.lang.Number) this.r.a()).longValue();
                            l = this.E;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            j = jLongValue3 - jLongValue;
                            f6 = j / 1000.0f;
                            this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                            agjmVar = this.a.k;
                            if (agjmVar != null) {
                                if (agjmVar.i != 0.0f) {
                                    f18 = agjmVar.j;
                                    if (f18 != 0.0f) {
                                        this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                        f9 = 0.0f;
                                    } else {
                                        f9 = 0.0f;
                                        this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                    }
                                } else {
                                    f9 = 0.0f;
                                    this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                }
                                f10 = agjmVar.f;
                                if (f10 > f9) {
                                    f17 = agjmVar.g;
                                    if (f17 > f9) {
                                        fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                                    } else {
                                        fL = f9;
                                    }
                                } else {
                                    fL = f9;
                                }
                                f11 = agjmVar.h;
                                if (f11 > f9) {
                                    f12 = ((6.2831855f / f11) * f6) + fL;
                                } else {
                                    f12 = 0.0f;
                                }
                                f7 = 2.0f;
                                this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                                if (agjmVar.c != 0.0f) {
                                    f13 = agjmVar.b;
                                    if (f13 != 0.0f) {
                                        f14 = agjmVar.e;
                                        if (f14 != 0.0f) {
                                            f15 = f6 % f14;
                                            float fL3 = defpackage.agmc.l(f13);
                                            java.util.List list2 = agjmVar.a;
                                            float fFloor2 = (float) java.lang.Math.floor((f6 / f14) % list2.size());
                                            float f310 = fFloor2 * fL3;
                                            float fC2 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f310, (fFloor2 + 1.0f) * fL3, 0.0f);
                                            float f311 = fC2 - f310;
                                            if (this.b == defpackage.agiz.EXIT) {
                                                defpackage.agmc.M(r17);
                                            } else {
                                                defpackage.agmc.M(false);
                                            }
                                            this.f.setFloatUniform(defpackage.agln.aZ.b, fC2 + fL);
                                            this.f.setFloatUniform(defpackage.agln.bd.b, ((f311 / fL3) + fFloor2) % list2.size());
                                            fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                            defpackage.aglb aglbVar3 = this.f;
                                            java.lang.String str2 = defpackage.agln.aY.b;
                                            if (f15 < fMin2) {
                                                f16 = f15 / fMin2;
                                            } else {
                                                f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                            }
                                            aglbVar3.setFloatUniform(str2, f16);
                                        }
                                        if (aolrVar5 != null) {
                                            int i8 = defpackage.agjj.a;
                                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                        }
                                        float fB5 = f39 + defpackage.aglz.b(fArr8);
                                        float f312 = f4 + f4;
                                        float f313 = defpackage.aglz.f(fArr8) + fMin;
                                        long jFloatToRawIntBits11 = java.lang.Float.floatToRawIntBits(fB5 + f312);
                                        long jFloatToRawIntBits12 = ((long) java.lang.Float.floatToRawIntBits(f313 + f312)) & j4;
                                        long jFloatToRawIntBits13 = (((long) java.lang.Float.floatToRawIntBits(f39 + defpackage.aglz.b(fArr8))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr8))) & j4);
                                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF3.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits13 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF3.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits13 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits11 << c5) | jFloatToRawIntBits12, 0.0f, (den) null, 0, 120);
                                        aiiVar = this.d;
                                        if (aiiVar.k()) {
                                            if (aiiVar.k()) {
                                                aoubVar.s((java.util.concurrent.CancellationException) null);
                                            }
                                        } else if (aiiVar.k()) {
                                            aoubVar.s((java.util.concurrent.CancellationException) null);
                                        }
                                        dbmVar.D();
                                        if (agjxVar == null) {
                                        }
                                        cfo.w(this);
                                        return;
                                    }
                                }
                                this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                                f8 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                                this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                                if (aolrVar5 != null) {
                                    int i9 = defpackage.agjj.a;
                                    this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                }
                                float fB6 = f39 + defpackage.aglz.b(fArr8);
                                float f314 = f4 + f4;
                                float f315 = defpackage.aglz.f(fArr8) + fMin;
                                long jFloatToRawIntBits14 = java.lang.Float.floatToRawIntBits(fB6 + f314);
                                long jFloatToRawIntBits15 = ((long) java.lang.Float.floatToRawIntBits(f315 + f314)) & j4;
                                long jFloatToRawIntBits16 = (((long) java.lang.Float.floatToRawIntBits(f39 + defpackage.aglz.b(fArr8))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr8))) & j4);
                                den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF3.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits16 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF3.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits16 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits14 << c5) | jFloatToRawIntBits15, 0.0f, (den) null, 0, 120);
                                aiiVar = this.d;
                                if (aiiVar.k()) {
                                    if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                } else if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                dbmVar.D();
                                if (agjxVar == null) {
                                }
                                cfo.w(this);
                                return;
                            }
                            f7 = 2.0f;
                            f8 = 0.0f;
                            if (aolrVar5 != null) {
                                int i10 = defpackage.agjj.a;
                                this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                            }
                            float fB7 = f39 + defpackage.aglz.b(fArr8);
                            float f316 = f4 + f4;
                            float f317 = defpackage.aglz.f(fArr8) + fMin;
                            long jFloatToRawIntBits17 = java.lang.Float.floatToRawIntBits(fB7 + f316);
                            long jFloatToRawIntBits18 = ((long) java.lang.Float.floatToRawIntBits(f317 + f316)) & j4;
                            long jFloatToRawIntBits19 = (((long) java.lang.Float.floatToRawIntBits(f39 + defpackage.aglz.b(fArr8))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr8))) & j4);
                            den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF3.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits19 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF3.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits19 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits17 << c5) | jFloatToRawIntBits18, 0.0f, (den) null, 0, 120);
                            aiiVar = this.d;
                            if (aiiVar.k()) {
                                if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                            } else if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            dbmVar.D();
                            if (agjxVar == null) {
                            }
                            cfo.w(this);
                            return;
                        }
                        aolrVar3 = aolrVar;
                        if (aolrVar2 != null) {
                            fMin = java.lang.Math.min(fFloatValue, fFloatValue2);
                            aolrVar4 = aolrVar2;
                            f3 = fMin;
                        } else {
                            fMin = fFloatValue2;
                            f3 = fFloatValue;
                            aolrVar4 = aolrVar3;
                        }
                        if (aolrVar4 != null) {
                            i2 = 3;
                            f4 = fFloatValue5;
                            agjxVar = agjxVar2;
                            if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)) != java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5))) {
                                mapAT2 = mapAT2;
                                float fMin6 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                                fFloatValue2 = fFloatValue2;
                                float fMin7 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                                f3 = f3;
                                long jFloatToRawIntBits20 = java.lang.Float.floatToRawIntBits(fMin6);
                                int iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fMin7);
                                f20 = 0.0f;
                                jO = (jFloatToRawIntBits20 << c5) | (((long) iFloatToRawIntBits2) & j4);
                            }
                            this.G = fFloatValue;
                            this.H = fFloatValue2;
                            mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                            mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                            defpackage.agkz agkzVar4 = defpackage.agln.g;
                            obj2 = mapAT2.get(agkzVar4);
                            if (obj2 instanceof float[]) {
                                obj3 = (float[]) obj2;
                            } else {
                                obj3 = aolrVar3;
                            }
                            r3 = obj3;
                            if (obj3 == null) {
                                float[] fArr9 = new float[4];
                                fArr9[i] = f20;
                                fArr9[r17] = f20;
                                fArr9[c] = f20;
                                fArr9[i2] = f20;
                                r3 = fArr9;
                            }
                            if (agjlVar.g) {
                                i3 = i2;
                                f5 = f3;
                                r4 = r3;
                            } else {
                                i3 = i2;
                                f5 = f3;
                                r4 = r3;
                            }
                            mapAT2.put(agkzVar4, r4);
                            if (agjaVar.d != null) {
                                length = r4.length;
                                defpackage.agla aglaVar3 = defpackage.agln.z;
                                if (length == 0) {
                                    aolrVarValueOf = aolrVar3;
                                } else {
                                    Min = r4[i];
                                    iCD = ajsz.cD((float[]) r4);
                                    if (iCD > 0) {
                                        r8 = r17;
                                        r0 = Min;
                                        while (true) {
                                            Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                            if (r8 != iCD) {
                                                break;
                                                break;
                                            } else {
                                                r0 = Min;
                                                r8++;
                                            }
                                        }
                                    }
                                    aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                                }
                                if (aolrVarValueOf != null) {
                                    fFloatValue3 = aolrVarValueOf.floatValue();
                                } else {
                                    fFloatValue3 = 0.0f;
                                }
                                mapAT2.put(aglaVar3, java.lang.Float.valueOf(fFloatValue3));
                            }
                            pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                            android.util.SizeF sizeF5 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                            android.util.SizeF sizeF6 = new android.util.SizeF(f5, fMin);
                            float f212 = pointF.x;
                            float width5 = sizeF5.getWidth();
                            float width6 = sizeF6.getWidth();
                            if (pointF.x < 0.5d) {
                                fD = defpackage.aglz.c(fArr3);
                            } else {
                                fD = defpackage.aglz.d(fArr3);
                            }
                            float fM3 = defpackage.agmc.m(f212, width5, width6, fD);
                            float f213 = pointF.y;
                            float height5 = sizeF5.getHeight();
                            float height6 = sizeF6.getHeight();
                            if (pointF.y < 0.5d) {
                                fA = defpackage.aglz.e(fArr3);
                            } else {
                                fA = defpackage.aglz.a(fArr3);
                            }
                            android.graphics.PointF pointF4 = new android.graphics.PointF(fM3, defpackage.agmc.m(f213, height5, height6, fA));
                            mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF4.x));
                            mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF4.y));
                            aglbVar = this.f;
                            map = this.m;
                            aooh.f(aglbVar, "shader");
                            aooh.f(map, "lastSetResolvedUniforms");
                            while (r7.hasNext()) {
                                aglvVar = (defpackage.aglv) entry2.getKey();
                                value = entry2.getValue();
                                obj5 = map.get(aglvVar);
                                j$.util.Objects.checkIndex(i, i3);
                                if (value == null) {
                                    if (aooh.n(obj5, value)) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j15 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j15 >> c5)), java.lang.Float.intBitsToFloat((int) (j15 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    continue;
                                } else {
                                    if (value instanceof float[]) {
                                        if (obj5 instanceof float[]) {
                                            strA = aglvVar.a();
                                            j$.util.Objects.checkIndex(0, 12);
                                            if (aglvVar == null) {
                                                if (aglvVar instanceof defpackage.agkw) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                } else if (aglvVar instanceof defpackage.agle) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                } else if (aglvVar instanceof defpackage.aglg) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                } else {
                                                    if (aglvVar instanceof defpackage.agkx) {
                                                        fArr = fArr3;
                                                        j$.util.Objects.checkIndex(0, 3);
                                                        if (value == null) {
                                                            if (value instanceof cqg) {
                                                                f19 = f5;
                                                                iIntValue = cfd.L(((cqg) value).a);
                                                            } else {
                                                                f19 = f5;
                                                                if (value instanceof java.lang.Integer) {
                                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                                }
                                                            }
                                                            aglbVar.setColorUniform(strA, iIntValue);
                                                        }
                                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                    }
                                                    fArr = fArr3;
                                                    f19 = f5;
                                                    if (aglvVar instanceof defpackage.aglc) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agll) {
                                                        if (value instanceof android.graphics.BitmapShader) {
                                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                        } else {
                                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                        }
                                                    } else if (aglvVar instanceof defpackage.aglf) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                        aglbVar.setIntUniform(strA, (int[]) value);
                                                    } else if (aglvVar instanceof defpackage.aglh) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agli) {
                                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                        long j16 = ((cpm) value).a;
                                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j16 >> c5)), java.lang.Float.intBitsToFloat((int) (j16 & j4)));
                                                    } else {
                                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                            throw aolrVar3;
                                                        }
                                                        if (aglvVar instanceof defpackage.aglu) {
                                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                        }
                                                    }
                                                    fArr3 = fArr;
                                                    f5 = f19;
                                                }
                                            }
                                            throw new aois();
                                        }
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j17 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j17 >> c5)), java.lang.Float.intBitsToFloat((int) (j17 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    if (value instanceof int[]) {
                                        if (obj5 instanceof int[]) {
                                            strA = aglvVar.a();
                                            j$.util.Objects.checkIndex(0, 12);
                                            if (aglvVar == null) {
                                                if (aglvVar instanceof defpackage.agkw) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                                } else if (aglvVar instanceof defpackage.agle) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                } else if (aglvVar instanceof defpackage.aglg) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                                } else {
                                                    if (aglvVar instanceof defpackage.agkx) {
                                                        fArr = fArr3;
                                                        j$.util.Objects.checkIndex(0, 3);
                                                        if (value == null) {
                                                            if (value instanceof cqg) {
                                                                f19 = f5;
                                                                iIntValue = cfd.L(((cqg) value).a);
                                                            } else {
                                                                f19 = f5;
                                                                if (value instanceof java.lang.Integer) {
                                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                                }
                                                            }
                                                            aglbVar.setColorUniform(strA, iIntValue);
                                                        }
                                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                    }
                                                    fArr = fArr3;
                                                    f19 = f5;
                                                    if (aglvVar instanceof defpackage.aglc) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agll) {
                                                        if (value instanceof android.graphics.BitmapShader) {
                                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                        } else {
                                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                        }
                                                    } else if (aglvVar instanceof defpackage.aglf) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                        aglbVar.setIntUniform(strA, (int[]) value);
                                                    } else if (aglvVar instanceof defpackage.aglh) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                                    } else if (aglvVar instanceof defpackage.agli) {
                                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                        long j18 = ((cpm) value).a;
                                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j18 >> c5)), java.lang.Float.intBitsToFloat((int) (j18 & j4)));
                                                    } else {
                                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                            throw aolrVar3;
                                                        }
                                                        if (aglvVar instanceof defpackage.aglu) {
                                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                        }
                                                    }
                                                    fArr3 = fArr;
                                                    f5 = f19;
                                                }
                                            }
                                            throw new aois();
                                        }
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j19 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j19 >> c5)), java.lang.Float.intBitsToFloat((int) (j19 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    if (aooh.n(obj5, value)) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j110 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j110 >> c5)), java.lang.Float.intBitsToFloat((int) (j110 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    continue;
                                }
                                i = 0;
                                i3 = 3;
                            }
                            float[] fArr10 = fArr3;
                            float f318 = f5;
                            this.m = ajsz.aS(mapAT2);
                            obj4 = mapAT2.get(defpackage.agln.aS);
                            if (obj4 instanceof java.lang.Float) {
                                aolrVar5 = (java.lang.Float) obj4;
                            } else {
                                aolrVar5 = aolrVar3;
                            }
                            long jLongValue4 = ((java.lang.Number) this.r.a()).longValue();
                            l = this.E;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            j = jLongValue4 - jLongValue;
                            f6 = j / 1000.0f;
                            this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                            agjmVar = this.a.k;
                            if (agjmVar != null) {
                                if (agjmVar.i != 0.0f) {
                                    f18 = agjmVar.j;
                                    if (f18 != 0.0f) {
                                        this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                        f9 = 0.0f;
                                    } else {
                                        f9 = 0.0f;
                                        this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                    }
                                } else {
                                    f9 = 0.0f;
                                    this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                }
                                f10 = agjmVar.f;
                                if (f10 > f9) {
                                    f17 = agjmVar.g;
                                    if (f17 > f9) {
                                        fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                                    } else {
                                        fL = f9;
                                    }
                                } else {
                                    fL = f9;
                                }
                                f11 = agjmVar.h;
                                if (f11 > f9) {
                                    f12 = ((6.2831855f / f11) * f6) + fL;
                                } else {
                                    f12 = 0.0f;
                                }
                                f7 = 2.0f;
                                this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                                if (agjmVar.c != 0.0f) {
                                    f13 = agjmVar.b;
                                    if (f13 != 0.0f) {
                                        f14 = agjmVar.e;
                                        if (f14 != 0.0f) {
                                            f15 = f6 % f14;
                                            float fL4 = defpackage.agmc.l(f13);
                                            java.util.List list3 = agjmVar.a;
                                            float fFloor3 = (float) java.lang.Math.floor((f6 / f14) % list3.size());
                                            float f319 = fFloor3 * fL4;
                                            float fC3 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f319, (fFloor3 + 1.0f) * fL4, 0.0f);
                                            float f3110 = fC3 - f319;
                                            if (this.b == defpackage.agiz.EXIT) {
                                                defpackage.agmc.M(r17);
                                            } else {
                                                defpackage.agmc.M(false);
                                            }
                                            this.f.setFloatUniform(defpackage.agln.aZ.b, fC3 + fL);
                                            this.f.setFloatUniform(defpackage.agln.bd.b, ((f3110 / fL4) + fFloor3) % list3.size());
                                            fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                            defpackage.aglb aglbVar4 = this.f;
                                            java.lang.String str3 = defpackage.agln.aY.b;
                                            if (f15 < fMin2) {
                                                f16 = f15 / fMin2;
                                            } else {
                                                f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                            }
                                            aglbVar4.setFloatUniform(str3, f16);
                                        }
                                        if (aolrVar5 != null) {
                                            int i11 = defpackage.agjj.a;
                                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                        }
                                        float fB8 = f318 + defpackage.aglz.b(fArr10);
                                        float f3111 = f4 + f4;
                                        float f3112 = defpackage.aglz.f(fArr10) + fMin;
                                        long jFloatToRawIntBits110 = java.lang.Float.floatToRawIntBits(fB8 + f3111);
                                        long jFloatToRawIntBits111 = ((long) java.lang.Float.floatToRawIntBits(f3112 + f3111)) & j4;
                                        long jFloatToRawIntBits112 = (((long) java.lang.Float.floatToRawIntBits(f318 + defpackage.aglz.b(fArr10))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr10))) & j4);
                                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF4.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits112 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF4.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits112 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits110 << c5) | jFloatToRawIntBits111, 0.0f, (den) null, 0, 120);
                                        aiiVar = this.d;
                                        if (aiiVar.k()) {
                                            if (aiiVar.k()) {
                                                aoubVar.s((java.util.concurrent.CancellationException) null);
                                            }
                                        } else if (aiiVar.k()) {
                                            aoubVar.s((java.util.concurrent.CancellationException) null);
                                        }
                                        dbmVar.D();
                                        if (agjxVar == null) {
                                        }
                                        cfo.w(this);
                                        return;
                                    }
                                }
                                this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                                f8 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                                this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                                if (aolrVar5 != null) {
                                    int i12 = defpackage.agjj.a;
                                    this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                }
                                float fB9 = f318 + defpackage.aglz.b(fArr10);
                                float f3113 = f4 + f4;
                                float f3114 = defpackage.aglz.f(fArr10) + fMin;
                                long jFloatToRawIntBits113 = java.lang.Float.floatToRawIntBits(fB9 + f3113);
                                long jFloatToRawIntBits114 = ((long) java.lang.Float.floatToRawIntBits(f3114 + f3113)) & j4;
                                long jFloatToRawIntBits115 = (((long) java.lang.Float.floatToRawIntBits(f318 + defpackage.aglz.b(fArr10))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr10))) & j4);
                                den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF4.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits115 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF4.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits115 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits113 << c5) | jFloatToRawIntBits114, 0.0f, (den) null, 0, 120);
                                aiiVar = this.d;
                                if (aiiVar.k()) {
                                    if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                } else if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                dbmVar.D();
                                if (agjxVar == null) {
                                }
                                cfo.w(this);
                                return;
                            }
                            f7 = 2.0f;
                            f8 = 0.0f;
                            if (aolrVar5 != null) {
                                int i13 = defpackage.agjj.a;
                                this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                            }
                            float fB10 = f318 + defpackage.aglz.b(fArr10);
                            float f3115 = f4 + f4;
                            float f3116 = defpackage.aglz.f(fArr10) + fMin;
                            long jFloatToRawIntBits116 = java.lang.Float.floatToRawIntBits(fB10 + f3115);
                            long jFloatToRawIntBits117 = ((long) java.lang.Float.floatToRawIntBits(f3116 + f3115)) & j4;
                            long jFloatToRawIntBits118 = (((long) java.lang.Float.floatToRawIntBits(f318 + defpackage.aglz.b(fArr10))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr10))) & j4);
                            den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF4.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits118 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF4.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits118 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits116 << c5) | jFloatToRawIntBits117, 0.0f, (den) null, 0, 120);
                            aiiVar = this.d;
                            if (aiiVar.k()) {
                                if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                            } else if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            dbmVar.D();
                            if (agjxVar == null) {
                            }
                            cfo.w(this);
                            return;
                        }
                        i2 = 3;
                        f4 = fFloatValue5;
                        agjxVar = agjxVar2;
                        jO = dbmVar.o();
                        this.G = fFloatValue;
                        this.H = fFloatValue2;
                        mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                        mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                        defpackage.agkz agkzVar5 = defpackage.agln.g;
                        obj2 = mapAT2.get(agkzVar5);
                        if (obj2 instanceof float[]) {
                            obj3 = (float[]) obj2;
                        } else {
                            obj3 = aolrVar3;
                        }
                        r3 = obj3;
                        if (obj3 == null) {
                            float[] fArr11 = new float[4];
                            fArr11[i] = f20;
                            fArr11[r17] = f20;
                            fArr11[c] = f20;
                            fArr11[i2] = f20;
                            r3 = fArr11;
                        }
                        if (agjlVar.g) {
                            i3 = i2;
                            f5 = f3;
                            r4 = r3;
                        } else {
                            i3 = i2;
                            f5 = f3;
                            r4 = r3;
                        }
                        mapAT2.put(agkzVar5, r4);
                        if (agjaVar.d != null) {
                            length = r4.length;
                            defpackage.agla aglaVar4 = defpackage.agln.z;
                            if (length == 0) {
                                aolrVarValueOf = aolrVar3;
                            } else {
                                Min = r4[i];
                                iCD = ajsz.cD((float[]) r4);
                                if (iCD > 0) {
                                    r8 = r17;
                                    r0 = Min;
                                    while (true) {
                                        Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                        if (r8 != iCD) {
                                            break;
                                            break;
                                        } else {
                                            r0 = Min;
                                            r8++;
                                        }
                                    }
                                }
                                aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                            }
                            if (aolrVarValueOf != null) {
                                fFloatValue3 = aolrVarValueOf.floatValue();
                            } else {
                                fFloatValue3 = 0.0f;
                            }
                            mapAT2.put(aglaVar4, java.lang.Float.valueOf(fFloatValue3));
                        }
                        pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                        android.util.SizeF sizeF7 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                        android.util.SizeF sizeF8 = new android.util.SizeF(f5, fMin);
                        float f214 = pointF.x;
                        float width7 = sizeF7.getWidth();
                        float width8 = sizeF8.getWidth();
                        if (pointF.x < 0.5d) {
                            fD = defpackage.aglz.c(fArr3);
                        } else {
                            fD = defpackage.aglz.d(fArr3);
                        }
                        float fM4 = defpackage.agmc.m(f214, width7, width8, fD);
                        float f215 = pointF.y;
                        float height7 = sizeF7.getHeight();
                        float height8 = sizeF8.getHeight();
                        if (pointF.y < 0.5d) {
                            fA = defpackage.aglz.e(fArr3);
                        } else {
                            fA = defpackage.aglz.a(fArr3);
                        }
                        android.graphics.PointF pointF5 = new android.graphics.PointF(fM4, defpackage.agmc.m(f215, height7, height8, fA));
                        mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF5.x));
                        mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF5.y));
                        aglbVar = this.f;
                        map = this.m;
                        aooh.f(aglbVar, "shader");
                        aooh.f(map, "lastSetResolvedUniforms");
                        while (r7.hasNext()) {
                            aglvVar = (defpackage.aglv) entry2.getKey();
                            value = entry2.getValue();
                            obj5 = map.get(aglvVar);
                            j$.util.Objects.checkIndex(i, i3);
                            if (value == null) {
                                if (aooh.n(obj5, value)) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j111 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111 >> c5)), java.lang.Float.intBitsToFloat((int) (j111 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                continue;
                            } else {
                                if (value instanceof float[]) {
                                    if (obj5 instanceof float[]) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j112 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j112 >> c5)), java.lang.Float.intBitsToFloat((int) (j112 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j113 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j113 >> c5)), java.lang.Float.intBitsToFloat((int) (j113 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                if (value instanceof int[]) {
                                    if (obj5 instanceof int[]) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j114 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j114 >> c5)), java.lang.Float.intBitsToFloat((int) (j114 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j115 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j115 >> c5)), java.lang.Float.intBitsToFloat((int) (j115 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                if (aooh.n(obj5, value)) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j116 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j116 >> c5)), java.lang.Float.intBitsToFloat((int) (j116 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                continue;
                            }
                            i = 0;
                            i3 = 3;
                        }
                        float[] fArr12 = fArr3;
                        float f3117 = f5;
                        this.m = ajsz.aS(mapAT2);
                        obj4 = mapAT2.get(defpackage.agln.aS);
                        if (obj4 instanceof java.lang.Float) {
                            aolrVar5 = (java.lang.Float) obj4;
                        } else {
                            aolrVar5 = aolrVar3;
                        }
                        long jLongValue5 = ((java.lang.Number) this.r.a()).longValue();
                        l = this.E;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        j = jLongValue5 - jLongValue;
                        f6 = j / 1000.0f;
                        this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                        agjmVar = this.a.k;
                        if (agjmVar != null) {
                            if (agjmVar.i != 0.0f) {
                                f18 = agjmVar.j;
                                if (f18 != 0.0f) {
                                    this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                    f9 = 0.0f;
                                } else {
                                    f9 = 0.0f;
                                    this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                }
                            } else {
                                f9 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                            }
                            f10 = agjmVar.f;
                            if (f10 > f9) {
                                f17 = agjmVar.g;
                                if (f17 > f9) {
                                    fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                                } else {
                                    fL = f9;
                                }
                            } else {
                                fL = f9;
                            }
                            f11 = agjmVar.h;
                            if (f11 > f9) {
                                f12 = ((6.2831855f / f11) * f6) + fL;
                            } else {
                                f12 = 0.0f;
                            }
                            f7 = 2.0f;
                            this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                            if (agjmVar.c != 0.0f) {
                                f13 = agjmVar.b;
                                if (f13 != 0.0f) {
                                    f14 = agjmVar.e;
                                    if (f14 != 0.0f) {
                                        f15 = f6 % f14;
                                        float fL5 = defpackage.agmc.l(f13);
                                        java.util.List list4 = agjmVar.a;
                                        float fFloor4 = (float) java.lang.Math.floor((f6 / f14) % list4.size());
                                        float f3118 = fFloor4 * fL5;
                                        float fC4 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f3118, (fFloor4 + 1.0f) * fL5, 0.0f);
                                        float f3119 = fC4 - f3118;
                                        if (this.b == defpackage.agiz.EXIT) {
                                            defpackage.agmc.M(r17);
                                        } else {
                                            defpackage.agmc.M(false);
                                        }
                                        this.f.setFloatUniform(defpackage.agln.aZ.b, fC4 + fL);
                                        this.f.setFloatUniform(defpackage.agln.bd.b, ((f3119 / fL5) + fFloor4) % list4.size());
                                        fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                        defpackage.aglb aglbVar5 = this.f;
                                        java.lang.String str4 = defpackage.agln.aY.b;
                                        if (f15 < fMin2) {
                                            f16 = f15 / fMin2;
                                        } else {
                                            f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                        }
                                        aglbVar5.setFloatUniform(str4, f16);
                                    }
                                    if (aolrVar5 != null) {
                                        int i14 = defpackage.agjj.a;
                                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                    }
                                    float fB11 = f3117 + defpackage.aglz.b(fArr12);
                                    float f31110 = f4 + f4;
                                    float f31111 = defpackage.aglz.f(fArr12) + fMin;
                                    long jFloatToRawIntBits119 = java.lang.Float.floatToRawIntBits(fB11 + f31110);
                                    long jFloatToRawIntBits1110 = ((long) java.lang.Float.floatToRawIntBits(f31111 + f31110)) & j4;
                                    long jFloatToRawIntBits1111 = (((long) java.lang.Float.floatToRawIntBits(f3117 + defpackage.aglz.b(fArr12))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr12))) & j4);
                                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF5.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF5.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits119 << c5) | jFloatToRawIntBits1110, 0.0f, (den) null, 0, 120);
                                    aiiVar = this.d;
                                    if (aiiVar.k()) {
                                        if (aiiVar.k()) {
                                            aoubVar.s((java.util.concurrent.CancellationException) null);
                                        }
                                    } else if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                    dbmVar.D();
                                    if (agjxVar == null) {
                                    }
                                    cfo.w(this);
                                    return;
                                }
                            }
                            this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                            f8 = 0.0f;
                            this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                            this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                            if (aolrVar5 != null) {
                                int i15 = defpackage.agjj.a;
                                this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                            }
                            float fB12 = f3117 + defpackage.aglz.b(fArr12);
                            float f31112 = f4 + f4;
                            float f31113 = defpackage.aglz.f(fArr12) + fMin;
                            long jFloatToRawIntBits1112 = java.lang.Float.floatToRawIntBits(fB12 + f31112);
                            long jFloatToRawIntBits1113 = ((long) java.lang.Float.floatToRawIntBits(f31113 + f31112)) & j4;
                            long jFloatToRawIntBits1114 = (((long) java.lang.Float.floatToRawIntBits(f3117 + defpackage.aglz.b(fArr12))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr12))) & j4);
                            den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF5.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1114 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF5.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1114 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits1112 << c5) | jFloatToRawIntBits1113, 0.0f, (den) null, 0, 120);
                            aiiVar = this.d;
                            if (aiiVar.k()) {
                                if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                            } else if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            dbmVar.D();
                            if (agjxVar == null) {
                            }
                            cfo.w(this);
                            return;
                        }
                        f7 = 2.0f;
                        f8 = 0.0f;
                        if (aolrVar5 != null) {
                            int i16 = defpackage.agjj.a;
                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                        }
                        float fB13 = f3117 + defpackage.aglz.b(fArr12);
                        float f31114 = f4 + f4;
                        float f31115 = defpackage.aglz.f(fArr12) + fMin;
                        long jFloatToRawIntBits1115 = java.lang.Float.floatToRawIntBits(fB13 + f31114);
                        long jFloatToRawIntBits1116 = ((long) java.lang.Float.floatToRawIntBits(f31115 + f31114)) & j4;
                        long jFloatToRawIntBits1117 = (((long) java.lang.Float.floatToRawIntBits(f3117 + defpackage.aglz.b(fArr12))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr12))) & j4);
                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF5.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1117 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF5.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1117 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits1115 << c5) | jFloatToRawIntBits1116, 0.0f, (den) null, 0, 120);
                        aiiVar = this.d;
                        if (aiiVar.k()) {
                            if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                        } else if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                        dbmVar.D();
                        if (agjxVar == null) {
                        }
                        cfo.w(this);
                        return;
                    }
                    i = 0;
                    aolrVar = null;
                    fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4));
                    f2 = defpackage.aglz.f(fArr3);
                    fFloatValue2 = fIntBitsToFloat2 - f2;
                    aolrVar2 = agjaVar.k;
                    if (aolrVar2 == null) {
                        aolrVar3 = aolrVar;
                    } else {
                        aolrVar3 = aolrVar;
                    }
                    if (aolrVar2 != null) {
                        fMin = java.lang.Math.min(fFloatValue, fFloatValue2);
                        aolrVar4 = aolrVar2;
                        f3 = fMin;
                    } else {
                        fMin = fFloatValue2;
                        f3 = fFloatValue;
                        aolrVar4 = aolrVar3;
                    }
                    if (aolrVar4 != null) {
                        i2 = 3;
                        f4 = fFloatValue5;
                        agjxVar = agjxVar2;
                        if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)) != java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5))) {
                            mapAT2 = mapAT2;
                            float fMin8 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                            fFloatValue2 = fFloatValue2;
                            float fMin9 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                            f3 = f3;
                            long jFloatToRawIntBits21 = java.lang.Float.floatToRawIntBits(fMin8);
                            int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fMin9);
                            f20 = 0.0f;
                            jO = (jFloatToRawIntBits21 << c5) | (((long) iFloatToRawIntBits3) & j4);
                        }
                        this.G = fFloatValue;
                        this.H = fFloatValue2;
                        mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                        mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                        defpackage.agkz agkzVar6 = defpackage.agln.g;
                        obj2 = mapAT2.get(agkzVar6);
                        if (obj2 instanceof float[]) {
                            obj3 = (float[]) obj2;
                        } else {
                            obj3 = aolrVar3;
                        }
                        r3 = obj3;
                        if (obj3 == null) {
                            float[] fArr13 = new float[4];
                            fArr13[i] = f20;
                            fArr13[r17] = f20;
                            fArr13[c] = f20;
                            fArr13[i2] = f20;
                            r3 = fArr13;
                        }
                        if (agjlVar.g) {
                            i3 = i2;
                            f5 = f3;
                            r4 = r3;
                        } else {
                            i3 = i2;
                            f5 = f3;
                            r4 = r3;
                        }
                        mapAT2.put(agkzVar6, r4);
                        if (agjaVar.d != null) {
                            length = r4.length;
                            defpackage.agla aglaVar5 = defpackage.agln.z;
                            if (length == 0) {
                                aolrVarValueOf = aolrVar3;
                            } else {
                                Min = r4[i];
                                iCD = ajsz.cD((float[]) r4);
                                if (iCD > 0) {
                                    r8 = r17;
                                    r0 = Min;
                                    while (true) {
                                        Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                        if (r8 != iCD) {
                                            break;
                                            break;
                                        } else {
                                            r0 = Min;
                                            r8++;
                                        }
                                    }
                                }
                                aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                            }
                            if (aolrVarValueOf != null) {
                                fFloatValue3 = aolrVarValueOf.floatValue();
                            } else {
                                fFloatValue3 = 0.0f;
                            }
                            mapAT2.put(aglaVar5, java.lang.Float.valueOf(fFloatValue3));
                        }
                        pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                        android.util.SizeF sizeF9 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                        android.util.SizeF sizeF10 = new android.util.SizeF(f5, fMin);
                        float f216 = pointF.x;
                        float width9 = sizeF9.getWidth();
                        float width10 = sizeF10.getWidth();
                        if (pointF.x < 0.5d) {
                            fD = defpackage.aglz.c(fArr3);
                        } else {
                            fD = defpackage.aglz.d(fArr3);
                        }
                        float fM5 = defpackage.agmc.m(f216, width9, width10, fD);
                        float f217 = pointF.y;
                        float height9 = sizeF9.getHeight();
                        float height10 = sizeF10.getHeight();
                        if (pointF.y < 0.5d) {
                            fA = defpackage.aglz.e(fArr3);
                        } else {
                            fA = defpackage.aglz.a(fArr3);
                        }
                        android.graphics.PointF pointF6 = new android.graphics.PointF(fM5, defpackage.agmc.m(f217, height9, height10, fA));
                        mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF6.x));
                        mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF6.y));
                        aglbVar = this.f;
                        map = this.m;
                        aooh.f(aglbVar, "shader");
                        aooh.f(map, "lastSetResolvedUniforms");
                        while (r7.hasNext()) {
                            aglvVar = (defpackage.aglv) entry2.getKey();
                            value = entry2.getValue();
                            obj5 = map.get(aglvVar);
                            j$.util.Objects.checkIndex(i, i3);
                            if (value == null) {
                                if (aooh.n(obj5, value)) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j117 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j117 >> c5)), java.lang.Float.intBitsToFloat((int) (j117 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                continue;
                            } else {
                                if (value instanceof float[]) {
                                    if (obj5 instanceof float[]) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j118 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j118 >> c5)), java.lang.Float.intBitsToFloat((int) (j118 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j119 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j119 >> c5)), java.lang.Float.intBitsToFloat((int) (j119 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                if (value instanceof int[]) {
                                    if (obj5 instanceof int[]) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j1110 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1110 >> c5)), java.lang.Float.intBitsToFloat((int) (j1110 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j1111 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1111 >> c5)), java.lang.Float.intBitsToFloat((int) (j1111 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                if (aooh.n(obj5, value)) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j1112 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1112 >> c5)), java.lang.Float.intBitsToFloat((int) (j1112 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                continue;
                            }
                            i = 0;
                            i3 = 3;
                        }
                        float[] fArr14 = fArr3;
                        float f31116 = f5;
                        this.m = ajsz.aS(mapAT2);
                        obj4 = mapAT2.get(defpackage.agln.aS);
                        if (obj4 instanceof java.lang.Float) {
                            aolrVar5 = (java.lang.Float) obj4;
                        } else {
                            aolrVar5 = aolrVar3;
                        }
                        long jLongValue6 = ((java.lang.Number) this.r.a()).longValue();
                        l = this.E;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        j = jLongValue6 - jLongValue;
                        f6 = j / 1000.0f;
                        this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                        agjmVar = this.a.k;
                        if (agjmVar != null) {
                            if (agjmVar.i != 0.0f) {
                                f18 = agjmVar.j;
                                if (f18 != 0.0f) {
                                    this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                    f9 = 0.0f;
                                } else {
                                    f9 = 0.0f;
                                    this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                }
                            } else {
                                f9 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                            }
                            f10 = agjmVar.f;
                            if (f10 > f9) {
                                f17 = agjmVar.g;
                                if (f17 > f9) {
                                    fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                                } else {
                                    fL = f9;
                                }
                            } else {
                                fL = f9;
                            }
                            f11 = agjmVar.h;
                            if (f11 > f9) {
                                f12 = ((6.2831855f / f11) * f6) + fL;
                            } else {
                                f12 = 0.0f;
                            }
                            f7 = 2.0f;
                            this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                            if (agjmVar.c != 0.0f) {
                                f13 = agjmVar.b;
                                if (f13 != 0.0f) {
                                    f14 = agjmVar.e;
                                    if (f14 != 0.0f) {
                                        f15 = f6 % f14;
                                        float fL6 = defpackage.agmc.l(f13);
                                        java.util.List list5 = agjmVar.a;
                                        float fFloor5 = (float) java.lang.Math.floor((f6 / f14) % list5.size());
                                        float f31117 = fFloor5 * fL6;
                                        float fC5 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f31117, (fFloor5 + 1.0f) * fL6, 0.0f);
                                        float f31118 = fC5 - f31117;
                                        if (this.b == defpackage.agiz.EXIT) {
                                            defpackage.agmc.M(r17);
                                        } else {
                                            defpackage.agmc.M(false);
                                        }
                                        this.f.setFloatUniform(defpackage.agln.aZ.b, fC5 + fL);
                                        this.f.setFloatUniform(defpackage.agln.bd.b, ((f31118 / fL6) + fFloor5) % list5.size());
                                        fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                        defpackage.aglb aglbVar6 = this.f;
                                        java.lang.String str5 = defpackage.agln.aY.b;
                                        if (f15 < fMin2) {
                                            f16 = f15 / fMin2;
                                        } else {
                                            f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                        }
                                        aglbVar6.setFloatUniform(str5, f16);
                                    }
                                    if (aolrVar5 != null) {
                                        int i17 = defpackage.agjj.a;
                                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                    }
                                    float fB14 = f31116 + defpackage.aglz.b(fArr14);
                                    float f31119 = f4 + f4;
                                    float f311110 = defpackage.aglz.f(fArr14) + fMin;
                                    long jFloatToRawIntBits1118 = java.lang.Float.floatToRawIntBits(fB14 + f31119);
                                    long jFloatToRawIntBits1119 = ((long) java.lang.Float.floatToRawIntBits(f311110 + f31119)) & j4;
                                    long jFloatToRawIntBits11110 = (((long) java.lang.Float.floatToRawIntBits(f31116 + defpackage.aglz.b(fArr14))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr14))) & j4);
                                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF6.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11110 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF6.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11110 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits1118 << c5) | jFloatToRawIntBits1119, 0.0f, (den) null, 0, 120);
                                    aiiVar = this.d;
                                    if (aiiVar.k()) {
                                        if (aiiVar.k()) {
                                            aoubVar.s((java.util.concurrent.CancellationException) null);
                                        }
                                    } else if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                    dbmVar.D();
                                    if (agjxVar == null) {
                                    }
                                    cfo.w(this);
                                    return;
                                }
                            }
                            this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                            f8 = 0.0f;
                            this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                            this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                            if (aolrVar5 != null) {
                                int i18 = defpackage.agjj.a;
                                this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                            }
                            float fB15 = f31116 + defpackage.aglz.b(fArr14);
                            float f311111 = f4 + f4;
                            float f311112 = defpackage.aglz.f(fArr14) + fMin;
                            long jFloatToRawIntBits11111 = java.lang.Float.floatToRawIntBits(fB15 + f311111);
                            long jFloatToRawIntBits11112 = ((long) java.lang.Float.floatToRawIntBits(f311112 + f311111)) & j4;
                            long jFloatToRawIntBits11113 = (((long) java.lang.Float.floatToRawIntBits(f31116 + defpackage.aglz.b(fArr14))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr14))) & j4);
                            den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF6.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11113 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF6.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11113 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits11111 << c5) | jFloatToRawIntBits11112, 0.0f, (den) null, 0, 120);
                            aiiVar = this.d;
                            if (aiiVar.k()) {
                                if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                            } else if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            dbmVar.D();
                            if (agjxVar == null) {
                            }
                            cfo.w(this);
                            return;
                        }
                        f7 = 2.0f;
                        f8 = 0.0f;
                        if (aolrVar5 != null) {
                            int i19 = defpackage.agjj.a;
                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                        }
                        float fB16 = f31116 + defpackage.aglz.b(fArr14);
                        float f311113 = f4 + f4;
                        float f311114 = defpackage.aglz.f(fArr14) + fMin;
                        long jFloatToRawIntBits11114 = java.lang.Float.floatToRawIntBits(fB16 + f311113);
                        long jFloatToRawIntBits11115 = ((long) java.lang.Float.floatToRawIntBits(f311114 + f311113)) & j4;
                        long jFloatToRawIntBits11116 = (((long) java.lang.Float.floatToRawIntBits(f31116 + defpackage.aglz.b(fArr14))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr14))) & j4);
                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF6.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11116 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF6.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11116 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits11114 << c5) | jFloatToRawIntBits11115, 0.0f, (den) null, 0, 120);
                        aiiVar = this.d;
                        if (aiiVar.k()) {
                            if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                        } else if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                        dbmVar.D();
                        if (agjxVar == null) {
                        }
                        cfo.w(this);
                        return;
                    }
                    i2 = 3;
                    f4 = fFloatValue5;
                    agjxVar = agjxVar2;
                    jO = dbmVar.o();
                    this.G = fFloatValue;
                    this.H = fFloatValue2;
                    mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                    mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                    defpackage.agkz agkzVar7 = defpackage.agln.g;
                    obj2 = mapAT2.get(agkzVar7);
                    if (obj2 instanceof float[]) {
                        obj3 = (float[]) obj2;
                    } else {
                        obj3 = aolrVar3;
                    }
                    r3 = obj3;
                    if (obj3 == null) {
                        float[] fArr15 = new float[4];
                        fArr15[i] = f20;
                        fArr15[r17] = f20;
                        fArr15[c] = f20;
                        fArr15[i2] = f20;
                        r3 = fArr15;
                    }
                    if (agjlVar.g) {
                        i3 = i2;
                        f5 = f3;
                        r4 = r3;
                    } else {
                        i3 = i2;
                        f5 = f3;
                        r4 = r3;
                    }
                    mapAT2.put(agkzVar7, r4);
                    if (agjaVar.d != null) {
                        length = r4.length;
                        defpackage.agla aglaVar6 = defpackage.agln.z;
                        if (length == 0) {
                            aolrVarValueOf = aolrVar3;
                        } else {
                            Min = r4[i];
                            iCD = ajsz.cD((float[]) r4);
                            if (iCD > 0) {
                                r8 = r17;
                                r0 = Min;
                                while (true) {
                                    Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                    if (r8 != iCD) {
                                        break;
                                        break;
                                    } else {
                                        r0 = Min;
                                        r8++;
                                    }
                                }
                            }
                            aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                        }
                        if (aolrVarValueOf != null) {
                            fFloatValue3 = aolrVarValueOf.floatValue();
                        } else {
                            fFloatValue3 = 0.0f;
                        }
                        mapAT2.put(aglaVar6, java.lang.Float.valueOf(fFloatValue3));
                    }
                    pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                    android.util.SizeF sizeF11 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                    android.util.SizeF sizeF12 = new android.util.SizeF(f5, fMin);
                    float f218 = pointF.x;
                    float width11 = sizeF11.getWidth();
                    float width12 = sizeF12.getWidth();
                    if (pointF.x < 0.5d) {
                        fD = defpackage.aglz.c(fArr3);
                    } else {
                        fD = defpackage.aglz.d(fArr3);
                    }
                    float fM6 = defpackage.agmc.m(f218, width11, width12, fD);
                    float f219 = pointF.y;
                    float height11 = sizeF11.getHeight();
                    float height12 = sizeF12.getHeight();
                    if (pointF.y < 0.5d) {
                        fA = defpackage.aglz.e(fArr3);
                    } else {
                        fA = defpackage.aglz.a(fArr3);
                    }
                    android.graphics.PointF pointF7 = new android.graphics.PointF(fM6, defpackage.agmc.m(f219, height11, height12, fA));
                    mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF7.x));
                    mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF7.y));
                    aglbVar = this.f;
                    map = this.m;
                    aooh.f(aglbVar, "shader");
                    aooh.f(map, "lastSetResolvedUniforms");
                    while (r7.hasNext()) {
                        aglvVar = (defpackage.aglv) entry2.getKey();
                        value = entry2.getValue();
                        obj5 = map.get(aglvVar);
                        j$.util.Objects.checkIndex(i, i3);
                        if (value == null) {
                            if (aooh.n(obj5, value)) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j1113 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1113 >> c5)), java.lang.Float.intBitsToFloat((int) (j1113 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            continue;
                        } else {
                            if (value instanceof float[]) {
                                if (obj5 instanceof float[]) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j1114 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1114 >> c5)), java.lang.Float.intBitsToFloat((int) (j1114 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j1115 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1115 >> c5)), java.lang.Float.intBitsToFloat((int) (j1115 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            if (value instanceof int[]) {
                                if (obj5 instanceof int[]) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j1116 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1116 >> c5)), java.lang.Float.intBitsToFloat((int) (j1116 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j1117 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1117 >> c5)), java.lang.Float.intBitsToFloat((int) (j1117 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            if (aooh.n(obj5, value)) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j1118 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1118 >> c5)), java.lang.Float.intBitsToFloat((int) (j1118 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            continue;
                        }
                        i = 0;
                        i3 = 3;
                    }
                    float[] fArr16 = fArr3;
                    float f311115 = f5;
                    this.m = ajsz.aS(mapAT2);
                    obj4 = mapAT2.get(defpackage.agln.aS);
                    if (obj4 instanceof java.lang.Float) {
                        aolrVar5 = (java.lang.Float) obj4;
                    } else {
                        aolrVar5 = aolrVar3;
                    }
                    long jLongValue7 = ((java.lang.Number) this.r.a()).longValue();
                    l = this.E;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    j = jLongValue7 - jLongValue;
                    f6 = j / 1000.0f;
                    this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                    agjmVar = this.a.k;
                    if (agjmVar != null) {
                        if (agjmVar.i != 0.0f) {
                            f18 = agjmVar.j;
                            if (f18 != 0.0f) {
                                this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                f9 = 0.0f;
                            } else {
                                f9 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                            }
                        } else {
                            f9 = 0.0f;
                            this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                        }
                        f10 = agjmVar.f;
                        if (f10 > f9) {
                            f17 = agjmVar.g;
                            if (f17 > f9) {
                                fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                            } else {
                                fL = f9;
                            }
                        } else {
                            fL = f9;
                        }
                        f11 = agjmVar.h;
                        if (f11 > f9) {
                            f12 = ((6.2831855f / f11) * f6) + fL;
                        } else {
                            f12 = 0.0f;
                        }
                        f7 = 2.0f;
                        this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                        if (agjmVar.c != 0.0f) {
                            f13 = agjmVar.b;
                            if (f13 != 0.0f) {
                                f14 = agjmVar.e;
                                if (f14 != 0.0f) {
                                    f15 = f6 % f14;
                                    float fL7 = defpackage.agmc.l(f13);
                                    java.util.List list6 = agjmVar.a;
                                    float fFloor6 = (float) java.lang.Math.floor((f6 / f14) % list6.size());
                                    float f311116 = fFloor6 * fL7;
                                    float fC6 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f311116, (fFloor6 + 1.0f) * fL7, 0.0f);
                                    float f311117 = fC6 - f311116;
                                    if (this.b == defpackage.agiz.EXIT) {
                                        defpackage.agmc.M(r17);
                                    } else {
                                        defpackage.agmc.M(false);
                                    }
                                    this.f.setFloatUniform(defpackage.agln.aZ.b, fC6 + fL);
                                    this.f.setFloatUniform(defpackage.agln.bd.b, ((f311117 / fL7) + fFloor6) % list6.size());
                                    fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                    defpackage.aglb aglbVar7 = this.f;
                                    java.lang.String str6 = defpackage.agln.aY.b;
                                    if (f15 < fMin2) {
                                        f16 = f15 / fMin2;
                                    } else {
                                        f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                    }
                                    aglbVar7.setFloatUniform(str6, f16);
                                }
                                if (aolrVar5 != null) {
                                    int i110 = defpackage.agjj.a;
                                    this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                }
                                float fB17 = f311115 + defpackage.aglz.b(fArr16);
                                float f311118 = f4 + f4;
                                float f311119 = defpackage.aglz.f(fArr16) + fMin;
                                long jFloatToRawIntBits11117 = java.lang.Float.floatToRawIntBits(fB17 + f311118);
                                long jFloatToRawIntBits11118 = ((long) java.lang.Float.floatToRawIntBits(f311119 + f311118)) & j4;
                                long jFloatToRawIntBits11119 = (((long) java.lang.Float.floatToRawIntBits(f311115 + defpackage.aglz.b(fArr16))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr16))) & j4);
                                den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF7.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11119 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF7.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11119 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits11117 << c5) | jFloatToRawIntBits11118, 0.0f, (den) null, 0, 120);
                                aiiVar = this.d;
                                if (aiiVar.k()) {
                                    if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                } else if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                dbmVar.D();
                                if (agjxVar == null) {
                                }
                                cfo.w(this);
                                return;
                            }
                        }
                        this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                        f8 = 0.0f;
                        this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                        this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                        if (aolrVar5 != null) {
                            int i111 = defpackage.agjj.a;
                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                        }
                        float fB18 = f311115 + defpackage.aglz.b(fArr16);
                        float f3111110 = f4 + f4;
                        float f3111111 = defpackage.aglz.f(fArr16) + fMin;
                        long jFloatToRawIntBits111110 = java.lang.Float.floatToRawIntBits(fB18 + f3111110);
                        long jFloatToRawIntBits111111 = ((long) java.lang.Float.floatToRawIntBits(f3111111 + f3111110)) & j4;
                        long jFloatToRawIntBits111112 = (((long) java.lang.Float.floatToRawIntBits(f311115 + defpackage.aglz.b(fArr16))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr16))) & j4);
                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF7.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111112 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF7.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111112 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111110 << c5) | jFloatToRawIntBits111111, 0.0f, (den) null, 0, 120);
                        aiiVar = this.d;
                        if (aiiVar.k()) {
                            if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                        } else if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                        dbmVar.D();
                        if (agjxVar == null) {
                        }
                        cfo.w(this);
                        return;
                    }
                    f7 = 2.0f;
                    f8 = 0.0f;
                    if (aolrVar5 != null) {
                        int i112 = defpackage.agjj.a;
                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                    }
                    float fB19 = f311115 + defpackage.aglz.b(fArr16);
                    float f3111112 = f4 + f4;
                    float f3111113 = defpackage.aglz.f(fArr16) + fMin;
                    long jFloatToRawIntBits111113 = java.lang.Float.floatToRawIntBits(fB19 + f3111112);
                    long jFloatToRawIntBits111114 = ((long) java.lang.Float.floatToRawIntBits(f3111113 + f3111112)) & j4;
                    long jFloatToRawIntBits111115 = (((long) java.lang.Float.floatToRawIntBits(f311115 + defpackage.aglz.b(fArr16))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr16))) & j4);
                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF7.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111115 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF7.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111115 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111113 << c5) | jFloatToRawIntBits111114, 0.0f, (den) null, 0, 120);
                    aiiVar = this.d;
                    if (aiiVar.k()) {
                        if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                    } else if (aiiVar.k()) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    dbmVar.D();
                    if (agjxVar == null) {
                    }
                    cfo.w(this);
                    return;
                }
                c2 = 2;
                z = true;
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5));
                fB = defpackage.aglz.b(fArr3);
                fFloatValue = fIntBitsToFloat - fB;
                c = c2;
                r17 = z;
                if (agjlVar.e) {
                    i = 0;
                    aolrVar = null;
                    obj = mapAT2.get(defpackage.agln.e);
                    if (obj instanceof java.lang.Float) {
                        f = (java.lang.Float) obj;
                    } else {
                        f = null;
                    }
                    if (f != null) {
                        fFloatValue2 = f.floatValue();
                    } else {
                        fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4));
                        f2 = defpackage.aglz.f(fArr3);
                    }
                    aolrVar2 = agjaVar.k;
                    if (aolrVar2 == null) {
                        aolrVar3 = aolrVar;
                    } else {
                        aolrVar3 = aolrVar;
                    }
                    if (aolrVar2 != null) {
                        fMin = java.lang.Math.min(fFloatValue, fFloatValue2);
                        aolrVar4 = aolrVar2;
                        f3 = fMin;
                    } else {
                        fMin = fFloatValue2;
                        f3 = fFloatValue;
                        aolrVar4 = aolrVar3;
                    }
                    if (aolrVar4 != null) {
                        i2 = 3;
                        f4 = fFloatValue5;
                        agjxVar = agjxVar2;
                        if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)) != java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5))) {
                            mapAT2 = mapAT2;
                            float fMin10 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                            fFloatValue2 = fFloatValue2;
                            float fMin11 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                            f3 = f3;
                            long jFloatToRawIntBits22 = java.lang.Float.floatToRawIntBits(fMin10);
                            int iFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fMin11);
                            f20 = 0.0f;
                            jO = (jFloatToRawIntBits22 << c5) | (((long) iFloatToRawIntBits4) & j4);
                        }
                        this.G = fFloatValue;
                        this.H = fFloatValue2;
                        mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                        mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                        defpackage.agkz agkzVar8 = defpackage.agln.g;
                        obj2 = mapAT2.get(agkzVar8);
                        if (obj2 instanceof float[]) {
                            obj3 = (float[]) obj2;
                        } else {
                            obj3 = aolrVar3;
                        }
                        r3 = obj3;
                        if (obj3 == null) {
                            float[] fArr17 = new float[4];
                            fArr17[i] = f20;
                            fArr17[r17] = f20;
                            fArr17[c] = f20;
                            fArr17[i2] = f20;
                            r3 = fArr17;
                        }
                        if (agjlVar.g) {
                            i3 = i2;
                            f5 = f3;
                            r4 = r3;
                        } else {
                            i3 = i2;
                            f5 = f3;
                            r4 = r3;
                        }
                        mapAT2.put(agkzVar8, r4);
                        if (agjaVar.d != null) {
                            length = r4.length;
                            defpackage.agla aglaVar7 = defpackage.agln.z;
                            if (length == 0) {
                                aolrVarValueOf = aolrVar3;
                            } else {
                                Min = r4[i];
                                iCD = ajsz.cD((float[]) r4);
                                if (iCD > 0) {
                                    r8 = r17;
                                    r0 = Min;
                                    while (true) {
                                        Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                        if (r8 != iCD) {
                                            break;
                                            break;
                                        } else {
                                            r0 = Min;
                                            r8++;
                                        }
                                    }
                                }
                                aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                            }
                            if (aolrVarValueOf != null) {
                                fFloatValue3 = aolrVarValueOf.floatValue();
                            } else {
                                fFloatValue3 = 0.0f;
                            }
                            mapAT2.put(aglaVar7, java.lang.Float.valueOf(fFloatValue3));
                        }
                        pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                        android.util.SizeF sizeF13 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                        android.util.SizeF sizeF14 = new android.util.SizeF(f5, fMin);
                        float f2110 = pointF.x;
                        float width13 = sizeF13.getWidth();
                        float width14 = sizeF14.getWidth();
                        if (pointF.x < 0.5d) {
                            fD = defpackage.aglz.c(fArr3);
                        } else {
                            fD = defpackage.aglz.d(fArr3);
                        }
                        float fM7 = defpackage.agmc.m(f2110, width13, width14, fD);
                        float f2111 = pointF.y;
                        float height13 = sizeF13.getHeight();
                        float height14 = sizeF14.getHeight();
                        if (pointF.y < 0.5d) {
                            fA = defpackage.aglz.e(fArr3);
                        } else {
                            fA = defpackage.aglz.a(fArr3);
                        }
                        android.graphics.PointF pointF8 = new android.graphics.PointF(fM7, defpackage.agmc.m(f2111, height13, height14, fA));
                        mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF8.x));
                        mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF8.y));
                        aglbVar = this.f;
                        map = this.m;
                        aooh.f(aglbVar, "shader");
                        aooh.f(map, "lastSetResolvedUniforms");
                        while (r7.hasNext()) {
                            aglvVar = (defpackage.aglv) entry2.getKey();
                            value = entry2.getValue();
                            obj5 = map.get(aglvVar);
                            j$.util.Objects.checkIndex(i, i3);
                            if (value == null) {
                                if (aooh.n(obj5, value)) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j1119 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1119 >> c5)), java.lang.Float.intBitsToFloat((int) (j1119 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                continue;
                            } else {
                                if (value instanceof float[]) {
                                    if (obj5 instanceof float[]) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j11110 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11110 >> c5)), java.lang.Float.intBitsToFloat((int) (j11110 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j11111 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11111 >> c5)), java.lang.Float.intBitsToFloat((int) (j11111 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                if (value instanceof int[]) {
                                    if (obj5 instanceof int[]) {
                                        strA = aglvVar.a();
                                        j$.util.Objects.checkIndex(0, 12);
                                        if (aglvVar == null) {
                                            if (aglvVar instanceof defpackage.agkw) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                            } else if (aglvVar instanceof defpackage.agle) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            } else if (aglvVar instanceof defpackage.aglg) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                                aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                            } else {
                                                if (aglvVar instanceof defpackage.agkx) {
                                                    fArr = fArr3;
                                                    j$.util.Objects.checkIndex(0, 3);
                                                    if (value == null) {
                                                        if (value instanceof cqg) {
                                                            f19 = f5;
                                                            iIntValue = cfd.L(((cqg) value).a);
                                                        } else {
                                                            f19 = f5;
                                                            if (value instanceof java.lang.Integer) {
                                                                iIntValue = ((java.lang.Number) value).intValue();
                                                            }
                                                        }
                                                        aglbVar.setColorUniform(strA, iIntValue);
                                                    }
                                                    throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                                }
                                                fArr = fArr3;
                                                f19 = f5;
                                                if (aglvVar instanceof defpackage.aglc) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agll) {
                                                    if (value instanceof android.graphics.BitmapShader) {
                                                        aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                    } else {
                                                        aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                        aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                    }
                                                } else if (aglvVar instanceof defpackage.aglf) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                    aglbVar.setIntUniform(strA, (int[]) value);
                                                } else if (aglvVar instanceof defpackage.aglh) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                    aglbVar.setFloatUniform(strA, (float[]) value);
                                                } else if (aglvVar instanceof defpackage.agli) {
                                                    aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                    long j11112 = ((cpm) value).a;
                                                    aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11112 >> c5)), java.lang.Float.intBitsToFloat((int) (j11112 & j4)));
                                                } else {
                                                    if (!(aglvVar instanceof defpackage.aglk)) {
                                                        aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                        throw aolrVar3;
                                                    }
                                                    if (aglvVar instanceof defpackage.aglu) {
                                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                    }
                                                }
                                                fArr3 = fArr;
                                                f5 = f19;
                                            }
                                        }
                                        throw new aois();
                                    }
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j11113 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11113 >> c5)), java.lang.Float.intBitsToFloat((int) (j11113 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                if (aooh.n(obj5, value)) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j11114 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11114 >> c5)), java.lang.Float.intBitsToFloat((int) (j11114 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                continue;
                            }
                            i = 0;
                            i3 = 3;
                        }
                        float[] fArr18 = fArr3;
                        float f3111114 = f5;
                        this.m = ajsz.aS(mapAT2);
                        obj4 = mapAT2.get(defpackage.agln.aS);
                        if (obj4 instanceof java.lang.Float) {
                            aolrVar5 = (java.lang.Float) obj4;
                        } else {
                            aolrVar5 = aolrVar3;
                        }
                        long jLongValue8 = ((java.lang.Number) this.r.a()).longValue();
                        l = this.E;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        j = jLongValue8 - jLongValue;
                        f6 = j / 1000.0f;
                        this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                        agjmVar = this.a.k;
                        if (agjmVar != null) {
                            if (agjmVar.i != 0.0f) {
                                f18 = agjmVar.j;
                                if (f18 != 0.0f) {
                                    this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                    f9 = 0.0f;
                                } else {
                                    f9 = 0.0f;
                                    this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                                }
                            } else {
                                f9 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                            }
                            f10 = agjmVar.f;
                            if (f10 > f9) {
                                f17 = agjmVar.g;
                                if (f17 > f9) {
                                    fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                                } else {
                                    fL = f9;
                                }
                            } else {
                                fL = f9;
                            }
                            f11 = agjmVar.h;
                            if (f11 > f9) {
                                f12 = ((6.2831855f / f11) * f6) + fL;
                            } else {
                                f12 = 0.0f;
                            }
                            f7 = 2.0f;
                            this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                            if (agjmVar.c != 0.0f) {
                                f13 = agjmVar.b;
                                if (f13 != 0.0f) {
                                    f14 = agjmVar.e;
                                    if (f14 != 0.0f) {
                                        f15 = f6 % f14;
                                        float fL8 = defpackage.agmc.l(f13);
                                        java.util.List list7 = agjmVar.a;
                                        float fFloor7 = (float) java.lang.Math.floor((f6 / f14) % list7.size());
                                        float f3111115 = fFloor7 * fL8;
                                        float fC7 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f3111115, (fFloor7 + 1.0f) * fL8, 0.0f);
                                        float f3111116 = fC7 - f3111115;
                                        if (this.b == defpackage.agiz.EXIT) {
                                            defpackage.agmc.M(r17);
                                        } else {
                                            defpackage.agmc.M(false);
                                        }
                                        this.f.setFloatUniform(defpackage.agln.aZ.b, fC7 + fL);
                                        this.f.setFloatUniform(defpackage.agln.bd.b, ((f3111116 / fL8) + fFloor7) % list7.size());
                                        fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                        defpackage.aglb aglbVar8 = this.f;
                                        java.lang.String str7 = defpackage.agln.aY.b;
                                        if (f15 < fMin2) {
                                            f16 = f15 / fMin2;
                                        } else {
                                            f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                        }
                                        aglbVar8.setFloatUniform(str7, f16);
                                    }
                                    if (aolrVar5 != null) {
                                        int i113 = defpackage.agjj.a;
                                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                    }
                                    float fB110 = f3111114 + defpackage.aglz.b(fArr18);
                                    float f3111117 = f4 + f4;
                                    float f3111118 = defpackage.aglz.f(fArr18) + fMin;
                                    long jFloatToRawIntBits111116 = java.lang.Float.floatToRawIntBits(fB110 + f3111117);
                                    long jFloatToRawIntBits111117 = ((long) java.lang.Float.floatToRawIntBits(f3111118 + f3111117)) & j4;
                                    long jFloatToRawIntBits111118 = (((long) java.lang.Float.floatToRawIntBits(f3111114 + defpackage.aglz.b(fArr18))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr18))) & j4);
                                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF8.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111118 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF8.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111118 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111116 << c5) | jFloatToRawIntBits111117, 0.0f, (den) null, 0, 120);
                                    aiiVar = this.d;
                                    if (aiiVar.k()) {
                                        if (aiiVar.k()) {
                                            aoubVar.s((java.util.concurrent.CancellationException) null);
                                        }
                                    } else if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                    dbmVar.D();
                                    if (agjxVar == null) {
                                    }
                                    cfo.w(this);
                                    return;
                                }
                            }
                            this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                            f8 = 0.0f;
                            this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                            this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                            if (aolrVar5 != null) {
                                int i114 = defpackage.agjj.a;
                                this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                            }
                            float fB111 = f3111114 + defpackage.aglz.b(fArr18);
                            float f3111119 = f4 + f4;
                            float f31111110 = defpackage.aglz.f(fArr18) + fMin;
                            long jFloatToRawIntBits111119 = java.lang.Float.floatToRawIntBits(fB111 + f3111119);
                            long jFloatToRawIntBits1111110 = ((long) java.lang.Float.floatToRawIntBits(f31111110 + f3111119)) & j4;
                            long jFloatToRawIntBits1111111 = (((long) java.lang.Float.floatToRawIntBits(f3111114 + defpackage.aglz.b(fArr18))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr18))) & j4);
                            den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF8.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111111 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF8.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111111 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111119 << c5) | jFloatToRawIntBits1111110, 0.0f, (den) null, 0, 120);
                            aiiVar = this.d;
                            if (aiiVar.k()) {
                                if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                            } else if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            dbmVar.D();
                            if (agjxVar == null) {
                            }
                            cfo.w(this);
                            return;
                        }
                        f7 = 2.0f;
                        f8 = 0.0f;
                        if (aolrVar5 != null) {
                            int i115 = defpackage.agjj.a;
                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                        }
                        float fB112 = f3111114 + defpackage.aglz.b(fArr18);
                        float f31111111 = f4 + f4;
                        float f31111112 = defpackage.aglz.f(fArr18) + fMin;
                        long jFloatToRawIntBits1111112 = java.lang.Float.floatToRawIntBits(fB112 + f31111111);
                        long jFloatToRawIntBits1111113 = ((long) java.lang.Float.floatToRawIntBits(f31111112 + f31111111)) & j4;
                        long jFloatToRawIntBits1111114 = (((long) java.lang.Float.floatToRawIntBits(f3111114 + defpackage.aglz.b(fArr18))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr18))) & j4);
                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF8.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111114 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF8.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111114 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits1111112 << c5) | jFloatToRawIntBits1111113, 0.0f, (den) null, 0, 120);
                        aiiVar = this.d;
                        if (aiiVar.k()) {
                            if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                        } else if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                        dbmVar.D();
                        if (agjxVar == null) {
                        }
                        cfo.w(this);
                        return;
                    }
                    i2 = 3;
                    f4 = fFloatValue5;
                    agjxVar = agjxVar2;
                    jO = dbmVar.o();
                    this.G = fFloatValue;
                    this.H = fFloatValue2;
                    mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                    mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                    defpackage.agkz agkzVar9 = defpackage.agln.g;
                    obj2 = mapAT2.get(agkzVar9);
                    if (obj2 instanceof float[]) {
                        obj3 = (float[]) obj2;
                    } else {
                        obj3 = aolrVar3;
                    }
                    r3 = obj3;
                    if (obj3 == null) {
                        float[] fArr19 = new float[4];
                        fArr19[i] = f20;
                        fArr19[r17] = f20;
                        fArr19[c] = f20;
                        fArr19[i2] = f20;
                        r3 = fArr19;
                    }
                    if (agjlVar.g) {
                        i3 = i2;
                        f5 = f3;
                        r4 = r3;
                    } else {
                        i3 = i2;
                        f5 = f3;
                        r4 = r3;
                    }
                    mapAT2.put(agkzVar9, r4);
                    if (agjaVar.d != null) {
                        length = r4.length;
                        defpackage.agla aglaVar8 = defpackage.agln.z;
                        if (length == 0) {
                            aolrVarValueOf = aolrVar3;
                        } else {
                            Min = r4[i];
                            iCD = ajsz.cD((float[]) r4);
                            if (iCD > 0) {
                                r8 = r17;
                                r0 = Min;
                                while (true) {
                                    Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                    if (r8 != iCD) {
                                        break;
                                        break;
                                    } else {
                                        r0 = Min;
                                        r8++;
                                    }
                                }
                            }
                            aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                        }
                        if (aolrVarValueOf != null) {
                            fFloatValue3 = aolrVarValueOf.floatValue();
                        } else {
                            fFloatValue3 = 0.0f;
                        }
                        mapAT2.put(aglaVar8, java.lang.Float.valueOf(fFloatValue3));
                    }
                    pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                    android.util.SizeF sizeF15 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                    android.util.SizeF sizeF16 = new android.util.SizeF(f5, fMin);
                    float f2112 = pointF.x;
                    float width15 = sizeF15.getWidth();
                    float width16 = sizeF16.getWidth();
                    if (pointF.x < 0.5d) {
                        fD = defpackage.aglz.c(fArr3);
                    } else {
                        fD = defpackage.aglz.d(fArr3);
                    }
                    float fM8 = defpackage.agmc.m(f2112, width15, width16, fD);
                    float f2113 = pointF.y;
                    float height15 = sizeF15.getHeight();
                    float height16 = sizeF16.getHeight();
                    if (pointF.y < 0.5d) {
                        fA = defpackage.aglz.e(fArr3);
                    } else {
                        fA = defpackage.aglz.a(fArr3);
                    }
                    android.graphics.PointF pointF9 = new android.graphics.PointF(fM8, defpackage.agmc.m(f2113, height15, height16, fA));
                    mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF9.x));
                    mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF9.y));
                    aglbVar = this.f;
                    map = this.m;
                    aooh.f(aglbVar, "shader");
                    aooh.f(map, "lastSetResolvedUniforms");
                    while (r7.hasNext()) {
                        aglvVar = (defpackage.aglv) entry2.getKey();
                        value = entry2.getValue();
                        obj5 = map.get(aglvVar);
                        j$.util.Objects.checkIndex(i, i3);
                        if (value == null) {
                            if (aooh.n(obj5, value)) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j11115 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11115 >> c5)), java.lang.Float.intBitsToFloat((int) (j11115 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            continue;
                        } else {
                            if (value instanceof float[]) {
                                if (obj5 instanceof float[]) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j11116 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11116 >> c5)), java.lang.Float.intBitsToFloat((int) (j11116 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j11117 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11117 >> c5)), java.lang.Float.intBitsToFloat((int) (j11117 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            if (value instanceof int[]) {
                                if (obj5 instanceof int[]) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j11118 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11118 >> c5)), java.lang.Float.intBitsToFloat((int) (j11118 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j11119 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j11119 >> c5)), java.lang.Float.intBitsToFloat((int) (j11119 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            if (aooh.n(obj5, value)) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j111110 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111110 >> c5)), java.lang.Float.intBitsToFloat((int) (j111110 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            continue;
                        }
                        i = 0;
                        i3 = 3;
                    }
                    float[] fArr110 = fArr3;
                    float f31111113 = f5;
                    this.m = ajsz.aS(mapAT2);
                    obj4 = mapAT2.get(defpackage.agln.aS);
                    if (obj4 instanceof java.lang.Float) {
                        aolrVar5 = (java.lang.Float) obj4;
                    } else {
                        aolrVar5 = aolrVar3;
                    }
                    long jLongValue9 = ((java.lang.Number) this.r.a()).longValue();
                    l = this.E;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    j = jLongValue9 - jLongValue;
                    f6 = j / 1000.0f;
                    this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                    agjmVar = this.a.k;
                    if (agjmVar != null) {
                        if (agjmVar.i != 0.0f) {
                            f18 = agjmVar.j;
                            if (f18 != 0.0f) {
                                this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                f9 = 0.0f;
                            } else {
                                f9 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                            }
                        } else {
                            f9 = 0.0f;
                            this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                        }
                        f10 = agjmVar.f;
                        if (f10 > f9) {
                            f17 = agjmVar.g;
                            if (f17 > f9) {
                                fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                            } else {
                                fL = f9;
                            }
                        } else {
                            fL = f9;
                        }
                        f11 = agjmVar.h;
                        if (f11 > f9) {
                            f12 = ((6.2831855f / f11) * f6) + fL;
                        } else {
                            f12 = 0.0f;
                        }
                        f7 = 2.0f;
                        this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                        if (agjmVar.c != 0.0f) {
                            f13 = agjmVar.b;
                            if (f13 != 0.0f) {
                                f14 = agjmVar.e;
                                if (f14 != 0.0f) {
                                    f15 = f6 % f14;
                                    float fL9 = defpackage.agmc.l(f13);
                                    java.util.List list8 = agjmVar.a;
                                    float fFloor8 = (float) java.lang.Math.floor((f6 / f14) % list8.size());
                                    float f31111114 = fFloor8 * fL9;
                                    float fC8 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f31111114, (fFloor8 + 1.0f) * fL9, 0.0f);
                                    float f31111115 = fC8 - f31111114;
                                    if (this.b == defpackage.agiz.EXIT) {
                                        defpackage.agmc.M(r17);
                                    } else {
                                        defpackage.agmc.M(false);
                                    }
                                    this.f.setFloatUniform(defpackage.agln.aZ.b, fC8 + fL);
                                    this.f.setFloatUniform(defpackage.agln.bd.b, ((f31111115 / fL9) + fFloor8) % list8.size());
                                    fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                    defpackage.aglb aglbVar9 = this.f;
                                    java.lang.String str8 = defpackage.agln.aY.b;
                                    if (f15 < fMin2) {
                                        f16 = f15 / fMin2;
                                    } else {
                                        f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                    }
                                    aglbVar9.setFloatUniform(str8, f16);
                                }
                                if (aolrVar5 != null) {
                                    int i116 = defpackage.agjj.a;
                                    this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                }
                                float fB113 = f31111113 + defpackage.aglz.b(fArr110);
                                float f31111116 = f4 + f4;
                                float f31111117 = defpackage.aglz.f(fArr110) + fMin;
                                long jFloatToRawIntBits1111115 = java.lang.Float.floatToRawIntBits(fB113 + f31111116);
                                long jFloatToRawIntBits1111116 = ((long) java.lang.Float.floatToRawIntBits(f31111117 + f31111116)) & j4;
                                long jFloatToRawIntBits1111117 = (((long) java.lang.Float.floatToRawIntBits(f31111113 + defpackage.aglz.b(fArr110))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr110))) & j4);
                                den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF9.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111117 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF9.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111117 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits1111115 << c5) | jFloatToRawIntBits1111116, 0.0f, (den) null, 0, 120);
                                aiiVar = this.d;
                                if (aiiVar.k()) {
                                    if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                } else if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                dbmVar.D();
                                if (agjxVar == null) {
                                }
                                cfo.w(this);
                                return;
                            }
                        }
                        this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                        f8 = 0.0f;
                        this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                        this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                        if (aolrVar5 != null) {
                            int i117 = defpackage.agjj.a;
                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                        }
                        float fB114 = f31111113 + defpackage.aglz.b(fArr110);
                        float f31111118 = f4 + f4;
                        float f31111119 = defpackage.aglz.f(fArr110) + fMin;
                        long jFloatToRawIntBits1111118 = java.lang.Float.floatToRawIntBits(fB114 + f31111118);
                        long jFloatToRawIntBits1111119 = ((long) java.lang.Float.floatToRawIntBits(f31111119 + f31111118)) & j4;
                        long jFloatToRawIntBits11111110 = (((long) java.lang.Float.floatToRawIntBits(f31111113 + defpackage.aglz.b(fArr110))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr110))) & j4);
                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF9.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111110 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF9.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111110 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits1111118 << c5) | jFloatToRawIntBits1111119, 0.0f, (den) null, 0, 120);
                        aiiVar = this.d;
                        if (aiiVar.k()) {
                            if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                        } else if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                        dbmVar.D();
                        if (agjxVar == null) {
                        }
                        cfo.w(this);
                        return;
                    }
                    f7 = 2.0f;
                    f8 = 0.0f;
                    if (aolrVar5 != null) {
                        int i118 = defpackage.agjj.a;
                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                    }
                    float fB115 = f31111113 + defpackage.aglz.b(fArr110);
                    float f311111110 = f4 + f4;
                    float f311111111 = defpackage.aglz.f(fArr110) + fMin;
                    long jFloatToRawIntBits11111111 = java.lang.Float.floatToRawIntBits(fB115 + f311111110);
                    long jFloatToRawIntBits11111112 = ((long) java.lang.Float.floatToRawIntBits(f311111111 + f311111110)) & j4;
                    long jFloatToRawIntBits11111113 = (((long) java.lang.Float.floatToRawIntBits(f31111113 + defpackage.aglz.b(fArr110))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr110))) & j4);
                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF9.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111113 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF9.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111113 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits11111111 << c5) | jFloatToRawIntBits11111112, 0.0f, (den) null, 0, 120);
                    aiiVar = this.d;
                    if (aiiVar.k()) {
                        if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                    } else if (aiiVar.k()) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    dbmVar.D();
                    if (agjxVar == null) {
                    }
                    cfo.w(this);
                    return;
                }
                i = 0;
                aolrVar = null;
                fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4));
                f2 = defpackage.aglz.f(fArr3);
                fFloatValue2 = fIntBitsToFloat2 - f2;
                aolrVar2 = agjaVar.k;
                if (aolrVar2 == null) {
                    aolrVar3 = aolrVar;
                } else {
                    aolrVar3 = aolrVar;
                }
                if (aolrVar2 != null) {
                    fMin = java.lang.Math.min(fFloatValue, fFloatValue2);
                    aolrVar4 = aolrVar2;
                    f3 = fMin;
                } else {
                    fMin = fFloatValue2;
                    f3 = fFloatValue;
                    aolrVar4 = aolrVar3;
                }
                if (aolrVar4 != null) {
                    i2 = 3;
                    f4 = fFloatValue5;
                    agjxVar = agjxVar2;
                    if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)) != java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5))) {
                        mapAT2 = mapAT2;
                        float fMin12 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                        fFloatValue2 = fFloatValue2;
                        float fMin13 = java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)));
                        f3 = f3;
                        long jFloatToRawIntBits23 = java.lang.Float.floatToRawIntBits(fMin12);
                        int iFloatToRawIntBits5 = java.lang.Float.floatToRawIntBits(fMin13);
                        f20 = 0.0f;
                        jO = (jFloatToRawIntBits23 << c5) | (((long) iFloatToRawIntBits5) & j4);
                    }
                    this.G = fFloatValue;
                    this.H = fFloatValue2;
                    mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                    mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                    defpackage.agkz agkzVar10 = defpackage.agln.g;
                    obj2 = mapAT2.get(agkzVar10);
                    if (obj2 instanceof float[]) {
                        obj3 = (float[]) obj2;
                    } else {
                        obj3 = aolrVar3;
                    }
                    r3 = obj3;
                    if (obj3 == null) {
                        float[] fArr111 = new float[4];
                        fArr111[i] = f20;
                        fArr111[r17] = f20;
                        fArr111[c] = f20;
                        fArr111[i2] = f20;
                        r3 = fArr111;
                    }
                    if (agjlVar.g) {
                        i3 = i2;
                        f5 = f3;
                        r4 = r3;
                    } else {
                        i3 = i2;
                        f5 = f3;
                        r4 = r3;
                    }
                    mapAT2.put(agkzVar10, r4);
                    if (agjaVar.d != null) {
                        length = r4.length;
                        defpackage.agla aglaVar9 = defpackage.agln.z;
                        if (length == 0) {
                            aolrVarValueOf = aolrVar3;
                        } else {
                            Min = r4[i];
                            iCD = ajsz.cD((float[]) r4);
                            if (iCD > 0) {
                                r8 = r17;
                                r0 = Min;
                                while (true) {
                                    Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                    if (r8 != iCD) {
                                        break;
                                        break;
                                    } else {
                                        r0 = Min;
                                        r8++;
                                    }
                                }
                            }
                            aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                        }
                        if (aolrVarValueOf != null) {
                            fFloatValue3 = aolrVarValueOf.floatValue();
                        } else {
                            fFloatValue3 = 0.0f;
                        }
                        mapAT2.put(aglaVar9, java.lang.Float.valueOf(fFloatValue3));
                    }
                    pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                    android.util.SizeF sizeF17 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                    android.util.SizeF sizeF18 = new android.util.SizeF(f5, fMin);
                    float f2114 = pointF.x;
                    float width17 = sizeF17.getWidth();
                    float width18 = sizeF18.getWidth();
                    if (pointF.x < 0.5d) {
                        fD = defpackage.aglz.c(fArr3);
                    } else {
                        fD = defpackage.aglz.d(fArr3);
                    }
                    float fM9 = defpackage.agmc.m(f2114, width17, width18, fD);
                    float f2115 = pointF.y;
                    float height17 = sizeF17.getHeight();
                    float height18 = sizeF18.getHeight();
                    if (pointF.y < 0.5d) {
                        fA = defpackage.aglz.e(fArr3);
                    } else {
                        fA = defpackage.aglz.a(fArr3);
                    }
                    android.graphics.PointF pointF10 = new android.graphics.PointF(fM9, defpackage.agmc.m(f2115, height17, height18, fA));
                    mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF10.x));
                    mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF10.y));
                    aglbVar = this.f;
                    map = this.m;
                    aooh.f(aglbVar, "shader");
                    aooh.f(map, "lastSetResolvedUniforms");
                    while (r7.hasNext()) {
                        aglvVar = (defpackage.aglv) entry2.getKey();
                        value = entry2.getValue();
                        obj5 = map.get(aglvVar);
                        j$.util.Objects.checkIndex(i, i3);
                        if (value == null) {
                            if (aooh.n(obj5, value)) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j111111 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111111 >> c5)), java.lang.Float.intBitsToFloat((int) (j111111 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            continue;
                        } else {
                            if (value instanceof float[]) {
                                if (obj5 instanceof float[]) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j111112 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111112 >> c5)), java.lang.Float.intBitsToFloat((int) (j111112 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j111113 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111113 >> c5)), java.lang.Float.intBitsToFloat((int) (j111113 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            if (value instanceof int[]) {
                                if (obj5 instanceof int[]) {
                                    strA = aglvVar.a();
                                    j$.util.Objects.checkIndex(0, 12);
                                    if (aglvVar == null) {
                                        if (aglvVar instanceof defpackage.agkw) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                        } else if (aglvVar instanceof defpackage.agle) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        } else if (aglvVar instanceof defpackage.aglg) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                            aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                        } else {
                                            if (aglvVar instanceof defpackage.agkx) {
                                                fArr = fArr3;
                                                j$.util.Objects.checkIndex(0, 3);
                                                if (value == null) {
                                                    if (value instanceof cqg) {
                                                        f19 = f5;
                                                        iIntValue = cfd.L(((cqg) value).a);
                                                    } else {
                                                        f19 = f5;
                                                        if (value instanceof java.lang.Integer) {
                                                            iIntValue = ((java.lang.Number) value).intValue();
                                                        }
                                                    }
                                                    aglbVar.setColorUniform(strA, iIntValue);
                                                }
                                                throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                            }
                                            fArr = fArr3;
                                            f19 = f5;
                                            if (aglvVar instanceof defpackage.aglc) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agll) {
                                                if (value instanceof android.graphics.BitmapShader) {
                                                    aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                                } else {
                                                    aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                    aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                                }
                                            } else if (aglvVar instanceof defpackage.aglf) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                                aglbVar.setIntUniform(strA, (int[]) value);
                                            } else if (aglvVar instanceof defpackage.aglh) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                                aglbVar.setFloatUniform(strA, (float[]) value);
                                            } else if (aglvVar instanceof defpackage.agli) {
                                                aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                                long j111114 = ((cpm) value).a;
                                                aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111114 >> c5)), java.lang.Float.intBitsToFloat((int) (j111114 & j4)));
                                            } else {
                                                if (!(aglvVar instanceof defpackage.aglk)) {
                                                    aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                    throw aolrVar3;
                                                }
                                                if (aglvVar instanceof defpackage.aglu) {
                                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                                }
                                            }
                                            fArr3 = fArr;
                                            f5 = f19;
                                        }
                                    }
                                    throw new aois();
                                }
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j111115 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111115 >> c5)), java.lang.Float.intBitsToFloat((int) (j111115 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            if (aooh.n(obj5, value)) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j111116 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111116 >> c5)), java.lang.Float.intBitsToFloat((int) (j111116 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            continue;
                        }
                        i = 0;
                        i3 = 3;
                    }
                    float[] fArr112 = fArr3;
                    float f311111112 = f5;
                    this.m = ajsz.aS(mapAT2);
                    obj4 = mapAT2.get(defpackage.agln.aS);
                    if (obj4 instanceof java.lang.Float) {
                        aolrVar5 = (java.lang.Float) obj4;
                    } else {
                        aolrVar5 = aolrVar3;
                    }
                    long jLongValue10 = ((java.lang.Number) this.r.a()).longValue();
                    l = this.E;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    j = jLongValue10 - jLongValue;
                    f6 = j / 1000.0f;
                    this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                    agjmVar = this.a.k;
                    if (agjmVar != null) {
                        if (agjmVar.i != 0.0f) {
                            f18 = agjmVar.j;
                            if (f18 != 0.0f) {
                                this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                                f9 = 0.0f;
                            } else {
                                f9 = 0.0f;
                                this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                            }
                        } else {
                            f9 = 0.0f;
                            this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                        }
                        f10 = agjmVar.f;
                        if (f10 > f9) {
                            f17 = agjmVar.g;
                            if (f17 > f9) {
                                fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                            } else {
                                fL = f9;
                            }
                        } else {
                            fL = f9;
                        }
                        f11 = agjmVar.h;
                        if (f11 > f9) {
                            f12 = ((6.2831855f / f11) * f6) + fL;
                        } else {
                            f12 = 0.0f;
                        }
                        f7 = 2.0f;
                        this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                        if (agjmVar.c != 0.0f) {
                            f13 = agjmVar.b;
                            if (f13 != 0.0f) {
                                f14 = agjmVar.e;
                                if (f14 != 0.0f) {
                                    f15 = f6 % f14;
                                    float fL10 = defpackage.agmc.l(f13);
                                    java.util.List list9 = agjmVar.a;
                                    float fFloor9 = (float) java.lang.Math.floor((f6 / f14) % list9.size());
                                    float f311111113 = fFloor9 * fL10;
                                    float fC9 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f311111113, (fFloor9 + 1.0f) * fL10, 0.0f);
                                    float f311111114 = fC9 - f311111113;
                                    if (this.b == defpackage.agiz.EXIT) {
                                        defpackage.agmc.M(r17);
                                    } else {
                                        defpackage.agmc.M(false);
                                    }
                                    this.f.setFloatUniform(defpackage.agln.aZ.b, fC9 + fL);
                                    this.f.setFloatUniform(defpackage.agln.bd.b, ((f311111114 / fL10) + fFloor9) % list9.size());
                                    fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                    defpackage.aglb aglbVar10 = this.f;
                                    java.lang.String str9 = defpackage.agln.aY.b;
                                    if (f15 < fMin2) {
                                        f16 = f15 / fMin2;
                                    } else {
                                        f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                    }
                                    aglbVar10.setFloatUniform(str9, f16);
                                }
                                if (aolrVar5 != null) {
                                    int i119 = defpackage.agjj.a;
                                    this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                                }
                                float fB116 = f311111112 + defpackage.aglz.b(fArr112);
                                float f311111115 = f4 + f4;
                                float f311111116 = defpackage.aglz.f(fArr112) + fMin;
                                long jFloatToRawIntBits11111114 = java.lang.Float.floatToRawIntBits(fB116 + f311111115);
                                long jFloatToRawIntBits11111115 = ((long) java.lang.Float.floatToRawIntBits(f311111116 + f311111115)) & j4;
                                long jFloatToRawIntBits11111116 = (((long) java.lang.Float.floatToRawIntBits(f311111112 + defpackage.aglz.b(fArr112))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr112))) & j4);
                                den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF10.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111116 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF10.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111116 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits11111114 << c5) | jFloatToRawIntBits11111115, 0.0f, (den) null, 0, 120);
                                aiiVar = this.d;
                                if (aiiVar.k()) {
                                    if (aiiVar.k()) {
                                        aoubVar.s((java.util.concurrent.CancellationException) null);
                                    }
                                } else if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                dbmVar.D();
                                if (agjxVar == null) {
                                }
                                cfo.w(this);
                                return;
                            }
                        }
                        this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                        f8 = 0.0f;
                        this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                        this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                        if (aolrVar5 != null) {
                            int i1110 = defpackage.agjj.a;
                            this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                        }
                        float fB117 = f311111112 + defpackage.aglz.b(fArr112);
                        float f311111117 = f4 + f4;
                        float f311111118 = defpackage.aglz.f(fArr112) + fMin;
                        long jFloatToRawIntBits11111117 = java.lang.Float.floatToRawIntBits(fB117 + f311111117);
                        long jFloatToRawIntBits11111118 = ((long) java.lang.Float.floatToRawIntBits(f311111118 + f311111117)) & j4;
                        long jFloatToRawIntBits11111119 = (((long) java.lang.Float.floatToRawIntBits(f311111112 + defpackage.aglz.b(fArr112))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr112))) & j4);
                        den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF10.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111119 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF10.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits11111119 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits11111117 << c5) | jFloatToRawIntBits11111118, 0.0f, (den) null, 0, 120);
                        aiiVar = this.d;
                        if (aiiVar.k()) {
                            if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                        } else if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                        dbmVar.D();
                        if (agjxVar == null) {
                        }
                        cfo.w(this);
                        return;
                    }
                    f7 = 2.0f;
                    f8 = 0.0f;
                    if (aolrVar5 != null) {
                        int i1111 = defpackage.agjj.a;
                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                    }
                    float fB118 = f311111112 + defpackage.aglz.b(fArr112);
                    float f311111119 = f4 + f4;
                    float f3111111110 = defpackage.aglz.f(fArr112) + fMin;
                    long jFloatToRawIntBits111111110 = java.lang.Float.floatToRawIntBits(fB118 + f311111119);
                    long jFloatToRawIntBits111111111 = ((long) java.lang.Float.floatToRawIntBits(f3111111110 + f311111119)) & j4;
                    long jFloatToRawIntBits111111112 = (((long) java.lang.Float.floatToRawIntBits(f311111112 + defpackage.aglz.b(fArr112))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr112))) & j4);
                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF10.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111111112 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF10.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111111112 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111111110 << c5) | jFloatToRawIntBits111111111, 0.0f, (den) null, 0, 120);
                    aiiVar = this.d;
                    if (aiiVar.k()) {
                        if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                    } else if (aiiVar.k()) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    dbmVar.D();
                    if (agjxVar == null) {
                    }
                    cfo.w(this);
                    return;
                }
                i2 = 3;
                f4 = fFloatValue5;
                agjxVar = agjxVar2;
                jO = dbmVar.o();
                this.G = fFloatValue;
                this.H = fFloatValue2;
                mapAT2.put(defpackage.agln.f, java.lang.Float.valueOf(f3));
                mapAT2.put(defpackage.agln.e, java.lang.Float.valueOf(fMin));
                defpackage.agkz agkzVar11 = defpackage.agln.g;
                obj2 = mapAT2.get(agkzVar11);
                if (obj2 instanceof float[]) {
                    obj3 = (float[]) obj2;
                } else {
                    obj3 = aolrVar3;
                }
                r3 = obj3;
                if (obj3 == null) {
                    float[] fArr113 = new float[4];
                    fArr113[i] = f20;
                    fArr113[r17] = f20;
                    fArr113[c] = f20;
                    fArr113[i2] = f20;
                    r3 = fArr113;
                }
                if (agjlVar.g) {
                    i3 = i2;
                    f5 = f3;
                    r4 = r3;
                } else {
                    i3 = i2;
                    f5 = f3;
                    r4 = r3;
                }
                mapAT2.put(agkzVar11, r4);
                if (agjaVar.d != null) {
                    length = r4.length;
                    defpackage.agla aglaVar10 = defpackage.agln.z;
                    if (length == 0) {
                        aolrVarValueOf = aolrVar3;
                    } else {
                        Min = r4[i];
                        iCD = ajsz.cD((float[]) r4);
                        if (iCD > 0) {
                            r8 = r17;
                            r0 = Min;
                            while (true) {
                                Min = java.lang.Math.min((float) r0, (float) r4[r8]);
                                if (r8 != iCD) {
                                    break;
                                    break;
                                } else {
                                    r0 = Min;
                                    r8++;
                                }
                            }
                        }
                        aolrVarValueOf = java.lang.Float.valueOf((float) Min);
                    }
                    if (aolrVarValueOf != null) {
                        fFloatValue3 = aolrVarValueOf.floatValue();
                    } else {
                        fFloatValue3 = 0.0f;
                    }
                    mapAT2.put(aglaVar10, java.lang.Float.valueOf(fFloatValue3));
                }
                pointF = new android.graphics.PointF(agjlVar.b, agjlVar.c);
                android.util.SizeF sizeF19 = new android.util.SizeF(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> c5)), java.lang.Float.intBitsToFloat((int) (dbmVar.o() & j4)));
                android.util.SizeF sizeF110 = new android.util.SizeF(f5, fMin);
                float f2116 = pointF.x;
                float width19 = sizeF19.getWidth();
                float width110 = sizeF110.getWidth();
                if (pointF.x < 0.5d) {
                    fD = defpackage.aglz.c(fArr3);
                } else {
                    fD = defpackage.aglz.d(fArr3);
                }
                float fM10 = defpackage.agmc.m(f2116, width19, width110, fD);
                float f2117 = pointF.y;
                float height19 = sizeF19.getHeight();
                float height110 = sizeF110.getHeight();
                if (pointF.y < 0.5d) {
                    fA = defpackage.aglz.e(fArr3);
                } else {
                    fA = defpackage.aglz.a(fArr3);
                }
                android.graphics.PointF pointF11 = new android.graphics.PointF(fM10, defpackage.agmc.m(f2117, height19, height110, fA));
                mapAT2.put(defpackage.agln.c, java.lang.Float.valueOf(pointF11.x));
                mapAT2.put(defpackage.agln.d, java.lang.Float.valueOf(pointF11.y));
                aglbVar = this.f;
                map = this.m;
                aooh.f(aglbVar, "shader");
                aooh.f(map, "lastSetResolvedUniforms");
                while (r7.hasNext()) {
                    aglvVar = (defpackage.aglv) entry2.getKey();
                    value = entry2.getValue();
                    obj5 = map.get(aglvVar);
                    j$.util.Objects.checkIndex(i, i3);
                    if (value == null) {
                        if (aooh.n(obj5, value)) {
                            strA = aglvVar.a();
                            j$.util.Objects.checkIndex(0, 12);
                            if (aglvVar == null) {
                                if (aglvVar instanceof defpackage.agkw) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                } else if (aglvVar instanceof defpackage.agle) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                } else if (aglvVar instanceof defpackage.aglg) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                } else {
                                    if (aglvVar instanceof defpackage.agkx) {
                                        fArr = fArr3;
                                        j$.util.Objects.checkIndex(0, 3);
                                        if (value == null) {
                                            if (value instanceof cqg) {
                                                f19 = f5;
                                                iIntValue = cfd.L(((cqg) value).a);
                                            } else {
                                                f19 = f5;
                                                if (value instanceof java.lang.Integer) {
                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                }
                                            }
                                            aglbVar.setColorUniform(strA, iIntValue);
                                        }
                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                    }
                                    fArr = fArr3;
                                    f19 = f5;
                                    if (aglvVar instanceof defpackage.aglc) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agll) {
                                        if (value instanceof android.graphics.BitmapShader) {
                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                        } else {
                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                        }
                                    } else if (aglvVar instanceof defpackage.aglf) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                        aglbVar.setIntUniform(strA, (int[]) value);
                                    } else if (aglvVar instanceof defpackage.aglh) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agli) {
                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                        long j111117 = ((cpm) value).a;
                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111117 >> c5)), java.lang.Float.intBitsToFloat((int) (j111117 & j4)));
                                    } else {
                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                            throw aolrVar3;
                                        }
                                        if (aglvVar instanceof defpackage.aglu) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        }
                                    }
                                    fArr3 = fArr;
                                    f5 = f19;
                                }
                            }
                            throw new aois();
                        }
                        continue;
                    } else {
                        if (value instanceof float[]) {
                            if (obj5 instanceof float[]) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j111118 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111118 >> c5)), java.lang.Float.intBitsToFloat((int) (j111118 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            strA = aglvVar.a();
                            j$.util.Objects.checkIndex(0, 12);
                            if (aglvVar == null) {
                                if (aglvVar instanceof defpackage.agkw) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                } else if (aglvVar instanceof defpackage.agle) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                } else if (aglvVar instanceof defpackage.aglg) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                } else {
                                    if (aglvVar instanceof defpackage.agkx) {
                                        fArr = fArr3;
                                        j$.util.Objects.checkIndex(0, 3);
                                        if (value == null) {
                                            if (value instanceof cqg) {
                                                f19 = f5;
                                                iIntValue = cfd.L(((cqg) value).a);
                                            } else {
                                                f19 = f5;
                                                if (value instanceof java.lang.Integer) {
                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                }
                                            }
                                            aglbVar.setColorUniform(strA, iIntValue);
                                        }
                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                    }
                                    fArr = fArr3;
                                    f19 = f5;
                                    if (aglvVar instanceof defpackage.aglc) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agll) {
                                        if (value instanceof android.graphics.BitmapShader) {
                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                        } else {
                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                        }
                                    } else if (aglvVar instanceof defpackage.aglf) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                        aglbVar.setIntUniform(strA, (int[]) value);
                                    } else if (aglvVar instanceof defpackage.aglh) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agli) {
                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                        long j111119 = ((cpm) value).a;
                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j111119 >> c5)), java.lang.Float.intBitsToFloat((int) (j111119 & j4)));
                                    } else {
                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                            throw aolrVar3;
                                        }
                                        if (aglvVar instanceof defpackage.aglu) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        }
                                    }
                                    fArr3 = fArr;
                                    f5 = f19;
                                }
                            }
                            throw new aois();
                        }
                        if (value instanceof int[]) {
                            if (obj5 instanceof int[]) {
                                strA = aglvVar.a();
                                j$.util.Objects.checkIndex(0, 12);
                                if (aglvVar == null) {
                                    if (aglvVar instanceof defpackage.agkw) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                        aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                    } else if (aglvVar instanceof defpackage.agle) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                        aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                    } else if (aglvVar instanceof defpackage.aglg) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                        aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                    } else {
                                        if (aglvVar instanceof defpackage.agkx) {
                                            fArr = fArr3;
                                            j$.util.Objects.checkIndex(0, 3);
                                            if (value == null) {
                                                if (value instanceof cqg) {
                                                    f19 = f5;
                                                    iIntValue = cfd.L(((cqg) value).a);
                                                } else {
                                                    f19 = f5;
                                                    if (value instanceof java.lang.Integer) {
                                                        iIntValue = ((java.lang.Number) value).intValue();
                                                    }
                                                }
                                                aglbVar.setColorUniform(strA, iIntValue);
                                            }
                                            throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                        }
                                        fArr = fArr3;
                                        f19 = f5;
                                        if (aglvVar instanceof defpackage.aglc) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agll) {
                                            if (value instanceof android.graphics.BitmapShader) {
                                                aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                            } else {
                                                aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                                aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                            }
                                        } else if (aglvVar instanceof defpackage.aglf) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                            aglbVar.setIntUniform(strA, (int[]) value);
                                        } else if (aglvVar instanceof defpackage.aglh) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                            aglbVar.setFloatUniform(strA, (float[]) value);
                                        } else if (aglvVar instanceof defpackage.agli) {
                                            aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                            long j1111110 = ((cpm) value).a;
                                            aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1111110 >> c5)), java.lang.Float.intBitsToFloat((int) (j1111110 & j4)));
                                        } else {
                                            if (!(aglvVar instanceof defpackage.aglk)) {
                                                aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                                throw aolrVar3;
                                            }
                                            if (aglvVar instanceof defpackage.aglu) {
                                                aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                                aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                            }
                                        }
                                        fArr3 = fArr;
                                        f5 = f19;
                                    }
                                }
                                throw new aois();
                            }
                            strA = aglvVar.a();
                            j$.util.Objects.checkIndex(0, 12);
                            if (aglvVar == null) {
                                if (aglvVar instanceof defpackage.agkw) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                } else if (aglvVar instanceof defpackage.agle) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                } else if (aglvVar instanceof defpackage.aglg) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                } else {
                                    if (aglvVar instanceof defpackage.agkx) {
                                        fArr = fArr3;
                                        j$.util.Objects.checkIndex(0, 3);
                                        if (value == null) {
                                            if (value instanceof cqg) {
                                                f19 = f5;
                                                iIntValue = cfd.L(((cqg) value).a);
                                            } else {
                                                f19 = f5;
                                                if (value instanceof java.lang.Integer) {
                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                }
                                            }
                                            aglbVar.setColorUniform(strA, iIntValue);
                                        }
                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                    }
                                    fArr = fArr3;
                                    f19 = f5;
                                    if (aglvVar instanceof defpackage.aglc) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agll) {
                                        if (value instanceof android.graphics.BitmapShader) {
                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                        } else {
                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                        }
                                    } else if (aglvVar instanceof defpackage.aglf) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                        aglbVar.setIntUniform(strA, (int[]) value);
                                    } else if (aglvVar instanceof defpackage.aglh) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agli) {
                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                        long j1111111 = ((cpm) value).a;
                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1111111 >> c5)), java.lang.Float.intBitsToFloat((int) (j1111111 & j4)));
                                    } else {
                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                            throw aolrVar3;
                                        }
                                        if (aglvVar instanceof defpackage.aglu) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        }
                                    }
                                    fArr3 = fArr;
                                    f5 = f19;
                                }
                            }
                            throw new aois();
                        }
                        if (aooh.n(obj5, value)) {
                            strA = aglvVar.a();
                            j$.util.Objects.checkIndex(0, 12);
                            if (aglvVar == null) {
                                if (aglvVar instanceof defpackage.agkw) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Boolean");
                                    aglbVar.setIntUniform(strA, ((java.lang.Boolean) value).booleanValue() ? 1 : 0);
                                } else if (aglvVar instanceof defpackage.agle) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                    aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                } else if (aglvVar instanceof defpackage.aglg) {
                                    aooh.d(value, "null cannot be cast to non-null type kotlin.Int");
                                    aglbVar.setIntUniform(strA, ((java.lang.Integer) value).intValue());
                                } else {
                                    if (aglvVar instanceof defpackage.agkx) {
                                        fArr = fArr3;
                                        j$.util.Objects.checkIndex(0, 3);
                                        if (value == null) {
                                            if (value instanceof cqg) {
                                                f19 = f5;
                                                iIntValue = cfd.L(((cqg) value).a);
                                            } else {
                                                f19 = f5;
                                                if (value instanceof java.lang.Integer) {
                                                    iIntValue = ((java.lang.Number) value).intValue();
                                                }
                                            }
                                            aglbVar.setColorUniform(strA, iIntValue);
                                        }
                                        throw new java.lang.IllegalArgumentException(a.bg(aglvVar, "Value set to ColorUniform ", " has the unsupported type. "));
                                    }
                                    fArr = fArr3;
                                    f19 = f5;
                                    if (aglvVar instanceof defpackage.aglc) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agll) {
                                        if (value instanceof android.graphics.BitmapShader) {
                                            aglbVar.setInputBuffer(strA, (android.graphics.BitmapShader) value);
                                        } else {
                                            aooh.d(value, "null cannot be cast to non-null type android.graphics.Shader");
                                            aglbVar.setInputShader(strA, (android.graphics.Shader) value);
                                        }
                                    } else if (aglvVar instanceof defpackage.aglf) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.IntArray");
                                        aglbVar.setIntUniform(strA, (int[]) value);
                                    } else if (aglvVar instanceof defpackage.aglh) {
                                        aooh.d(value, "null cannot be cast to non-null type kotlin.FloatArray");
                                        aglbVar.setFloatUniform(strA, (float[]) value);
                                    } else if (aglvVar instanceof defpackage.agli) {
                                        aooh.d(value, "null cannot be cast to non-null type androidx.compose.ui.geometry.Offset");
                                        long j1111112 = ((cpm) value).a;
                                        aglbVar.setFloatUniform(strA, java.lang.Float.intBitsToFloat((int) (j1111112 >> c5)), java.lang.Float.intBitsToFloat((int) (j1111112 & j4)));
                                    } else {
                                        if (!(aglvVar instanceof defpackage.aglk)) {
                                            aooh.d(value, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Resolution");
                                            throw aolrVar3;
                                        }
                                        if (aglvVar instanceof defpackage.aglu) {
                                            aooh.d(value, "null cannot be cast to non-null type kotlin.Float");
                                            aglbVar.setFloatUniform(strA, ((java.lang.Float) value).floatValue());
                                        }
                                    }
                                    fArr3 = fArr;
                                    f5 = f19;
                                }
                            }
                            throw new aois();
                        }
                        continue;
                    }
                    i = 0;
                    i3 = 3;
                }
                float[] fArr114 = fArr3;
                float f3111111111 = f5;
                this.m = ajsz.aS(mapAT2);
                obj4 = mapAT2.get(defpackage.agln.aS);
                if (obj4 instanceof java.lang.Float) {
                    aolrVar5 = (java.lang.Float) obj4;
                } else {
                    aolrVar5 = aolrVar3;
                }
                long jLongValue11 = ((java.lang.Number) this.r.a()).longValue();
                l = this.E;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                j = jLongValue11 - jLongValue;
                f6 = j / 1000.0f;
                this.f.setFloatUniform(defpackage.agln.a.b, this.F + f6);
                agjmVar = this.a.k;
                if (agjmVar != null) {
                    if (agjmVar.i != 0.0f) {
                        f18 = agjmVar.j;
                        if (f18 != 0.0f) {
                            this.f.setFloatUniform(defpackage.agln.bb.b, agjmVar.k.a(1.0f - java.lang.Math.abs(((f6 / f18) % 2.0f) - 1.0f)));
                            f9 = 0.0f;
                        } else {
                            f9 = 0.0f;
                            this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                        }
                    } else {
                        f9 = 0.0f;
                        this.f.setFloatUniform(defpackage.agln.bb.b, 0.0f);
                    }
                    f10 = agjmVar.f;
                    if (f10 > f9) {
                        f17 = agjmVar.g;
                        if (f17 > f9) {
                            fL = defpackage.agmc.l(f10) * ((f6 % f17) / f17);
                        } else {
                            fL = f9;
                        }
                    } else {
                        fL = f9;
                    }
                    f11 = agjmVar.h;
                    if (f11 > f9) {
                        f12 = ((6.2831855f / f11) * f6) + fL;
                    } else {
                        f12 = 0.0f;
                    }
                    f7 = 2.0f;
                    this.f.setFloatUniform(defpackage.agln.ba.b, f12);
                    if (agjmVar.c != 0.0f) {
                        f13 = agjmVar.b;
                        if (f13 != 0.0f) {
                            f14 = agjmVar.e;
                            if (f14 != 0.0f) {
                                f15 = f6 % f14;
                                float fL11 = defpackage.agmc.l(f13);
                                java.util.List list10 = agjmVar.a;
                                float fFloor10 = (float) java.lang.Math.floor((f6 / f14) % list10.size());
                                float f3111111112 = fFloor10 * fL11;
                                float fC10 = agjmVar.d.c((j % ((long) (f14 * 1000.0f))) * 1000000, f3111111112, (fFloor10 + 1.0f) * fL11, 0.0f);
                                float f3111111113 = fC10 - f3111111112;
                                if (this.b == defpackage.agiz.EXIT) {
                                    defpackage.agmc.M(r17);
                                } else {
                                    defpackage.agmc.M(false);
                                }
                                this.f.setFloatUniform(defpackage.agln.aZ.b, fC10 + fL);
                                this.f.setFloatUniform(defpackage.agln.bd.b, ((f3111111113 / fL11) + fFloor10) % list10.size());
                                fMin2 = java.lang.Math.min(0.3f, 0.4f * f14);
                                defpackage.aglb aglbVar11 = this.f;
                                java.lang.String str10 = defpackage.agln.aY.b;
                                if (f15 < fMin2) {
                                    f16 = f15 / fMin2;
                                } else {
                                    f16 = 1.0f - ((f15 - fMin2) / (f14 - fMin2));
                                }
                                aglbVar11.setFloatUniform(str10, f16);
                            }
                            if (aolrVar5 != null) {
                                int i1112 = defpackage.agjj.a;
                                this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                            }
                            float fB119 = f3111111111 + defpackage.aglz.b(fArr114);
                            float f3111111114 = f4 + f4;
                            float f3111111115 = defpackage.aglz.f(fArr114) + fMin;
                            long jFloatToRawIntBits111111113 = java.lang.Float.floatToRawIntBits(fB119 + f3111111114);
                            long jFloatToRawIntBits111111114 = ((long) java.lang.Float.floatToRawIntBits(f3111111115 + f3111111114)) & j4;
                            long jFloatToRawIntBits111111115 = (((long) java.lang.Float.floatToRawIntBits(f3111111111 + defpackage.aglz.b(fArr114))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr114))) & j4);
                            den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF11.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111111115 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF11.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111111115 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111111113 << c5) | jFloatToRawIntBits111111114, 0.0f, (den) null, 0, 120);
                            aiiVar = this.d;
                            if (aiiVar.k()) {
                                if (aiiVar.k()) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                            } else if (aiiVar.k()) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            dbmVar.D();
                            if (agjxVar == null) {
                            }
                            cfo.w(this);
                            return;
                        }
                    }
                    this.f.setFloatUniform(defpackage.agln.aZ.b, fL);
                    f8 = 0.0f;
                    this.f.setFloatUniform(defpackage.agln.bd.b, 0.0f);
                    this.f.setFloatUniform(defpackage.agln.aY.b, 1.0f);
                    if (aolrVar5 != null) {
                        int i1113 = defpackage.agjj.a;
                        this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                    }
                    float fB1110 = f3111111111 + defpackage.aglz.b(fArr114);
                    float f3111111116 = f4 + f4;
                    float f3111111117 = defpackage.aglz.f(fArr114) + fMin;
                    long jFloatToRawIntBits111111116 = java.lang.Float.floatToRawIntBits(fB1110 + f3111111116);
                    long jFloatToRawIntBits111111117 = ((long) java.lang.Float.floatToRawIntBits(f3111111117 + f3111111116)) & j4;
                    long jFloatToRawIntBits111111118 = (((long) java.lang.Float.floatToRawIntBits(f3111111111 + defpackage.aglz.b(fArr114))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr114))) & j4);
                    den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF11.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111111118 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF11.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits111111118 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111111116 << c5) | jFloatToRawIntBits111111117, 0.0f, (den) null, 0, 120);
                    aiiVar = this.d;
                    if (aiiVar.k()) {
                        if (aiiVar.k()) {
                            aoubVar.s((java.util.concurrent.CancellationException) null);
                        }
                    } else if (aiiVar.k()) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    dbmVar.D();
                    if (agjxVar == null) {
                    }
                    cfo.w(this);
                    return;
                }
                f7 = 2.0f;
                f8 = 0.0f;
                if (aolrVar5 != null) {
                    int i1114 = defpackage.agjj.a;
                    this.f.setFloatUniform(defpackage.agln.b.b, java.lang.Float.intBitsToFloat((int) (jO >> c5)), java.lang.Float.intBitsToFloat((int) (jO & j4)));
                }
                float fB1111 = f3111111111 + defpackage.aglz.b(fArr114);
                float f3111111118 = f4 + f4;
                float f3111111119 = defpackage.aglz.f(fArr114) + fMin;
                long jFloatToRawIntBits111111119 = java.lang.Float.floatToRawIntBits(fB1111 + f3111111118);
                long jFloatToRawIntBits1111111110 = ((long) java.lang.Float.floatToRawIntBits(f3111111119 + f3111111118)) & j4;
                long jFloatToRawIntBits1111111111 = (((long) java.lang.Float.floatToRawIntBits(f3111111111 + defpackage.aglz.b(fArr114))) << c5) | (((long) java.lang.Float.floatToRawIntBits(fMin + defpackage.aglz.f(fArr114))) & j4);
                den.P(dbmVar, this.g, (((long) java.lang.Float.floatToRawIntBits((pointF11.x - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111111111 >> c5)) / f7)) - f4)) << c5) | (((long) java.lang.Float.floatToRawIntBits((pointF11.y - (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits1111111111 & j4)) / f7)) - f4)) & j4), (jFloatToRawIntBits111111119 << c5) | jFloatToRawIntBits1111111110, 0.0f, (den) null, 0, 120);
                aiiVar = this.d;
                if (aiiVar.k()) {
                    if (aiiVar.k()) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                } else if (aiiVar.k()) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                dbmVar.D();
                if (agjxVar == null) {
                }
                cfo.w(this);
                return;
            }
        }
        android.util.Log.w(o, "Shader draw area has zero dimension, skipping drawRect.");
        dbmVar.D();
    }

    public final void u() {
        aoub aoubVar = this.s;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        aoub aoubVar2 = this.e;
        if (aoubVar2 != null) {
            aoubVar2.s((java.util.concurrent.CancellationException) null);
        }
        f();
        da$.ExternalSyntheticApiModelOutline0.m("EnergyShaderNode#lifetime", this.I);
    }

    public final /* synthetic */ void m() {
    }
}
