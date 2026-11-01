package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aijz implements java.util.Comparator {
    protected aijz() {
    }

    public static defpackage.aijz d(java.util.Comparator comparator) {
        return comparator instanceof defpackage.aijz ? (defpackage.aijz) comparator : new aiee(comparator);
    }

    public defpackage.aijz a() {
        return new defpackage.aikq(this);
    }

    public defpackage.aijz b() {
        return new aijv(this);
    }

    public defpackage.aijz c() {
        return new aijw(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(java.lang.Object obj, java.lang.Object obj2);

    final defpackage.aijz e() {
        return new defpackage.aidi(new agqd(16), this);
    }
}
