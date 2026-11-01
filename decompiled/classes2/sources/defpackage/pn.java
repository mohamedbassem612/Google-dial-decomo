package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class pn {
    final defpackage.sj a;

    public pn(defpackage.sj sjVar) {
        dzk.x(sjVar);
        this.a = sjVar;
    }

    public final java.lang.String a() {
        return this.a.a;
    }

    final void b(defpackage.sm smVar) {
        int i;
        java.util.List list;
        int i2;
        int i3;
        int i4;
        smVar.a("{\n");
        smVar.d();
        smVar.a("name: \"");
        smVar.a(a());
        smVar.a("\",\n");
        smVar.a("description: \"");
        defpackage.sj sjVar = this.a;
        smVar.a(sjVar.i);
        smVar.a("\",\n");
        if (this instanceof defpackage.pp) {
            defpackage.sj sjVar2 = ((defpackage.pp) this).a;
            defpackage.si siVar = sjVar2.e;
            if (siVar == null || (i4 = siVar.a) == 0) {
                smVar.a("indexingType: INDEXING_TYPE_NONE,\n");
            } else if (i4 == 1) {
                smVar.a("indexingType: INDEXING_TYPE_EXACT_TERMS,\n");
            } else if (i4 != 2) {
                smVar.a("indexingType: INDEXING_TYPE_UNKNOWN,\n");
            } else {
                smVar.a("indexingType: INDEXING_TYPE_PREFIXES,\n");
            }
            if (siVar == null || (i3 = siVar.b) == 0) {
                smVar.a("tokenizerType: TOKENIZER_TYPE_NONE,\n");
            } else if (i3 == 1) {
                smVar.a("tokenizerType: TOKENIZER_TYPE_PLAIN,\n");
            } else if (i3 == 2) {
                smVar.a("tokenizerType: TOKENIZER_TYPE_VERBATIM,\n");
            } else if (i3 != 3) {
                smVar.a("tokenizerType: TOKENIZER_TYPE_UNKNOWN,\n");
            } else {
                smVar.a("tokenizerType: TOKENIZER_TYPE_RFC822,\n");
            }
            defpackage.sh shVar = sjVar2.h;
            if (shVar == null || (i2 = shVar.a) == 0) {
                smVar.a("joinableValueType: JOINABLE_VALUE_TYPE_NONE,\n");
            } else if (i2 != 1) {
                smVar.a("joinableValueType: JOINABLE_VALUE_TYPE_UNKNOWN,\n");
            } else {
                smVar.a("joinableValueType: JOINABLE_VALUE_TYPE_QUALIFIED_ID,\n");
            }
            smVar.a("deletePropagationType: DELETE_PROPAGATION_TYPE_NONE,\n");
        } else if (this instanceof defpackage.pj) {
            smVar.a("shouldIndexNestedProperties: ");
            defpackage.sj sjVar3 = ((defpackage.pj) this).a;
            defpackage.se seVar = sjVar3.f;
            smVar.b(java.lang.Boolean.valueOf(seVar == null ? false : seVar.a));
            smVar.a(",\n");
            smVar.a("indexableNestedProperties: ");
            java.util.List listUnmodifiableList = (seVar == null || (list = seVar.b) == null) ? java.util.Collections.EMPTY_LIST : j$.util.DesugarCollections.unmodifiableList(list);
            smVar.b(listUnmodifiableList);
            smVar.a(",\n");
            smVar.a("schemaType: \"");
            java.lang.String str = sjVar3.d;
            dzk.x(str);
            smVar.a(str);
            smVar.a("\",\n");
        } else if (this instanceof defpackage.pm) {
            defpackage.sg sgVar = ((defpackage.pm) this).a.g;
            if (sgVar == null || (i = sgVar.a) == 0) {
                smVar.a("indexingType: INDEXING_TYPE_NONE,\n");
            } else if (i != 1) {
                smVar.a("indexingType: INDEXING_TYPE_UNKNOWN,\n");
            } else {
                smVar.a("indexingType: INDEXING_TYPE_RANGE,\n");
            }
        }
        int i5 = sjVar.c;
        if (i5 == 1) {
            smVar.a("cardinality: CARDINALITY_REPEATED,\n");
        } else if (i5 == 2) {
            smVar.a("cardinality: CARDINALITY_OPTIONAL,\n");
        } else if (i5 != 3) {
            smVar.a("cardinality: CARDINALITY_UNKNOWN,\n");
        } else {
            smVar.a("cardinality: CARDINALITY_REQUIRED,\n");
        }
        switch (sjVar.b) {
            case 1:
                smVar.a("dataType: DATA_TYPE_STRING,\n");
                break;
            case 2:
                smVar.a("dataType: DATA_TYPE_LONG,\n");
                break;
            case 3:
                smVar.a("dataType: DATA_TYPE_DOUBLE,\n");
                break;
            case 4:
                smVar.a("dataType: DATA_TYPE_BOOLEAN,\n");
                break;
            case 5:
                smVar.a("dataType: DATA_TYPE_BYTES,\n");
                break;
            case 6:
                smVar.a("dataType: DATA_TYPE_DOCUMENT,\n");
                break;
            case 7:
                smVar.a("dataType: DATA_TYPE_EMBEDDING,\n");
                break;
            default:
                smVar.a("dataType: DATA_TYPE_BLOB_HANDLE,\n");
                break;
        }
        smVar.c();
        smVar.a("}");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pn) {
            return j$.util.Objects.equals(this.a, ((defpackage.pn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.sm smVar = new defpackage.sm();
        b(smVar);
        return smVar.toString();
    }
}
