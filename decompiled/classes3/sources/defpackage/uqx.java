package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uqx implements ajas {
    public final /* synthetic */ uqz a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ int e;

    public /* synthetic */ uqx(uqz uqzVar, java.lang.String str, int i, int i2, java.lang.String str2) {
        this.a = uqzVar;
        this.b = str;
        this.e = i;
        this.c = i2;
        this.d = str2;
    }

    public final ajcq a() {
        akzx akzxVarM = defpackage.zug.a.m();
        akzxVarM.u();
        defpackage.zug zugVar = (defpackage.zug) akzxVarM.b;
        java.lang.String str = this.b;
        j$.util.Objects.requireNonNull(str);
        zugVar.b |= 2;
        zugVar.d = str;
        akzxVarM.u();
        defpackage.zug zugVar2 = (defpackage.zug) akzxVarM.b;
        zugVar2.c = this.e - 1;
        zugVar2.b |= 1;
        akzxVarM.u();
        defpackage.zug zugVar3 = (defpackage.zug) akzxVarM.b;
        zugVar3.b |= 8;
        zugVar3.f = this.c;
        java.lang.String str2 = this.d;
        if (!android.text.TextUtils.isEmpty(str2)) {
            akzxVarM.u();
            defpackage.zug zugVar4 = (defpackage.zug) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            zugVar4.b |= 4;
            zugVar4.e = str2;
        }
        return ((tvn) this.a.d).l().a(defpackage.ztu.b, (defpackage.zug) akzxVarM.p());
    }
}
