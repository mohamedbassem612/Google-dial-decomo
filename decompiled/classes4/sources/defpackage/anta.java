package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anta implements defpackage.anpb {
    private final android.os.Parcelable.Creator a;
    private final boolean b;

    public anta(android.os.Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.anpb
    public final /* bridge */ /* synthetic */ java.io.InputStream a(java.lang.Object obj) {
        boolean z = this.b;
        return new defpackage.antm(this.a, (android.os.Parcelable) obj, z);
    }

    @Override // defpackage.anpb
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.io.InputStream inputStream) {
        if (!(inputStream instanceof defpackage.antm)) {
            throw new java.lang.UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
        }
        defpackage.antm antmVar = (defpackage.antm) inputStream;
        if (antmVar.b) {
            return antmVar.c;
        }
        if (antmVar.e == null) {
            android.os.Parcelable parcelable = antmVar.c;
            android.os.Parcelable.Creator creator = antmVar.a;
            ahvr.ci(creator);
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            android.os.Parcelable parcelable2 = (android.os.Parcelable) creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            antmVar.e = parcelable2;
        }
        return antmVar.e;
    }
}
