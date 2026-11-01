package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cds extends defpackage.caz {
    public static final defpackage.aozj j = defpackage.aozk.a(defpackage.cir.a);
    private static final java.util.concurrent.atomic.AtomicReference u = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);
    private final defpackage.aoud A;
    private final defpackage.ajxw B;
    public long a;
    public final java.lang.Object b;
    public defpackage.aoub c;
    public java.lang.Throwable d;
    public final defpackage.cfc e;
    public final java.util.List f;
    public defpackage.aosb g;
    public boolean h;
    public final defpackage.aolr i;
    public final defpackage.aozj k;
    public defpackage.ady l;
    public final defpackage.adw m;
    public final defpackage.adw n;
    public final defpackage.adw o;
    public defpackage.ady p;
    public final defpackage.ccx q;
    public final defpackage.cdh r;
    public final defpackage.nf s;
    public final defpackage.aogc t;
    private final java.util.List v;
    private java.util.List w;
    private final java.util.List x;
    private java.util.List y;
    private final defpackage.aozj z;

    public cds(defpackage.aolr aolrVar) {
        defpackage.ccx ccxVar = new defpackage.ccx(new defpackage.bpa(this, 2), 1);
        this.q = ccxVar;
        this.t = new defpackage.aogc(new defpackage.bpa(this, 3));
        this.b = new java.lang.Object();
        this.v = new java.util.ArrayList();
        this.l = new defpackage.ady(6);
        this.e = new defpackage.cfc(new defpackage.cbb[16]);
        this.x = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.m = new defpackage.adw(6);
        this.s = new defpackage.nf((byte[]) null, (byte[]) null);
        long[] jArr = defpackage.adx.a;
        this.n = new defpackage.adw(6);
        this.o = new defpackage.adw(6);
        this.z = defpackage.aozk.a(null);
        this.k = new defpackage.aozj(defpackage.cdm.c);
        this.B = new defpackage.ajxw();
        defpackage.aoud aoudVar = new defpackage.aoud((defpackage.aoub) aolrVar.get(defpackage.aoub.d));
        aoudVar.p(new defpackage.bjp(this, 8));
        this.A = aoudVar;
        this.i = aolrVar.plus(ccxVar).plus(aoudVar);
        this.r = new defpackage.cdh();
    }

    private static final void M(defpackage.cds cdsVar, cck cckVar, cck cckVar2) {
        java.util.List list = cckVar2.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cck cckVar3 = (cck) list.get(i);
                defpackage.nf nfVar = cdsVar.s;
                defpackage.ccj ccjVar = cckVar3.a;
                defpackage.vx vxVar = new defpackage.vx(cckVar3, cckVar, (char[]) null);
                defpackage.cey.b((defpackage.adw) nfVar.a, ccjVar, vxVar);
                defpackage.cey.b((defpackage.adw) nfVar.b, vxVar.a, ccjVar);
                M(cdsVar, cckVar, cckVar3);
            }
        }
    }

    private final boolean N() {
        return this.e.b != 0 || G() || O() || this.m.e();
    }

    private final boolean O() {
        return !this.h && ((defpackage.cix) this.t.b).c();
    }

    private final boolean P() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (!this.l.c() && this.e.b == 0 && !G() && !O()) {
                z = false;
            }
        }
        return z;
    }

    private final void Q(defpackage.cbb cbbVar) throws java.lang.Throwable {
        synchronized (this.b) {
            java.util.List list = this.f;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (defpackage.aooh.n(((cck) list.get(i)).f, cbbVar)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    R(arrayList, this, cbbVar);
                    while (!arrayList.isEmpty()) {
                        J(arrayList, null);
                        R(arrayList, this, cbbVar);
                    }
                    return;
                }
            }
        }
    }

    private static final void R(java.util.List list, defpackage.cds cdsVar, defpackage.cbb cbbVar) {
        list.clear();
        synchronized (cdsVar.b) {
            java.util.Iterator it = cdsVar.f.iterator();
            while (it.hasNext()) {
                cck cckVar = (cck) it.next();
                if (defpackage.aooh.n(cckVar.f, cbbVar)) {
                    list.add(cckVar);
                    it.remove();
                }
            }
        }
    }

    private final void S(defpackage.cbb cbbVar) {
        if (this.v.remove(cbbVar)) {
            this.w = null;
        }
    }

    private static final void T(defpackage.ckk ckkVar) {
        try {
            if (ckkVar.c() instanceof defpackage.ckq) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            ckkVar.d();
        } catch (java.lang.Throwable th) {
            ckkVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object A(defpackage.aoln aolnVar) {
        defpackage.cdo cdoVar;
        if (aolnVar instanceof defpackage.cdo) {
            cdoVar = (defpackage.cdo) aolnVar;
            int i = cdoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdoVar.c = i - Integer.MIN_VALUE;
            } else {
                cdoVar = new defpackage.cdo(this, aolnVar);
            }
        } else {
            cdoVar = new defpackage.cdo(this, aolnVar);
        }
        java.lang.Object obj = cdoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cdoVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aozj aozjVar = this.k;
            defpackage.fys fysVar = new defpackage.fys((defpackage.aoln) null, 1, (byte[]) null);
            cdoVar.c = 1;
            if (defpackage.aoov.av(aozjVar, fysVar, cdoVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final java.util.List B() {
        java.util.List arrayList = this.w;
        if (arrayList == null) {
            java.util.List list = this.v;
            arrayList = list.isEmpty() ? defpackage.aokc.a : new java.util.ArrayList(list);
            this.w = arrayList;
        }
        return arrayList;
    }

    public final defpackage.aosb C() {
        defpackage.cdm cdmVar;
        defpackage.aozj aozjVar = this.k;
        if (((defpackage.cdm) aozjVar.c()).compareTo(defpackage.cdm.b) > 0) {
            if (this.z.c() != null) {
                cdmVar = defpackage.cdm.c;
            } else if (this.c == null) {
                this.l = new defpackage.ady(6);
                this.e.g();
                cdmVar = (G() || O()) ? defpackage.cdm.d : defpackage.cdm.c;
            } else {
                cdmVar = (this.e.b != 0 || this.l.c() || !this.x.isEmpty() || !this.f.isEmpty() || G() || O() || this.m.e()) ? defpackage.cdm.f : defpackage.cdm.e;
            }
            aozjVar.e(cdmVar);
            if (cdmVar != defpackage.cdm.f) {
                return null;
            }
            defpackage.aosb aosbVar = this.g;
            this.g = null;
            return aosbVar;
        }
        java.util.List listB = B();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
        }
        this.v.clear();
        this.w = defpackage.aokc.a;
        this.l = new defpackage.ady(6);
        this.e.g();
        this.x.clear();
        this.f.clear();
        this.y = null;
        defpackage.aosb aosbVar2 = this.g;
        if (aosbVar2 != null) {
            aosbVar2.g(null);
        }
        this.g = null;
        this.z.e(null);
        return null;
    }

    public final void D() {
        synchronized (this.b) {
            defpackage.aozj aozjVar = this.k;
            if (((defpackage.cdm) aozjVar.c()).compareTo(defpackage.cdm.e) >= 0) {
                aozjVar.e(defpackage.cdm.b);
            }
        }
        this.A.s(null);
    }

    public final void E() {
        defpackage.aosb aosbVarC;
        synchronized (this.b) {
            aosbVarC = C();
            if (((defpackage.cdm) this.k.c()).compareTo(defpackage.cdm.b) <= 0) {
                throw defpackage.aodc.l("Recomposer shutdown; frame clock awaiter will never resume", this.d);
            }
        }
        if (aosbVarC != null) {
            aosbVarC.w(defpackage.aojh.a);
        }
    }

    public final void F() {
        synchronized (this.b) {
            this.h = true;
        }
    }

    public final boolean G() {
        return !this.h && ((defpackage.cix) this.q.b).c();
    }

    public final boolean H() {
        boolean zN;
        synchronized (this.b) {
            if (this.l.b()) {
                zN = N();
            } else {
                java.util.List listB = B();
                defpackage.cff cffVar = new defpackage.cff(this.l);
                this.l = new defpackage.ady(6);
                try {
                    int size = listB.size();
                    for (int i = 0; i < size; i++) {
                        ((defpackage.cbb) listB.get(i)).r(cffVar);
                        if (((defpackage.cdm) this.k.c()).compareTo(defpackage.cdm.b) <= 0) {
                            break;
                        }
                    }
                    synchronized (this.b) {
                        if (C() != null) {
                            throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        zN = N();
                    }
                } catch (java.lang.Throwable th) {
                    synchronized (this.b) {
                        this.l.k(cffVar);
                        throw th;
                    }
                }
            }
        }
        return zN;
    }

    public final void I(defpackage.cbb cbbVar) {
        java.util.List arrayList = this.y;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.y = arrayList;
        }
        if (!arrayList.contains(cbbVar)) {
            arrayList.add(cbbVar);
        }
        S(cbbVar);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0389 A[Catch: all -> 0x04be, TryCatch #11 {all -> 0x04be, blocks: (B:104:0x0290, B:106:0x02a8, B:108:0x02b3, B:109:0x02b9, B:114:0x02ef, B:118:0x02fd, B:119:0x0300, B:120:0x0301, B:122:0x030c, B:125:0x0312, B:128:0x0318, B:130:0x0321, B:131:0x0326, B:133:0x032d, B:134:0x0332, B:136:0x0346, B:141:0x0362, B:142:0x0364, B:144:0x0380, B:146:0x0389, B:148:0x0391, B:150:0x03a2, B:152:0x03ad, B:154:0x03c6, B:137:0x0352), top: B:284:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0391 A[Catch: all -> 0x04be, TryCatch #11 {all -> 0x04be, blocks: (B:104:0x0290, B:106:0x02a8, B:108:0x02b3, B:109:0x02b9, B:114:0x02ef, B:118:0x02fd, B:119:0x0300, B:120:0x0301, B:122:0x030c, B:125:0x0312, B:128:0x0318, B:130:0x0321, B:131:0x0326, B:133:0x032d, B:134:0x0332, B:136:0x0346, B:141:0x0362, B:142:0x0364, B:144:0x0380, B:146:0x0389, B:148:0x0391, B:150:0x03a2, B:152:0x03ad, B:154:0x03c6, B:137:0x0352), top: B:284:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ad A[Catch: all -> 0x04be, TryCatch #11 {all -> 0x04be, blocks: (B:104:0x0290, B:106:0x02a8, B:108:0x02b3, B:109:0x02b9, B:114:0x02ef, B:118:0x02fd, B:119:0x0300, B:120:0x0301, B:122:0x030c, B:125:0x0312, B:128:0x0318, B:130:0x0321, B:131:0x0326, B:133:0x032d, B:134:0x0332, B:136:0x0346, B:141:0x0362, B:142:0x0364, B:144:0x0380, B:146:0x0389, B:148:0x0391, B:150:0x03a2, B:152:0x03ad, B:154:0x03c6, B:137:0x0352), top: B:284:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x03c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [cbb] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final java.util.List J(java.util.List list, defpackage.ady adyVar) throws java.lang.Throwable {
        defpackage.ckk ckkVar;
        java.util.ArrayList arrayList;
        java.util.HashMap map;
        java.util.Iterator it;
        ?? r5;
        vk vkVar;
        java.lang.Object obj;
        defpackage.cfh cfhVar;
        defpackage.cfh cfhVarC;
        java.util.ArrayList arrayList2;
        defpackage.cfl cflVarE;
        defpackage.cfl cflVarE2;
        defpackage.cfl cflVar;
        defpackage.cfl cflVar2;
        int[] iArr;
        defpackage.aco acoVar;
        defpackage.can canVar;
        boolean z;
        defpackage.can canVar2;
        defpackage.cfm cfmVar;
        java.util.HashMap map2;
        java.util.Iterator it2;
        java.util.List list2;
        java.util.HashMap map3 = new java.util.HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj2 = list.get(i);
            defpackage.cbb cbbVar = ((cck) obj2).f;
            java.lang.Object arrayList3 = map3.get(cbbVar);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                map3.put(cbbVar, arrayList3);
            }
            ((java.util.ArrayList) arrayList3).add(obj2);
        }
        java.util.Iterator it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
            defpackage.cbb cbbVar2 = (defpackage.cbb) entry.getKey();
            java.util.List list3 = (java.util.List) entry.getValue();
            if (cbbVar2.u()) {
                defpackage.cax.b("Check failed");
            }
            defpackage.ckk ckkVarK = defpackage.cfd.k(new defpackage.bjp(cbbVar2, 7), new defpackage.bet(cbbVar2, adyVar, 3, null));
            try {
                defpackage.cko ckoVarW = ckkVarK.w();
                try {
                    java.lang.Object obj3 = this.b;
                    synchronized (obj3) {
                        try {
                            arrayList = new java.util.ArrayList(list3.size());
                            int size2 = list3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                cck cckVar = (cck) list3.get(i2);
                                java.lang.Object objA = defpackage.cey.a(this.m, cckVar.a);
                                cck cckVar2 = (cck) objA;
                                if (cckVar2 != null) {
                                    defpackage.nf nfVar = this.s;
                                    map2 = map3;
                                    java.lang.Object objA2 = ((defpackage.adw) nfVar.b).a(cckVar2);
                                    if (objA2 != null) {
                                        it2 = it3;
                                        if (objA2 instanceof defpackage.adq) {
                                            defpackage.adq adqVar = (defpackage.adq) objA2;
                                            java.lang.Object[] objArr = adqVar.a;
                                            int i3 = adqVar.b;
                                            int i4 = 0;
                                            while (i4 < i3) {
                                                java.lang.Object obj4 = objArr[i4];
                                                if (obj4 == null) {
                                                    defpackage.aooh.h("null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                                }
                                                int i5 = i4;
                                                defpackage.cey.c((defpackage.adw) nfVar.a, (defpackage.ccj) obj4, new bru(cckVar2, 18));
                                                i4 = i5 + 1;
                                                i3 = i3;
                                                list3 = list3;
                                            }
                                        } else {
                                            list2 = list3;
                                            defpackage.cey.c((defpackage.adw) nfVar.a, (defpackage.ccj) objA2, new bru(cckVar2, 18));
                                        }
                                        arrayList.add(new defpackage.aoiu(cckVar, objA));
                                        i2++;
                                        map3 = map2;
                                        it3 = it2;
                                        list3 = list2;
                                    }
                                    list2 = list3;
                                    arrayList.add(new defpackage.aoiu(cckVar, objA));
                                    i2++;
                                    map3 = map2;
                                    it3 = it2;
                                    list3 = list2;
                                } else {
                                    map2 = map3;
                                }
                                it2 = it3;
                                list2 = list3;
                                arrayList.add(new defpackage.aoiu(cckVar, objA));
                                i2++;
                                map3 = map2;
                                it3 = it2;
                                list3 = list2;
                            }
                            map = map3;
                            it = it3;
                            int size3 = arrayList.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                defpackage.aoiu aoiuVar = (defpackage.aoiu) arrayList.get(i6);
                                if (aoiuVar.b == null) {
                                    defpackage.nf nfVar2 = this.s;
                                    defpackage.ccj ccjVar = ((cck) aoiuVar.a).a;
                                    java.lang.Object obj5 = nfVar2.a;
                                    if (defpackage.adw.f((defpackage.adw) obj5, ccjVar)) {
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i7 = 0; i7 < size4; i7++) {
                                            defpackage.aoiu aoiuVar2 = (defpackage.aoiu) arrayList.get(i7);
                                            if (aoiuVar2.b == null) {
                                                java.lang.Object obj6 = aoiuVar2.a;
                                                defpackage.vx vxVar = (defpackage.vx) defpackage.cey.a((defpackage.adw) obj5, ((cck) obj6).a);
                                                if (((defpackage.adw) obj5).d()) {
                                                    ((defpackage.adw) nfVar2.b).k();
                                                }
                                                if (vxVar != null) {
                                                    java.lang.Object obj7 = vxVar.b;
                                                    defpackage.cey.b(this.o, vxVar.a, obj7);
                                                    aoiuVar2 = new defpackage.aoiu(obj6, obj7);
                                                }
                                            }
                                            arrayList4.add(aoiuVar2);
                                        }
                                        arrayList = arrayList4;
                                        break;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defpackage.ckw.i.j(ckoVarW);
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        if (((defpackage.aoiu) arrayList.get(i8)).b != null) {
                            int size6 = arrayList.size();
                            for (int i9 = 0; i9 < size6; i9++) {
                                if (((defpackage.aoiu) arrayList.get(i9)).b == null) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i10 = 0; i10 < size7; i10++) {
                                        defpackage.aoiu aoiuVar3 = (defpackage.aoiu) arrayList.get(i10);
                                        cck cckVar3 = aoiuVar3.b == null ? (cck) aoiuVar3.a : null;
                                        if (cckVar3 != null) {
                                            arrayList5.add(cckVar3);
                                        }
                                    }
                                    synchronized (obj3) {
                                        defpackage.ajsz.bv(this.f, arrayList5);
                                    }
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i11 = 0; i11 < size8; i11++) {
                                        java.lang.Object obj8 = arrayList.get(i11);
                                        if (((defpackage.aoiu) obj8).b != null) {
                                            arrayList6.add(obj8);
                                        }
                                    }
                                    arrayList = arrayList6;
                                    break;
                                }
                            }
                            break;
                        }
                        th = th;
                        T(ckkVar);
                        throw th;
                    }
                    int size9 = arrayList.size();
                    for (int i12 = 0; i12 < size9; i12++) {
                        if (!defpackage.aooh.n(((cck) ((defpackage.aoiu) arrayList.get(i12)).a).f, cbbVar2)) {
                            defpackage.cax.b("Check failed");
                            break;
                        }
                    }
                    try {
                        defpackage.ckj ckjVar = cbbVar2.g;
                        defpackage.cfc cfcVarA = defpackage.ckh.a();
                        cfcVarA.n(ckjVar);
                        try {
                            defpackage.ccb ccbVar = cbbVar2.m;
                            android.os.Trace.beginSection("Compose:insertMovableContent");
                            try {
                                defpackage.den denVar = ((defpackage.cbt) ccbVar).C;
                                try {
                                    defpackage.cfr cfrVar = ((defpackage.cbt) ccbVar).t;
                                    defpackage.can canVarG = defpackage.cfo.g(((defpackage.cbt) ccbVar).e);
                                    defpackage.can canVar3 = cfrVar.j;
                                    try {
                                        cfrVar.j = canVarG;
                                        cfrVar.j.a.i(cgs.a);
                                        int size10 = arrayList.size();
                                        int i13 = 0;
                                        cbbVar2 = cbbVar2;
                                        while (i13 < size10) {
                                            defpackage.aoiu aoiuVar4 = (defpackage.aoiu) arrayList.get(i13);
                                            cck cckVar4 = (cck) aoiuVar4.a;
                                            cck cckVar5 = (cck) aoiuVar4.b;
                                            defpackage.cfh cfhVarC2 = defpackage.cfd.c(cckVar4.g);
                                            defpackage.ced cedVar = cckVar4.c;
                                            int iD = ((defpackage.cfm) cedVar).d(cfhVarC2);
                                            int i14 = size10;
                                            ckkVar = ckkVarK;
                                            try {
                                                defpackage.cjb cjbVar = new defpackage.cjb(null);
                                                cfrVar.f();
                                                defpackage.chi chiVar = cfrVar.j.a;
                                                int i15 = i13;
                                                chiVar.i(cfz.a);
                                                defpackage.chh.b(chiVar, 0, cjbVar, 1, cfhVarC2);
                                                if (cckVar5 == null) {
                                                    if (defpackage.aooh.n(cedVar, ((defpackage.cbt) ccbVar).q)) {
                                                        ((defpackage.cbt) ccbVar).U();
                                                    }
                                                    defpackage.cfl cflVarE3 = ((defpackage.cfm) cedVar).e();
                                                    try {
                                                        cflVarE3.t(iD);
                                                        cfrVar.c = iD;
                                                        defpackage.can canVar4 = new defpackage.can(null);
                                                        try {
                                                            ((defpackage.cbt) ccbVar).ah(null, null, null, defpackage.aokc.a, new ajx((defpackage.cbt) ccbVar, canVar4, cflVarE3, cckVar4, 3));
                                                            cfrVar.m(canVar4, cjbVar);
                                                            cflVarE3.r();
                                                        } catch (java.lang.Throwable th2) {
                                                            th = th2;
                                                            cflVarE3 = cflVarE3;
                                                            cflVarE3.r();
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                    }
                                                } else {
                                                    defpackage.caz cazVar = ((defpackage.cbt) ccbVar).b;
                                                    vk vkVarX = cazVar.x(cckVar5);
                                                    java.lang.Object obj9 = vkVarX != null ? vkVarX.a : null;
                                                    java.lang.Object obj10 = obj9 == null ? cckVar5.c : obj9;
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (obj9 != null) {
                                                                                            cbbVar2 = cazVar;
                                                                                            if (((defpackage.cfm) obj9).f) {
                                                                                                defpackage.cax.b("use active SlotWriter to create an anchor location instead");
                                                                                            }
                                                                                            if (((defpackage.cfm) obj9).b <= 0) {
                                                                                                defpackage.cdh.a("Parameter index is out of range");
                                                                                            }
                                                                                            java.util.ArrayList arrayList7 = ((defpackage.cfm) obj9).h;
                                                                                            vkVar = vkVarX;
                                                                                            int iC = defpackage.cfo.c(arrayList7, 0, ((defpackage.cfm) obj9).b);
                                                                                            obj = obj10;
                                                                                            if (iC < 0) {
                                                                                                cfhVar = new defpackage.cfh(0);
                                                                                                arrayList7.add(-(iC + 1), cfhVar);
                                                                                            } else {
                                                                                                cfhVar = (defpackage.cfh) arrayList7.get(iC);
                                                                                            }
                                                                                            if (cfhVar == null) {
                                                                                                cbbVar2 = cbbVar2;
                                                                                            } else {
                                                                                                cfhVarC = defpackage.cfd.c(cfhVar);
                                                                                                arrayList2 = new java.util.ArrayList();
                                                                                                cflVarE = ((defpackage.cfm) obj).e();
                                                                                                defpackage.cbu.f(cflVarE, arrayList2, ((defpackage.cfm) obj).d(cfhVarC));
                                                                                                cflVarE.r();
                                                                                                if (arrayList2.isEmpty()) {
                                                                                                    cfhVarC = cfhVarC;
                                                                                                } else {
                                                                                                    canVar2 = cfrVar.j;
                                                                                                    if (!arrayList2.isEmpty()) {
                                                                                                        defpackage.chi chiVar2 = canVar2.a;
                                                                                                        chiVar2.i(cfw.a);
                                                                                                        defpackage.chh.b(chiVar2, 1, arrayList2, 0, cjbVar);
                                                                                                    }
                                                                                                    cfmVar = ((defpackage.cbt) ccbVar).c;
                                                                                                    if (defpackage.aooh.n(cedVar, cfmVar)) {
                                                                                                        int iD2 = cfmVar.d(cfhVarC2);
                                                                                                        ((defpackage.cbt) ccbVar).ac(iD2, ((defpackage.cbt) ccbVar).N(iD2) + arrayList2.size());
                                                                                                    }
                                                                                                }
                                                                                                defpackage.chi chiVar3 = cfrVar.j.a;
                                                                                                chiVar3.i(cfx.a);
                                                                                                int i16 = chiVar3.f - chiVar3.a[chiVar3.b - 1].c;
                                                                                                ?? r0 = chiVar3.e;
                                                                                                r0[i16] = vkVar;
                                                                                                r0[i16 + 1] = cbbVar2;
                                                                                                r0[i16 + 3] = cckVar4;
                                                                                                r0[i16 + 2] = cckVar5;
                                                                                                cflVarE2 = ((defpackage.cfm) obj).e();
                                                                                                cflVar2 = ((defpackage.cbt) ccbVar).p;
                                                                                                iArr = ((defpackage.cbt) ccbVar).g;
                                                                                                acoVar = ((defpackage.cbt) ccbVar).y;
                                                                                                ((defpackage.cbt) ccbVar).g = null;
                                                                                                ((defpackage.cbt) ccbVar).y = null;
                                                                                                ((defpackage.cbt) ccbVar).p = cflVarE2;
                                                                                                int iD3 = ((defpackage.cfm) obj).d(defpackage.cfd.c(cfhVarC));
                                                                                                cflVarE2.t(iD3);
                                                                                                cfrVar.c = iD3;
                                                                                                defpackage.can canVar5 = new defpackage.can(null);
                                                                                                canVar = cfrVar.j;
                                                                                                cfrVar.j = canVar5;
                                                                                                z = cfrVar.b;
                                                                                                cfrVar.b = false;
                                                                                                cflVar = cflVarE2;
                                                                                                ((defpackage.cbt) ccbVar).ah(cckVar5.f, cckVar4.f, java.lang.Integer.valueOf(cflVarE2.f), cckVar5.d, new bxq(ccbVar, cckVar4, 2, (byte[]) null));
                                                                                                cfrVar.b = z;
                                                                                                cfrVar.j = canVar;
                                                                                                cfrVar.m(canVar5, cjbVar);
                                                                                                ((defpackage.cbt) ccbVar).p = cflVar2;
                                                                                                ((defpackage.cbt) ccbVar).g = iArr;
                                                                                                ((defpackage.cbt) ccbVar).y = acoVar;
                                                                                                cflVar.r();
                                                                                            }
                                                                                            th = th;
                                                                                            cfrVar.j = canVar3;
                                                                                            throw th;
                                                                                        }
                                                                                        cbbVar2 = cazVar;
                                                                                        vkVar = vkVarX;
                                                                                        obj = obj10;
                                                                                        ((defpackage.cbt) ccbVar).p = cflVar2;
                                                                                        ((defpackage.cbt) ccbVar).g = iArr;
                                                                                        ((defpackage.cbt) ccbVar).y = acoVar;
                                                                                        cflVar.r();
                                                                                    } catch (java.lang.Throwable th4) {
                                                                                        th = th4;
                                                                                        cflVar.r();
                                                                                        throw th;
                                                                                    }
                                                                                    cfrVar.j = canVar;
                                                                                    cfrVar.m(canVar5, cjbVar);
                                                                                } catch (java.lang.Throwable th5) {
                                                                                    th = th5;
                                                                                    ((defpackage.cbt) ccbVar).p = cflVar2;
                                                                                    ((defpackage.cbt) ccbVar).g = iArr;
                                                                                    ((defpackage.cbt) ccbVar).y = acoVar;
                                                                                    throw th;
                                                                                }
                                                                                cfrVar.b = z;
                                                                            } catch (java.lang.Throwable th6) {
                                                                                th = th6;
                                                                                cfrVar.j = canVar;
                                                                                throw th;
                                                                            }
                                                                            ((defpackage.cbt) ccbVar).ah(cckVar5.f, cckVar4.f, java.lang.Integer.valueOf(cflVarE2.f), cckVar5.d, new bxq(ccbVar, cckVar4, 2, (byte[]) null));
                                                                        } catch (java.lang.Throwable th7) {
                                                                            th = th7;
                                                                            cfrVar.b = z;
                                                                            throw th;
                                                                        }
                                                                        cfrVar.b = false;
                                                                        cflVar = cflVarE2;
                                                                    } catch (java.lang.Throwable th8) {
                                                                        th = th8;
                                                                        cflVar = cflVarE2;
                                                                    }
                                                                    cfrVar.j = canVar5;
                                                                    z = cfrVar.b;
                                                                } catch (java.lang.Throwable th9) {
                                                                    th = th9;
                                                                    cflVar = cflVarE2;
                                                                }
                                                                ((defpackage.cbt) ccbVar).p = cflVarE2;
                                                                int iD4 = ((defpackage.cfm) obj).d(defpackage.cfd.c(cfhVarC));
                                                                cflVarE2.t(iD4);
                                                                cfrVar.c = iD4;
                                                                defpackage.can canVar6 = new defpackage.can(null);
                                                                canVar = cfrVar.j;
                                                            } catch (java.lang.Throwable th10) {
                                                                th = th10;
                                                                cflVar = cflVarE2;
                                                            }
                                                            cflVar2 = ((defpackage.cbt) ccbVar).p;
                                                            iArr = ((defpackage.cbt) ccbVar).g;
                                                            acoVar = ((defpackage.cbt) ccbVar).y;
                                                            ((defpackage.cbt) ccbVar).g = null;
                                                            ((defpackage.cbt) ccbVar).y = null;
                                                        } catch (java.lang.Throwable th11) {
                                                            th = th11;
                                                            cflVar = cflVarE2;
                                                        }
                                                        defpackage.cbu.f(cflVarE, arrayList2, ((defpackage.cfm) obj).d(cfhVarC));
                                                        cflVarE.r();
                                                        if (arrayList2.isEmpty()) {
                                                            canVar2 = cfrVar.j;
                                                            if (!arrayList2.isEmpty()) {
                                                                defpackage.chi chiVar4 = canVar2.a;
                                                                chiVar4.i(cfw.a);
                                                                defpackage.chh.b(chiVar4, 1, arrayList2, 0, cjbVar);
                                                            }
                                                            cfmVar = ((defpackage.cbt) ccbVar).c;
                                                            if (defpackage.aooh.n(cedVar, cfmVar)) {
                                                                int iD5 = cfmVar.d(cfhVarC2);
                                                                ((defpackage.cbt) ccbVar).ac(iD5, ((defpackage.cbt) ccbVar).N(iD5) + arrayList2.size());
                                                            }
                                                        } else {
                                                            cfhVarC = cfhVarC;
                                                        }
                                                        defpackage.chi chiVar5 = cfrVar.j.a;
                                                        chiVar5.i(cfx.a);
                                                        int i17 = chiVar5.f - chiVar5.a[chiVar5.b - 1].c;
                                                        ?? r1 = chiVar5.e;
                                                        r1[i17] = vkVar;
                                                        r1[i17 + 1] = cbbVar2;
                                                        r1[i17 + 3] = cckVar4;
                                                        r1[i17 + 2] = cckVar5;
                                                        cflVarE2 = ((defpackage.cfm) obj).e();
                                                    } catch (java.lang.Throwable th12) {
                                                        cflVarE.r();
                                                        throw th12;
                                                    }
                                                    cfhVar = cckVar5.g;
                                                    cfhVarC = defpackage.cfd.c(cfhVar);
                                                    arrayList2 = new java.util.ArrayList();
                                                    cflVarE = ((defpackage.cfm) obj).e();
                                                }
                                                try {
                                                    cfrVar.l();
                                                    i13 = i15 + 1;
                                                    arrayList = arrayList;
                                                    cbbVar2 = cbbVar2;
                                                    size10 = i14;
                                                    ckkVarK = ckkVar;
                                                } catch (java.lang.Throwable th13) {
                                                    th = th13;
                                                }
                                            } catch (java.lang.Throwable th14) {
                                                th = th14;
                                                cbbVar2 = cbbVar2;
                                            }
                                        }
                                        cbbVar2 = cbbVar2;
                                        ckkVar = ckkVarK;
                                        cfrVar.f();
                                        cfrVar.j.a.i(cgd.a);
                                        cfrVar.c = 0;
                                        try {
                                            cfrVar.j = canVar3;
                                            try {
                                                ((defpackage.cbt) ccbVar).T();
                                                try {
                                                    android.os.Trace.endSection();
                                                    try {
                                                        cfcVarA.c(cfcVarA.b - 1);
                                                        try {
                                                            defpackage.ckw.i.j(ckoVarW);
                                                            T(ckkVar);
                                                            map3 = map;
                                                            it3 = it;
                                                        } catch (java.lang.Throwable th15) {
                                                            th = th15;
                                                        }
                                                    } catch (java.lang.Throwable th16) {
                                                        th = th16;
                                                        r5 = cbbVar2;
                                                        try {
                                                            java.util.Set set = r5.d;
                                                            if (!set.isEmpty()) {
                                                                defpackage.cjh cjhVar = r5.l;
                                                                r5.m.P();
                                                                try {
                                                                    cjhVar.i(set, null);
                                                                    cjhVar.b();
                                                                } finally {
                                                                    cjhVar.a();
                                                                }
                                                            }
                                                            throw th;
                                                        } catch (java.lang.Throwable th17) {
                                                            r5.g();
                                                            throw th17;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th18) {
                                                    th = th18;
                                                    cfcVarA.c(cfcVarA.b - 1);
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th19) {
                                                th = th19;
                                                android.os.Trace.endSection();
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th20) {
                                            th = th20;
                                            defpackage.den denVar2 = ((defpackage.cbt) ccbVar).C;
                                            ((defpackage.cbt) ccbVar).S();
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th21) {
                                        th = th21;
                                        cbbVar2 = cbbVar2;
                                        ckkVar = ckkVarK;
                                    }
                                } catch (java.lang.Throwable th22) {
                                    th = th22;
                                    cbbVar2 = cbbVar2;
                                    ckkVar = ckkVarK;
                                }
                            } catch (java.lang.Throwable th23) {
                                th = th23;
                                cbbVar2 = cbbVar2;
                                ckkVar = ckkVarK;
                            }
                        } catch (java.lang.Throwable th24) {
                            th = th24;
                            cbbVar2 = cbbVar2;
                            ckkVar = ckkVarK;
                        }
                    } catch (java.lang.Throwable th25) {
                        th = th25;
                        ckkVar = ckkVarK;
                        r5 = cbbVar2;
                    }
                } catch (java.lang.Throwable th26) {
                    th = th26;
                    ckkVar = ckkVarK;
                    defpackage.ckw.i.j(ckoVarW);
                    throw th;
                }
            } catch (java.lang.Throwable th27) {
                th = th27;
                ckkVar = ckkVarK;
            }
        }
        return defpackage.ajsz.bZ(map3.keySet());
    }

    public final defpackage.cbb K(defpackage.cbb cbbVar, defpackage.ady adyVar) {
        defpackage.ady adyVar2;
        byte[] bArr = null;
        if (!cbbVar.u() && !cbbVar.v() && ((adyVar2 = this.p) == null || !adyVar2.a(cbbVar))) {
            defpackage.ckk ckkVarK = defpackage.cfd.k(new defpackage.bjp(cbbVar, 7), new defpackage.bet(cbbVar, adyVar, 3, bArr));
            try {
                defpackage.cko ckoVarW = ckkVarK.w();
                boolean zH = false;
                if (adyVar != null) {
                    try {
                        if (adyVar.c()) {
                            defpackage.bev bevVar = new defpackage.bev(adyVar, cbbVar, 4, bArr);
                            defpackage.ccb ccbVar = cbbVar.m;
                            if (((defpackage.cbt) ccbVar).o) {
                                defpackage.cax.b("Preparing a composition while composing is not supported");
                            }
                            ((defpackage.cbt) ccbVar).o = true;
                            try {
                                bevVar.a();
                                ((defpackage.cbt) ccbVar).o = false;
                            } catch (java.lang.Throwable th) {
                                ((defpackage.cbt) ccbVar).o = false;
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        defpackage.ckw.i.j(ckoVarW);
                        throw th2;
                    }
                }
                synchronized (cbbVar.c) {
                    ccy ccyVar = cbbVar.i;
                    if (ccyVar == null || (defpackage.aooh.n(ccyVar.d.get(), cdf.a) && ccyVar.e == java.lang.Thread.currentThread().getId())) {
                        cbbVar.n();
                        try {
                            defpackage.adw adwVarX = cbbVar.x();
                            try {
                                defpackage.ckj ckjVar = cbbVar.g;
                                defpackage.cfc cfcVarA = defpackage.ckh.a();
                                cfcVarA.n(ckjVar);
                                try {
                                    defpackage.ccb ccbVar2 = cbbVar.m;
                                    ceb cebVar = cbbVar.h;
                                    if (!((defpackage.cbt) ccbVar2).d.k()) {
                                        defpackage.cax.b("Expected applyChanges() to have been called");
                                    }
                                    if (adwVarX.e > 0 || !((defpackage.cbt) ccbVar2).j.isEmpty()) {
                                        ((defpackage.cbt) ccbVar2).u = cebVar;
                                        try {
                                            ((defpackage.cbt) ccbVar2).af(adwVarX, null);
                                            ((defpackage.cbt) ccbVar2).u = null;
                                            zH = ((defpackage.cbt) ccbVar2).d.h();
                                        } catch (java.lang.Throwable th3) {
                                            ((defpackage.cbt) ccbVar2).u = null;
                                            throw th3;
                                        }
                                    }
                                    if (!zH) {
                                        cbbVar.o();
                                    }
                                    cfcVarA.c(cfcVarA.b - 1);
                                } catch (java.lang.Throwable th4) {
                                    cfcVarA.c(cfcVarA.b - 1);
                                    throw th4;
                                }
                            } catch (java.lang.Throwable th5) {
                                cbbVar.q = adwVarX;
                                throw th5;
                            }
                        } catch (java.lang.Throwable th6) {
                            try {
                                java.util.Set set = cbbVar.d;
                                if (!set.isEmpty()) {
                                    defpackage.cjh cjhVar = cbbVar.l;
                                    cbbVar.m.P();
                                    try {
                                        cjhVar.i(set, null);
                                        cjhVar.b();
                                    } finally {
                                        cjhVar.a();
                                    }
                                }
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                cbbVar.g();
                                throw th7;
                            }
                        }
                    } else {
                        defpackage.anty.Q(ccyVar.d, cda.a, cde.a);
                        ccyVar.g.a.f(9);
                    }
                }
                defpackage.ckw.i.j(ckoVarW);
                T(ckkVarK);
                if (zH) {
                    return cbbVar;
                }
            } catch (java.lang.Throwable th8) {
                T(ckkVarK);
                throw th8;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [cbb] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final void L(java.lang.Throwable th, defpackage.cbb cbbVar) throws java.lang.Throwable {
        if (!((java.lang.Boolean) u.get()).booleanValue() || (th instanceof cas)) {
            synchronized (this.b) {
                android.util.Log.e("ComposeInternal", "Error was captured in composition.", th);
                defpackage.aozj aozjVar = this.z;
                vk vkVar = (vk) aozjVar.c();
                if (vkVar != null) {
                    throw ((java.lang.Throwable) vkVar.a);
                }
                aozjVar.e(new vk(th, (byte[]) null));
            }
            throw th;
        }
        synchronized (this.b) {
            android.util.Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.x.clear();
            this.e.g();
            this.l = new defpackage.ady(6);
            this.f.clear();
            this.m.k();
            this.n.k();
            this.z.e(new vk(th, (byte[]) null));
            if (cbbVar != 0) {
                while (cbbVar != 0) {
                    I((defpackage.cbb) cbbVar);
                    defpackage.caz cazVar = ((defpackage.cbb) cbbVar).a;
                    cbbVar = cazVar != null ? cazVar.c() : 0;
                    if (true != (cbbVar instanceof defpackage.cbb)) {
                        cbbVar = 0;
                    }
                }
            }
            if (C() != null) {
                defpackage.cax.b("expected to go to inactive state due to composition error");
            }
        }
    }

    @Override // defpackage.caz
    public final long a() {
        return 1000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [aomy, java.lang.Object] */
    @Override // defpackage.caz
    public final cal b(defpackage.aomy aomyVar) {
        ccq ccqVar = new ccq(aomyVar);
        defpackage.aogc aogcVar = this.t;
        return ((defpackage.cix) aogcVar.b).a(ccqVar, aogcVar.a);
    }

    @Override // defpackage.caz
    public final defpackage.cay c() {
        return null;
    }

    @Override // defpackage.caz
    public final defpackage.aolr d() {
        return this.i;
    }

    @Override // defpackage.caz
    public final void e(cck cckVar) {
        defpackage.aosb aosbVarC;
        synchronized (this.b) {
            defpackage.cey.b(this.m, cckVar.a, cckVar);
            if (cckVar.e != null) {
                M(this, cckVar, cckVar);
            }
            aosbVarC = C();
        }
        if (aosbVarC != null) {
            aosbVarC.w(defpackage.aojh.a);
        }
    }

    @Override // defpackage.caz
    public final void i(defpackage.cdk cdkVar) {
        defpackage.ajxw ajxwVar = this.B;
        defpackage.ady adyVar = (defpackage.ady) ajxwVar.i();
        if (adyVar == null) {
            defpackage.ady adyVar2 = defpackage.adz.a;
            adyVar = new defpackage.ady(6);
            ajxwVar.j(adyVar);
        }
        adyVar.j(cdkVar);
    }

    @Override // defpackage.caz
    public final boolean l() {
        return ((java.lang.Boolean) u.get()).booleanValue();
    }

    @Override // defpackage.caz
    public final boolean m() {
        return false;
    }

    @Override // defpackage.caz
    public final boolean n() {
        return false;
    }

    @Override // defpackage.caz
    public final defpackage.ady o(defpackage.cbb cbbVar, ceb cebVar, defpackage.aonn aonnVar) {
        try {
            ceb cebVarF = cbbVar.f(cebVar);
            try {
                q(cbbVar, aonnVar);
                defpackage.ady adyVar = (defpackage.ady) this.B.i();
                if (adyVar == null && (adyVar = defpackage.adz.a) == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                cbbVar.f(cebVarF);
                this.B.j(null);
                return adyVar;
            } catch (java.lang.Throwable th) {
                cbbVar.f(cebVarF);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.B.j(null);
            throw th2;
        }
    }

    @Override // defpackage.caz
    public final defpackage.ady p(defpackage.cbb cbbVar, ceb cebVar, defpackage.ady adyVar) {
        try {
            H();
            cbbVar.r(new defpackage.cff(adyVar));
            ceb cebVarF = cbbVar.f(cebVar);
            try {
                defpackage.cbb cbbVarK = K(cbbVar, null);
                if (cbbVarK != null) {
                    Q(cbbVar);
                    cbbVarK.i();
                    cbbVarK.j();
                }
                defpackage.ady adyVar2 = (defpackage.ady) this.B.i();
                if (adyVar2 == null && (adyVar2 = defpackage.adz.a) == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                cbbVar.f(cebVarF);
                this.B.j(null);
                return adyVar2;
            } catch (java.lang.Throwable th) {
                cbbVar.f(cebVarF);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.B.j(null);
            throw th2;
        }
    }

    @Override // defpackage.caz
    public final void q(defpackage.cbb cbbVar, defpackage.aonn aonnVar) throws java.lang.Throwable {
        boolean zContains;
        boolean zU = cbbVar.u();
        synchronized (this.b) {
            zContains = ((defpackage.cdm) this.k.c()).compareTo(defpackage.cdm.b) > 0 ? true ^ B().contains(cbbVar) : true;
        }
        try {
            byte[] bArr = null;
            defpackage.ckk ckkVarK = defpackage.cfd.k(new defpackage.bjp(cbbVar, 7), new defpackage.bet(cbbVar, bArr, 3, bArr));
            try {
                defpackage.cko ckoVarW = ckkVarK.w();
                try {
                    synchronized (cbbVar.c) {
                        cbbVar.n();
                        defpackage.adw adwVarX = cbbVar.x();
                        try {
                            defpackage.ckj ckjVar = cbbVar.g;
                            defpackage.cfc cfcVarA = defpackage.ckh.a();
                            cfcVarA.n(ckjVar);
                            try {
                                defpackage.ccb ccbVar = cbbVar.m;
                                ceb cebVar = cbbVar.h;
                                if (!((defpackage.cbt) ccbVar).d.k()) {
                                    defpackage.cax.b("Expected applyChanges() to have been called");
                                }
                                ((defpackage.cbt) ccbVar).u = cebVar;
                                try {
                                    ((defpackage.cbt) ccbVar).af(adwVarX, aonnVar);
                                    ((defpackage.cbt) ccbVar).u = null;
                                    cfcVarA.c(cfcVarA.b - 1);
                                } catch (java.lang.Throwable th) {
                                    ((defpackage.cbt) ccbVar).u = null;
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                cfcVarA.c(cfcVarA.b - 1);
                                throw th2;
                            }
                        } catch (java.lang.Throwable th3) {
                            cbbVar.q = adwVarX;
                            throw th3;
                        }
                    }
                    defpackage.ckw.i.j(ckoVarW);
                    T(ckkVarK);
                    synchronized (this.b) {
                        if (((defpackage.cdm) this.k.c()).compareTo(defpackage.cdm.b) > 0 && !B().contains(cbbVar)) {
                            this.v.add(cbbVar);
                            this.w = null;
                        }
                    }
                    if (!zU) {
                        defpackage.ckw.b().e();
                    }
                    try {
                        Q(cbbVar);
                        try {
                            cbbVar.i();
                            cbbVar.j();
                            if (zU) {
                                return;
                            }
                            defpackage.ckw.b().e();
                        } catch (java.lang.Throwable th4) {
                            L(th4, null);
                        }
                    } catch (java.lang.Throwable th5) {
                        L(th5, cbbVar);
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        java.util.Set set = cbbVar.d;
                        if (!set.isEmpty()) {
                            defpackage.cjh cjhVar = cbbVar.l;
                            cbbVar.m.P();
                            try {
                                cjhVar.i(set, null);
                                cjhVar.b();
                            } finally {
                                cjhVar.a();
                            }
                        }
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        try {
                            cbbVar.g();
                            throw th7;
                        } catch (java.lang.Throwable th8) {
                            defpackage.ckw.i.j(ckoVarW);
                            throw th8;
                        }
                    }
                }
            } catch (java.lang.Throwable th9) {
                T(ckkVarK);
                throw th9;
            }
        } catch (java.lang.Throwable th10) {
            if (zContains) {
                synchronized (this.b) {
                }
            }
            L(th10, cbbVar);
        }
    }

    @Override // defpackage.caz
    public final void r(defpackage.cbb cbbVar) {
        defpackage.aosb aosbVarC;
        synchronized (this.b) {
            defpackage.cfc cfcVar = this.e;
            if (cfcVar.l(cbbVar)) {
                aosbVarC = null;
            } else {
                cfcVar.n(cbbVar);
                aosbVarC = C();
            }
        }
        if (aosbVarC != null) {
            aosbVarC.w(defpackage.aojh.a);
        }
    }

    @Override // defpackage.caz
    public final void s(defpackage.cbb cbbVar) {
        synchronized (this.b) {
            defpackage.ady adyVar = this.p;
            if (adyVar == null) {
                defpackage.ady adyVar2 = defpackage.adz.a;
                adyVar = new defpackage.ady(6);
                this.p = adyVar;
            }
            adyVar.j(cbbVar);
        }
    }

    @Override // defpackage.caz
    public final void t(defpackage.cbb cbbVar) {
        synchronized (this.b) {
            S(cbbVar);
            this.e.m(cbbVar);
            this.x.remove(cbbVar);
        }
    }

    @Override // defpackage.caz
    public final vk x(cck cckVar) {
        vk vkVar;
        synchronized (this.b) {
            vkVar = (vk) this.n.i(cckVar);
        }
        return vkVar;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0192 A[Catch: all -> 0x019c, LOOP:4: B:63:0x0157->B:74:0x0192, LOOP_END, TryCatch #1 {all -> 0x019c, blocks: (B:4:0x0009, B:6:0x0017, B:11:0x002c, B:13:0x0032, B:15:0x003c, B:17:0x004f, B:19:0x005d, B:21:0x0071, B:22:0x0074, B:24:0x0079, B:25:0x007c, B:27:0x0088, B:29:0x0095, B:31:0x00a3, B:33:0x00b1, B:34:0x00b9, B:36:0x00c3, B:38:0x00cd, B:39:0x00d1, B:41:0x00d7, B:43:0x00db, B:60:0x014b, B:63:0x0157, B:65:0x0167, B:66:0x016a, B:68:0x0173, B:70:0x017c, B:71:0x018a, B:74:0x0192, B:44:0x00e1, B:59:0x0147, B:76:0x0196, B:77:0x0199, B:7:0x001a, B:9:0x001e, B:10:0x0021, B:45:0x00ee, B:47:0x00f5, B:48:0x010d, B:50:0x0111, B:52:0x0115, B:53:0x011b, B:55:0x0122, B:56:0x0126, B:57:0x012a, B:58:0x0141), top: B:85:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x019a A[EDGE_INSN: B:95:0x019a->B:78:0x019a BREAK  A[LOOP:4: B:63:0x0157->B:74:0x0192], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Comparable] */
    @Override // defpackage.caz
    public final void y(cck cckVar, vk vkVar, defpackage.cah cahVar) {
        defpackage.adq adqVar;
        defpackage.adw adwVar;
        int i;
        ?? r6;
        synchronized (this.b) {
            try {
                defpackage.adw adwVar2 = this.n;
                adwVar2.n(cckVar, vkVar);
                java.lang.Object objA = this.o.a(cckVar);
                if (objA == null) {
                    adqVar = defpackage.adr.b;
                } else if (objA instanceof defpackage.adq) {
                    adqVar = (defpackage.adq) objA;
                } else {
                    java.lang.Object[] objArr = defpackage.adr.a;
                    defpackage.adq adqVar2 = new defpackage.adq(1);
                    adqVar2.q(objA);
                    adqVar = adqVar2;
                }
                if (adqVar.g()) {
                    java.lang.Object obj = vkVar.a;
                    java.lang.Object[] objArr2 = adqVar.a;
                    int i2 = adqVar.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (!((defpackage.cfm) obj).h(defpackage.cfd.c(((cck) objArr2[i3]).g))) {
                            defpackage.adq adqVar3 = new defpackage.adq(16);
                            java.lang.Object[] objArr3 = adqVar.a;
                            int i4 = adqVar.b;
                            for (int i5 = 0; i5 < i4; i5++) {
                                java.lang.Object obj2 = objArr3[i5];
                                if (((defpackage.cfm) obj).h(defpackage.cfd.c(((cck) obj2).g))) {
                                    adqVar3.q(obj2);
                                }
                            }
                            adqVar = adqVar3;
                            break;
                        }
                    }
                    bru bruVar = new bru(obj, 19);
                    if (adqVar.b > 1) {
                        java.lang.Object objA2 = bruVar.a(adqVar.c(0));
                        int i6 = adqVar.b;
                        int i7 = 1;
                        while (true) {
                            if (i7 >= i6) {
                                r6 = objA2;
                                break;
                            }
                            java.lang.Object objA3 = bruVar.a(adqVar.c(i7));
                            if (r6.compareTo(objA3) > 0) {
                                r6 = objA2;
                                defpackage.adq adqVar4 = new defpackage.adq(adqVar.b);
                                java.lang.Object[] objArr4 = adqVar.a;
                                int i8 = adqVar.b;
                                for (int i9 = 0; i9 < i8; i9++) {
                                    adqVar4.q(objArr4[i9]);
                                }
                                java.util.List listJ = adqVar4.j();
                                if (listJ.size() > 1) {
                                    defpackage.ajsz.bo(listJ, new bdt(bruVar, 6));
                                }
                                adqVar = adqVar4;
                                break;
                            }
                            r6 = objA2;
                            i7++;
                            r6 = objA3;
                        }
                    }
                    if (adqVar.f()) {
                        adwVar = defpackage.adx.b;
                        if (adwVar == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
                        }
                    } else {
                        long[] jArr = defpackage.adx.a;
                        defpackage.adw adwVar3 = new defpackage.adw(6);
                        defpackage.cfp cfpVarF = ((defpackage.cfm) obj).f();
                        try {
                            java.lang.Object[] objArr5 = adqVar.a;
                            int i10 = adqVar.b;
                            for (int i11 = 0; i11 < i10; i11++) {
                                cck cckVar2 = (cck) objArr5[i11];
                                int iA = cfpVarF.a(defpackage.cfd.c(cckVar2.g));
                                int iL = cfpVarF.l(iA);
                                defpackage.cfm.g(cfpVarF, iL);
                                defpackage.cfm.g(cfpVarF, iL);
                                while (true) {
                                    int i12 = cfpVarF.o;
                                    if (i12 == iL) {
                                        break;
                                    }
                                    if (i12 == cfpVarF.p) {
                                        defpackage.cax.b("Unexpected slot table structure");
                                        break;
                                    } else if (iL < i12 + cfpVarF.j(i12)) {
                                        cfpVarF.J();
                                    } else {
                                        cfpVarF.m();
                                    }
                                }
                                cfpVarF.J();
                                cfpVarF.v(iA - cfpVarF.o);
                                adwVar3.n(cckVar2, defpackage.cax.d(cckVar2.f, cckVar2, cfpVarF, cahVar));
                            }
                            defpackage.cfm.g(cfpVarF, Integer.MAX_VALUE);
                            cfpVarF.x(true);
                            adwVar = adwVar3;
                        } catch (java.lang.Throwable th) {
                            cfpVarF.x(false);
                            throw th;
                        }
                    }
                    java.lang.Object[] objArr6 = adwVar.b;
                    java.lang.Object[] objArr7 = adwVar.c;
                    long[] jArr2 = adwVar.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j2 = jArr2[i13];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i13 != length) {
                                    break;
                                    break;
                                }
                                i13++;
                            } else {
                                int i14 = i13 - length;
                                int i15 = 0;
                                while (true) {
                                    i = 8 - ((~i14) >>> 31);
                                    if (i15 >= i) {
                                        break;
                                    }
                                    if ((255 & j2) < 128) {
                                        int i16 = (i13 << 3) + i15;
                                        adwVar2.n((cck) objArr6[i16], (vk) objArr7[i16]);
                                    }
                                    j2 >>= 8;
                                    i15++;
                                }
                                if (i != 8) {
                                    break;
                                } else if (i13 != length) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object z(defpackage.aoln aolnVar) {
        defpackage.cdn cdnVar;
        defpackage.aosc aoscVar;
        if (aolnVar instanceof defpackage.cdn) {
            cdnVar = (defpackage.cdn) aolnVar;
            int i = cdnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdnVar.c = i - Integer.MIN_VALUE;
            } else {
                cdnVar = new defpackage.cdn(this, aolnVar);
            }
        } else {
            cdnVar = new defpackage.cdn(this, aolnVar);
        }
        java.lang.Object obj = cdnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cdnVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!P()) {
                cdnVar.c = 1;
                defpackage.aosc aoscVar2 = new defpackage.aosc(defpackage.ajsz.ap(cdnVar), 1);
                aoscVar2.z();
                synchronized (this.b) {
                    if (P()) {
                        aoscVar = aoscVar2;
                    } else {
                        this.g = aoscVar2;
                        aoscVar = null;
                    }
                }
                if (aoscVar != null) {
                    aoscVar.w(defpackage.aojh.a);
                }
                if (aoscVar2.k() == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.caz
    public final void w() {
    }

    @Override // defpackage.caz
    public final void g(java.util.Set set) {
    }
}
