package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aary implements defpackage.aaqg {
    private final com.google.android.gms.common.api.Status a;
    private final defpackage.aash b;

    public aary(com.google.android.gms.common.api.Status status, defpackage.aash aashVar) {
        this.a = status;
        this.b = aashVar;
    }

    public final void a() {
        defpackage.aash aashVar = this.b;
        if (aashVar != null) {
            aashVar.a();
        }
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    @Override // defpackage.aaqg
    public final defpackage.aash c() {
        return this.b;
    }
}
