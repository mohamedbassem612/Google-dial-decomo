package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pom {
    public final java.lang.String a;
    public final java.lang.Long b;
    public final defpackage.pof c;
    public final defpackage.pol d;
    public final defpackage.poj e;
    public final defpackage.pog f;
    public final java.lang.CharSequence g;
    public final java.lang.CharSequence h;
    public final defpackage.poh i;
    public final defpackage.poi j;
    public final java.util.List k;
    public final defpackage.zpo l;
    public final boolean m;
    public final java.lang.CharSequence n;
    public final java.util.List o;
    public final defpackage.pzp p;
    public final defpackage.pne q;
    public final defpackage.pmn r;
    private final boolean s;

    public /* synthetic */ pom(java.lang.String str, java.lang.Long l, defpackage.pof pofVar, defpackage.pol polVar, defpackage.poj pojVar, defpackage.pog pogVar, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, defpackage.poh pohVar, defpackage.poi poiVar, boolean z, java.util.List list, defpackage.zpo zpoVar, boolean z2, java.lang.CharSequence charSequence3, java.util.List list2, defpackage.pzp pzpVar, defpackage.pne pneVar, defpackage.pmn pmnVar, int i) {
        defpackage.pof pofVar2 = (i & 4) != 0 ? new defpackage.pof(null, 1) : pofVar;
        defpackage.pol polVar2 = (i & 8) != 0 ? new defpackage.pol(null, false, null, false, 0L) : polVar;
        defpackage.poj pojVar2 = (i & 16) != 0 ? new defpackage.poj(null, null, null) : pojVar;
        defpackage.pog pogVar2 = (i & 32) != 0 ? new defpackage.pog(null, null, false, false, false, false, 0L) : pogVar;
        java.lang.CharSequence charSequence4 = (i & 64) != 0 ? null : charSequence;
        java.lang.CharSequence charSequence5 = (i & 128) != 0 ? null : charSequence2;
        defpackage.poh pohVar2 = (i & 256) != 0 ? defpackage.poh.a : pohVar;
        defpackage.poi poiVar2 = (i & 512) != 0 ? new defpackage.poi(null) : poiVar;
        boolean z3 = ((i & 1024) == 0) & z;
        java.util.List list3 = (i & 2048) != 0 ? aokc.a : list;
        defpackage.zpo zpoVar2 = (i & 4096) != 0 ? defpackage.zpo.a : zpoVar;
        boolean z4 = ((i & 8192) == 0) & z2;
        java.lang.CharSequence charSequence6 = (i & 16384) != 0 ? "" : charSequence3;
        java.util.List list4 = (i & 32768) != 0 ? aokc.a : list2;
        int i2 = i & 1;
        java.lang.Long l2 = (i & 2) != 0 ? null : l;
        java.lang.String str2 = 1 == i2 ? "invalid" : str;
        defpackage.pzp pzpVar2 = (i & 65536) != 0 ? null : pzpVar;
        defpackage.pne pneVar2 = (i & 131072) != 0 ? null : pneVar;
        defpackage.pmn pmnVar2 = (i & 262144) != 0 ? null : pmnVar;
        aooh.f(str2, "callId");
        aooh.f(pofVar2, "avatar");
        aooh.f(polVar2, "topRow");
        aooh.f(pojVar2, "middleRow");
        aooh.f(pogVar2, "bottomRow");
        aooh.f(pohVar2, "colorScheme");
        aooh.f(poiVar2, "deviceNumberRow");
        aooh.f(list3, "icons");
        aooh.f(zpoVar2, "callState");
        aooh.f(charSequence6, "labelForConnecting");
        java.lang.CharSequence charSequence7 = charSequence6;
        java.util.List list5 = list4;
        aooh.f(list5, "indicators");
        this.a = str2;
        this.b = l2;
        this.c = pofVar2;
        this.d = polVar2;
        this.e = pojVar2;
        this.f = pogVar2;
        this.g = charSequence4;
        this.h = charSequence5;
        this.i = pohVar2;
        this.j = poiVar2;
        this.s = z3;
        this.k = list3;
        this.l = zpoVar2;
        this.m = z4;
        this.n = charSequence7;
        this.o = list5;
        this.p = pzpVar2;
        this.q = pneVar2;
        this.r = pmnVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pom) {
            defpackage.pom pomVar = (defpackage.pom) obj;
            if (aooh.n(this.a, pomVar.a) && aooh.n(this.b, pomVar.b) && aooh.n(this.c, pomVar.c) && aooh.n(this.d, pomVar.d) && aooh.n(this.e, pomVar.e) && aooh.n(this.f, pomVar.f) && aooh.n(this.g, pomVar.g) && aooh.n(this.h, pomVar.h) && this.i == pomVar.i && aooh.n(this.j, pomVar.j) && this.s == pomVar.s && aooh.n(this.k, pomVar.k) && this.l == pomVar.l && this.m == pomVar.m && aooh.n(this.n, pomVar.n) && aooh.n(this.o, pomVar.o) && this.p == pomVar.p && aooh.n(this.q, pomVar.q) && aooh.n(this.r, pomVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Long l = this.b;
        int iHashCode2 = (((((((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        java.lang.CharSequence charSequence = this.g;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.h;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + anty.L(this.s)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + anty.L(this.m)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31;
        defpackage.pzp pzpVar = this.p;
        int iHashCode5 = (iHashCode4 + (pzpVar == null ? 0 : pzpVar.hashCode())) * 31;
        defpackage.pne pneVar = this.q;
        int iHashCode6 = (iHashCode5 + (pneVar != null ? pneVar.hashCode() : 0)) * 31;
        if (this.r == null) {
            return iHashCode6;
        }
        throw null;
    }

    public final java.lang.String toString() {
        return "ContactGridModel(callId=" + this.a + ", outgoingCallRequestId=" + this.b + ", avatar=" + this.c + ", topRow=" + this.d + ", middleRow=" + this.e + ", bottomRow=" + this.f + ", topRowAuroraLabel=" + ((java.lang.Object) this.g) + ", bottomRowAuroraLabel=" + ((java.lang.Object) this.h) + ", colorScheme=" + this.i + ", deviceNumberRow=" + this.j + ", isNameAmbiguous=" + this.s + ", icons=" + this.k + ", callState=" + this.l + ", isVideoCall=" + this.m + ", labelForConnecting=" + ((java.lang.Object) this.n) + ", indicators=" + this.o + ", selectedInCallScreen=" + this.p + ", incomingMessage=" + this.q + ", contactGridChip=" + this.r + ')';
    }

    public pom() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, 524287);
    }
}
