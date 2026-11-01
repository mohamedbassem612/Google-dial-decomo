package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akeq implements java.util.Map.Entry {
    defpackage.akeq a;
    defpackage.akeq b;
    defpackage.akeq c;
    defpackage.akeq d;
    defpackage.akeq e;
    public final java.lang.Object f;
    final boolean g;
    public java.lang.Object h;
    int i;

    public akeq(boolean z, defpackage.akeq akeqVar, java.lang.Object obj, defpackage.akeq akeqVar2, defpackage.akeq akeqVar3) {
        this.a = akeqVar;
        this.f = obj;
        this.g = z;
        this.i = 1;
        this.d = akeqVar2;
        this.e = akeqVar3;
        akeqVar3.d = this;
        akeqVar2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        java.lang.Object obj3 = this.h;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object obj = this.f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj == null && !this.g) {
            throw new java.lang.NullPointerException("value == null");
        }
        java.lang.Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.f) + '=' + java.lang.String.valueOf(this.h);
    }

    public akeq(boolean z) {
        this.f = null;
        this.g = z;
        this.e = this;
        this.d = this;
    }
}
