package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aao implements defpackage.dvc {
    public final java.util.ArrayList a;
    private final java.lang.CharSequence b;
    private final int c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public aao(defpackage.bjz bjzVar) {
        this.b = bjzVar.c;
        this.a = (java.util.ArrayList) bjzVar.b;
        this.c = bjzVar.a;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("content_text", charSequence);
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = this.a;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList("actions", arrayList);
        }
        bundle.putInt("importance", this.c);
        return bundle;
    }

    @Override // defpackage.dvc
    public final void b(defpackage.dva dvaVar) {
        j$.util.Objects.requireNonNull(dvaVar);
        dvaVar.b().putBundle("androidx.car.app.EXTENSIONS", a());
    }
}
