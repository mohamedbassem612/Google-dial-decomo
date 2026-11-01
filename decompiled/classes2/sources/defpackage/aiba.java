package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiba extends java.lang.ref.SoftReference implements aibi {
    final aibu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiba(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, aibu aibuVar) {
        super(obj, referenceQueue);
        aibt.p(obj);
        this.a = aibuVar;
    }

    public final int a() {
        return 1;
    }

    public final aibi b(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, aibu aibuVar) {
        return new defpackage.aiba(referenceQueue, obj, aibuVar);
    }

    public final aibu c() {
        return this.a;
    }

    public final java.lang.Object d() {
        return get();
    }

    public final boolean f() {
        return true;
    }

    public final boolean g() {
        return false;
    }

    public final void e(java.lang.Object obj) {
    }
}
