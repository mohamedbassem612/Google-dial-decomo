package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjq implements defpackage.tjh {
    public final int a;
    private final defpackage.tjh b;

    public tjq(int i, defpackage.tjh tjhVar) {
        this.a = i;
        this.b = tjhVar;
    }

    @Override // defpackage.tjh
    public final void a() {
        this.b.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tjq) {
            defpackage.tjq tjqVar = (defpackage.tjq) obj;
            if (this.a == tjqVar.a && this.b.equals(tjqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VideoAction{type=" + this.a + ", action=" + this.b.toString() + '}';
    }

    public tjq() {
        throw null;
    }
}
