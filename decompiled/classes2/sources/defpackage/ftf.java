package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftf implements defpackage.frt {
    private final defpackage.etx a = new defpackage.etx();

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        defpackage.ess essVarA;
        defpackage.etx etxVar = this.a;
        etxVar.O(bArr, i2 + i);
        etxVar.Q(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (etxVar.d() > 0) {
            ahvr.bN(etxVar.d() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i3 = etxVar.i() - 8;
            if (etxVar.i() == 1987343459) {
                java.lang.CharSequence charSequenceA = null;
                defpackage.esr esrVarA = null;
                while (i3 > 0) {
                    ahvr.bN(i3 >= 8, "Incomplete vtt cue box header found.");
                    int i4 = etxVar.i();
                    int i5 = etxVar.i();
                    int i6 = i3 - 8;
                    int i7 = i4 - 8;
                    java.lang.String strI = eum.I(etxVar.b, etxVar.c, i7);
                    etxVar.R(i7);
                    if (i5 == 1937011815) {
                        java.util.regex.Pattern pattern = defpackage.ftm.a;
                        defpackage.ftl ftlVar = new defpackage.ftl();
                        defpackage.ftm.c(strI, ftlVar);
                        esrVarA = ftlVar.a();
                    } else if (i5 == 1885436268) {
                        charSequenceA = defpackage.ftm.a(null, strI.trim(), java.util.Collections.EMPTY_LIST);
                    }
                    i3 = i6 - i7;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (esrVarA != null) {
                    esrVarA.d(charSequenceA);
                    essVarA = esrVarA.a();
                } else {
                    java.util.regex.Pattern pattern2 = defpackage.ftm.a;
                    defpackage.ftl ftlVar2 = new defpackage.ftl();
                    ftlVar2.c = charSequenceA;
                    essVarA = ftlVar2.a().a();
                }
                arrayList.add(essVarA);
            } else {
                etxVar.R(i3);
            }
        }
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
