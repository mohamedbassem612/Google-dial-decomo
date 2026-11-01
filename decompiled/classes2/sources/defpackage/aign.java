package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aign extends aifo {
    public final aigf a;

    public aign(aigf aigfVar) {
        this.a = aigfVar;
    }

    public final boolean contains(java.lang.Object obj) {
        return obj != null && ahvr.be(new defpackage.aigk(this), obj);
    }

    public final aify g() {
        return new defpackage.aigl(this, this.a.e().g());
    }

    public final /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.aigk(this);
    }

    public final ailj k() {
        return new defpackage.aigk(this);
    }

    public final boolean l() {
        throw null;
    }

    public final int size() {
        return this.a.size();
    }

    public java.lang.Object writeReplace() {
        return new defpackage.aigm(this.a);
    }
}
