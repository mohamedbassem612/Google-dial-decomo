package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adll extends defpackage.adkv {
    private final defpackage.adsw a;

    public adll(java.lang.String str, defpackage.adsw adswVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = adswVar.d;
        sb.append((java.lang.Object) defpackage.agab.cc(i));
        if (i == 4) {
            sb.append(' ');
            sb.append(adswVar.a);
        }
        java.lang.String str2 = adswVar.b;
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        sb.append(", url: ");
        sb.append(str);
        super(sb.toString());
        this.a = adswVar;
    }

    @Override // defpackage.adkv
    public final boolean a() {
        return this.a.d == 2;
    }

    @Override // defpackage.adkv
    public final boolean b() {
        defpackage.adsw adswVar = this.a;
        int i = adswVar.a;
        return (i >= 400 && i < 500) || adswVar.d == 3;
    }
}
