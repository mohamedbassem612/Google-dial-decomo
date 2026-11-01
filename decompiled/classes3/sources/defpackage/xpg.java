package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpg implements android.os.Parcelable.Creator, defpackage.xpb, defpackage.xpn {
    public static final com.android.onboarding.utils.persistable.PersistableIntent f(android.os.PersistableBundle persistableBundle) {
        android.net.Uri uri;
        aooh.f(persistableBundle, "persistableBundle");
        java.lang.String string = persistableBundle.getString("ACTION");
        java.lang.String string2 = persistableBundle.getString("TYPE");
        java.lang.String string3 = persistableBundle.getString("PACKAGE");
        java.lang.String string4 = persistableBundle.getString("COMPONENT_NAME");
        android.content.ComponentName componentNameUnflattenFromString = string4 != null ? android.content.ComponentName.unflattenFromString(string4) : null;
        int i = persistableBundle.getInt("FLAGS");
        java.lang.String string5 = persistableBundle.getString("DATA");
        if (string5 != null) {
            android.net.Uri uri2 = android.net.Uri.parse(string5);
            aooh.e(uri2, "parse(...)");
            uri = uri2;
        } else {
            uri = null;
        }
        java.lang.String[] stringArray = persistableBundle.getStringArray("CATEGORIES");
        java.util.Set setCW = stringArray != null ? ajsz.cW(stringArray) : null;
        android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle("EXTRAS");
        if (persistableBundle2 == null) {
            persistableBundle2 = new android.os.PersistableBundle();
        }
        return new com.android.onboarding.utils.persistable.PersistableIntent(string, string2, persistableBundle2, string3, componentNameUnflattenFromString, setCW, i, uri);
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        return defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        return f(persistableBundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        aooh.f(parcel, "source");
        java.lang.Object objCreateFromParcel = android.content.Intent.CREATOR.createFromParcel(parcel);
        aooh.e(objCreateFromParcel, "createFromParcel(...)");
        return new com.android.onboarding.utils.persistable.PersistableIntent((android.content.Intent) objCreateFromParcel);
    }

    @Override // defpackage.xoz
    public final /* synthetic */ defpackage.xoz e() {
        return new defpackage.xoy(this);
    }

    @Override // defpackage.xpn, defpackage.xoz
    public final /* synthetic */ android.os.PersistableBundle ew(java.lang.Object obj) {
        return new com.android.onboarding.utils.persistable.PersistableIntent((android.content.Intent) obj).toPersistableBundle();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.android.onboarding.utils.persistable.PersistableIntent[i];
    }
}
