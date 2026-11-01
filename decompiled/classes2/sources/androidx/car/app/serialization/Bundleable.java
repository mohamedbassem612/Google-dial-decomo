package androidx.car.app.serialization;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class Bundleable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(16);
    private final android.os.Bundle a;

    public Bundleable(java.lang.Object obj) {
        java.lang.String strE = defpackage.aau.e(obj.getClass());
        if (android.util.Log.isLoggable("CarApp.Bun", 3)) {
            android.util.Log.d("CarApp.Bun", "Bundling ".concat(java.lang.String.valueOf(strE)));
        }
        this.a = defpackage.aau.a(obj, strE, defpackage.aas.a());
    }

    public final java.lang.Object a() {
        int i = defpackage.aau.a;
        boolean zIsLoggable = android.util.Log.isLoggable("CarApp.Bun", 3);
        android.os.Bundle bundle = this.a;
        if (zIsLoggable) {
            android.util.Log.d("CarApp.Bun", "Unbundling ".concat(defpackage.aau.c(bundle.getInt("tag_class_type"))));
        }
        return defpackage.aau.b(bundle, defpackage.aas.a());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public Bundleable(android.os.Bundle bundle) {
        this.a = bundle;
    }
}
