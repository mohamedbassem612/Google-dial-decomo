package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaqz extends defpackage.aaqt {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ zzx b;
    private final java.lang.ref.WeakReference c;

    public aaqz(defpackage.aara aaraVar, android.content.Context context, zzx zzxVar) {
        this.a = context;
        this.b = zzxVar;
        j$.util.Objects.requireNonNull(aaraVar);
        this.c = new java.lang.ref.WeakReference(context);
    }

    @Override // defpackage.aaqt
    public final void g(com.google.android.gms.common.api.Status status, java.lang.String str, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        if (status.c()) {
            android.content.Intent intent = new android.content.Intent(str).setPackage("com.google.android.gms");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            intent.putExtras(bundle);
            android.content.Context context = (android.content.Context) this.c.get();
            if (context != null) {
                context.startActivity(intent);
            }
            aais.av(status, (java.lang.Object) null, this.b, apiMetadata);
        }
    }
}
