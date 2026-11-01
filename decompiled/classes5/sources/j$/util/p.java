package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p implements java.util.Map.Entry {
    public final java.util.Map.Entry a;

    public p(java.util.Map.Entry entry) {
        this.a = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.util.Map.Entry entry2 = this.a;
            java.lang.Object key = entry2.getKey();
            java.lang.Object key2 = entry.getKey();
            if (key == null) {
                zEquals = key2 == null;
            } else {
                zEquals = key.equals(key2);
            }
            if (zEquals) {
                java.lang.Object value = entry2.getValue();
                java.lang.Object value2 = entry.getValue();
                if (value == null) {
                    zEquals2 = value2 == null;
                } else {
                    zEquals2 = value.equals(value2);
                }
                if (zEquals2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
