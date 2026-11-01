package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class khs extends android.os.Binder {
    final /* synthetic */ defpackage.kvt a;

    public khs(defpackage.kvt kvtVar) {
        this.a = kvtVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    @Override // android.os.Binder
    protected final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        aooh.f(parcel, "data");
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        parcel2.writeNoException();
        java.lang.Object objA = this.a.a.a();
        aooh.e(objA, "get(...)");
        da$.ExternalSyntheticApiModelOutline0.m(parcel2, ((java.lang.Boolean) objA).booleanValue());
        return true;
    }
}
