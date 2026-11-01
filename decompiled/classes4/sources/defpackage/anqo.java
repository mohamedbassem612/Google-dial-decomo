package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anqo implements defpackage.anqm {
    private final defpackage.anqn a;
    private final defpackage.anqm b;

    public anqo(defpackage.anqn anqnVar, defpackage.anqm anqmVar) {
        ahvr.cj(anqnVar, "interceptor");
        this.a = anqnVar;
        this.b = anqmVar;
    }

    @Override // defpackage.anqm
    public final defpackage.antw a(defpackage.anql anqlVar, anph anphVar) {
        return this.a.a(anqlVar, anphVar, this.b);
    }
}
