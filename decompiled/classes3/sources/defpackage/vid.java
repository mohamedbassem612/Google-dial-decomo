package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vid {
    public final android.content.Context a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final java.lang.String e;
    public final int f;
    public final android.net.Network g;
    public defpackage.vhy h;
    public final defpackage.vgi i;
    public final rsr j;

    public vid(android.content.Context context, defpackage.vgi vgiVar, rsr rsrVar, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, android.net.Network network) {
        this.a = context;
        this.i = vgiVar;
        this.j = rsrVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = network;
    }

    static java.lang.String b(aihd aihdVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        ailj ailjVarK = aihdVar.k();
        boolean z = false;
        while (ailjVarK.hasNext()) {
            defpackage.vhi vhiVar = (defpackage.vhi) ailjVarK.next();
            if (z) {
                sb.append(',');
            }
            sb.append(vhiVar.a);
            z = true;
        }
        return sb.toString();
    }

    public final defpackage.vhy a() {
        defpackage.vhy vhyVar = this.h;
        if (vhyVar != null) {
            return vhyVar;
        }
        defpackage.vhy vhyVar2 = new defpackage.vhy(this);
        this.h = vhyVar2;
        return vhyVar2;
    }
}
