package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aeqf implements ajas {
    public final /* synthetic */ aeqg a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ aenj c;
    public final /* synthetic */ int d;

    public /* synthetic */ aeqf(aeqg aeqgVar, boolean z, int i, aenj aenjVar) {
        this.a = aeqgVar;
        this.b = z;
        this.d = i;
        this.c = aenjVar;
    }

    public final ajcq a() {
        aeqg aeqgVar = this.a;
        if (this.b && !aeqgVar.c.b((java.lang.String) null)) {
            return aiql.x();
        }
        return aiql.z(aeqgVar.o(this.d, this.c));
    }
}
