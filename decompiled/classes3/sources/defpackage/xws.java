package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xws {
    final defpackage.yeq a;
    final java.util.concurrent.Executor b;

    public xws(defpackage.yeq yeqVar, java.util.concurrent.Executor executor) {
        this.a = yeqVar;
        this.b = executor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xws) {
            return this.a.equals(((defpackage.xws) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
