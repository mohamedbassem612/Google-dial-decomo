package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbx {
    public final long a;
    public final dji b;
    public final aify c;
    public final java.lang.Integer d;
    public final defpackage.kbg e;
    public final dji f;
    public final boolean g;
    public final dji h;
    public final dji i;
    public final defpackage.kcu j;
    public final defpackage.klb k;
    public final kcw l;
    public final defpackage.kbh m;
    public final defpackage.kbf n;
    public final java.lang.String o;
    public final int p;
    public final int q;

    public kbx(long j, int i, int i2, dji djiVar, aify aifyVar, java.lang.Integer num, defpackage.kbg kbgVar, dji djiVar2, boolean z, dji djiVar3, dji djiVar4, defpackage.kcu kcuVar, defpackage.klb klbVar, kcw kcwVar, defpackage.kbh kbhVar, defpackage.kbf kbfVar, java.lang.String str) {
        aooh.f(aifyVar, "icons");
        aooh.f(str, "contentDescription");
        this.a = j;
        this.p = i;
        this.q = i2;
        this.b = djiVar;
        this.c = aifyVar;
        this.d = num;
        this.e = kbgVar;
        this.f = djiVar2;
        this.g = z;
        this.h = djiVar3;
        this.i = djiVar4;
        this.j = kcuVar;
        this.k = klbVar;
        this.l = kcwVar;
        this.m = kbhVar;
        this.n = kbfVar;
        this.o = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kbx) {
            defpackage.kbx kbxVar = (defpackage.kbx) obj;
            if (this.a == kbxVar.a && this.p == kbxVar.p && this.q == kbxVar.q && aooh.n(this.b, kbxVar.b) && aooh.n(this.c, kbxVar.c) && aooh.n(this.d, kbxVar.d) && this.e == kbxVar.e && aooh.n(this.f, kbxVar.f) && this.g == kbxVar.g && aooh.n(this.h, kbxVar.h) && aooh.n(this.i, kbxVar.i) && aooh.n(this.j, kbxVar.j) && aooh.n(this.k, kbxVar.k) && aooh.n(this.l, kbxVar.l) && aooh.n(this.m, kbxVar.m) && aooh.n(this.n, kbxVar.n) && aooh.n(this.o, kbxVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (((((((anty.M(this.a) * 31) + this.p) * 31) + this.q) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        java.lang.Integer num = this.d;
        int iHashCode = ((((((((iM * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + anty.L(this.g)) * 31;
        dji djiVar = this.h;
        int iHashCode2 = (iHashCode + (djiVar == null ? 0 : djiVar.hashCode())) * 31;
        dji djiVar2 = this.i;
        int iHashCode3 = (((((((((iHashCode2 + (djiVar2 == null ? 0 : djiVar2.hashCode())) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31;
        defpackage.kbf kbfVar = this.n;
        return ((iHashCode3 + (kbfVar != null ? kbfVar.hashCode() : 0)) * 31) + this.o.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallLogListItemUiModel(callId=");
        sb.append(this.a);
        sb.append(", category=");
        sb.append((java.lang.Object) kcq.e(this.p));
        sb.append(", readState=");
        sb.append((java.lang.Object) (this.q != 1 ? "UNREAD_MISSED" : "READ"));
        sb.append(", primaryText=");
        sb.append(this.b);
        sb.append(", icons=");
        sb.append(this.c);
        sb.append(", callCount=");
        sb.append(this.d);
        sb.append(", callDirection=");
        sb.append(this.e);
        sb.append(", secondaryText=");
        sb.append(this.f);
        sb.append(", isSelected=");
        sb.append(this.g);
        sb.append(", thirdLineText=");
        sb.append(this.h);
        sb.append(", phoneAccountText=");
        sb.append(this.i);
        sb.append(", chipConfig=");
        sb.append(this.j);
        sb.append(", callIntegrationInfo=");
        sb.append(this.k);
        sb.append(", dropdownMenuConfig=");
        sb.append(this.l);
        sb.append(", avatar=");
        sb.append(this.m);
        sb.append(", callButton=");
        sb.append(this.n);
        sb.append(", contentDescription=");
        sb.append(this.o);
        sb.append(')');
        return sb.toString();
    }
}
