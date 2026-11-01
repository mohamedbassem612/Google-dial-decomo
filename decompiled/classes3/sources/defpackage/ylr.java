package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ylr extends ylc implements android.os.IInterface {
    final /* synthetic */ dsd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylr(defpackage.ymr ymrVar, dsd dsdVar) {
        super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback");
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(ymrVar);
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 2) {
            this.a.b((java.lang.Object) null);
        } else if (i != 3) {
            if (i != 4) {
                return false;
            }
            com.google.android.apps.aicore.aidl.AiCoreException aiCoreException = (com.google.android.apps.aicore.aidl.AiCoreException) yld.a(parcel, com.google.android.apps.aicore.aidl.AiCoreException.CREATOR);
            yld.c(parcel);
            a(aiCoreException != null ? aiCoreException.b : 0);
        } else {
            int i2 = parcel.readInt();
            yld.c(parcel);
            a(i2);
        }
        return true;
    }

    public final void a(int i) {
        this.a.d(new defpackage.ymi(3, i, "Preparation failed.", null));
    }
}
