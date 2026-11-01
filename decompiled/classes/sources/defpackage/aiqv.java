package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aiqv {
    public final int a;
    public final defpackage.aioj b;

    protected aiqv(defpackage.aioj aiojVar, int i) {
        if (aiojVar == null) {
            throw new java.lang.IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "invalid index: "));
        }
        this.a = i;
        this.b = aiojVar;
    }

    public abstract void a(defpackage.aiqz aiqzVar, java.lang.Object obj);
}
