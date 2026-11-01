package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyv implements defpackage.yzs {
    private final /* synthetic */ int $cid;
    private final aoin a;
    private int b;
    private int c;
    private final java.lang.Object d;
    private final java.lang.Object e;
    private final java.lang.Object f;
    private final java.lang.Object g;

    public yyv(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, zzx zzxVar, int i) {
        this.$cid = i;
        aooh.f(aoinVar, "sentenceLowerLimit");
        aooh.f(aoinVar2, "tokenCountUpperLimit");
        aooh.f(aoinVar3, "tokenCountLowerLimit");
        this.d = aoinVar;
        this.a = aoinVar2;
        this.e = aoinVar3;
        this.f = zzxVar;
        this.g = new java.util.ArrayList();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yvp] */
    private final long d() {
        defpackage.ywi ywiVar = (defpackage.ywi) aooh.q((j$.util.Optional) this.d);
        if (ywiVar == null || ywiVar.a() == null) {
            return this.f.a().d;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, yvp] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // defpackage.yzs
    public final defpackage.zaa a() {
        java.lang.String strCr;
        int i = this.$cid;
        int i2 = this.c;
        if (i != 0) {
            if (i2 < this.f.a().e) {
                return new defpackage.yzy(defpackage.yzx.a);
            }
            if (this.b < ((java.lang.Number) this.a.a()).longValue()) {
                return new defpackage.yzy(defpackage.yzx.b);
            }
            this.b = 0;
            return new defpackage.yzz(ajsz.cr((java.lang.Iterable) this.e, " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.yrz(3), 30));
        }
        if (i2 < ((java.lang.Number) this.d.a()).longValue() || this.b < ((java.lang.Number) this.e.a()).longValue()) {
            return new defpackage.yzy(defpackage.yzx.a);
        }
        long j = this.b;
        aoin aoinVar = this.a;
        long jLongValue = ((java.lang.Number) aoinVar.a()).longValue();
        ?? r4 = this.g;
        if (j <= jLongValue) {
            strCr = ajsz.cr((java.lang.Iterable) r4, " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.yrz(4), 30);
        } else {
            defpackage.yyu yyuVar = (defpackage.yyu) ajsz.bE((java.util.List) r4);
            int i3 = yyuVar.b;
            int iLongValue = i3 - (this.b - ((int) ((java.lang.Number) aoinVar.a()).longValue()));
            android.icu.text.BreakIterator breakIteratorM$1 = fh$.ExternalSyntheticApiModelOutline0.m$1();
            aooh.e(breakIteratorM$1, "getWordInstance(...)");
            java.lang.String str = yyuVar.a;
            fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$1, str);
            int iM$2 = fh$.ExternalSyntheticApiModelOutline0.m$2(breakIteratorM$1);
            int i4 = 0;
            for (int iM = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$1); iM != -1; iM = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$1)) {
                java.lang.String strSubstring = str.substring(iM$2, iM);
                aooh.e(strSubstring, "substring(...)");
                if (!aoov.H(strSubstring)) {
                    i4++;
                }
                if (i4 == (i3 - iLongValue) + 1) {
                    break;
                }
                iM$2 = iM;
            }
            java.lang.String strSubstring2 = str.substring(iM$2);
            aooh.e(strSubstring2, "substring(...)");
            r4.set(0, new defpackage.yyu(strSubstring2, this.b - ((int) ((java.lang.Number) aoinVar.a()).longValue())));
            this.b = (int) ((java.lang.Number) aoinVar.a()).longValue();
            strCr = ajsz.cr((java.lang.Iterable) r4, " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.yrz(5), 30);
        }
        return new defpackage.yzz(aoov.x(strCr).toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yzs
    public final void b() {
        if (this.$cid != 0) {
            this.e.clear();
            this.c = 0;
        } else {
            this.g.clear();
            this.b = 0;
            this.c = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x020b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aoin, java.lang.Object] */
    @Override // defpackage.yzs
    public final void c(java.lang.String str, int i) {
        if (this.$cid != 0) {
            aooh.f(str, "queryContext");
            if (aoov.x(str).toString().length() == 0) {
                return;
            }
            android.icu.text.BreakIterator breakIteratorM = fh$.ExternalSyntheticApiModelOutline0.m();
            fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM, str);
            int iM$2 = fh$.ExternalSyntheticApiModelOutline0.m$2(breakIteratorM);
            int i2 = 0;
            int i3 = 0;
            for (int iM = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM); iM != -1; iM = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM)) {
                java.lang.String string = aoov.x(str.subSequence(iM$2, iM).toString()).toString();
                i2++;
                final android.icu.text.BreakIterator breakIteratorM$1 = fh$.ExternalSyntheticApiModelOutline0.m$1();
                fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$1, string);
                aomy aomyVar = new aomy() { // from class: yyl
                    public final java.lang.Object a() {
                        return java.lang.Integer.valueOf(fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$1));
                    }
                };
                int i4 = aooc.i(new aoqt(aooc.l(aooc.g(new aoqk(aomyVar, new aoqo(aomyVar, 0))), new aonj() { // from class: yym
                    public final java.lang.Object a(java.lang.Object obj) {
                        boolean z = true;
                        if (((java.lang.Integer) obj).intValue() != -1 && fh$.ExternalSyntheticApiModelOutline0.m$1(breakIteratorM$1) == 0) {
                            z = false;
                        }
                        return java.lang.Boolean.valueOf(z);
                    }
                }), new defpackage.yrz(2), 0));
                this.e.add(new defpackage.yyn(string, i4));
                i3 += i4;
                this.c += i4;
                iM$2 = iM;
            }
            this.b += i2;
            if (i3 > d()) {
                ((zzx) this.g).l(new zbq(defpackage.zbr.aA));
            }
            if (i == 2) {
                return;
            }
            while (true) {
                ?? r1 = this.e;
                if (r1.size() <= 1 || this.c <= d()) {
                    return;
                }
                this.c -= ((defpackage.yyn) r1.remove(0)).b;
            }
        } else {
            aooh.f(str, "queryContext");
            if (aoov.x(str).toString().length() == 0) {
                return;
            }
            java.lang.String string2 = aoov.x(str).toString();
            ?? r2 = this.g;
            if (!r2.isEmpty()) {
                this.c--;
                java.lang.String str2 = ((defpackage.yyu) ajsz.bI((java.util.List) r2)).a;
                r2.remove(r2.size() - 1);
                string2 = str2 + ' ' + string2;
            }
            android.icu.text.BreakIterator breakIteratorM2 = fh$.ExternalSyntheticApiModelOutline0.m(java.util.Locale.US);
            aooh.e(breakIteratorM2, "getSentenceInstance(...)");
            fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM2, string2);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            int iM$3 = fh$.ExternalSyntheticApiModelOutline0.m$2(breakIteratorM2);
            int iM2 = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM2);
            while (true) {
                int i5 = iM2;
                int i6 = iM$3;
                iM$3 = i5;
                if (iM$3 == -1) {
                    break;
                }
                this.c++;
                java.lang.String strSubstring = string2.substring(i6, iM$3);
                aooh.e(strSubstring, "substring(...)");
                arrayList.add(aoov.x(strSubstring).toString());
                iM2 = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM2);
            }
            int i7 = 0;
            for (java.lang.String str3 : arrayList) {
                android.icu.text.BreakIterator breakIteratorM$2 = fh$.ExternalSyntheticApiModelOutline0.m$1();
                aooh.e(breakIteratorM$2, "getWordInstance(...)");
                fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$2, str3);
                int iM$4 = fh$.ExternalSyntheticApiModelOutline0.m$2(breakIteratorM$2);
                int i8 = 0;
                for (int iM3 = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$2); iM3 != -1; iM3 = fh$.ExternalSyntheticApiModelOutline0.m(breakIteratorM$2)) {
                    java.lang.String strSubstring2 = str3.substring(iM$4, iM3);
                    aooh.e(strSubstring2, "substring(...)");
                    if (!aoov.H(strSubstring2)) {
                        i8++;
                    }
                    iM$4 = iM3;
                }
                r2.add(new defpackage.yyu(str3, i8));
                this.b += i8;
                i7 += i8;
            }
            long j = i7;
            aoin aoinVar = this.a;
            if (j > ((java.lang.Number) aoinVar.a()).longValue()) {
                ((zzx) this.f).l(new zbq(defpackage.zbr.aB));
            }
            long j2 = this.c;
            ?? r5 = this.d;
            if (j2 < ((java.lang.Number) r5.a()).longValue()) {
                return;
            }
            while (true) {
                if (r2.size() > ((java.lang.Number) r5.a()).longValue()) {
                    if (this.b - ((defpackage.yyu) r2.get(0)).b <= ((java.lang.Number) this.e.a()).longValue()) {
                        if (this.b - ((defpackage.yyu) r2.get(0)).b > ((java.lang.Number) aoinVar.a()).longValue()) {
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (this.b - ((defpackage.yyu) r2.get(0)).b > ((java.lang.Number) aoinVar.a()).longValue()) {
                        return;
                    }
                }
                this.b -= ((defpackage.yyu) r2.remove(0)).b;
            }
        }
    }

    public yyv(aoin aoinVar, zzx zzxVar, j$.util.Optional optional, yvp yvpVar, int i) {
        this.$cid = i;
        aooh.f(aoinVar, "newSentenceDelta");
        aooh.f(optional, "sharpieTestingOverrides");
        this.a = aoinVar;
        this.g = zzxVar;
        this.d = optional;
        this.f = yvpVar;
        this.e = new java.util.ArrayList();
    }
}
