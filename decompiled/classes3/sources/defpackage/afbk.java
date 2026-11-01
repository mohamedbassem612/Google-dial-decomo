package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afbk implements dyy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ afbk(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        this.$cid = i5;
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        eak eahVar;
        if (this.$cid == 0) {
            dwn dwnVarF = eaxVar.f(519);
            int i = dwnVarF.b;
            int i2 = dwnVarF.c;
            int i3 = dwnVarF.d;
            int i4 = dwnVarF.e;
            int i5 = this.e;
            int i6 = this.d;
            this.a.setPadding(this.b + i, this.c + i2, i6 + i3, i5 + i4);
            return eaxVar;
        }
        dwn dwnVarF2 = eaxVar.f(519);
        int i7 = dwnVarF2.b;
        int i8 = dwnVarF2.c;
        int i9 = dwnVarF2.d;
        this.a.setPadding(this.b + i7, this.c + i8, this.d + i9, this.e);
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            eahVar = new eak(eaxVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            eahVar = new eaj(eaxVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            eahVar = new eai(eaxVar);
        } else {
            eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new eah(eaxVar) : new eag(eaxVar);
        }
        eahVar.d(519, dwn.d(i7, 0, i9, dwnVarF2.e));
        return eahVar.a();
    }
}
