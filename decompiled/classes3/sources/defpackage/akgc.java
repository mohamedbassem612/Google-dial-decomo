package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akgc implements java.io.Externalizable {
    public static final java.util.Map a;
    public int[] b;
    public java.util.List c;
    private int d = 0;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("zh_TW", "zh_Hant");
        map.put("zh_HK", "zh_Hant");
        map.put("zh_MO", "zh_Hant");
        a = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    public static final void a(java.lang.String str, java.lang.StringBuilder sb) {
        if (str.length() > 0) {
            sb.append('_');
            sb.append(str);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) {
        int i = objectInput.readInt();
        this.d = i;
        int[] iArr = this.b;
        if (iArr == null || iArr.length < i) {
            this.b = new int[i];
        }
        if (this.c == null) {
            this.c = new java.util.ArrayList();
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            this.b[i2] = objectInput.readInt();
            int i3 = objectInput.readInt();
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i4 = 0; i4 < i3; i4++) {
                hashSet.add(objectInput.readUTF());
            }
            this.c.add(hashSet);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < this.d; i++) {
            sb.append(this.b[i]);
            sb.append('|');
            java.util.Iterator it = new java.util.TreeSet((java.util.Collection) this.c.get(i)).iterator();
            while (it.hasNext()) {
                sb.append((java.lang.String) it.next());
                sb.append(',');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) {
        objectOutput.writeInt(this.d);
        for (int i = 0; i < this.d; i++) {
            objectOutput.writeInt(this.b[i]);
            java.util.Set set = (java.util.Set) this.c.get(i);
            objectOutput.writeInt(set.size());
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                objectOutput.writeUTF((java.lang.String) it.next());
            }
        }
    }
}
