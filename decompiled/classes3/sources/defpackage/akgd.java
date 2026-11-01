package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akgd implements java.io.Externalizable {
    private final defpackage.akfx a = defpackage.akfx.h();
    private defpackage.akge b;

    static {
        java.util.logging.Logger.getLogger(defpackage.akgd.class.getName());
    }

    public final java.lang.String a(defpackage.akgu akguVar) {
        long j = java.lang.Long.parseLong(akguVar.c + this.a.l(akguVar));
        defpackage.akge akgeVar = this.b;
        int i = akgeVar.a;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        java.util.SortedSet sortedSetHeadSet = akgeVar.b;
        while (!sortedSetHeadSet.isEmpty()) {
            java.lang.Integer num = (java.lang.Integer) sortedSetHeadSet.last();
            java.lang.String strValueOf = java.lang.String.valueOf(j);
            int i3 = 0;
            if (strValueOf.length() > num.intValue()) {
                j = java.lang.Long.parseLong(strValueOf.substring(0, num.intValue()));
            }
            int i4 = 0;
            while (i3 <= i2) {
                i4 = (i3 + i2) >>> 1;
                long jA = this.b.a(i4);
                if (jA == j) {
                    break;
                }
                if (jA > j) {
                    i4--;
                    i2 = i4;
                } else {
                    i3 = i4 + 1;
                }
            }
            i2 = i4;
            if (i2 < 0) {
                return null;
            }
            if (j == this.b.a(i2)) {
                return this.b.b(i2);
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(num);
        }
        return null;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            this.b = new defpackage.akga();
        } else {
            this.b = new defpackage.akfz();
        }
        this.b.c(objectInput);
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.b instanceof defpackage.akga);
        this.b.d(objectOutput);
    }
}
