package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nse extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.nsf c;
    final /* synthetic */ akzb d;
    final /* synthetic */ int e;
    final /* synthetic */ java.util.List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nse(defpackage.nsf nsfVar, akzb akzbVar, int i, java.util.List list, aoln aolnVar) {
        super(2, aolnVar);
        this.c = nsfVar;
        this.d = akzbVar;
        this.e = i;
        this.f = list;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[EDGE_INSN: B:37:0x00b9->B:29:0x00b9 BREAK  A[LOOP:0: B:21:0x0082->B:40:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9 A[EDGE_INSN: B:39:0x00b9->B:29:0x00b9 BREAK  A[LOOP:0: B:21:0x0082->B:40:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        int length;
        byte[] bArr;
        defpackage.nsf nsfVar;
        defpackage.irl irlVar;
        java.util.Iterator it;
        defpackage.nmp nmpVar;
        java.lang.String str;
        int iA;
        java.lang.String str2;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                obj2 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
            }
            short[] sArr = (short[]) obj2;
            length = sArr.length << 1;
            bArr = new byte[length];
            java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().put(sArr);
            nsfVar = this.c;
            j$.util.Optional optionalG = nsfVar.d.g();
            aooh.e(optionalG, "getFeature(...)");
            irlVar = (defpackage.irl) aooh.q(optionalG);
            if (irlVar != null && irlVar.a() > 0) {
                it = this.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        nmpVar = (defpackage.nmp) it.next();
                        str = nmpVar.d;
                        aooh.e(str, "getFilePath(...)");
                        if (aoov.r(str, ".amr", false)) {
                            break;
                        }
                        if (((java.lang.Boolean) nsfVar.b.a()).booleanValue()) {
                            str2 = nmpVar.d;
                            aooh.e(str2, "getFilePath(...)");
                            if (aoov.r(str2, ".m4a", false)) {
                                break;
                            }
                        }
                    }
                }
                iA = (int) ((((irlVar.a() + 1000) * ((long) this.e)) << 2) / 1000);
                if (iA > length) {
                    defpackage.nsf.a.d().l("com/android/dialer/dobby/impl/storage/DobbyWavAudioRecordingMerger", "stripCustomGreetingSilenceFromMergedAudio", 99, "DobbyWavAudioRecordingMerger.kt").v("Greeting longer than actual audio, not trimming to prevent empty audio.");
                    akzc akzcVar = akzc.d;
                    akzb akzbVar = new akzb(128);
                    akzbVar.write(bArr);
                    return akzbVar;
                }
                int i2 = length - iA;
                byte[] bArr2 = new byte[i2];
                defpackage.nsf.a.b().l("com/android/dialer/dobby/impl/storage/DobbyWavAudioRecordingMerger", "stripCustomGreetingSilenceFromMergedAudio", 110, "DobbyWavAudioRecordingMerger.kt").z("Audio size without custom greeting: %s, Original size: %s", i2, length);
                java.lang.System.arraycopy(bArr, iA, bArr2, 0, i2);
                akzc akzcVar2 = akzc.d;
                akzb akzbVar2 = new akzb(128);
                akzbVar2.write(bArr2);
                return akzbVar2;
            }
            akzc akzcVar3 = akzc.d;
            akzb akzbVar3 = new akzb(128);
            akzbVar3.write(bArr);
            return akzbVar3;
        }
        aooc.af(obj);
        defpackage.nsf nsfVar2 = this.c;
        akzb akzbVar4 = this.d;
        int i3 = this.e;
        java.util.List list = this.f;
        this.b = 1;
        obj = nsfVar2.b(akzbVar4, i3, list, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        short[] sArr2 = (short[]) obj;
        if (sArr2 != null) {
            java.util.List list2 = this.f;
            if (!list2.isEmpty()) {
                defpackage.nsf nsfVar3 = this.c;
                int i4 = this.e;
                this.a = sArr2;
                this.b = 2;
                if (nsfVar3.a(sArr2, list2, i4, this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = sArr2;
                short[] sArr3 = (short[]) obj2;
                length = sArr3.length << 1;
                bArr = new byte[length];
                java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().put(sArr3);
                nsfVar = this.c;
                j$.util.Optional optionalG2 = nsfVar.d.g();
                aooh.e(optionalG2, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG2);
                if (irlVar != null) {
                    it = this.f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            nmpVar = (defpackage.nmp) it.next();
                            str = nmpVar.d;
                            aooh.e(str, "getFilePath(...)");
                            if (aoov.r(str, ".amr", false)) {
                                break;
                                break;
                            }
                            if (((java.lang.Boolean) nsfVar.b.a()).booleanValue()) {
                                str2 = nmpVar.d;
                                aooh.e(str2, "getFilePath(...)");
                                if (aoov.r(str2, ".m4a", false)) {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                    iA = (int) ((((irlVar.a() + 1000) * ((long) this.e)) << 2) / 1000);
                    if (iA > length) {
                        defpackage.nsf.a.d().l("com/android/dialer/dobby/impl/storage/DobbyWavAudioRecordingMerger", "stripCustomGreetingSilenceFromMergedAudio", 99, "DobbyWavAudioRecordingMerger.kt").v("Greeting longer than actual audio, not trimming to prevent empty audio.");
                        akzc akzcVar4 = akzc.d;
                        akzb akzbVar5 = new akzb(128);
                        akzbVar5.write(bArr);
                        return akzbVar5;
                    }
                    int i5 = length - iA;
                    byte[] bArr3 = new byte[i5];
                    defpackage.nsf.a.b().l("com/android/dialer/dobby/impl/storage/DobbyWavAudioRecordingMerger", "stripCustomGreetingSilenceFromMergedAudio", 110, "DobbyWavAudioRecordingMerger.kt").z("Audio size without custom greeting: %s, Original size: %s", i5, length);
                    java.lang.System.arraycopy(bArr, iA, bArr3, 0, i5);
                    akzc akzcVar5 = akzc.d;
                    akzb akzbVar6 = new akzb(128);
                    akzbVar6.write(bArr3);
                    return akzbVar6;
                }
                akzc akzcVar6 = akzc.d;
                akzb akzbVar7 = new akzb(128);
                akzbVar7.write(bArr);
                return akzbVar7;
            }
        }
        return null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nse(this.c, this.d, this.e, this.f, aolnVar);
    }
}
