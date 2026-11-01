package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aagu {
    public final java.lang.String a;
    public final java.lang.String b;
    public final android.content.ComponentName c;
    public final int d;
    public final boolean e;
    public final android.os.UserHandle f;

    public aagu(java.lang.String str, java.lang.String str2, boolean z) {
        defpackage.aais.ap(str);
        this.a = str;
        defpackage.aais.ap(str2);
        this.b = str2;
        this.c = null;
        this.d = 4225;
        this.e = z;
        this.f = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aagu) {
            defpackage.aagu aaguVar = (defpackage.aagu) obj;
            if (j$.util.Objects.equals(this.a, aaguVar.a) && j$.util.Objects.equals(this.b, aaguVar.b) && j$.util.Objects.equals(this.c, aaguVar.c)) {
                int i = aaguVar.d;
                if (this.e == aaguVar.e) {
                    android.os.UserHandle userHandle = aaguVar.f;
                    if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, 4225, java.lang.Boolean.valueOf(this.e), null});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        if (str != null) {
            return str;
        }
        android.content.ComponentName componentName = this.c;
        defpackage.aais.as(componentName);
        return componentName.flattenToString();
    }

    public aagu(android.content.ComponentName componentName) {
        this.a = null;
        this.b = null;
        defpackage.aais.as(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
        this.f = null;
    }
}
