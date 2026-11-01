package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class smb implements aonj {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ czc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ czc e;
    public final /* synthetic */ czc f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ czc i;
    public final /* synthetic */ czc j;

    public /* synthetic */ smb(boolean z, czc czcVar, long j, int i, czc czcVar2, czc czcVar3, int i2, int i3, czc czcVar4, czc czcVar5) {
        this.a = z;
        this.b = czcVar;
        this.c = j;
        this.d = i;
        this.e = czcVar2;
        this.f = czcVar3;
        this.g = i2;
        this.h = i3;
        this.i = czcVar4;
        this.j = czcVar5;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        czb czbVar = (czb) obj;
        java.util.List list = defpackage.sme.a;
        aooh.f(czbVar, "$this$layout");
        czc czcVar = this.b;
        int i = this.d;
        boolean z = this.a;
        long j = this.c;
        if (!z) {
            czbVar.s(czcVar, 0, dpd.a(j) - i, 0.0f);
        }
        czbVar.s(this.e, 0, 0, 0.0f);
        int iA = dpd.a(j) - i;
        if (z) {
            czbVar.s(czcVar, 0, iA, 0.0f);
        }
        czc czcVar2 = this.j;
        czc czcVar3 = this.i;
        czbVar.s(this.f, 0, (iA + this.g) - this.h, 0.0f);
        czbVar.s(czcVar3, 0, 0, 0.0f);
        if (czcVar2 != null) {
            czbVar.s(czcVar2, 0, 0, 0.0f);
        }
        return aojh.a;
    }
}
