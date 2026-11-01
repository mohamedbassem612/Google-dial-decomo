package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agja {
    public final defpackage.agjl a;
    public final defpackage.agjn b;
    public final defpackage.agjo c;
    public final defpackage.agjp d;
    public final defpackage.agjs e;
    public final defpackage.agiw f;
    public final defpackage.agiw g;
    public final defpackage.agjq h;
    public final defpackage.agjc i;
    public final defpackage.agiy j;
    public final defpackage.agjm k;
    public final defpackage.agji l;

    public agja(defpackage.agjl agjlVar, defpackage.agjn agjnVar, defpackage.agjo agjoVar, defpackage.agjp agjpVar, defpackage.agjs agjsVar, defpackage.agiw agiwVar, defpackage.agiw agiwVar2, defpackage.agjq agjqVar, defpackage.agjc agjcVar, defpackage.agiy agiyVar, defpackage.agjm agjmVar, defpackage.agji agjiVar) {
        aooh.f(agjlVar, "layout");
        this.a = agjlVar;
        this.b = agjnVar;
        this.c = agjoVar;
        this.d = agjpVar;
        this.e = agjsVar;
        this.f = agiwVar;
        this.g = agiwVar2;
        this.h = agjqVar;
        this.i = agjcVar;
        this.j = agiyVar;
        this.k = agjmVar;
        this.l = agjiVar;
    }

    public static /* synthetic */ defpackage.agja b(defpackage.agja agjaVar, int i) {
        defpackage.agjl agjlVar = (i & 1) != 0 ? agjaVar.a : null;
        defpackage.agjn agjnVar = (i & 2) != 0 ? agjaVar.b : null;
        defpackage.agjo agjoVar = (i & 4) != 0 ? agjaVar.c : null;
        defpackage.agjp agjpVar = (i & 8) != 0 ? agjaVar.d : null;
        defpackage.agjs agjsVar = (i & 16) != 0 ? agjaVar.e : null;
        defpackage.agiw agiwVar = (i & 32) != 0 ? agjaVar.f : null;
        defpackage.agiw agiwVar2 = (i & 64) != 0 ? agjaVar.g : null;
        defpackage.agjq agjqVar = (i & 128) != 0 ? agjaVar.h : null;
        defpackage.agjc agjcVar = (i & 256) != 0 ? agjaVar.i : null;
        defpackage.agiy agiyVar = (i & 512) != 0 ? agjaVar.j : null;
        defpackage.agjm agjmVar = (i & 1024) != 0 ? agjaVar.k : null;
        defpackage.agji agjiVar = agjaVar.l;
        aooh.f(agjlVar, "layout");
        return new defpackage.agja(agjlVar, agjnVar, agjoVar, agjpVar, agjsVar, agiwVar, agiwVar2, agjqVar, agjcVar, agiyVar, agjmVar, agjiVar);
    }

    public final java.util.Map a() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        defpackage.agle agleVar = defpackage.agln.a;
        defpackage.agjl agjlVar = this.a;
        linkedHashMap.put(defpackage.agln.g, agjlVar.a);
        linkedHashMap.put(defpackage.agln.h, agjlVar.d);
        linkedHashMap.put(defpackage.agln.i, java.lang.Float.valueOf(agjlVar.h));
        defpackage.agjn agjnVar = this.b;
        if (agjnVar != null) {
            linkedHashMap.put(defpackage.agln.k, java.lang.Float.valueOf(agjnVar.a));
            linkedHashMap.put(defpackage.agln.l, java.lang.Float.valueOf(agjnVar.b));
            linkedHashMap.put(defpackage.agln.m, java.lang.Integer.valueOf(agjnVar.c));
            linkedHashMap.put(defpackage.agln.j, java.lang.Float.valueOf(agjnVar.d));
            linkedHashMap.put(defpackage.agln.n, java.lang.Float.valueOf(agjnVar.e));
        }
        defpackage.agjo agjoVar = this.c;
        if (agjoVar != null) {
            linkedHashMap.put(defpackage.agln.q, java.lang.Float.valueOf(agjoVar.a));
            linkedHashMap.put(defpackage.agln.o, java.lang.Integer.valueOf(agjoVar.b));
            linkedHashMap.put(defpackage.agln.p, java.lang.Float.valueOf(agjoVar.c));
            linkedHashMap.put(defpackage.agln.r, java.lang.Integer.valueOf(agjoVar.d));
            linkedHashMap.put(defpackage.agln.s, java.lang.Integer.valueOf(agjoVar.e));
        }
        defpackage.agjp agjpVar = this.d;
        if (agjpVar != null) {
            defpackage.agla aglaVar = defpackage.agln.u;
            java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
            linkedHashMap.put(aglaVar, fValueOf);
            linkedHashMap.put(defpackage.agln.v, java.lang.Float.valueOf(agjpVar.a));
            linkedHashMap.put(defpackage.agln.y, fValueOf);
            linkedHashMap.put(defpackage.agln.x, fValueOf);
            linkedHashMap.put(defpackage.agln.w, fValueOf);
            linkedHashMap.put(defpackage.agln.t, java.lang.Float.valueOf(agjpVar.c));
            linkedHashMap.put(defpackage.agln.z, java.lang.Float.valueOf(agjpVar.b));
            linkedHashMap.put(defpackage.agln.A, java.lang.Float.valueOf(agjpVar.d));
        }
        defpackage.agjs agjsVar = this.e;
        if (agjsVar != null) {
            linkedHashMap.put(defpackage.agln.C, java.lang.Float.valueOf(agjsVar.a));
            linkedHashMap.put(defpackage.agln.D, java.lang.Float.valueOf(agjsVar.b));
            linkedHashMap.put(defpackage.agln.B, java.lang.Float.valueOf(agjsVar.c));
            linkedHashMap.put(defpackage.agln.E, java.lang.Float.valueOf(agjsVar.d));
        }
        defpackage.agiw agiwVar = this.f;
        if (agiwVar != null) {
            defpackage.agmc.L(agiwVar, linkedHashMap);
        }
        defpackage.agiw agiwVar2 = this.g;
        if (agiwVar2 != null) {
            defpackage.agmc.L(agiwVar2, linkedHashMap);
        }
        defpackage.agjq agjqVar = this.h;
        if (agjqVar != null) {
            defpackage.agle agleVar2 = defpackage.agln.L;
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
            linkedHashMap.put(agleVar2, fValueOf2);
            linkedHashMap.put(defpackage.agln.M, java.lang.Float.valueOf(agjqVar.a));
            linkedHashMap.put(defpackage.agln.N, java.lang.Float.valueOf(agjqVar.b));
            linkedHashMap.put(defpackage.agln.O, java.lang.Float.valueOf(agjqVar.c));
            linkedHashMap.put(defpackage.agln.P, java.lang.Float.valueOf(agjqVar.d));
            linkedHashMap.put(defpackage.agln.Q, java.lang.Integer.valueOf(agjqVar.e));
            linkedHashMap.put(defpackage.agln.R, fValueOf2);
            linkedHashMap.put(defpackage.agln.S, java.lang.Float.valueOf(agjqVar.f));
        }
        defpackage.agjc agjcVar = this.i;
        if (agjcVar != null) {
            linkedHashMap.put(defpackage.agln.V, java.lang.Float.valueOf(agjcVar.a));
            linkedHashMap.put(defpackage.agln.W, java.lang.Float.valueOf(agjcVar.b));
            linkedHashMap.put(defpackage.agln.T, java.lang.Boolean.FALSE);
            linkedHashMap.put(defpackage.agln.U, java.lang.Boolean.valueOf(agjcVar.f));
            linkedHashMap.put(defpackage.agln.X, java.lang.Float.valueOf(agjcVar.c));
            linkedHashMap.put(defpackage.agln.Y, java.lang.Float.valueOf(agjcVar.d));
            linkedHashMap.put(defpackage.agln.Z, java.lang.Float.valueOf(agjcVar.e));
            defpackage.agla aglaVar2 = defpackage.agln.aa;
            java.lang.Float fValueOf3 = java.lang.Float.valueOf(0.0f);
            linkedHashMap.put(aglaVar2, fValueOf3);
            linkedHashMap.put(defpackage.agln.ab, fValueOf3);
            linkedHashMap.put(defpackage.agln.ac, java.lang.Float.valueOf(agjcVar.g));
            linkedHashMap.put(defpackage.agln.ad, fValueOf3);
            linkedHashMap.put(defpackage.agln.ae, fValueOf3);
            linkedHashMap.put(defpackage.agln.af, fValueOf3);
            linkedHashMap.put(defpackage.agln.ag, fValueOf3);
            linkedHashMap.put(defpackage.agln.ah, fValueOf3);
            linkedHashMap.put(defpackage.agln.ai, fValueOf3);
            linkedHashMap.put(defpackage.agln.aj, fValueOf3);
            linkedHashMap.put(defpackage.agln.ak, fValueOf3);
            linkedHashMap.put(defpackage.agln.al, fValueOf3);
            linkedHashMap.put(defpackage.agln.am, fValueOf3);
            linkedHashMap.put(defpackage.agln.an, fValueOf3);
            linkedHashMap.put(defpackage.agln.ao, fValueOf3);
            linkedHashMap.put(defpackage.agln.ap, java.lang.Float.valueOf(agjcVar.h));
            linkedHashMap.put(defpackage.agln.aq, java.lang.Float.valueOf(agjcVar.i));
            linkedHashMap.put(defpackage.agln.ar, java.lang.Float.valueOf(agjcVar.j));
            linkedHashMap.put(defpackage.agln.as, java.lang.Float.valueOf(agjcVar.k));
            linkedHashMap.put(defpackage.agln.at, java.lang.Float.valueOf(agjcVar.l));
            linkedHashMap.put(defpackage.agln.au, java.lang.Float.valueOf(agjcVar.m));
            linkedHashMap.put(defpackage.agln.av, java.lang.Float.valueOf(agjcVar.n));
            linkedHashMap.put(defpackage.agln.aw, java.lang.Float.valueOf(agjcVar.o));
            linkedHashMap.put(defpackage.agln.ax, java.lang.Float.valueOf(agjcVar.p));
            linkedHashMap.put(defpackage.agln.ay, java.lang.Float.valueOf(agjcVar.q));
            linkedHashMap.put(defpackage.agln.az, java.lang.Float.valueOf(agjcVar.r));
            linkedHashMap.put(defpackage.agln.aA, java.lang.Float.valueOf(agjcVar.s));
            linkedHashMap.put(defpackage.agln.aB, java.lang.Float.valueOf(agjcVar.t));
        }
        defpackage.agiy agiyVar = this.j;
        if (agiyVar != null) {
            linkedHashMap.put(defpackage.agln.aS, java.lang.Float.valueOf(agiyVar.c));
            linkedHashMap.put(defpackage.agln.aT, java.lang.Integer.valueOf(agiyVar.d));
            linkedHashMap.put(defpackage.agln.aU, java.lang.Float.valueOf(agiyVar.e));
            linkedHashMap.put(defpackage.agln.aV, java.lang.Float.valueOf(agiyVar.n));
            linkedHashMap.put(defpackage.agln.aP, java.lang.Float.valueOf(agiyVar.f));
            linkedHashMap.put(defpackage.agln.aQ, java.lang.Float.valueOf(agiyVar.g));
            linkedHashMap.put(defpackage.agln.aR, java.lang.Float.valueOf(agiyVar.h));
            linkedHashMap.put(defpackage.agln.aN, java.lang.Float.valueOf(agiyVar.i));
            linkedHashMap.put(defpackage.agln.aO, java.lang.Float.valueOf(agiyVar.j));
            linkedHashMap.put(defpackage.agln.aK, java.lang.Float.valueOf(agiyVar.k));
            linkedHashMap.put(defpackage.agln.aH, java.lang.Float.valueOf(agiyVar.l));
            linkedHashMap.put(defpackage.agln.aI, java.lang.Float.valueOf(agiyVar.m));
            defpackage.agjj agjjVar = agiyVar.o;
            linkedHashMap.put(defpackage.agln.aJ, java.lang.Float.valueOf(agjjVar.d));
            linkedHashMap.put(defpackage.agln.aL, java.lang.Float.valueOf(agjjVar.e));
            linkedHashMap.put(defpackage.agln.aE, new float[]{agjjVar.f, agjjVar.g});
            linkedHashMap.put(defpackage.agln.aC, new float[]{agjjVar.h, agjjVar.i});
            linkedHashMap.put(defpackage.agln.aD, new float[]{agjjVar.j, agjjVar.k, agjjVar.l});
            float f = agjjVar.m;
            linkedHashMap.put(defpackage.agln.aF, java.lang.Float.valueOf(-0.75f));
            float f2 = agjjVar.n;
            linkedHashMap.put(defpackage.agln.aG, java.lang.Float.valueOf(1.0f));
            float f3 = agjjVar.o;
            linkedHashMap.put(defpackage.agln.aM, java.lang.Float.valueOf(0.1f));
            float f4 = agjjVar.p;
            linkedHashMap.put(defpackage.agln.aW, java.lang.Float.valueOf(0.00277f));
            float f5 = agjjVar.q;
            linkedHashMap.put(defpackage.agln.aX, java.lang.Float.valueOf(0.35f));
        }
        defpackage.agjm agjmVar = this.k;
        if (agjmVar != null) {
            linkedHashMap.put(defpackage.agln.be, java.lang.Float.valueOf(agjmVar.l));
            linkedHashMap.put(defpackage.agln.bf, java.lang.Float.valueOf(agjmVar.m));
            linkedHashMap.put(defpackage.agln.bc, java.lang.Float.valueOf(agjmVar.i));
        }
        if (this.l != null) {
            defpackage.agle agleVar3 = defpackage.agln.bg;
            java.lang.Float fValueOf4 = java.lang.Float.valueOf(0.0f);
            linkedHashMap.put(agleVar3, fValueOf4);
            linkedHashMap.put(defpackage.agln.bh, 0);
            linkedHashMap.put(defpackage.agln.bi, fValueOf4);
            linkedHashMap.put(defpackage.agln.bj, 0);
            linkedHashMap.put(defpackage.agln.bk, fValueOf4);
        }
        return linkedHashMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agja) {
            defpackage.agja agjaVar = (defpackage.agja) obj;
            if (aooh.n(this.a, agjaVar.a) && aooh.n(this.b, agjaVar.b) && aooh.n(this.c, agjaVar.c) && aooh.n(this.d, agjaVar.d) && aooh.n(this.e, agjaVar.e) && aooh.n(this.f, agjaVar.f) && aooh.n(this.g, agjaVar.g) && aooh.n(this.h, agjaVar.h) && aooh.n(this.i, agjaVar.i) && aooh.n(this.j, agjaVar.j) && aooh.n(this.k, agjaVar.k) && aooh.n(this.l, agjaVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.agjn agjnVar = this.b;
        int iHashCode2 = (iHashCode + (agjnVar == null ? 0 : agjnVar.hashCode())) * 31;
        defpackage.agjo agjoVar = this.c;
        int iHashCode3 = (iHashCode2 + (agjoVar == null ? 0 : agjoVar.hashCode())) * 31;
        defpackage.agjp agjpVar = this.d;
        int iHashCode4 = (iHashCode3 + (agjpVar == null ? 0 : agjpVar.hashCode())) * 31;
        defpackage.agjs agjsVar = this.e;
        int iHashCode5 = (iHashCode4 + (agjsVar == null ? 0 : agjsVar.hashCode())) * 31;
        defpackage.agiw agiwVar = this.f;
        int iHashCode6 = (iHashCode5 + (agiwVar == null ? 0 : agiwVar.hashCode())) * 31;
        defpackage.agiw agiwVar2 = this.g;
        int iHashCode7 = (iHashCode6 + (agiwVar2 == null ? 0 : agiwVar2.hashCode())) * 31;
        defpackage.agjq agjqVar = this.h;
        int iHashCode8 = (iHashCode7 + (agjqVar == null ? 0 : agjqVar.hashCode())) * 31;
        defpackage.agjc agjcVar = this.i;
        int iHashCode9 = (iHashCode8 + (agjcVar == null ? 0 : agjcVar.hashCode())) * 31;
        defpackage.agiy agiyVar = this.j;
        int iHashCode10 = (iHashCode9 + (agiyVar == null ? 0 : agiyVar.hashCode())) * 31;
        defpackage.agjm agjmVar = this.k;
        int iHashCode11 = (iHashCode10 + (agjmVar == null ? 0 : agjmVar.hashCode())) * 31;
        defpackage.agji agjiVar = this.l;
        return iHashCode11 + (agjiVar != null ? agjiVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "EnergyShaderConfig(layout=" + this.a + ", panel=" + this.b + ", radialGradient=" + this.c + ", rimLight=" + this.d + ", spotLight=" + this.e + ", borderLight=" + this.f + ", borderLight2=" + this.g + ", rippleLight=" + this.h + ", googleColors=" + this.i + ", dots=" + this.j + ", loader=" + this.k + ", interactionStateConfig=" + this.l + ')';
    }

    public agja() {
        this(null);
    }

    public /* synthetic */ agja(byte[] bArr) {
        this(new defpackage.agjl(null), new defpackage.agjn(null), new defpackage.agjo(null), null, null, null, null, null, null, null, null, null);
    }
}
