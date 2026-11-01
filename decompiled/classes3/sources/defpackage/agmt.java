package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agmt implements defpackage.agna {
    private final az a;
    private ok b;
    private ok c;

    public agmt(az azVar) {
        this.a = azVar;
    }

    @Override // defpackage.agna
    public final android.content.Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.agna
    public final ok b() {
        ok okVar = this.c;
        if (okVar != null) {
            return okVar;
        }
        aooh.j("_requirementActivityLauncher");
        return null;
    }

    @Override // defpackage.agna
    public final ok c() {
        ok okVar = this.b;
        if (okVar != null) {
            return okVar;
        }
        aooh.j("_switchAccountActivityLauncher");
        return null;
    }

    @Override // defpackage.agna
    public final void d(oi oiVar, oi oiVar2) {
        pb pbVar = new pb();
        az azVar = this.a;
        this.b = azVar.O(pbVar, oiVar);
        this.c = azVar.O(new pb(), oiVar2);
    }

    @Override // defpackage.agna
    public final boolean e() {
        return true;
    }

    @Override // defpackage.agna
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.agna
    public final boolean g() {
        return this.a.a().ac();
    }
}
