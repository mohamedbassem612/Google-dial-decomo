package com.android.onboarding.utils.persistable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PersistableIntent implements android.os.Parcelable, defpackage.xpa {
    public static final defpackage.xpg CREATOR = new defpackage.xpg();
    public java.lang.String a;
    public android.os.PersistableBundle b;
    public java.lang.String c;
    public java.util.Set d;
    public int e;
    private java.lang.String f;
    private android.content.ComponentName g;
    private android.net.Uri h;

    /* JADX WARN: Illegal instructions before constructor call */
    public PersistableIntent(android.content.Intent intent) {
        aooh.f(intent, "intent");
        java.lang.String action = intent.getAction();
        java.lang.String type = intent.getType();
        java.lang.String str = intent.getPackage();
        android.content.ComponentName component = intent.getComponent();
        int flags = intent.getFlags();
        android.net.Uri data = intent.getData();
        java.util.Set<java.lang.String> categories = intent.getCategories();
        android.os.Bundle extras = intent.getExtras();
        this(action, type, extras != null ? defpackage.xfh.p(extras, new defpackage.xpf(0)) : new android.os.PersistableBundle(), str, component, categories, flags, data);
    }

    public final android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(this.a);
        intent.setDataAndType(this.h, this.f);
        intent.setPackage(this.c);
        intent.setComponent(this.g);
        intent.setFlags(this.e);
        java.util.Set set = this.d;
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                intent.addCategory((java.lang.String) it.next());
            }
        }
        intent.putExtras(defpackage.xfh.m(this.b));
        return intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return a().describeContents();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.android.onboarding.utils.persistable.PersistableIntent) {
            com.android.onboarding.utils.persistable.PersistableIntent persistableIntent = (com.android.onboarding.utils.persistable.PersistableIntent) obj;
            if (aooh.n(this.a, persistableIntent.a) && aooh.n(this.f, persistableIntent.f) && defpackage.xff.l(this.b, persistableIntent.b) && aooh.n(this.c, persistableIntent.c) && aooh.n(this.g, persistableIntent.g) && this.e == persistableIntent.e && aooh.n(this.h, persistableIntent.h) && aooh.n(this.d, persistableIntent.d) && defpackage.xff.l(this.b, persistableIntent.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.f;
        int iHashCode2 = (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + defpackage.xff.m(this.b);
        java.lang.String str3 = this.c;
        int iHashCode3 = ((iHashCode2 * 31) + (str3 != null ? str3.hashCode() : 0)) * 31;
        android.content.ComponentName componentName = this.g;
        int iHashCode4 = (((iHashCode3 + (componentName != null ? componentName.hashCode() : 0)) * 31) + this.e) * 31;
        android.net.Uri uri = this.h;
        int iHashCode5 = (iHashCode4 + (uri != null ? uri.hashCode() : 0)) * 31;
        java.util.Set set = this.d;
        return ((iHashCode5 + (set != null ? set.hashCode() : 0)) * 31) + defpackage.xff.m(this.b);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("ACTION", this.a);
        persistableBundle.putString("TYPE", this.f);
        persistableBundle.putString("PACKAGE", this.c);
        android.content.ComponentName componentName = this.g;
        persistableBundle.putString("COMPONENT_NAME", componentName != null ? componentName.flattenToString() : null);
        persistableBundle.putInt("FLAGS", this.e);
        android.net.Uri uri = this.h;
        persistableBundle.putString("DATA", uri != null ? uri.toString() : null);
        java.util.Set set = this.d;
        persistableBundle.putStringArray("CATEGORIES", set != null ? (java.lang.String[]) set.toArray(new java.lang.String[0]) : null);
        persistableBundle.putPersistableBundle("EXTRAS", this.b);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PersistableIntent(action=" + this.a + ",type=" + this.f + ",package=" + this.c + ",component=" + this.g + ",categories=" + this.d + ",flags=" + this.e + ",data=" + this.h + ",extras=" + defpackage.xff.n(this.b) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        a().writeToParcel(parcel, i);
    }

    public PersistableIntent(java.lang.String str, java.lang.String str2, android.os.PersistableBundle persistableBundle, java.lang.String str3, android.content.ComponentName componentName, java.util.Set set, int i, android.net.Uri uri) {
        aooh.f(persistableBundle, "extras");
        this.a = str;
        this.f = str2;
        this.b = persistableBundle;
        this.c = str3;
        this.g = componentName;
        this.d = set;
        this.e = i;
        this.h = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersistableIntent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    public /* synthetic */ PersistableIntent(java.lang.String str, java.lang.String str2, java.util.Set set, int i) {
        this(1 == (i & 1) ? null : str, null, (i & 4) != 0 ? new android.os.PersistableBundle() : null, (i & 8) != 0 ? null : str2, null, (i & 32) != 0 ? null : set, 0, null);
    }
}
